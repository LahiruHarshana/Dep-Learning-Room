import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: TodoItem
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoItem {
    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;

}
