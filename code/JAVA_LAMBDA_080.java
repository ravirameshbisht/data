// 80. Lambda with Stream NoneMatch 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_080 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean noneMatch = list.stream()
                                .noneMatch(s -> s.startsWith("Z"));
        System.out.println(noneMatch);  // true
    }
}