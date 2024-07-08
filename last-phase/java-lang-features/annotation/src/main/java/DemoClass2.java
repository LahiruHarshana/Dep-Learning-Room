/**
 * @author : L.H.J
 * @File: DemoClass2
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public class DemoClass2 {
    @DEP(studentCount = 10)
    int instanceVariavle;

    public static void printDepDetails(@DEP(studentCount = 20)String id,
                                       @DEP(studentCount = 20) String name){

        @DEP(studentCount = 20)
        int localVariable = 20;
    }
}
