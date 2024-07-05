import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author : L.H.J
 * @File: EmployeeToJson
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public class EmployeeToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Employee employee = new Employee(1, "Kasun", "Sampath", "0718334554");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(employee);
        System.out.println(json);
    }
}
