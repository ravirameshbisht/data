// 63. Lambda for Array Sorting 
import java.util.Arrays;

public class JAVA_LAMBDA_063 {
    public static void main(String[] args) {
        String[] array = {"Java", "Spring", "Lambda"};
        Arrays.sort(array, (s1, s2) -> s1.compareTo(s2));
        for (String s : array) {
            System.out.println(s);  // Java, Lambda, Spring
        }
    }
}