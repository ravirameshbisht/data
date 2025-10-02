//Iterating List using Lambda
import java.util.Arrays;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.forEach(item -> System.out.println(item));
    }
}
