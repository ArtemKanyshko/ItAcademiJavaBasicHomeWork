package HomeWork11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;


public class QueueTask3Synchronized extends Thread{
    Random random = new Random();
    private int size = 200;
    Queue<Integer> queue = new ArrayDeque<>(size);
    private int count = 0;
    private int amount = 10000;

    public synchronized int getAmount() {
        return amount;
    }

    public synchronized void in(String name) {
        if (count >= 100) {
            try {
                wait();
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(random.nextInt(100) + 1);
        count++;
        amount--;
        System.out.println("Добавил в очередь: " + name);
        System.out.println("Элементов в очереди: " + count);
        System.out.println("Действий осталось: " + amount);
        notify();

    }

    public synchronized void out (String name) {
        if (count == 0) {
            try {
                wait();
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.remove();
        count--;
        amount--;
        System.out.println("Забрал из очереди: " + name);
        System.out.println("Элементов в очереди: " + count);
        System.out.println("Действий осталось: " + amount);
        if (count <= 80) {
            notify();
        }

    }
}
