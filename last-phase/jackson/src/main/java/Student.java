import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author : L.H.J
 * @File: Student
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-05, Friday
 **/
public record Student(Integer id , String name , String contact , @JsonIgnore byte[] profilePicture) {
}
