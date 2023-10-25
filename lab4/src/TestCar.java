public class TestCar {

    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.speed);
        c1.accelerate(15);
        System.out.println(c1.speed);
        c1.decelerate(20);
        System.out.println(c1.speed);
    }
}

class Car
{
    String brand;
    String model;
    int speed;

    public void accelerate(int value)
    {
        speed +=value;
    }

    public void decelerate(int value)
    {
        speed -= value;
        if (speed < 0)
        {
            speed =0;
        }
    }
}
