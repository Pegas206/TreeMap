import ru.netology.people.Person;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List listPeople = getPerson();
        System.out.println("Исходный список");
        System.out.println(listPeople);
        System.out.println("============================================================");
        System.out.println("Список после сортировки по знатности");
        listPeople.removeIf(Person.isAbove18());
        System.out.println(listPeople);


    }
    private static List getPerson() {
        //Генерация пользователей
        List<Person> people = new ArrayList<>();
        people.add(new Person("Петр", "Пупкин", 33));
        people.add(new Person("Сеня", "Третьяк", 5));
        people.add(new Person("Таня", "Бобрик", 19));
        people.add(new Person("Андрей", "Дак", 10));
        people.add(new Person("Анна", "Цин", 26));
        return people;


    }
}