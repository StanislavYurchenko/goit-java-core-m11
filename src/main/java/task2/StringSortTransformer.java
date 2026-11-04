package task2;

import java.util.Comparator;
import java.util.List;

public class StringSortTransformer {
    public List<String> transform(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
