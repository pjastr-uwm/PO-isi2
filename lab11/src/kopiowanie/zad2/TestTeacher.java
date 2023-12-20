package kopiowanie.zad2;

public class TestTeacher {

    public static void main(String[] args) throws CloneNotSupportedException{
        Teacher t1 = new Teacher("AA", "BB", 34);
        Teacher t2 = t1.clone();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1 == t2);
        t2.setExperience(12);
        System.out.println(t1);
        System.out.println(t2);

    }
}
