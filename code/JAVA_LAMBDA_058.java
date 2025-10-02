// 58. Lambda for Custom Functional Interface with Parameter 
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String s);
}

public class JAVA_LAMBDA_058 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = (s) -> System.out.println(s);
        myFunc.myMethod("Hello, World!");  // Hello, World!
    }
}