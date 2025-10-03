// Q5. Java program to find special characters in a string using streams
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_STREAMS_005 {
    public static void main(String[] args) {
        String input = "Hello, World! 123 #Java$Stream";

        List<Character> specialCharacters = input.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> !Character.isLetterOrDigit(c))
            .collect(Collectors.toList());

        System.out.println("Special characters: " + specialCharacters);
    }
}