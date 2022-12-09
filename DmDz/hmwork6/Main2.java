import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    static Semin semin = new Semin();
    static String temp = "";

    public static void main(String[] args) {
        //System.out.println(semin.methodSize());

        Set<Integer> integers = new HashSet<>();
//        integers.add(5);


        for (int i = 0; i < 10; i++) {

            int a = new Random().nextInt(10);
            System.out.print(a + ", ");
            semin.methodAdd(a);
            integers.add(a);
        }

        System.out.println();
        System.out.println(semin.methodRead());
        //System.out.println(integers);

        for (int a: integers) {
            System.out.print(a + ", ");

        }

        Iterator<Integer> abcd = integers.iterator();
        while(abcd.hasNext()) {
            int i = abcd.next();
            //abcd.remove();
        }

        //integers.forEach(n -> System.out.print(temp = temp + n + " | "));

        Set<Integer> integerSet = new TreeSet<>();
        System.out.println();

        for (int i = 0; i < 3; i++) {

            int a = new Random().nextInt(10);
            System.out.print(a + ", ");
            integerSet.add(a);
        }
        System.out.println();


        //integers.retainAll(integerSet);

        //System.out.println(integers.toString());

        List<Integer> a = integers.stream().filter(integerSet:: contains).collect(Collectors.toList());
        System.out.println(a);








    }
}
