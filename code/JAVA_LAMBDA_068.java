// 68. Lambda with Stream Filter and Count 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_068 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        long count = list.stream()
                         .filter(s -> s.contains("a"))
                         .count();
        System.out.println("Count: " + count);  // Count: 3
    }
}