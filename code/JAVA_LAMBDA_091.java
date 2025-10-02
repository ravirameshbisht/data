// 91. Lambda with Stream Collect to Set 
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_091 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");
        Set<String> set = list.stream()
                              .collect(Collectors.toSet());
        set.forEach(System.out::println);  // Java, Spring, Lambda
    }
}