package zad4;

public class TestTriple {

    public static void main(String[] args) {
        Triple<Integer, String, Boolean> t1 = new Triple<>(4, "Hello", true);
        System.out.println(t1);
        System.out.println(t1.getFirst());
        System.out.println(t1.getSecond());
        System.out.println(t1.getThird());
    }
}
