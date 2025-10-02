// 50. Lambda with Optional 
import java.util.Optional;

public class JAVA_LAMBDA_050 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(System.out::println);  // Java
    }
}