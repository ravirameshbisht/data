//Java program where static methods are used in Parent and Child classes
class Parent {
    public static void display() {
        System.out.println("parent class display()");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("child class display()");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
