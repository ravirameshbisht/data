// 19. Lambda with Custom Sorting 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_019 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Pear", "Grapes");
        list.sort((s1, s2) -> s2.compareTo(s1));  // Sort in reverse order
        list.forEach(System.out::println);
    }
}