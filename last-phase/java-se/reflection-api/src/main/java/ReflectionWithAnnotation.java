/**
 * @author : L.H.J
 * @File: ReflectionWithAnnotation
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/

public class ReflectionWithAnnotation {
    @Dep12(startingDate = "2024-01-23")
    static String startingDate;
    @Dep12(duration = 8,startingDate = "2024-01-24")
    static int duration;
    public static void main(String[] args) {

    }
}
