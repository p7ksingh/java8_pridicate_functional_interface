import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

interface Pridicateint {
    boolean test(String s);
}

public class PridicateFunction1 {

    public static void main(String[] args) {
        Pridicateint p = s -> s.length() > 5;
        Predicate<Integer> p2 = s -> s > 10;

        System.out.println(p.test("pankaj"));
        System.out.println(p2.test(9));
        Predicate<Collection> p3 = s -> s.isEmpty();
        List<String> p4 = List.of("hello");
        System.out.println(p3.test(p4));
    }
}
