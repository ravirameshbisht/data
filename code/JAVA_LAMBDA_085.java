// 85. Lambda with Stream Generate 
import java.util.stream.Stream;

public class JAVA_LAMBDA_085 {
    public static void main(String[] args) {
        Stream.generate(() -> "Java")
              .limit(3)
              .forEach(System.out::println);  // Java, Java, Java
    }
}