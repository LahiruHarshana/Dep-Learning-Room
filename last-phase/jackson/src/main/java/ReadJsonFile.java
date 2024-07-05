import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : L.H.J
 * @File: ReadJsonFIle
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public class ReadJsonFile {

    public static void main(String[] args) throws IOException {
        InputStream is = ReadJsonFile.class.getResourceAsStream("/todos.json");
        ObjectMapper mapper = new ObjectMapper();
        TodoItem[] todoItems = mapper.readValue(is,TodoItem[].class);
        for (TodoItem todoItem : todoItems){
            System.out.println(todoItem);
        }
    }
}
