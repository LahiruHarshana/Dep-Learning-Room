import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author : L.H.J
 * @File: setDemo1
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public class setDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(10);
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(30));
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(40));
        System.out.println(numberSet.add(50));

        for (Integer i : numberSet) {
            System.out.println(i);
        }

    }
}
