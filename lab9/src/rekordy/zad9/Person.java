package rekordy.zad9;

public record Person(String name, int age) {

    public Person{
        if (age < 0)
            age = 0;
    }
}
