// 43. Lambda with Stream Mapping  
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_043 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<Integer, List<String>> map = list.stream()
                                             .collect(Collectors.groupingBy(String::length));
        map.forEach((k, v) -> System.out.println(k + ": " + v));  // 4: [Java], 6: [Spring, Lambda]
    }
}