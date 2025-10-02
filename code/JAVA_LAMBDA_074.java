// 74. Lambda with Stream Collect and GroupingBy
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_074 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        Map<Integer, List<String>> grouped = list.stream()
                                                 .collect(Collectors.groupingBy(String::length));
        grouped.forEach((k, v) -> System.out.println(k + ": " + v));  // 4: [Java], 6: [Spring, Lambda], 6: [Stream]
    }
}