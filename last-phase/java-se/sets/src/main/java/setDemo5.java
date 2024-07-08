import java.util.HashSet;
import java.util.Set;

/**
 * @author : L.H.J
 * @File: setDemo5
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public class setDemo5 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kasun", 93);
        Student s2 = new Student(2, "Nuwan", 86);
        Student s3 = new Student(3, "Ruwan", 73);
        Student s4 = new Student(4, "Supun", 21);
        Student s5 = new Student(5, "Kamal", 19);


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s5);
        studentSet.forEach(System.out::println);
    }
}
