package HomeWork13;

import HomeWork10.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeWork13 {
    public static void main(String[] args) {
        Random random = new Random();

        /* 1. Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
        a. печатает на экран значения в дюймах;
        b. переводит значения в сантиметры;
        c. печатает на экран сумму в сантиметрах.*/
        System.out.println("Задание 1.");
        System.out.println(IntStream.range(1, 21)
                .filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(i -> i * 2.54)
                .sum());
        System.out.println();

        /* 2. Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100
        человек в возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
        a. выбирает объекты, возраст которых меньше 21;
        b. распечатывает их на экран;
        c. сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
        d. берет 4 первых объекта;
        e. формирует коллекцию из фамилий объектов;
        f. агрегирует все в коллекцию.*/

        System.out.println("Задание 2.");

        int amountPerson = 100;
        List<Person> person = new ArrayList<>(amountPerson);

        String [] listName = {"Артем", "Андрей", "Александр", "Владимир", "Ян",
                "Алексей", "Кирилл", "Денис", "Павел"};
        String [] listSurname = {"Канышко", "Синицкий", "Иванов", "Котиков", "Смирнов",
                "Олололов", "Алигов"};

        for (int i = 0; i < amountPerson; i ++) {
            int rand1 = random.nextInt(listName.length);
            int rand2 = random.nextInt(listSurname.length);
            int age = (random.nextInt(15) + 15);
            person.add(new Person(listName[rand1], listSurname[rand2], age ));
            //person.add(i) = new Person(listName[rand1], listSurname[rand2], age);
            //System.out.println(person::);
        }
        List<String> collect = person.stream()
                .filter(person1 -> person1.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println();

        /* 3. Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
        Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на
        5 с помощью stream.*/

        System.out.println("Задание 3.");

        int minValue = 100;
        int maxValue = 200;
        int n = 10;
        System.out.println(IntStream.generate(() -> (random.nextInt(maxValue-minValue) + minValue))
                .limit(n)
                .anyMatch(value -> value % 3 == 0 && value % 5 == 0));
    }
}
