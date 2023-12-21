import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PridicateJoining {

    public static void main(String[] args) {
        // System.out.println("negate(),and(),or()");
        Predicate<Integer> p = dt -> dt > 5;
        System.out.println(p.test(11));

        Predicate<String> p1 = dt -> dt.length() > 10;
        // Predicate<String> p2 = dt -> dt.equalsIgnoreCase("pankajkumarsingh");
        // Predicate<String> p3 = p1.and(p2);
        // System.out.println(p3.test("Pankajkumarsingh"));
        Predicate<Collection> p4 = dt -> dt.isEmpty();
        List list = new ArrayList();
        System.out.println(p4.test(list));
        // filter the data with >10 and even number
         int[] x1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        
        Predicate<Integer> p5 = dt -> dt > 10;
        Predicate<Integer> p6 = dt -> dt % 2 == 0;
        Predicate<Integer> p7 = p5.and(p6);
        m1(p7, x);
        m1(p6.negate(), x);
        m1(p5.and(p6), x);
        m1(p5.or(p6), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }
    }
}