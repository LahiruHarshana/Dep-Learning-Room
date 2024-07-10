package lk.ijse.dep12.to;

import jakarta.validation.ConstraintViolation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private String type;
    private int status;
    private String title;
    private String detail;
    private List<HashMap<String,String>> errors = new ArrayList<>();

    public ErrorResponse(String type,int code, String status, String message, Set<ConstraintViolation<User>> violations) {
        this.type = type;
        this.status = code;
        this.title = status;
        this.detail = message;
        violations.forEach(violation -> {
            HashMap<String,String> error = new HashMap<>();
            error.put("details",violation.getMessage());
            error.put("pointer",violation.getPropertyPath().toString());
            errors.add(error);
        });

        }

}
