import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author : L.H.J
 * @File: setDemo4
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-08, Monday
 **/
public class setDemo4 {
    public static void main(String[] args) {
        HashSet<String> nameSet1 = new HashSet<>();
        nameSet1.add("Kasun");
        nameSet1.add("Nuwan");
        nameSet1.add("Saman");
        nameSet1.add("Lahiru");
        nameSet1.add("Saan");

        nameSet1.forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        LinkedHashSet<String> nameSet2 = new LinkedHashSet<>();
        nameSet2.add("Kasun");
        nameSet2.add("Nuwan");
        nameSet2.add("Saman");
        nameSet2.add("Lahiru");
        nameSet2.add("Saan");

        nameSet2.forEach(System.out::println);

        System.out.println("--------------------------------------------------");
        TreeSet<String> nameSet3 = new TreeSet<>();
        nameSet3.add("Kasun");
        nameSet3.add("Nuwan");
        nameSet3.add("Saman");
        nameSet3.add("Lahiru");
        nameSet3.add("Saan");

        nameSet3.forEach(System.out::println);
    }
}
