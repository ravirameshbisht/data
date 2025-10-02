// 100. Lambda with Stream Min by Comparator 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JAVA_LAMBDA_100 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda");
        String shortest = list.stream()
                              .min(Comparator.comparingInt(String::length))
                              .orElse("Not found");
        System.out.println(shortest);  // Java
    }
}