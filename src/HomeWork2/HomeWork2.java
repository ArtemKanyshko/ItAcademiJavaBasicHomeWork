package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        boolean lastNumberSevanTrue = lastNumberSeven (7); // введите число
        // и проверьте заканчивается ли оно на 7
        System.out.println("Число заканчивается на 7: " + lastNumberSevanTrue);
        boolean circleAndRectangleTrue = circleAndRectangle (1, 1, 1); // введите стороны прямоугольника и
        // радиус круга и проверьте будет ли круг закрывать прямоугольник
        rubleCaseDeclension(0); // введите число и проверьте окончание рубля
        showNextDay (1, 1, 1); // введите дату dd, mm, yyyy
        housesOnTheLand(1, 1, 1, 1, 1, 1); // введите размеры двух домов и участка
        weekSchedule(0); // введите день недели
    }
    // Создайте метод с одним целочисленным параметром. Метод должен определить,
    // является ли последняя цифра числа семеркой и вернуть boolean значение.
    public static boolean lastNumberSeven (int number1) {
        int multiple = 7; // задает число, которое должно быть в конце
        return Math.abs(number1) % 10 == multiple || Math.abs(number1) == multiple;
    }
    // Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
    // Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
    public static boolean circleAndRectangle (int a, int b, int r) { // a - 1 сторона, b - 2 сторона, r - радиус круга
        if (a > 0 && b > 0 && r > 0) {
            if (2 * r >= Math.sqrt(a * a + b * b)) {
                System.out.println("Круг закрывает прямоугольник");
                return true;
            }
            else {
                System.out.println("Круг не закрывает прямоугольник");
                return false;
            }
        }
        else {
            System.out.println("Вы ввели отрицательное значение или ноль");
            return false;
        }
    }
    //Задать целое число в виде переменной, это число – сумма денег в рублях.
    // Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
    public static void rubleCaseDeclension (int number) {
        int x = number % 10;
        int y = number % 100;
        if (number == 1 || (x == 1 && number > 20 && y != 11)) {
            System.out.println(number + " рубль");
        }
        else if ((number >=2 && number < 5) || (number > 20 && x >= 2 && x < 5 && y > 20)) {
            System.out.println(number + " рубля");
        }
        else if (x >= 5 || x == 0 || (y>=10 && y<=20)) {
            System.out.println(number + " рублей");
        }
        else {
            System.out.println("Вы ввели отрицательное значение");
        }
    }
    //Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
    public static void showNextDay (int day, int month, int year) {
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // проверка на високосный год
        if (day > 0 && day < 31 && (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12) && year > 0) {
            ++day;
            System.out.println(day + "." + month + "." + year + " г.");
        }
        else if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)
                && year > 0) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day == 31 && month == 12 && year > 0) {
            day = 1;
            month = 1;
            ++year;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day > 0 && day < 30 && (month == 4 || month == 6 || month == 9 || month == 11) && year > 0) {
            ++day;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11) && year > 0) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day > 0 && day < 28 && month == 2 && year > 0) {
            ++day;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day == 28 && month == 2 && (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) && year > 0) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else if (day > 0 && day < 29 && month == 2 && leapYear && year > 0) {
            ++day;
            System.out.println(day + "." + month + "." + year + " y.");
        }

        else if (day == 29 && month == 2 && leapYear && year > 0) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year + " y.");
        }
        else {
            System.out.println("Такой даты не существует");
        }
    }
    // Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
    // Проверить, помещаются ли эти дома на данном участке. Стороны домов – параллельны сторонам участка,
    // в остальном размещение может быть любым.
    public static void housesOnTheLand (int a1, int b1, int c2, int d2, int e3, int f3) {
        if (a1 > 0 && b1 > 0 && c2 > 0 && d2 > 0 && e3 > 0 && f3 > 0) {
            if (e3 >= a1 + c2 && 31 >= Math.max(b1, d2)) {
                System.out.println("Два дома поместятся на участке");
            } else if (f3 >= b1 + d2 && e3 >= Math.max(a1, c2)) {
                System.out.println("Два дома поместятся на участке");
            } else {
                System.out.println("Два дома не поместятся на участке");
            }
        }
        else {
            System.out.println("Вы ввели отрицательное значение или ноль");
        }
    }
    // Написать метод, который выводит расписание на неделю.
    // Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
    public static void weekSchedule (int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник.");
                System.out.println("8:30 - 12:30 Рабочее время");
                System.out.println("12:30 - 13:00 Обед");
                System.out.println("13:00 - 17:00 Рабочее время");
                System.out.println("18:30 - 21:20 Курсы");
                break;
            case 2:
                System.out.println("Вторник.");
                System.out.println("8:30 - 12:30 Рабочее время");
                System.out.println("12:30 - 13:00 Обед");
                System.out.println("13:00 - 17:00 Рабочее время");
                System.out.println("18:00 - 20:30 Самостоятельна работа");
                break;
            case 3:
                System.out.println("Среда.");
                System.out.println("8:30 - 12:30 Рабочее время");
                System.out.println("12:30 - 13:00 Обед");
                System.out.println("13:00 - 17:00 Рабочее время");
                System.out.println("18:30 - 21:20 Курсы");
                break;
            case 4:
                System.out.println("Четверг");
                System.out.println("8:30 - 12:30 Рабочее время");
                System.out.println("12:30 - 13:00 Обед");
                System.out.println("13:00 - 17:00 Рабочее время");
                System.out.println("18:00 - 20:30 Самостоятельна работа");
                break;
            case 5:
                System.out.println("Пятница");
                System.out.println("8:30 - 12:30 Рабочее время");
                System.out.println("12:30 - 13:00 Обед");
                System.out.println("13:00 - 17:00 Рабочее время");
                System.out.println("18:00 - 20:30 Самостоятельна работа");
                break;
            case 6:
                System.out.println("Суббота");
                System.out.println("в течении дня домашние дела");
                System.out.println("13:00 - 16:00 Самостоятельна работа");
                break;
            case 7:
                System.out.println("Воскресенье");
                System.out.println("в течении дня домашние дела");
                System.out.println("13:00 - 16:00 Самостоятельна работа");
                break;
            default:
                System.out.println("Дня с таким номером не существует.");
        }
    }
}
