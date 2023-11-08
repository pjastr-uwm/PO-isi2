package info.people.zad13;

class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Nowak", 30, "Olsztyn");
        System.out.println(p1.introduceYourself());
        p1.setAddress("Gdańsk");
        System.out.println(p1.introduceYourself());
        System.out.println(p1.getAge());
    }
}
