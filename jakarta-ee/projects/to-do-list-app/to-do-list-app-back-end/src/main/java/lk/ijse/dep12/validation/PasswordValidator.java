package lk.ijse.dep12.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;

/**
 * @author : L.H.J
 * @File: PasswordValidator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class PasswordValidator implements ConstraintValidator<Password,String> {
    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {


        if (password.length() < 6) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password must be at least 6 characters")
                    .addConstraintViolation();
            return false;
        }
        if (password.matches(".*[0-9].*")) return false;
        if (password.matches(".*[A-Z].*")) return false;
        if (password.matches(".*[a-z].*")) return false;
        HashSet<Character> charachterSet = new HashSet<>();
        for (char c : password.toCharArray()) charachterSet.add(c);
        if (charachterSet.size() != password.length()) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Password can't conatin repeat characters")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
