// 20. Lambda for Uppercase Conversion 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_020 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "lambda");
        List<String> upperList = list.stream()
                                     .map(String::toUpperCase)
                                     .collect(Collectors.toList());
        upperList.forEach(System.out::println);
    }
}