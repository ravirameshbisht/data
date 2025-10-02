// 70. Lambda with Stream Min 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JAVA_LAMBDA_070 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String min = list.stream()
                         .min(Comparator.comparingInt(String::length))
                         .orElse("No min");
        System.out.println(min);  // Java
    }
}