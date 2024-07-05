import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author : L.H.J
 * @File: StudentToJson
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public class StudentToJson {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student(1, "Tharindu", "0718334554",
                new byte[]{25, 45, 34, -122, 22, 34});
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(student);
        System.out.println(json);
    }
}
