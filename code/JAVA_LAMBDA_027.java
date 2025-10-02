// 27. Lambda with Stream AnyMatch 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_027 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean containsJava = list.stream()
                                   .anyMatch(s -> s.equals("Java"));
        System.out.println("Contains 'Java': " + containsJava);  // true
    }
}