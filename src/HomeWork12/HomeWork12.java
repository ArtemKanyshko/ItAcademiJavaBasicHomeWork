package HomeWork12;

import java.util.Date;
import java.util.Scanner;

public class HomeWork12 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 1. Создайте простейший сервис с методом, который выводит на экран
        текущую дату. Сделайте его Singleton и используйте в основном теле
        программы.*/
        TimeNow timeNow = TimeNow.getInstance();
        timeNow.showTimeNow();
        /* 2. Создайте класс Person с полями: имя, фамилия, год рождения.
        Реализуйте у этого класса паттерн Строитель. Введите поля с
        клавиатуры и заполните объект класса Person с помощью паттерна
        Строитель.*/
        System.out.println("Введите Имя, Фамилия, год рождения");
        Person person = new Person(scanner.next(), scanner.next(), scanner.nextInt());
        System.out.println(person.getFirstname() + ", " + person.getLastName()+ ", " + person.getBirthday());
        /* 3. Создайте простейший логгер, выводящий сообщения об ошибках в
        текстовый файл. Объект логгера должен быть создан с помощью ШП
        Singleton. У объекта должен быть обязательным один метод,
        получающий на вход текст сообщения об ошибке и записывающий его в
        файл вместе с информацией о дате и времени происшествия.*/
        Logger logger = Logger.getInstance();
        logger.logPrint("записать это сообщение");
    }

}
