import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : L.H.J
 * @File: ReflectionWithAnnotation
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-09, Tuesday
 **/

@Dep12(startingDate = "2025-01-01")
public class ReflectionWithAnnotation {
    @Dep12(startingDate = "2024-01-23")
    static String startingDate;


    @Dep12(duration = 8,startingDate = "2024-01-24")
    static void printDep12Details(int duration,String startingDate){
        System.out.println("Duration: "+duration);
        System.out.println("Starting Date: "+startingDate);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//       Dep12 declaredAnnotations = ReflectionWithAnnotation.class.getDeclaredAnnotation(Dep12.class);
//        System.out.println(declaredAnnotations.startingDate());
//        System.out.println(declaredAnnotations.duration());
//        System.out.println("------------------------------------------");
//        Field st = ReflectionWithAnnotation.class.getDeclaredField("startingDate");
//        Dep12 declaredAnnotation = st.getDeclaredAnnotation(Dep12.class);
//        st.set(ReflectionWithAnnotation.class,declaredAnnotation.startingDate());
//        System.out.println(startingDate);
//        System.out.println("------------------------------------------");
//
//
//        Method printDep12Details = ReflectionWithAnnotation.class.getDeclaredMethod("printDep12Details", int.class, String.class);
//        Dep12 declaredAnnotation1 = printDep12Details.getDeclaredAnnotation(Dep12.class);
//        int duration = declaredAnnotation1.duration();
//        String start = declaredAnnotation1.startingDate();
//
//        printDep12Details.invoke(ReflectionWithAnnotation.class,duration,start);

    }
}
