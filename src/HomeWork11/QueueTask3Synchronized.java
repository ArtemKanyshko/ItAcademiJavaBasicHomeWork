package HomeWork11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;


public class QueueTask3Synchronized extends Thread{
    Random random = new Random();
    volatile Queue<Integer> queue = new ArrayDeque<>(200);
    volatile int amount = 0;
    volatile int amountNow = 0;
    public synchronized void add () throws InterruptedException {
        while (amount <= 10000) {
            if (amountNow <= 80) {
                queue.add(random.nextInt(100) + 1);
                amountNow++;
                amount++;
                System.out.println(amount);
                System.out.println(amountNow + " now add");
            } else if (amountNow >= 100) {
                wait();
            }
        }
    }
    public synchronized void remove () throws InterruptedException {
        while (amount <= 10000 && queue.peek() == null) {
            if (amountNow > 0) {
                queue.remove();
                amountNow--;
                System.out.println(amountNow + " now remove");
            } else if (amountNow == 0) {
            } else {
                notify();
            }
        }
    }
}
