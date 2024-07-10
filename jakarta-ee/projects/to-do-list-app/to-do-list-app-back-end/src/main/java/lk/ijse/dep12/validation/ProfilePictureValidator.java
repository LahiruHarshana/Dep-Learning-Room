package lk.ijse.dep12.validation;

import jakarta.servlet.http.Part;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author : L.H.J
 * @File: ProfilePictureValidator
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/
public class ProfilePictureValidator implements ConstraintValidator<ProfilePicture, Part> {
    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getContentType().startsWith("image/");
    }
}
