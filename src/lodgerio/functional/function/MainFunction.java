package lodgerio.functional.function;

import java.util.ArrayList;
import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");

        /*
        Function<T,R> represents a function that takes a single parameter(T) and returns a single value(R)
        */
        
        Function<Integer, Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));

    }
}
