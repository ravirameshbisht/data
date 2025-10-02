// 92. Lambda with Stream Count on Distinct Elements 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_092 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");
        long count = list.stream()
                         .distinct()
                         .count();
        System.out.println("Count: " + count);  // Count: 3
    }
}