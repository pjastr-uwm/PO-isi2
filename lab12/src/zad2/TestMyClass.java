package zad2;

public class TestMyClass {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        System.out.println(m1.isEqual(4, 5));
        System.out.println(m1.isEqual(6, 6));
        System.out.println(m1.isEqual("Hello", "Hello"));
        System.out.println(m1.isEqual(1.1, 1.1));
    }
}
