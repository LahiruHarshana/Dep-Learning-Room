import jakarta.validation.Constraint;

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
}
