import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author : L.H.J
 * @File: Employee
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public record Employee(Integer id,
                       @JsonProperty("first_name") String firstName,
                       @JsonProperty("last_name") String lastName,
                       String contact) {
}
