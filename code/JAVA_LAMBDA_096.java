// 96. Lambda with Stream Grouping and Counting 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_096 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        Map<Integer, Long> groupedCount = list.stream()
                                              .collect(Collectors.groupingBy(String::length, 
                                                  Collectors.counting()));
        groupedCount.forEach((k, v) -> System.out.println(k + ": " + v));  // 4: 1, 6: 3
    }
}