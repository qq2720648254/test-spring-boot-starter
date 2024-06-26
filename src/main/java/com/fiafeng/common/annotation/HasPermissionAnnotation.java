package com.fiafeng.common.annotation;

import java.lang.annotation.*;

/**
 * @author Fiafeng
 * @create 2023/12/08
 * @description
 */
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HasPermissionAnnotation {
    String[] value();

}
