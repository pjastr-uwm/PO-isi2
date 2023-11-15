package pl.edu.uwm.zad1;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = (firstName == null || firstName.isEmpty()) ? "" : firstName;
        this.lastName = (lastName == null || lastName.isEmpty()) ? "" :lastName;
        this.age = age < 0 ? 0 : age;
    }

    @Override
    public String toString() {
        return "Person: "+firstName+" "+lastName+", Age: "+age+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!firstName.equals(person.firstName)) return false;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode() ;
        result = 31 * result + age;
        return result;
    }
}
