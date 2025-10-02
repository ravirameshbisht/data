// 55. Lambda with Optional Filter 
import java.util.Optional;

public class JAVA_LAMBDA_055 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        optional.filter(s -> s.equals("Java"))
                .ifPresent(System.out::println);  // Java
    }
}