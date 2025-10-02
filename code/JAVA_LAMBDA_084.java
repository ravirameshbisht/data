// 84. Lambda with Stream Skip 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_084 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Stream");
        List<String> skippedList = list.stream()
                                       .skip(2)
                                       .collect(Collectors.toList());
        skippedList.forEach(System.out::println);  // Lambda, Stream
    }
}