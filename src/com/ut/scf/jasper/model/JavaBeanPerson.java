package com.ut.scf.jasper.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * iReport测试bean: Person实体类 
 * @author wukai
 * @Create 2017-5-23 14:39:27 
 */  
public class JavaBeanPerson {
	private String name; // 姓名
	private String sex; // 性别
	private int age; // 年龄
	private String hometown;// 籍贯
	private String phone; // 电话号码

	public JavaBeanPerson() {
	}

	public JavaBeanPerson(String name, String sex, int age, String hometown,
			String phone) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.hometown = hometown;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static List<JavaBeanPerson> getList() {
		List<JavaBeanPerson> list = new ArrayList<JavaBeanPerson>();
		list.add(new JavaBeanPerson("Lily", "female", 22, "Hubei", "10086"));
		list.add(new JavaBeanPerson("Macro", "male", 33, "Beijing",
				"13800000000"));
		list.add(new JavaBeanPerson("Andy", "male", 44, "HongKong",
				"13812345678"));
		list.add(new JavaBeanPerson("Linder", "female", 28, "Guangxi",
				"18677778888"));
		list.add(new JavaBeanPerson("Jessie", "female", 26, "Gansu",
				"18219177720"));
		return list;
	}
}
