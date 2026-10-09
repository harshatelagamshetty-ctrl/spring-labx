package com.springlabx.library.a0Labs;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class validator4 implements ConstraintValidator<Email, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.length()<10) return false;
        else if(value.length()>10 && value.endsWith("@gmail.com")) return true;
        else return false;
    }
}
