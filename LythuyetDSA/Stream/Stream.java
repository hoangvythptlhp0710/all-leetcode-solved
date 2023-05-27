package LythuyetDSA.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        //Collect method
        System.out.println("Collect method");
        List<String> list = Arrays.asList("a", "b", "c", "d");
        List<String> filter = list.stream().collect((Collectors.toList()));
        System.out.println(filter);

        System.out.println();
        //forEach method
        System.out.println("forEach method");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "...", "jkl");
        strings.stream().forEach(System.out::println);

        System.out.println();

        //Reduce method:
        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String result = strings2.stream().reduce("-", String::concat);
        System.out.println(result);

        System.out.println();

        //Map method:
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().distinct().map(i -> i * i).forEach(System.out::println);
    }

}
