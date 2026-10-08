package com.springlabx.library.a0Labs;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class ValidationTest {

    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        TestClass test = new TestClass();

        test.name = "";
        test.password = "hello";
        test.username = "abc";

        Set<ConstraintViolation<TestClass>> violations =
                validator.validate(test);

        for (ConstraintViolation<TestClass> violation : violations) {
            System.out.println(
                    violation.getPropertyPath() + " : " +
                    violation.getMessage()
            );
        }

        factory.close();
    }
}

class TestClass {

    @NotNull
    String name;

    @Min
    String password;

    @Size
    String username;
}