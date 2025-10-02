// 51. Lambda with Optional OrElse 
import java.util.Optional;

public class JAVA_LAMBDA_051 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        String value = optional.orElse("Default");
        System.out.println(value);  // Default
    }
}