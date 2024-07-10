package lk.ijse.dep12.to;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.servlet.http.Part;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lk.ijse.dep12.validation.Password;
import lk.ijse.dep12.validation.ProfilePicture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: User
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
    private Integer id;
    @NotBlank(message = "Name can't be empty or null")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must only contain letters and spaces")
    private String name;
    @NotBlank(message = "User email can't be empty or null")
    @Email
    private String email;
    @JsonIgnore
    @NotBlank(message = "User password can't be empty or null")
    @Password
    private String password;
    @JsonIgnore
    @ProfilePicture
    private Part picture;
}
