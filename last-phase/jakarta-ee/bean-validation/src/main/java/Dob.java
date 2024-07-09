import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author : L.H.J
 * @File: Dob
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
@Constraint(validatedBy = DobValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dob {
    String message() default "Tikak pba tiyena ekek wenna ona";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

