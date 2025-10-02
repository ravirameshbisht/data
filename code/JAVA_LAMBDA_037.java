// 37. Lambda with Stream MapToInt 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_037 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream()
            .mapToInt(String::length)
            .forEach(System.out::println);  // 4, 6, 6
    }
}