import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.executable.ExecutableValidator;

import java.lang.reflect.Executable;
import java.util.Set;

/**
 * @author : L.H.J
 * @File: ObjectValidationDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public class ObjectValidationDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(-1,"Kasun1234",null);
        try(ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory()) {
            //To validate objects
            Validator validator = validatorFactory.getValidator();

            //To validate methods
            //ExecutableValidator executableValidator = validator.forExecutables();
            System.out.println(validator);
            //System.out.println(executableValidator);
            Set<ConstraintViolation<Customer>> constraintViolations = validator.validate(customer);
            if (constraintViolations.isEmpty()){
                System.out.println("Validation passed");
            }else{
                System.out.println("Validation failed");
                constraintViolations.forEach(System.out::println);
            }
        }
    }

}
