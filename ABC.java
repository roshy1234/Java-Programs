class A {
    public void add() {
        System.out.println("Add A");
    }
}

class B extends A {
    public void add() {
        super.add();
        System.out.println("Add B");
    }
}

class C extends B {
    public void add() {
        super.add();
        System.out.println("Add C");
    }
}

public class ABC {
    public static void main(String[] args) {
        C c = new C();
        c.add();
    }
}

