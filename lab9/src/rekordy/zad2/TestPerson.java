package rekordy.zad2;

public class TestPerson {

    public static void main(String[] args) {
        Address a1 = new Address("Sloneczna", 54,
                "10-710", "Olsztyn");
        Person p1 = new Person("Jan", "Nowak", a1);
        Person p2 = new Person("Jan", "Nowak",
                new Address("Sloneczna", 54,
                "10-710", "Olsztyn"));
        System.out.println(p1.equals(p2));
    }
}
