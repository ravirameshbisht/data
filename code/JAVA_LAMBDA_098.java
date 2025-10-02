// 98. Lambda with Stream Map to Optional 
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JAVA_LAMBDA_098 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        Optional<String> optional = list.stream()
                                        .filter(s -> s.startsWith("L"))
                                        .map(String::toUpperCase)
                                        .findFirst();
        optional.ifPresent(System.out::println);  // LAMBDA
    }
}