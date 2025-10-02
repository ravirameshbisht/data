// JAVA_LAMBDA_01660. Lambda with Runnable 
public class JAVA_LAMBDA_060 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task is running");
        new Thread(task).start();  // Task is running
    }
}