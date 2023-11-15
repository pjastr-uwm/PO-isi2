import pl.edu.uwm.zad1.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Nowak", 22);
        System.out.println(p1);
        Person p2 = new Person("Jan", "Nowak", 22);
        System.out.println(p2);
        System.out.println(p1 == p2); // w Javie zawsze równosc w pamieci
        System.out.println(p1.equals(p2)); // w Javie nowy sens
        System.out.println(p1.hashCode() == p2.hashCode());

    }
}
