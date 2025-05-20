package ly.sparsearry;

import java.util.List;
import java.util.stream.Collectors;

public class Demo03 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "", "banana", "", "cherry", "  ", "date");

        List<String> strings1 = strings.stream()
                .filter(s -> !s.trim().isEmpty())
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("处理后的列表: " + strings1);

    }
}
