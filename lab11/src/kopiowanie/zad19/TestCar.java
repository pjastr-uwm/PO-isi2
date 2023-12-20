package kopiowanie.zad19;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("AA", "XX", new Engine(4,5,"ZZ"));
        Car c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);

    }
}
