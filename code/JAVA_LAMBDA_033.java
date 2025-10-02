// 33. Lambda for Averaging Integers
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_033 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0);
        System.out.println("Average: " + average);  // Average: 3.0
    }
}