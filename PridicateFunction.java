interface PridicateTest {
    boolean test(String s);
}

public class PridicateFunction implements PridicateTest {

    @Override
    public boolean test(String s) {
        if (s.length() > 6) {
            System.out.println("truetype");
            return true;
        } else {
            System.out.println("falsetype");
            return false;
        }

    }

    public static void main(String[] args) {
        PridicateTest f = new PridicateFunction();
        f.test("qwee");
    }
}
