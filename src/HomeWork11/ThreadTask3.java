package HomeWork11;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class ThreadTask3 extends Thread{
    /* 3.Создать класс поток, который создает средствами Java файл и записать в него
        произвольно сгенерированный массив из 10 случайных целых чисел. Запустить 5
        потоков.*/
    Random random = new Random();
    @Override
    public void run() {
        File textFilePersonList = new File("./src/HomeWork11/textFileArraysThreadTask3.txt");
        try (PrintWriter pwTextFilePersonList = new PrintWriter(new BufferedWriter
                (new FileWriter(textFilePersonList, true)))) {
            int[] numberRandom = new int [10];
            for (int i = 0; i < numberRandom.length; i++) {
                numberRandom [i] = random.nextInt(20);
            }
                pwTextFilePersonList.println(Arrays.toString(numberRandom));
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }
}
