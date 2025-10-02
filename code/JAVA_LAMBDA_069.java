// 69. Lambda with Stream Max
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JAVA_LAMBDA_069 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String max = list.stream()
                         .max(Comparator.comparingInt(String::length))
                         .orElse("No max");
        System.out.println(max);  // Spring
    }
}