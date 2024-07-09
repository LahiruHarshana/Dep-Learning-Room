import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : L.H.J
 * @File: InvokePrivateConstructor
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class InvokePrivateConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor<?> declaredConstructor = Demo3.class.getDeclaredConstructors()[0];
        Constructor<Demo3> noArgsConstructor = Demo3.class.getDeclaredConstructor();
        noArgsConstructor.setAccessible(true);
        Demo3 demo3 = noArgsConstructor.newInstance();
        System.out.println(demo3);
    }
}

class Demo3{
    private Demo3(){
        System.out.println("No one can invoke me");
    }
}
