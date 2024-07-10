package lk.ijse.dep12.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author : L.H.J
 * @File: PasswordValidator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class PasswordValidator implements ConstraintValidator<Password,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        
    }
}
