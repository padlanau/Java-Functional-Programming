package lodgerio.functional.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainConsumer {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");


        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);
    }
}
