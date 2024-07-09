/**
 * @author : L.H.J
 * @File: Test
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Demo.class==new Demo().getClass());
        System.out.println(Demo.class instanceof Object);
        System.out.println(Demo.class instanceof Class);
    }
}