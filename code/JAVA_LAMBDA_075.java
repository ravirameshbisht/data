// 75. Lambda with Stream Map and Counting 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_075 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        long count = list.stream()
                         .map(String::toUpperCase)
                         .count();
        System.out.println("Count: " + count);  // Count: 3
    }
}