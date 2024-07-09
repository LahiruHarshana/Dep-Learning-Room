import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author : L.H.J
 * @File: ChangeRunItemConstantValueDemo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/
public class ChangeRunItemConstantValueDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(Demo4.MY_CONSTANT);
//        Demo4.MY_CONSTANT = 5.11
        Field myConstant = Demo4.class.getDeclaredField("MY_CONSTANT");
        myConstant.setAccessible(true);

        System.out.println(myConstant.getModifiers());


        //Only Works up to java 10
//        Field modifiersFields = Field.class.getDeclaredField("modifiers");
//        modifiersFields.setAccessible(true);
//        modifiersFields.setInt(myConstant,myConstant.getModifiers() & ~Modifier.FINAL);
//
//        myConstant.set(null,5);
//        System.out.println(Demo4.MY_CONSTANT);
//        Demo4.MY_CONSTANT = 10;
//        System.out.println(Demo4.MY_CONSTANT);
    }
}

class Demo4{
    public static final Object MY_CONSTANT = Double.valueOf(3.14);

}
