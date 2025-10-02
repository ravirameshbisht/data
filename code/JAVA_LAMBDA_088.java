// 88. Lambda with Stream forEachOrdered 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_088 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.stream()
            .forEachOrdered(System.out::println);  // Java, Spring, Lambda
    }
}