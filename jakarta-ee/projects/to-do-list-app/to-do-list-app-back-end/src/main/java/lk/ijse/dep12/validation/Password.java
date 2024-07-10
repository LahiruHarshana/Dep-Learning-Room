package lk.ijse.dep12.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: Password
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/



@Constraint(validatedBy = PasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Password must contain at least one uppercase letter, one lowercase letter and one digit";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

