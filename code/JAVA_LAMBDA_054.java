// 54. Lambda with Optional Map 
import java.util.Optional;

public class JAVA_LAMBDA_054 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        Optional<Integer> length = optional.map(String::length);
        length.ifPresent(System.out::println);  // 4
    }
}