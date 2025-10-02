// Iterating List using Lambda
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_002 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        
        // Using lambda expression to print each item
        list.forEach(item -> System.out.println(item));
    }
}
