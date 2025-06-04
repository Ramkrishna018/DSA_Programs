interface A {
    void show();  // method declaration
}

interface B {
    void show();  // same method name
}

class MyClass implements A, B {
    public void show() {
        System.out.println("Hello from show()");
    }
}

public class interfaceExample{
    public static void main(String[] args) {
        MyClass obj = new A();
        obj.show();  // ✅ Only one implementation needed
    }
}
