package lodgerio.functional.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static lodgerio.functional.predicate.Gender.*;


public class MainPredicate {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
                    students.add("Sally");
                    students.add("Polly");
                    students.add("Molly");
                    students.add("Tony");

        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));

        /*
         *  Example #2
         */

        List<Person> people = Arrays.asList(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);


        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());			// collecting as list
        females2.forEach(System.out::println);

       // -OR-

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females21 = people.stream()
                .filter(personPredicate)        //   	<=== this is the difference above
                .collect(Collectors.toList());	// collecting as list
        females21.forEach(System.out::println);


        /*
         *  Example #3   Predicate + Stream
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> condition = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0) {
                    return true;
                }
                return false;
            }
        };

        list.stream().filter(condition).forEach(System.out::println);

        System.out.println("----");



        /*
         *  Example #4
         */



        /*
         *  Example #5
         */

    }
}
