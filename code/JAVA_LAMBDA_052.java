// 52. Lambda with Optional OrElseGet 
import java.util.Optional;

public class JAVA_LAMBDA_052 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        String value = optional.orElseGet(() -> "Default");
        System.out.println(value);  // Default
    }
}