package com.springlabx.library.a0Labs;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=validator4.class)
public @interface Email {
    String message() default "Invalid Email!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}