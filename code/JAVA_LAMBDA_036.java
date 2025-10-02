// 36. Lambda for Joining Strings 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_036 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String joined = list.stream()
                            .collect(Collectors.joining(", "));
        System.out.println(joined);  // Java, Spring, Lambda
    }
}