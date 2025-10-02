// 99. Lambda with Stream PartitioningBy 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_099 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        Map<Boolean, List<String>> partitioned = list.stream()
                                                     .collect(Collectors.partitioningBy(s -> s.length() > 4));
        partitioned.forEach((k, v) -> System.out.println(k + ": " + v));  // true: [Spring, Lambda, Stream], false: [Java]
    }
}