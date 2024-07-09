import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: Password
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/

@Constraint(validatedBy = PasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "Invalid password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
