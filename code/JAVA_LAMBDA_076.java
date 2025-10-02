// 76. Lambda with Stream Filter and FindFirst 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_076 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String first = list.stream()
                           .filter(s -> s.startsWith("S"))
                           .findFirst()
                           .orElse("Not found");
        System.out.println(first);  // Spring
    }
}