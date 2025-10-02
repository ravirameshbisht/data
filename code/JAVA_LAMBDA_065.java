// 65. Lambda with Stream Reduce for Concatenation 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_065 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String result = list.stream()
                            .reduce("", (a, b) -> a + b);
        System.out.println(result);  // JavaSpringLambda
    }
}