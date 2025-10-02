// 97. Lambda with Stream Collect to Map
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_097 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Map<Integer, String> map = list.stream()
                                       .collect(Collectors.toMap(String::length, s -> s));
        map.forEach((k, v) -> System.out.println(k + ": " + v));  // 4: Java, 6: Lambda (Spring might be overridden)
    }
}