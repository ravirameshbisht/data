// 41. Lambda with Stream Counting 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_041 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        long count = list.stream()
                         .collect(Collectors.counting());
        System.out.println("Count: " + count);  // Count: 3
    }
}