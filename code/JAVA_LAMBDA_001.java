// 1. Simple Runnable Example
public class JAVA_LAMBDA_001 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, Lambda!");
        new Thread(r).start();
    }
}
