// 71. Lambda with Stream Collect to Map 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_071 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<String, Integer> map = list.stream()
                                       .collect(Collectors.toMap(s -> s, String::length));
        map.forEach((k, v) -> System.out.println(k + ": " + v));  // Java: 4, Spring: 6, Lambda: 6
    }
}