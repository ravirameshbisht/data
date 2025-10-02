// Lambda with BiFunction 
import java.util.function.BiFunction;

public class JAVA_LAMBDA_012 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3));  // 5
    }
}