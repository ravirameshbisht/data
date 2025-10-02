// A simple Java program showing basics
public class JavaBasics {
    
    // A method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 1. Variables and Data Types
        int number = 10;
        double pi = 3.14159;
        String name = "Java";
        boolean isFun = true;

        System.out.println("Number: " + number);
        System.out.println("Pi: " + pi);
        System.out.println("Language: " + name);
        System.out.println("Is Java fun? " + isFun);

        // 2. Operators
        int sum = number + 5;
        int product = number * 2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // 3. Conditional Statement
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // 4. Loops
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 5. Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("\nArray elements:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 6. Methods
        int result = addNumbers(7, 8);
        System.out.println("\nSum using method: " + result);

        // 7. Objects and Classes
        Student student = new Student("Alice", 21);
        student.displayInfo();
    }
}

// A simple class
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("\nStudent Name: " + name + ", Age: " + age);
    }
}
