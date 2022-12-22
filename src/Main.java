import ru.netology.people.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Генерация пользователей
        List<Person> people = new ArrayList<>();
        people.add(new Person("Петр", "Пупкин", 3));
        people.add(new Person("Сеня", "Третьяк", 5));
        people.add(new Person("Таня", "Бобрик", 1));
        people.add(new Person("Андрей", "Дак", 10));
        people.add(new Person("Анна", "Цин", 6));
        System.out.println("Исходный список");
        System.out.println(people);
        System.out.println("============================================================");
        System.out.println("Список после сортировки по знатности");
        Collections.sort(people);
        System.out.println(people);

    }
}
