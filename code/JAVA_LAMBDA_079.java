// 79. Lambda with Stream AllMatch 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_079 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        boolean allMatch = list.stream()
                               .allMatch(s -> s.length() > 3);
        System.out.println(allMatch);  // true
    }
}