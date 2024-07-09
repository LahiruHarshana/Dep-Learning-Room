import java.io.File;
import java.lang.reflect.Field;

/**
 * @author : L.H.J
 * @File: ReflectionDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field[] declaredField = Student.class.getDeclaredFields();
        for (Field filed : declaredField) {
            System.out.println(filed);
        }
        Field addressField = Student.class.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(Student.class,"Panadura");
        Student.printAddress();
    }
}

class Student{
    private String id;
    private String name;
    private static String address;

    public static void printAddress(){
        System.out.println(address);
    }
}