// 53. Lambda with Optional OrElseThrow 
import java.util.Optional;

public class JAVA_LAMBDA_053 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        try {
            String value = optional.orElseThrow(() -> new RuntimeException("No value present"));
        } catch (Exception e) {
            System.out.println(e.getMessage());  // No value present
        }
    }
}