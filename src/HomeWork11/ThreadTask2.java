package HomeWork11;

import java.util.Random;

public class ThreadTask2 extends Thread{
    /* 2. Создать класс поток, который генерирует массив случайных целых чисел из 10
        элементов, затем находит максимальный элемент, в этом массиве, и выводит на
        экран в формате имя потока, максимальный элемент. Запустить 10 потоков.*/
    Random random = new Random();
    String name;

    public ThreadTask2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int[] numberRandom = new int [10];
        int maxNumber = numberRandom[0];
        for (int i = 0; i < numberRandom.length; i++) {
            numberRandom [i] = random.nextInt(20);
            if (numberRandom [i] > maxNumber) {
                maxNumber = numberRandom [i];
            }
        }
        System.out.println(name + ": maxNumber = " + maxNumber);
    }
}
