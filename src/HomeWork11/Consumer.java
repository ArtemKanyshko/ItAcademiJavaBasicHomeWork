package HomeWork11;

import java.util.Queue;

public class Consumer extends QueueTask3Synchronized {
    volatile private Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public synchronized void run() {
            try {
                remove();
            } catch (InterruptedException e) {
                System.out.println("Exception" + e);
            }

    }
}
