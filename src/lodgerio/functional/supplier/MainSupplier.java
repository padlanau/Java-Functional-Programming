package lodgerio.functional.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class MainSupplier {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");

        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());
    }
}
