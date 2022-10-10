package HomeWork4;
// Создать класс описывающие промежуток времени. Сам промежуток в классе
// должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте, сравнения двух
// объектов (метод должен работать аналогично compareTo в строках).
// Создать два конструктора: получающий общее количество секунд получающий часы, минуты и
// секунды по отдельности. Сделать метод для вывода данных.
// Прочее на ваше усмотрение.

public class TimeInterval {
    // описываем промежуток времени - сек. мин. часы
    private int seconds;
    private int minutes;
    private int hours;
    // контруктор получающий часы минуты секунды
    public TimeInterval(int hours, int minutes, int seconds) {
        // задает интервал в который должны попадать минуты и секунды
        if (minutes < 60 && seconds < 60 && hours >= 0 && minutes >= 0 && seconds >= 0) {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }
        else {
            this.seconds = -1;
        }
    }
    // конструктор получающий только секунды
    public TimeInterval(int seconds) {
        // задает интервал в который должны попадпть секунды
        if (seconds >= 0) {
            this.seconds = seconds;
        }
        else {
            this.seconds = -1;
        }
    }
    // перевод секунд в чч.мм.сс
    private void convertSecondsToTime(int second) {
            hours = second / 3600;
            second %= 3600;
            minutes = second / 60;
            seconds = second % 60;
    }
    // перевод чч.мм.сс в секунды
    private long totalNumberOfSeconds(){
            return (long) hours * 3600 +  (long) minutes * 60 + (long) seconds;
    }
    // печает полное количество секунд
    public void printTotalOfSeconds () {
        if (seconds == -1) {
            System.out.println("Вы ввели некоректные данные");
        } else {
            System.out.println("Количесво секунд = " + totalNumberOfSeconds());
        }
    }
    public void printTime() {
        if (seconds == -1) {
            System.out.println("Вы ввели некоректные данные");
        } else {
            if (seconds >= 60) {
                convertSecondsToTime(seconds);
            }
            System.out.println("Время: " + hours + ":" + minutes + ":" + seconds);
        }
    }
    // сравнивает два обьекта по секундам
    public int compareTime(TimeInterval t) {
        if (seconds == -1 || t.seconds == -1) {
            System.out.println("Вы ввели некоректные данные");
            return 666;
        } else {
            long first = totalNumberOfSeconds();
        long second = t.totalNumberOfSeconds();
        int result;
        if (first == second) {
            result = 0;
        } else if (first > second) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
    }
    public String compareTimeResultTime(TimeInterval t) {
        if (seconds == -1 || t.seconds == -1) {
            return "Вы ввели некоректные данные";
        } else {
            long first = totalNumberOfSeconds();
            long second = t.totalNumberOfSeconds();
            String result;
            if (first == second) {
                result = "=";
            } else if (first > second) {
                result = ">";
            } else {
                result = "<";
            }
            if (seconds >= 60) {
                convertSecondsToTime(seconds);
            }
            if (t.seconds >= 60) {
                t.convertSecondsToTime(t.seconds);
            }
            result = hours + ":" + minutes + ":" + seconds + " " + result +
                    " " + t.hours + ":" + t.minutes + ":" + t.seconds;
            return result;
        }
    }
}
