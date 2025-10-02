// 6. Lambda with Map Iteration 
import java.util.HashMap;
import java.util.Map;

public class JAVA_LAMBDA_006 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 8);
        map.put("Spring", 5);
        map.put("Lambda", 1);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}