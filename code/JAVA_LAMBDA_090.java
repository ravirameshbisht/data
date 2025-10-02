// 90. Lambda with Stream Reduce for Multiplication 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_090 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int product = list.stream()
                          .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);  // Product: 24
    }
}