// 94. Lambda with Stream Map for Object Transformation 
import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JAVA_LAMBDA_094 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        List<Person> people = names.stream()
                                   .map(name -> new Person(name, 25))
                                   .collect(Collectors.toList());
        people.forEach(person -> System.out.println(person.name + ": " + person.age));  // John: 25, Jane: 25, Jack: 25
    }
}