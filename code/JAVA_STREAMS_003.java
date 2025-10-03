// Q3. Write a Java program to find duplicate elements in a list using streams.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_STREAMS_003 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 4);

        // Use streams to find duplicate elements
        List<Integer> duplicates = numbers.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        // Print the duplicate elements
        System.out.println("Duplicate elements: " + duplicates);
    }
}