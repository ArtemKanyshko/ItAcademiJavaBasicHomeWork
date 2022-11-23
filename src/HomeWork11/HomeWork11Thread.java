package HomeWork11;

public class HomeWork11Thread {
    public static void main(String[] args) throws InterruptedException {
        /* 1. Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
        коллекции из 10 случайных целых чисел и выводит на экран.*/
        for (int i = 1; i <= 10; i++) {
            ThreadTask1 threadTask1 = new ThreadTask1("Thread-" + String.valueOf(i));
            threadTask1.start();
        }
        /* 2. Создать класс поток, который генерирует массив случайных целых чисел из 10
        элементов, затем находит максимальный элемент, в этом массиве, и выводит на
        экран в формате имя потока, максимальный элемент. Запустить 10 потоков.*/
        for (int i = 1; i <= 10; i++) {
            ThreadTask2 threadTask2 = new ThreadTask2("Thread-" + String.valueOf(i));
            threadTask2.start();
        }
        /* 3.Создать класс поток, который создает средствами Java файл и записать в него
        произвольно сгенерированный массив из 10 случайных целых чисел. Запустить 5
        потоков.*/
        for (int i = 1; i <= 5; i++) {
            ThreadTask3 threadTask3 = new ThreadTask3();
            threadTask3.start();
        }
    }
}
