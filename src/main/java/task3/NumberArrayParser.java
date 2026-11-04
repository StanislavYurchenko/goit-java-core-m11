package task3;


import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberArrayParser {
    public String parse(String[] objects) {
        return Arrays.stream(objects)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
