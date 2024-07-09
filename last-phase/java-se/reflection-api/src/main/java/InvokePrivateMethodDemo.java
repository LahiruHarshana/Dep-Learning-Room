import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : L.H.J
 * @File: InvokePrivateMethodDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class InvokePrivateMethodDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method myMethod = Demo1.class.getDeclaredMethod("myMethod");
        myMethod.setAccessible(true);
        myMethod.invoke(Demo1.class);
    }
}
class Demo1{
    private static void myMethod(){
        System.out.println("I'am private , outsiders can't invoke me");
    }
}