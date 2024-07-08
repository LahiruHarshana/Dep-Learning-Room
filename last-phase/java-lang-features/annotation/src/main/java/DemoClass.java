/**
 * @author : L.H.J
 * @File: DemoClass
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
@MyMarkerAnnotation
public class  DemoClass {

    @MyMarkerAnnotation
    int instanceVariable;

    @MyMarkerAnnotation
    public static void myMethod1(){

    }


    @MySingleElementAnnotation()
    @MySingleElementAnnotationFake(myValue = 10)
    public static void myMethod2(){

    }
}
