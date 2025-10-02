// 86. Lambda with Stream Iterate 
import java.util.stream.Stream;

public class JAVA_LAMBDA_086 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
              .limit(5)
              .forEach(System.out::println);  // 1, 3, 5, 7, 9
    }
}