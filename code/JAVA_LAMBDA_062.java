// 62. Lambda with ForEach Loop 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_062 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        list.forEach(s -> System.out.println(s));
    }
}