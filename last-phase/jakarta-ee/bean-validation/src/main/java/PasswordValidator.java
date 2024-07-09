import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author : L.H.J
 * @File: PasswordValidator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class PasswordValidator implements ConstraintValidator<Password,String> {
    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        if (password.matches(".*\\d.*")) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[a-z].*")) return false;
        char[] charArray = password.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (Character c : charArray) {
            characters.add(c);
        }
        return characters.size() >= charArray.length;
    }
}
