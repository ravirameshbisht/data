//Using a Custom Functional Interface 
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class JAVA_LAMBDA_005 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Multiplication: " + multiply.calculate(5, 3));
    }
}