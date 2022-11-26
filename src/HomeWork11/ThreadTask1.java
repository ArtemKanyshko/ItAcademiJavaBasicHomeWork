package HomeWork11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTask1 extends Thread{
    /* 1. Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
    коллекции из 10 случайных целых чисел и выводит на экран.*/
    Random random = new Random();
    String name;

    public ThreadTask1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        List<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumber.add(random.nextInt(20));
        }
        int sumNumber = 0;
        for (Integer number : randomNumber) {
            sumNumber += number;
        }
        System.out.println(name +": " + (double) sumNumber / randomNumber.size());
    }
}
