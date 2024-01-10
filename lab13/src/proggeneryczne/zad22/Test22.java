package proggeneryczne.zad22;

public class Test22 {

    public static void main(String[] args) {
        System.out.println(compareObjects(new Car(), new Car()));
        System.out.println(compareObjects(new Car(), new ElectricCar()));
        System.out.println(compareObjects(new ElectricCar(), new ElectricCar()));
        //System.out.println(compareObjects(4,4));
    }

    public static <T extends Car> boolean compareObjects(T object1, T object2){
        return object1.getClass() == object2.getClass();
    }
}
