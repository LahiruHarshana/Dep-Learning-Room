import lombok.*;

import java.util.Objects;

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


        @Override
        public int hashCode(){
                System.out.println("hashCode()");
                return Objects.hash(id,name,totalMarks);
        }

        @Override
        public boolean equals(Object obj){
                System.out.println("equals()");
                if(obj instanceof Student s){
                        return s.getId() == getId() && s.getName().equals(getName()) && s.getTotalMarks() == getTotalMarks();
                }else {
                        throw new ClassCastException();
                }
        }
}
