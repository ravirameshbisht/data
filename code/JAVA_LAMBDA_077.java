// 77. Lambda with Stream Collect and Joining 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_077 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String result = list.stream()
                            .collect(Collectors.joining(", "));
        System.out.println(result);  // Java, Spring, Lambda
    }
}