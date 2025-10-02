// 25. Lambda with Stream Sorted 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_025 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Pear", "Grapes");
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}