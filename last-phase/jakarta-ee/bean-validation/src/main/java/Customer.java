import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
 * @author : L.H.J
 * @File: Customer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Positive
    private int id;
    @NotBlank
    @Pattern(regexp = "^[A-Za-z]+$",message = "${validatedValue += ' something'} is invalid name")
    private String name;
    @NotBlank(message = "address can't be empty or null")
    @Length(min = 3)
    private String address;
}