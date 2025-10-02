// 47. Lambda with Stream Limit 
import java.util.stream.Stream;

public class JAVA_LAMBDA_047 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.limit(2)
              .forEach(System.out::println);  // Java, Spring
    }
}