package com.springlabx.library.a0Labs;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;


import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = validator1.class)
public @interface NotNull {
    public String defaultMessage() default "The input is null!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}