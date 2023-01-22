package ru.netology.people;

import java.util.function.Predicate;

public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;

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