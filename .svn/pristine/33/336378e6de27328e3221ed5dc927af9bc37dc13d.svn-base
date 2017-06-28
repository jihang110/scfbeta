/*
 * 文 件 名:  ReflectUtils.java
 * 版    权:  XXX Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zan
 * 修改时间:  2015年3月26日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.ut.scf.core.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ReflectionUtils;

/**
 * 反射工具类
 * 
 * @author zan
 * @version [版本号, 2015年3月26日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class ReflectUtils {

	private static final Logger logger = LoggerFactory.getLogger(ReflectUtils.class);

	/**
	 * 得到指定类型的指定位置的泛型实参
	 *
	 * @param clazz
	 * @param index
	 * @param <T>
	 * @return
	 */
	public static <T> Class<T> findParameterizedType(Class<?> clazz, int index) {
		Type parameterizedType = clazz.getGenericSuperclass();
		// CGLUB subclass target object(泛型在父类上)
		if (!(parameterizedType instanceof ParameterizedType)) {
			parameterizedType = clazz.getSuperclass().getGenericSuperclass();
		}
		if (!(parameterizedType instanceof ParameterizedType)) {
			return null;
		}
		Type[] actualTypeArguments = ((ParameterizedType) parameterizedType).getActualTypeArguments();
		if (actualTypeArguments == null || actualTypeArguments.length == 0) {
			return null;
		}
		return (Class<T>) actualTypeArguments[index];
	}

	public static <T> Class<T> getClass(String className) {
		try {
			return (Class<T>) Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static <T> Object newInstance(String className) {
		try {
			return Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static <T> T newInstance(Class<T> clzz) throws Exception {
		return clzz.newInstance();
	}

	public static <T> T newInstance(Class<T> clzz, Object[] params, Class<?>... paramTypes) throws Exception {
		return clzz.getConstructor(paramTypes).newInstance(params);
	}

	public static Object getFieldValue(final Object object, Field field) {
		makeAccessible(field);
		Object result = null;
		try {
			result = field.get(object);
		} catch (IllegalAccessException e) {
			logger.error("不可能抛出的异常{}", e.getMessage());
		}
		return result;
	}

	/**
	 * 直接读取对象属性值,无视private/public修饰符,不经过getter函数.
	 */
	public static Object getFieldValue(final Object object, final String fieldName) {
		Field field = getDeclaredField(object, fieldName);

		if (field == null)
			throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");

		makeAccessible(field);

		Object result = null;
		try {
			result = field.get(object);
		} catch (IllegalAccessException e) {
			logger.error("不可能抛出的异常{}", e.getMessage());
		}
		return result;
	}

	/**
	 * 直接设置对象属性值,无视private/public修饰符,不经过setter函数.
	 */
	public static void setFieldValue(final Object object, final String fieldName, final Object value) {
		Field field = getDeclaredField(object, fieldName);
		if (field == null) {
			throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
		}
		makeAccessible(field);
		try {
			field.set(object, value);
		} catch (IllegalAccessException e) {
			logger.error("不可能抛出的异常:{}", e.getMessage());
		}
	}

	public static void setFieldValue(final Object object, final Field field, final Object value) {
		makeAccessible(field);
		try {
			field.set(object, value);
		} catch (IllegalAccessException e) {
			logger.error("不可能抛出的异常:{}", e.getMessage());
		}
	}

	/**
	 * 循环向上转型,获取对象的DeclaredField.
	 */
	public static Field getDeclaredField(final Object object, final String fieldName) {
		return getDeclaredField(object.getClass(), fieldName);
	}

	/**
	 * 循环向上转型,获取类的DeclaredField.
	 */

	public static Field getDeclaredField(final Class clazz, final String fieldName) {
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			try {
				return superClass.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
				// Field不在当前类定义,继续向上转型
			}
		}
		return null;
	}

	public static boolean isExtends(final Class clazz, Class targetClzz) {
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			if (superClass == targetClzz) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 查找某个class类型的参数
	 * 
	 * @param targetClzz
	 * @param args
	 * @return
	 */
	public static <T> T loopupByTargetClass(final Class<T> targetClzz, final Object[] args) {
		if (args == null) {
			throw new IllegalArgumentException("Could not find target [" + targetClzz + "] on args [" + args + "]");
		}
		for (Object arg : args) {
			if (arg == null) {
				continue;
			}
			Class<?> argClzz = arg.getClass();
			for (Class<?> superClass = argClzz; superClass != Object.class; superClass = superClass.getSuperclass()) {
				if (superClass.equals(targetClzz)) {
					return (T) arg;
				}
			}
		}
		throw new IllegalArgumentException("Could not find target [" + targetClzz + "] on args [" + args + "]");
	}

	public static List<Field> getAllDeclaredField(final Class clazz) {
		List<Field> fieldlist = new ArrayList<Field>();
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			for (Field f : superClass.getDeclaredFields()) {
				fieldlist.add(f);
			}
		}
		return fieldlist;
	}

	public static List<Field> getAllSpecialDeclaredField(final Class clazz, final Class<?> specialClass) {
		List<Field> fieldlist = new ArrayList<Field>();
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			for (Field f : superClass.getDeclaredFields()) {
				if (f.getType().equals(specialClass)) {
					fieldlist.add(f);
				}
			}
		}
		return fieldlist;
	}

	public static List<Field> getAllDeclaredField(final Class<?> clazz, final Class<? extends Annotation> anntClzz) {
		List<Field> fieldlist = new ArrayList<Field>();
		for (Class superClass = clazz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			for (Field f : superClass.getDeclaredFields()) {
				if (f.getAnnotation(anntClzz) != null) {
					fieldlist.add(f);
				}
			}
		}
		return fieldlist;
	}

	/**
	 * 强制转换fileld可访问.
	 */
	public static void makeAccessible(final Field field) {
		if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
			field.setAccessible(true);
		}
	}

	/**
	 * 通过反射,获得定义Class时声明的父类的泛型参数的类型. 如public UserDao extends HibernateDao<User>
	 * 
	 * @param clazz
	 *            The class to introspect
	 * @return the first generic declaration, or Object.class if cannot be
	 *         determined
	 */
	public static Class getSuperClassGenricType(final Class clazz) {
		return getSuperClassGenricType(clazz, 0);
	}

	/**
	 * 通过反射,获得定义Class时声明的父类的泛型参数的类型. 如public UserDao extends HibernateDao
	 * <User,Long>
	 * 
	 * @param clazz
	 *            clazz The class to introspect
	 * @param index
	 *            the Index of the generic ddeclaration,start from 0.
	 * @return the index generic declaration, or Object.class if cannot be
	 *         determined
	 */

	public static Class getSuperClassGenricType(final Class clazz, final int index) {

		Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			logger.warn(clazz.getSimpleName() + "'s superclass not ParameterizedType");
			return Object.class;
		}

		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

		if (index >= params.length || index < 0) {
			logger.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: "
					+ params.length);
			return Object.class;
		}
		if (!(params[index] instanceof Class)) {
			logger.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
			return Object.class;
		}
		return (Class) params[index];
	}

	/**
	 * 提取集合中的对象的属性,组合成List.
	 * 
	 * @param collection
	 *            来源集合.
	 * @param propertityName
	 *            要提取的属性名.
	 */
	public static List fetchElementPropertyToList(final Collection collection, final String propertyName)
			throws Exception {

		List list = new ArrayList();

		for (Object obj : collection) {
			list.add(PropertyUtils.getProperty(obj, propertyName));
		}

		return list;
	}

	/**
	 * 提取集合中的对象的属性,组合成由分割符分隔的字符串.
	 * 
	 * @param collection
	 *            来源集合.
	 * @param propertityName
	 *            要提取的属性名.
	 * @param separator
	 *            分隔符.
	 */
	public static String fetchElementPropertyToString(final Collection collection, final String propertyName,
			final String separator) throws Exception {
		List list = fetchElementPropertyToList(collection, propertyName);
		return StringUtils.join(list.toArray(), separator);
	}

	public static <T> int getIntValue(T t, String fieldName) {
		return Integer.parseInt(String.valueOf(getFieldValue(t, fieldName)));
	}

	/**
	 * 反射调用方法
	 * 
	 * @param methodName
	 * @param target
	 * @param paramTypes
	 * @param args
	 * @return
	 */
	public static <T> Object invoke(String methodName, T target, Class<?>[] paramTypes, Object... args) {
		Method method = ReflectionUtils.findMethod(target.getClass(), methodName, paramTypes);
		Object obj = ReflectionUtils.invokeMethod(method, target, args);
		return obj;
	}

}
