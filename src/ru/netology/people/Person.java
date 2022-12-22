package ru.netology.people;

import java.util.concurrent.Callable;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
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

    private  int age;

@Override
public String toString() {
    return name + " " + surname + " " + age;
}

    @Override
    public int compareTo(Person o) {
        if (getSurname().length() < o.surname.length()) {
            return 1;
        } else if (getSurname().length() > o.surname.length()) {
            return -1;
        } else if (getAge() < o.age){
                return 1;
        }else if (getAge() > o.age){
            return -1;
        }
        return 0;
    }
    }

