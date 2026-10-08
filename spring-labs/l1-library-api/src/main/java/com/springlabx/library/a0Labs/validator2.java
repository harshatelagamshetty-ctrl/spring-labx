package com.springlabx.library.a0Labs;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public  class validator2 implements ConstraintValidator<Min, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.length()<8) return false;
        return true;
    }
}
