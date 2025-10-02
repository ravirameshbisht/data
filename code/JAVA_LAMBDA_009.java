// Method Reference with Lambda 
import java.util.Arrays;
import java.util.List;

public class JAVA_LAMBDA_009 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Lambda", "Kafka");
        list.forEach(System.out::println);
    }
}