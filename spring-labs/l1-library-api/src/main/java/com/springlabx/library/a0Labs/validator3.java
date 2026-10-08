package com.springlabx.library.a0Labs;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class validator3 implements ConstraintValidator<Size, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        int x=value.length();
        if(x<5 || x>10) return false;
        return true;
    }
}
