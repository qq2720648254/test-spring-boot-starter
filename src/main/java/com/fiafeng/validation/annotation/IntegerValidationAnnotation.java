package com.fiafeng.validation.annotation;


import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IntegerValidationAnnotation {
    /**
     * 最小值
     *
     * @return 最小值
     */
    int min() default -1;

    /**
     * 最大值
     *
     * @return 最大值
     */
    int max() default -1;


    /**
     * 参数名称
     *
     * @return 参数名称
     */
    String fieldName() default "";

    /**
     * 默认是不允许为null的
     */
    boolean allowNull() default true;

}