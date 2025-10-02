// Iterating List using Lambda
import java.util.Arrays;
import java.util.List;

/**
 * LambdaExample2 demonstrates how to use a lambda expression
 * with the forEach method to iterate over a list of strings.
 *
 * In this example:
 * - We create a list containing "Java", "Spring", "Lambda".
 * - We use the forEach method along with a lambda to print each element.
 */
public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        
        // Using lambda expression to print each item
        list.forEach(item -> System.out.println(item));
    }
}
