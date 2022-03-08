package lodgerio.functional.predicate;

import java.util.ArrayList;
import java.util.function.IntPredicate;

public class MainPredicate {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");

        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));
    }
}
