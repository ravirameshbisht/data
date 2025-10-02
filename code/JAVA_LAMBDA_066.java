// 66. Lambda with Stream Filter and Collect 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_066 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        List<String> filteredList = list.stream()
                                        .filter(s -> s.startsWith("S"))
                                        .collect(Collectors.toList());
        filteredList.forEach(System.out::println);  // Spring
    }
}