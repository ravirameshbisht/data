// 82. Lambda with Stream Distinct 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_082 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Java", "Lambda");
        List<String> distinctList = list.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        distinctList.forEach(System.out::println);  // Java, Spring, Lambda
    }
}