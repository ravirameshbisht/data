// 11. Lambda with Predicate 
import java.util.function.Predicate;

public class JAVA_LAMBDA_011 {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));   // true
        System.out.println(isEmpty.test("Java")); // false
    }
}