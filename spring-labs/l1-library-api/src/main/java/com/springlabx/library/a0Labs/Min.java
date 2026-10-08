package com.springlabx.library.a0Labs;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = validator2.class)
public @interface Min {
    public String message() default "The input is less than the minimum requirement!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
