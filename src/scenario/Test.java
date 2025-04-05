package scenario;

class Parent {
    static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static method");
    }
}

class THis {
    int x = 10;

    void display() {
        int x = 20;
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new THis().display();
    }
}


public class Test {
    public static void main(String[] args) {
        Child p = new Child();
        p.staticMethod();
    }
}

