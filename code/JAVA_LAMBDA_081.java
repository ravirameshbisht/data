// 81. Lambda with Stream Sorted 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_081 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Spring", "Lambda", "Java");
        List<String> sortedList = list.stream()
                                      .sorted()
                                      .collect(Collectors.toList());
        sortedList.forEach(System.out::println);  // Java, Lambda, Spring
    }
}