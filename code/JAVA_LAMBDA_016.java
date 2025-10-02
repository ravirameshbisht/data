// 16. Lambda with UnaryOperator 
import java.util.function.UnaryOperator;

public class JAVA_LAMBDA_016 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));  // 25
    }
}