// 48. Lambda with Stream Skip 
import java.util.stream.Stream;

public class JAVA_LAMBDA_048 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.skip(2)
              .forEach(System.out::println);  // Lambda, Kafka
    }
}