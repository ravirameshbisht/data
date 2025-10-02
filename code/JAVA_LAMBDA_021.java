// 21. Lambda with Stream Reduce 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_021 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);  // Sum: 15
    }
}