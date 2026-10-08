package com.springlabx.library.a0Labs;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = validator3.class)
public @interface Size {
    String message() default "The input is less than the minimum requirement!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}