// 95. Lambda with Stream Peek 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_095 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream()
            .peek(System.out::println)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    }
}