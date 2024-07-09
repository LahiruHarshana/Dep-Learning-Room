import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

/**
 * @author : L.H.J
 * @File: UserValidationDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class UserValidationDemo {

    public static void main(String[] args) {
        User user = new User("Kasun Sampath", "Kasun@ijse.lk", "kasun");
        try(ValidatorFactory vf = Validation.buildDefaultValidatorFactory()){
            Validator validator = vf.getValidator();
            Set<ConstraintViolation<User>> violationSet = validator.validate(user);
            if (violationSet.isEmpty()){
                System.out.println("Validation Password");
            }else{
                System.out.println("Validation Failed");
                violationSet.forEach(System.out::println);
            }

        }
    }
}
