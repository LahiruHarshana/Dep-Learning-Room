import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: User
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank
    @Pattern(regexp = "^[A-Za-z]+$")
    private String fullName;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
