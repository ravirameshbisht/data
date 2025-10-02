// Lambda with Consumer 
import java.util.function.Consumer;

public class JAVA_LAMBDA_013 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, World!");  // Hello, World!
    }
}