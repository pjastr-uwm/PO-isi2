package zlozone.zad7;

public class TestCar {

    public static void main(String[] args) {
        Car c1 = new Car("AA", "XX",
                new Engine(4.2, "DD", "AA@@"));
        Engine temp = c1.getEngine();
        System.out.println(c1);
        temp.setPower(10.2);
        System.out.println(c1);
    }
}
