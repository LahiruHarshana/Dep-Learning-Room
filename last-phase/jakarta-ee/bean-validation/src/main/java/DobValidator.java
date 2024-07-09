import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author : L.H.J
 * @File: DobValidator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class DobValidator implements ConstraintValidator<Dob, LocalDate> {
    @Override
    public boolean isValid(LocalDate birthday, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate today = LocalDate.now();
        int years = Period.between(today, birthday).getYears();
        return years >= 18 && years <= 60;

    }
}
