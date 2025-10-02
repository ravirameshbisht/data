// 57. Lambda for Custom Functional Interface 
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class JAVA_LAMBDA_057 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("My method implementation");
        myFunc.myMethod();  // My method implementation
    }
}