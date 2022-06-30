package com.cj.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * Created by Jinmunan
 * 2022/6/30
 * 8:30
 */
@Target(ElementType.METHOD) //应用在方法上
@Retention(RetentionPolicy.RUNTIME) //运行时执行
public @interface MyLog {
	/**
	 * 方法描述
	 */
	String desc() default "";
}
