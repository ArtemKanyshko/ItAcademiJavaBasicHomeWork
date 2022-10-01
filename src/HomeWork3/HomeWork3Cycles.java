package HomeWork3;

public class HomeWork3Cycles {
    public static void main(String[] args) {
        factorialNumbers(1, 10); // введите числа от и до что бы посчитать их факториалы
        sumNumbers (1, 25); // введите числа от и до что бы посчитать их сумму
        sumNumbers2(7893823445L); // введите число, что бы посчитать сумму чисел в введенном числе
        secondPrimeNumber(50, 70); // введите числа от и до что бы найти второе число в интервале
        sevenHope (1, 100); // введите числа от и до что бы узнать какие делятся на 7
        accountingFormatNumber(12312656732312L); // введите число, что бы перевести его в бух формат
    }
    // Вычислить факториал целых чисел от 0 до 10 с помощью цикла while для каждого.
    public static void factorialNumbers (int numberMin, int numberMax) {
        if (numberMin >= 0 && numberMax >= 0) { // проверяем на отрицательные числа
            int c = numberMin;
            int b = numberMin;
            while (c <= numberMax) {
                if (c == 0) { // факториал !0 = 1
                    b = 1;
                } else {
                    while (c > 1) {
                        b = b * --c;
                    }
                }
                System.out.println(b);
                c = ++numberMin;
                b = c;
            }
        }
        else {
            System.out.println("Вы неверно ввели число. Число должно быть целое и положительное.");
        }
    }
    // Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
    public static void sumNumbers (int firstNumber, int lastNumber) {
        int s = 0;
        do {
            s = s + firstNumber;
            firstNumber++;
        }
        while (firstNumber <= lastNumber);
        System.out.println(s);
    }
    // Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
    public static void sumNumbers2 (long number) {
        number = Math.abs(number);
        int s = 0;
        do {
            s += number % 10;
            number /= 10;
        }
        while (number != 0);
        System.out.println(s);
    }
    // Найти среди чисел от 50 до 70 второе простое число (число называют простым,
    // если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
    public static void secondPrimeNumber (int number1, int number2) {
        if (number1 >= 0 && number2 >= 0) {
            if (number1 <= 1) {
                number1 = 2;
            }
            int s = 0;
            while (number1 <= number2) {
                int c = 0;
                for (int i = 1; i <= number1; i++) {
                    if (number1 % i == 0) {
                        c++;
                    }
                    if (c > 2) {
                        c = 0;
                        number1++;
                        i = 0;
                    }
                }
                if (number1 <= number2) {
                    //System.out.println(number1);
                    s++;
                    if (s == 2) {
                        System.out.println(number1);
                        break;
                    }
                    number1++;
                }
            }
        }
    }
    //Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
    public static void sevenHope (int numberFirst, int numberSecond) {
        if ( numberFirst < numberSecond) {
            while (numberFirst <= numberSecond) {
                if (numberFirst % 7 == 0) {
                    System.out.println(numberFirst + "Hope!");
                } else {
                    System.out.println(numberFirst); // можно убрать данную строку, тогда на консоль
                                                     // выведет только те числа которые будут делиться на 7
                }
                numberFirst++;
            }
        }
        else {
            while (numberFirst <= numberSecond) {
                if (numberFirst % 7 == 0) {
                    System.out.println(numberFirst + "Hope!");
                    numberFirst--;
                } else {
                    System.out.println(numberFirst);
                    numberFirst--;
                }
            }
        }
    }
    // Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
    // каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.
    public static void accountingFormatNumber(long number) {
        String s = "" + Math.abs(number); // создаем строку и помещаем в нее наше число
        String r = "";
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) { //выводим длинну строки и через каждый 3 символ ставим пробел
            if (c == 3) {
                r = " " + r;
                c = 0;
            }
            r = s.charAt(i) + r;
            c++;
        }
        if (number < 0) {
            System.out.println("-" + r);
        }
        else {
            System.out.println(r);
        }
    }
}
