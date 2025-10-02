// 26. Lambda with Stream Count 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_026 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers.stream()
                            .count();
        System.out.println("Count: " + count);  // Count: 5
    }
}