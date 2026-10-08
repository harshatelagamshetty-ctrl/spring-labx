package com.springlabx.library.a0Labs;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class validator1 implements ConstraintValidator<NotNull,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null) return false;
        return true;
    }
}