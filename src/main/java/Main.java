import task1.OddNamesFilter;
import task2.StringSortTransformer;
import task3.NumberArrayParser;
import task4.PseudoRandomStream;
import task5.StreamZipper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");
        OddNamesFilter filter = new OddNamesFilter();
        String oddNames = filter.getOdd(Arrays.asList("Ivan", "Alex", "Maria", "John"));
        System.out.println(oddNames);
        System.out.println();

        System.out.println("=== Task 2 ===");
        StringSortTransformer transformer = new StringSortTransformer();
        List<String> names = transformer.transform(Arrays.asList("Ivan", "Alex", "Maria", "John"));
        System.out.println(names.toString());
        System.out.println();

        System.out.println("=== Task 3 ===");
        NumberArrayParser parser = new NumberArrayParser();
        String numbers = parser.parse(new String[]{"1, 2, 0", "4, 5"});
        System.out.println(numbers);
        System.out.println();

        System.out.println("=== Task 4 ===");
        Long a = 25214903917L;
        Long c = 11L;
        Long m = (long) Math.pow(2, 48);
        PseudoRandomStream stream = new PseudoRandomStream();
        System.out.println(stream.generate(a, c, m).limit(15).toList());
        System.out.println();

        System.out.println("=== Task 5 ===");

        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");

        List<String> zipped = StreamZipper.zip(first, second).toList();

        System.out.println(zipped);
        System.out.println();

    }
}