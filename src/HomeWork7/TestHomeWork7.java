package HomeWork7;

import java.util.Scanner;

import static HomeWork7.Seasons.*;

public class TestHomeWork7 {
    public static void main(String[] args) {
        /* 1. Создать enum, который описывает сезоны года. Добавить поле description в этот
        enum. Добавить поле countOfDays в этот enum. Вывести на экран все константы
        сезоны года.
        */
        System.out.println("Задание 1. Вывести на экран все константы сезоны года.");
        Seasons[] season = Seasons.values();
        for (Seasons element : season) {
            System.out.println("Время года: " + element + " (" + element.getCountOfDays() +
                               " дней(дня), " + element.getDescription() + ")");
        }
        System.out.println();

        /* 2. Написать метод, который выводит следующий сезон от заданного во входном
        параметре. Входной параметр ввести с клавиатуры.
        */
        System.out.println("Задание 2. Вывести на экран следующий сезон от заданного во входном параметре.");
        System.out.print("Введите WINTER или SPRING или SUMMER или AUTUMN: ");
        Scanner stringFromKeyboard = new Scanner(System.in);
        String nextSeason = stringFromKeyboard.nextLine();
        nextSeason(nextSeason);
        System.out.println();

        /* 3. Написать метод, который в зависимости от сезона, выводит на экран сумму дней в
        этом сезоне. Входной параметр ввести с клавиатуры.
        */
        System.out.println("Задание 3. Вывести на экран сумму дней в этом сезоне.");
        System.out.print("Введите WINTER или SPRING или SUMMER или AUTUMN: ");
        String nowSeason = stringFromKeyboard.nextLine();
        sumDaysSeason(nowSeason);
        System.out.println();

        /* 4. Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
        Создать поле name в классе Vehicle и проинициализировать его через конструктора.
        Создать generic класс Garage, который может хранить только объекты типа
        наследуемого от Vehicle. Создать 2 объекта класса Garage (все поля ввести с
        клавиатуры) и вывести на экран имя хранимого транспортного средства.
        */
        System.out.println("Задание 4. Вывести на экран имя хранимого транспортного средства.");
        System.out.print("Введите имя транспорта: ");
        String forSedan = stringFromKeyboard.nextLine();
        Garage<Car> sedan = new Garage<Car>(new Car(forSedan));
        System.out.print("Введите имя транспорта: ");
        String forMotorcycle = stringFromKeyboard.nextLine();
        Garage<Motorcycle> motorcycle = new Garage<Motorcycle>(new Motorcycle(forMotorcycle));
        System.out.println("В гараже хранится:");
        sedan.vehicle.showName();
        motorcycle.vehicle.showName();

    }
    public static void nextSeason(String nextSeason) {
        if (nextSeason.equals("WINTER")) {
            System.out.println(SPRING + " (" + SPRING.getCountOfDays() +
                    " дней(дня), " + SPRING.getDescription() + ")");
        }
        if (nextSeason.equals("SPRING")) {
            System.out.println(SUMMER + " (" + SUMMER.getCountOfDays() +
                    " дней(дня), " + SUMMER.getDescription() + ")");
        }
        if (nextSeason.equals("SUMMER")) {
            System.out.println(AUTUMN + " (" + AUTUMN.getCountOfDays() +
                    " дней(дня), " + AUTUMN.getDescription() + ")");
        }
        if (nextSeason.equals("AUTUMN")) {
            System.out.println(WINTER + " (" + WINTER.getCountOfDays() +
                    " дней(дня), " + WINTER.getDescription() + ")");
        }
    }
        public static void sumDaysSeason(String nowSeason) {
            if (nowSeason.equals("WINTER")) {
                System.out.println(WINTER.getCountOfDays() + " дней(дня)");
            }
            if (nowSeason.equals("SPRING")) {
                System.out.println(SPRING.getCountOfDays() + " дней(дня)");
            }
            if (nowSeason.equals("SUMMER")) {
                System.out.println(SUMMER.getCountOfDays() + " дней(дня)");
            }
            if (nowSeason.equals("AUTUMN")) {
                System.out.println(AUTUMN.getCountOfDays() + " дней(дня)");
            }
    }
}
