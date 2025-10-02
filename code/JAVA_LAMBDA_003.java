// 3. Filtering a List with Lambda 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_LAMBDA_003 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "JavaScript", "Python");
        List<String> filteredList = list.stream()
                                        .filter(s -> s.startsWith("J"))
                                        .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}