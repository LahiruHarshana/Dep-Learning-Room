import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

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


        //
        Map<String, Object> properties = new LinkedHashMap<>();
        properties.put("id",customer.getId());
        properties.put("name",customer.getName());
        properties.put("address",customer.getAddress());
        String json2 = mapper.writeValueAsString(properties);
        System.out.println(json2);
    }
}
