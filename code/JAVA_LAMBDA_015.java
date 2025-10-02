// Lambda with Function 
import java.util.function.Function;

public class JAVA_LAMBDA_015 {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Lambda"));  // 6
    }
}