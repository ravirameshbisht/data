// Q4. Java program to remove all occurrences of a character from a string using Streams API
import java.util.stream.Collectors;

public class JAVA_STREAMS_004 {

    public static void main(String[] args) {
        String str = "java interview";
        char ch = 'a';
        String result = removeCharacter(str, ch);
        System.out.println("Original String: " + str);
        System.out.println("String after removing '" + ch + "': " + result);
    }

    // Method to remove all occurrences of a character from a string using Streams API
    public static String removeCharacter(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Convert the string to a stream of characters,
        // filter out the specified character,
        // and collect the result
        String result = str.chars()
                           .filter(c -> c != ch)
                           .mapToObj(c -> String.valueOf((char) c))
                           .collect(Collectors.joining());

        return result;
    }
}