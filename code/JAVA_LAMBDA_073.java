// 73. Lambda with Stream Map and Reduce 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_073 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String concatenated = list.stream()
                                  .map(String::toUpperCase)
                                  .reduce("", (a, b) -> a + b);
        System.out.println(concatenated);  // JAVASPRINGLAMBDA
    }
}