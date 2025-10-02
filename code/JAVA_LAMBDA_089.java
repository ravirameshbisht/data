// 89. Lambda with Stream Reduce with Identity 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_089 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);  // Sum: 15
    }
}