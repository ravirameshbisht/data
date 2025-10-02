// 39. Lambda with Stream GroupingBy 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_039 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Java");
        Map<String, Long> frequency = list.stream()
                                          .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));  // Java: 2, Spring: 1, Lambda: 1
    }
}