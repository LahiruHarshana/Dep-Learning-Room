import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author : L.H.J
 * @File: JavaObjectToJson
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public class JavaObjectToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Customer customer = new Customer(1, "Kasun Samptha", "Galle");
//        String json = """
//                {
//                "id":"%s",
//                "name": "%s"
//                "address":"%s"
//                }
//                """.formatted(customer.getId(),customer.getName(),customer.getAddress());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(customer);
        System.out.println(json);
    }
}
