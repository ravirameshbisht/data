// 93. Lambda with Stream Filter for Empty Strings 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_093 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "", "Spring", "Lambda", "");
        List<String> nonEmptyList = list.stream()
                                        .filter(s -> !s.isEmpty())
                                        .collect(Collectors.toList());
        nonEmptyList.forEach(System.out::println);  // Java, Spring, Lambda
    }
}