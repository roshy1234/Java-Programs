class A {
    void message() {
        System.out.println("Welcome to base class");
    }
}

class B extends A {
    void message() {
        System.out.println("Welcome to derived class");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.message(); // calling the overridden method
    }
}
