import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

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
        HibernateConstraintValidatorContext elContext = constraintValidatorContext.unwrap(HibernateConstraintValidatorContext.class);
        elContext.addExpressionVariable("abc", this);
        LocalDate today = LocalDate.now();
        int years = Period.between(birthday, today).getYears();
        return years >= 18 && years <= 60;
    }
//    public boolean isChild(LocalDate birthday){
//        return Period.between(birthday, LocalDate.now()).getYears() < 18;
//    }

}
