// 24. Lambda with Stream Distinct 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_024 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        numbers.stream()
               .distinct()
               .forEach(System.out::println);  // 1, 2, 3, 4, 5
    }
}