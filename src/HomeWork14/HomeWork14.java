package HomeWork14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.stream.Stream;

public class HomeWork14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 1. Ввести с клавиатуры номер месяца текущего года. Вывести на
        экран все его даты в формате d::MMM::uuuu.*/
        System.out.println("Задание 1");
        System.out.print("Введите месяц от 1 до 12: ");
        int monthNumber = scanner.nextInt();
        LocalDate localDateNow = LocalDate.now();
        int nowYear = localDateNow.getYear();
        LocalDate dayOfMonth = LocalDate.of(nowYear, monthNumber, 1);
        Stream.iterate(dayOfMonth.withDayOfMonth(1), day -> day.plusDays(1))
                .limit(dayOfMonth.lengthOfMonth())
                .peek(localDate -> System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd::MM::yyyy"))))
                .count();
        System.out.println();

        /* 2. От текущей даты вывести расписание всех встреч, которые
        происходят еженедельно в 13:00 в течение 2 месяцев.*/


        System.out.println("Задание 2");
        LocalDateTime localDateNowTask2 = LocalDateTime.now();
        var dayNow = localDateNowTask2.getDayOfMonth();

        Stream.iterate(localDateNowTask2.withDayOfMonth(dayNow), day -> day.plusWeeks(1))
                .limit((localDateNowTask2.getMonth().maxLength()
                        + localDateNowTask2.plusMonths(1).getMonth().maxLength()) / 7)
                .peek(localDate -> System.out.println(localDate.withHour(13).withMinute(00)
                        .format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm"))
                        + " - \"Main event\""))
                .count();

        System.out.println();

        /* 3. От текущей даты вывести на экран дату, которая была 60 дней
        назад.*/

        System.out.println("Задание 3.");
        System.out.println(LocalDate.now().minusDays(60)
                .format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy")));
    }
}
