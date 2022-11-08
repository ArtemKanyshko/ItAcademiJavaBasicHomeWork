package HomeWork9;

public class HomeWork9 {
    public static void main(String[] args) throws MyException {
        /* Написать код, который выбрасывает NullPointerException. Написать обработчик
        этого исключения и вывести на экран сообщение, которое будет содержать
        описание данного исключения.
        */
        System.out.println("Задание 1. Написать код, который выбрасывает NullPointerException.");
        try {
            methodNullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println();

        /* Написать собственное исключение от Exception. Сгенерировать код, который будет
        выбрасывать его и обрабатывать. Результат работы программы вывести на экран.
        */
        System.out.println("Задание 2. Написать собственное исключение от Exception.");
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e);
        }
        System.out.println();

        /* Написать метод, который будет возбуждать исключение и обработать это
        исключение на уровне выше. Результат работы программы вывести на экран.
        */
        System.out.println("Задание 3. Написать метод, который будет возбуждать исключение и обработать " +
                "это исключение на уровне выше.");
        methodThrowsException();

    }
    /* Написать код, который выбрасывает NullPointerException. Написать обработчик
    этого исключения и вывести на экран сообщение, которое будет содержать
    описание данного исключения.
    */
    public static void methodNullPointerException () {
        Object nullPoint = null;
        nullPoint.equals("qwerty");
    }

    /* Написать метод, который будет возбуждать исключение и обработать это
    исключение на уровне выше. Результат работы программы вывести на экран.
    */
    public static void methodThrowsException () {
        try {
            methodThrowsException2();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally!!!");
        }
    }
    public static void methodThrowsException2 () throws NullPointerException {
        Object nullPoint = null;
        nullPoint.equals("qwerty");
    }
}
