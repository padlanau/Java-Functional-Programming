package lodgerio.functional.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreams {

    public static void main(String[] args) {
            /*
             *  Example #1
            */

        // Create a stream
        Stream<String> shoppingStream = Stream.of("apples", "bananas", "cherries", "coffee");

        // Create a stream from other collection types :
        // 1. Array
        String[] shoppingArray = new String[]{"apples", "bananas", "cherries", "coffee"};
        Stream<String> shopArrayStream = Arrays.stream(shoppingArray);

        // 2. Lists
        //List<String> shoppingList = List.of("apples", "bananas", "cherries", "coffee");
        List<String> shoppingList = Arrays.asList("apples", "bananas", "cherries", "coffee");
        Stream<String> shoppingListStream = shoppingList.stream();

        // For loop in one line
        shoppingList.stream().forEach(System.out::println);
        shoppingList.parallelStream().forEach(System.out::println);

        // Match
        boolean isOnList = shoppingList.stream()
                .anyMatch(item -> item.contains("apples"));

        // Filter
        Stream<String> itemsInAisle = shoppingList.stream()
                .filter(item -> item.startsWith("c"));

        // Map
        // List<Integer> numbersList = List.of(4, 2, 6, 9, 10, 17, 3);
        List<Integer> numbersList = Arrays.asList(4, 2, 6, 9, 10, 17, 3);

        Stream<Integer> doubledStream = numbersList.stream()
                .map(n -> n*n);

        // Collectors to list
        List<Integer> doubledList = numbersList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        /*
         *  Example #2
         */

        String panda = "  Panda";
        String fish = "  fish  ";
        String horse = "Horse   ";
        String cat = " CAT";
        String nothing = "   ";

        // Trim
        //List<String> animals = List.of(panda, fish, horse, cat, nothing);
        List<String> animals = Arrays.asList(panda, fish, horse, cat, nothing);
        animals.stream().forEach(s -> System.out.println(s.trim()));

        // Collect
        List<String> trimmed = animals.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());

        // Collect
        List<String> realAnimals = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Collect
        List<String> normalizedAnimalsNames = realAnimals.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Normalized Animal Names " + normalizedAnimalsNames);

        /*
         *  Example #3
         */

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements that are divisible by 5

        list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);


        /*
         *  Example #4
         */

        Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the elements having UpperCase Character at index 1
        stream.filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);


        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the elements ending with s
        stream.filter(str -> str.endsWith("s"))
                .forEach(System.out::println);

        /*
         *  Example #5
         */

        // Find even numbers from Stream using Predicate ream

        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

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

        list5.stream().filter(condition).forEach(System.out::println);


        /*
         *  Example #6
         */



    }
}
