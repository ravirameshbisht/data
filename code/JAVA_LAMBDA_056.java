// 56. Lambda with Optional FlatMap
import java.util.Optional;

public class JAVA_LAMBDA_056 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.flatMap(s -> Optional.of(s.toUpperCase()))
                .ifPresent(System.out::println);  // JAVA
    }
}