package ru.netology.people;

import java.util.function.Predicate;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
    public static Predicate<Person> isAbove18() {
        return p -> p.getAge() < 18;
    }
    static Predicate<Person> isNameEqualTo(String name){
        return p -> p.getName().equals(name);
    }
}