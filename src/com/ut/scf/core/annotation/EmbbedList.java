package com.ut.scf.core.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 聚合资源，带有此注解的成员变量类型必须是List
 * @author shenying
 *
 */
@Documented
@Target({ FIELD })
@Retention(RUNTIME)
public @interface EmbbedList {

}
