//Creating a Thread with Lambda 
public class JAVA_LAMBDA_007 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread with Lambda!")).start();
    }
}