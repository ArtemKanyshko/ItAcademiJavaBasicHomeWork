package HomeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Array {
    static Random random = new Random();

    public static void main(String[] args) {
        lastElement(); // задание 1
        evenIndex(); // задание 2
        maxElement(); // задание 3
        sumElements(); // задание 4
        reverseArray(); // задание 5
        butterfly (); // задание 6
    }
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
    public static void lastElement() {
        int[] array = new int[10]; // создаём массив в 10 элементов
        for (int i = 0; i < array.length; i++) { // заполняем массив числами от 1 до 10
            int newValue = (random.nextInt(10) + 1); // random.nextInt(10) - выдает от 0 до 10, число 10 не включая
                                                         // что бы получить диапозон от 1 до 10 нужно добавить 1 (+ 1)
            array [i] = newValue;
        }
        System.out.println(Arrays.toString(array)); // выводит массив в консоль
        System.out.println("last element - " + array[array.length - 1]); // показывает последний элемент массива

    }
    // Создайте переменную для массива из 10 элементов (другим способом).
    // Выведите на экран элементы, стоящие на четных позициях (индексы).
    public static void evenIndex () {
        int e = 10; // количество элементов массива
        int[] array = new int[e];
        int i = 0;
        while (i < e ) {
            array [i] = (int) (Math.random() * 10 + 1); // другой способ
            i++;
        }
        System.out.println(Arrays.toString(array));
        for (i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " = " + array[i] + ", ");
            }
        }
    }
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа. Найдите максимальный элемент и выведите его индекс.
    public static void maxElement () {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int newValue = (random.nextInt(10) + 1);
            array [i] = newValue;
        }
        System.out.println(Arrays.toString(array));
        int m = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) { // находим максимальный элемент
            if (m < array[i]) {
                m = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) { // находим индекс максимального элемента
            if (array[i] == m) {
                indexMax = i;
                break; // останавливаем цикл на первом нашедшем индексе
            }
        }
        System.out.println("индекс " + indexMax + " = " + m);
    }
    // Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
    // Определите сумму элементов массива, расположенных между минимальным и максимальным значениями (не включая).
    // Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов
    // между максимальным и минимальным значениями.
    public static void sumElements () {
        //int[] array = {10, 1, 1, 1, 10, 10, 1, 1, 1, 10}; // для проверки
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int newValue = (random.nextInt(10) + 1);
            array [i] = newValue;
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int indexMinMin = 0;
        int indexMaxMin = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // находим максимальное значение
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) { // находим минимальное значение
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min = " + min + "; " + "max = " + max);
        for (int i = 0; i < array.length; i++) { // находим максимальный индекс максимального значения
            if (array[i] == max) {
                indexMax = i;
            }
            if (array[i] == min) { // находим максимальный индекс минимального значения
                indexMin = i;
            }
        }
        for (int i = 0; i < array.length; i++) { // находим минимальный индекс максимального значения
            if (array[i] == max) {
                indexMaxMin = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) { // находим минимальный индекс минимального значения
            if (array[i] == min) {
                indexMinMin = i;
                break;
            }
        }
          if (indexMax - indexMinMin >= indexMin - indexMaxMin) { // надим разницу и считам сумму элементов
              int index = indexMinMin;
              while (index < indexMax) {
                  sum = array[index + 1] + sum;
                  index++;
              }
              sum = sum - array[indexMax];
          }
          else if (indexMax - indexMinMin < indexMin - indexMaxMin) { // надим разницу и считам сумму элементов
              int index = indexMaxMin;
              while (index < indexMin) {
                  sum = array[index + 1] + sum;
                  index++;
              }
              sum = sum - array[indexMin];
          }
        System.out.println("Сумма элементов массива между минимальным и максимальным значениями = " + sum);
    }
    // Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
    // Выведите на экран, переверните и снова выведите на экран
    // (при переворачивании нежелательно создавать еще один массив).
    public static void reverseArray () {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int newValue = (random.nextInt(10) + 1);
            array[i] = newValue;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int r = array[i]; // помещаем в переменную значение i-того индекса
            array[i] = array[array.length - i - 1]; // присваиваем i-тому индексу значение i индекса с конца
            array[array.length - i - 1] = r; // присваиваем i индексу с конца значение r
                                             // и так по кругу пока не закочится половина длинны массива
        }
        System.out.println(Arrays.toString(array));
    }
    // Создать двухмерный квадратный массив и заполнить его «бабочкой»
    public static void butterfly () {
        int c = 5; // размер массива
        int[][] array = new int[c][c];
        for (int i = 0; i < array.length / 2 + 1; i++) { // для первой половины длинны массива
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                    array[i][j] = 0;
                }
                else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) { // для второй половины длинны массива
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i )) || (j > i)) {
                    array[i][j] = 0;
                }
                else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < c; i++) { // выводи массив на консоль
            for (int j = 0; j < c; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}