// 32. Lambda for Summing Integers 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_032 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum: " + sum);  // Sum: 15
    }
}