// 67. Lambda with Stream Map and Collect 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_067 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        List<String> upperList = list.stream()
                                     .map(String::toUpperCase)
                                     .collect(Collectors.toList());
        upperList.forEach(System.out::println);  // JAVA, SPRING, LAMBDA
    }
}