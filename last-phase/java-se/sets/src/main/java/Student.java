import lombok.*;

/**
 * @author : L.H.J
 * @File: Customer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/



@Getter
@Setter
@EqualsAndHashCode
@ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public class Student{
        private int id;
        private String name;
        private int totalMarks;
    }
