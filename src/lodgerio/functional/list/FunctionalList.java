package lodgerio.functional.list;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalList {

    public static void main(String[] args) {

        /*
        *  Example 1
        * */
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
         *  Example 2
         * */
        List<String> list2 = Arrays.asList("3", "6", "8", "14", "15");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        list2.stream().mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        /*
         *  Example 3
         * */
        List<String> list3 = Arrays.asList("Geeks", "for", "gfg", "GeeksforGeeks", "GeeksQuiz");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        // which contains length of each element in
        // given Stream
        list3.stream().mapToInt(str -> str.length()).forEach(System.out::println);
        list3.stream().map(str -> str.length()).forEach(System.out::println);

        /*
         *  Example 4
         * */

        List<String> list4 = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");

        // Using Stream map(Function mapper) to convert the Strings in stream to UpperCase form
        List<String> answer = list4.stream().map(String::toUpperCase).collect(Collectors.toList());

        /*
         *  Example 5. The Java Stream map () method converts (maps) an element to another object. For instance, if you had a list of strings it could convert each string to lowercase, uppercase, or to a substring of the original string, or something completely else.
         * */

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

        /*
         *  Example 6. Map AND Filter
         * */

        List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = list6.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        /*
         *  Example 7
         * */
        List<Integer> list7 = Arrays.asList(2, 4, 6, 8, 10);

        // Java program to iterate over Stream of Integers and verify encounter ordering
        list7.stream().parallel().forEach( System.out::println );        //1

        list7.stream().parallel().forEachOrdered( System.out::println ); //2

        // Java program to iterate over Stream of Integers and to print into the Console
        list7.stream().forEachOrdered( System.out::println );

        // Java program to iterate over Stream of Integers in reverse order
        list7.stream()
                .sorted(Comparator.reverseOrder())
                .forEachOrdered(System.out::println);
        /*
         *  Example 8
         * */

        List<Integer> arr = Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
        Predicate<Integer> cond = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer i) {
                if (i % 4 == 0) {
                    return true;
                }
                return false;
            }
        };
        arr.stream().filter(cond).forEach(System.out::println);


        /*
         *  Example 9
         * */

        /*
         *  Example 10
         * */

        /*
         *  Example 11
         * */

        /*
         *  Example 12
         * */

        /*
         *  Example 13
         * */

        /*
         *  Example 14
         * */

        /*
         *  Example 15
         * */

        /*
         *  Example 16
         * */

        /*
         *  Example 17
         * */

        /*
         *  Example 18
         * */

        /*
         *  Example 19
         * */

        /*
         *  Example 20
         * */

    }
}
