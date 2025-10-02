// 17. Lambda with BinaryOperator 
import java.util.function.BinaryOperator;

public class JAVA_LAMBDA_017 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 3));  // 6
    }
}