// 18. Lambda for Checking Even Numbers 
import java.util.function.Predicate;

public class JAVA_LAMBDA_018 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));  // true
        System.out.println(isEven.test(5));  // false
    }
}