// 46. Lambda for Creating a Stream 
import java.util.stream.Stream;

public class JAVA_LAMBDA_046 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Spring", "Lambda");
        stream.forEach(System.out::println);
    }
}