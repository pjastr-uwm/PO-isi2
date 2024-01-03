package zad1;

public class TestBox {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(6);
        System.out.println(b1.get());
        System.out.println(b1);
        Box<Integer> b2 = new Box<>(12);
        System.out.println(b2);
        Box<String> b3 = new Box<>("Hello");
        System.out.println(b2.get());
    }
}
