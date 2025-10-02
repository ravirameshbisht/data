// 40. Lambda with Stream PartitioningBy 
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_040 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                         .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        partitioned.forEach((k, v) -> System.out.println(k + ": " + v));  // true: [2, 4, 6, 8, 10], false: [1, 3, 5, 7, 9]
    }
}