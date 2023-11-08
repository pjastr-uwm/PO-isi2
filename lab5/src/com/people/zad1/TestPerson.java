package com.people.zad1;

public class TestPerson {

    public static void main(String[] args) {
        System.out.println(Person.getCounter());
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(Person.getCounter());
    }
}
