package lk.ijse.dep12.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: ProfilePicture
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/

@Constraint(validatedBy = ProfilePictureValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProfilePicture {
    String message() default "passowrd must conatain a uoopercase letter , a lowercase letter and a digit";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
