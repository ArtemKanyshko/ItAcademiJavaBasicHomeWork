package HomeWork11;

import java.util.Queue;
import java.util.Random;

public class Producer extends QueueTask3Synchronized{
    Random random = new Random();
    volatile private Queue<Integer> queue;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public synchronized void run() {
            try {
                add();
            } catch (InterruptedException e) {
                System.out.println("Exception" + e);

        }
    }
}
