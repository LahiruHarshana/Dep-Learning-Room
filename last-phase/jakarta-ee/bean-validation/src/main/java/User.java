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
    private String fullName;
    private String email;
    private String password;
}
