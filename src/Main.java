import ru.netology.people.Person;

import java.util.*;

public class Main {

    public static void main (String[] args) {

        List listPeople = getPerson();
        System.out.println("Исходный список");
        System.out.println(listPeople);
        System.out.println("============================================================");
        System.out.println("Список после сортировки по знатности");
        Collections.sort(listPeople, (Person o1, Person o2) -> {
            if (o1.getSurname().length() < o2.getSurname().length()) {
                return 1;
            } else if (o1.getSurname().length() > o2.getSurname().length()) {
                return -1;
            } else if (o1.getAge() < o2.getAge()) {
                return 1;
            } else if (o1.getAge() > o2.getAge()) {
                return -1;
            }
            return 0;
        });
        System.out.println(listPeople);
    }

    private static List getPerson() {
        //Генерация пользователей
        List<Person> people = new ArrayList<>();
        people.add(new Person("Петр", "Пупкин", 3));
        people.add(new Person("Сеня", "Третьяк", 5));
        people.add(new Person("Таня", "Бобрик", 1));
        people.add(new Person("Андрей", "Дак", 10));
        people.add(new Person("Анна", "Цин", 6));
        return people;


    }
}
