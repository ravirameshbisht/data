import java.util.*;
import java.util.stream.*;

public class JAVA_STREAMS_001 {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 5, 10, 6);

        System.out.println("Original List: " + numbers);

        // 1. Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Square each number
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 3. Sort numbers
        List<Integer> sorted = numbers.stream()
                                      .sorted()
                                      .collect(Collectors.toList());
        System.out.println("Sorted List: " + sorted);

        // 4. Find the maximum number
        int max = numbers.stream()
                         .max(Integer::compare)
                         .get();
        System.out.println("Max Value: " + max);

        // 5. Sum of numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // 6. Count numbers greater than 5
        long count = numbers.stream()
                            .filter(n -> n > 5)
                            .count();
        System.out.println("Count > 5: " + count);
    }
}
