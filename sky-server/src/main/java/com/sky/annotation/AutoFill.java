package com.sky.annotation;


import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义注解，用于标识某些方法需要进行功能字段自动填充
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //表示注解 AutoFill 的保留策略为运行时（RUNTIME）,即注解在何时有效。
public @interface AutoFill {
    OperationType value();   //名称为value的元素，该元素的类型为 OperationType。

}
