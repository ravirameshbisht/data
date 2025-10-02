// 10. Lambda with Optional 
import java.util.Optional;

public class JAVA_LAMBDA_010 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(s -> System.out.println("Value is present: " + s));
    }
}