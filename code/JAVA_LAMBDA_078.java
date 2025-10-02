// 78. Lambda with Stream AnyMatch 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_078 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean anyMatch = list.stream()
                               .anyMatch(s -> s.startsWith("S"));
        System.out.println(anyMatch);  // true
    }
}