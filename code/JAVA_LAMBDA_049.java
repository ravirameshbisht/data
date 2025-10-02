// 49. Lambda with Stream Peek 
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_049 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda", "Kafka");
        stream.peek(System.out::println)
              .collect(Collectors.toList());
    }
}