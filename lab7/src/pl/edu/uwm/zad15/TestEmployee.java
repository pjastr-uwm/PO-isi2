package pl.edu.uwm.zad15;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jan", "Nowak", 4567.89);
        Employee e2 = new Employee("Jan", "Nowak", 4567.89);
        Employee e3 = null;
        Employee e4 = new Employee(new String("Jan"), "Nowak", 4567.89);
        Employee e5 = new Employee(null, "Nowak", 4567.89);
        System.out.println(e1.equals(e1)); // true
        System.out.println(e1.equals(e2)); // true
        System.out.println(e1.equals(e3)); // false
        System.out.println(e1.equals(e4)); // true
        System.out.println(e1.equals(e5)); // false
        Programmer p1 = new Programmer("Jan", "Nowak", 4567.89, "Java");
        Programmer p2 = new Programmer("Jan", "Nowak", 4567.89, "Java");
        Programmer p3 = null;
        Programmer p4 = new Programmer("Jan", "Nowak", 4567.89, "Python");
        Programmer p5 = new Programmer("Jan", "Nowak", 4567.89, new String("Java"));
        System.out.println(p1.equals(e1)); // false
        System.out.println(p1.equals(p1)); // true
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(p4)); // false
        System.out.println(p1.equals(p5)); // true

    }
}
