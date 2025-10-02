import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with String as key and Integer as value
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Access a value
        System.out.println("Value for Apple: " + map.get("Apple"));

        // Update a value
        map.put("Apple", 50);
        System.out.println("Updated value for Apple: " + map.get("Apple"));

        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists with value: " + map.get("Banana"));
        }

        // Remove a key
        map.remove("Orange");

        // Iterate using entrySet
        System.out.println("\nIterating over map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterate using keySet
        System.out.println("\nIterating using keySet:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
