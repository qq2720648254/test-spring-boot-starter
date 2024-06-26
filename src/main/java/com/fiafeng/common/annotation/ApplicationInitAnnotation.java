package com.fiafeng.common.annotation;


import java.lang.annotation.*;

@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ApplicationInitAnnotation {
    int value() default 0;
}
