package lk.ijse.dep12.to;

import jakarta.validation.ConstraintViolation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Set;

/**
 * @author : L.H.J
 * @File: ErrorResponse
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-10, Wednesday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private int code;
    private String status;
    private String message;
    private HashMap<String,String> errors = new HashMap<>();

    public ErrorResponse(int code, String status, String message, Set<ConstraintViolation<User>> violations) {
        this.code = code;
        this.status = status;
        this.message = message;
        violations.forEach(violation -> errors.put(violation.getPropertyPath().toString(),
                violation.getMessage().toString()));    }
}
