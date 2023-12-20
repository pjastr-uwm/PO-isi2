package porownywanie.zad22;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("AA", 45));
        list.add(new Animal("BB", 45));
        list.add(new Animal("AA", 32));
        list.add(new Dog("AA", 45, "XX"));
        list.add(new Dog("BB", 21, "XX"));
        list.add(new Dog("CC", 21, "YY"));
        for(var elem:list){
            System.out.println(elem);
        }
        list.sort(null);
        System.out.println("After sorting");
        for(var elem:list){
            System.out.println(elem);
        }
        System.out.println(list.get(3).compareTo(list.get(4)));
        System.out.println(list.get(4).compareTo(list.get(3)));
    }
}
