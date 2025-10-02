// 59. Lambda for Custom Functional Interface with Return Value 
@FunctionalInterface
interface MyFunctionalInterface {
    int myMethod(int a, int b);
}

public class JAVA_LAMBDA_059 {
    public static void main(String[] args) {
        MyFunctionalInterface add = (a, b) -> a + b;
        System.out.println(add.myMethod(5, 3));  // 8
    }
}