// 83. Lambda with Stream Limit 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_083 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        List<String> limitedList = list.stream()
                                       .limit(2)
                                       .collect(Collectors.toList());
        limitedList.forEach(System.out::println);  // Java, Spring
    }
}