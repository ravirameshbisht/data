// Lambda with Supplier 
import java.util.function.Supplier;

public class JAVA_LAMBDA_014 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java";
        System.out.println(supplier.get());  // Java
    }
}