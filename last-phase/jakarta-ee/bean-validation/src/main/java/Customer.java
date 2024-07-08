import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private int id;
    private String name;
    private String address;
}