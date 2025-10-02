// 23. Lambda with Stream Map 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_023 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream()
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }
}