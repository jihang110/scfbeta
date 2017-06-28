package com.ut.scf.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 共享资源，带有此注解的成员变量，会在流程发起时插入SYS_TEMP_RESOURCE_POOL一条占用资源记录，并在流程结束时释放此记录<br>
 * definition=流程定义KEY <br>
 * instanceid =流程实例ID <br>
 * key = 成员变量名称 <br>
 * value = 成员变量的值 <br>
 * shareval = toShare属性同名的成员变量的值 <br>
 * 
 * @author shenying
 *
 */
@Documented
@Target({ FIELD })
@Retention(RUNTIME)
public @interface ShareResource {

	String toShare();

}
