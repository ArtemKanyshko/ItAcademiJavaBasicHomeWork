package HomeWork11;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{
    private QueueTask3Synchronized queueTask3Synchronized;
    private String name;
    public Producer (QueueTask3Synchronized queueTask3Synchronized, String name) {
        this.queueTask3Synchronized = queueTask3Synchronized;
        this.name = name;
    }

    @Override
    public void run() {
        while (queueTask3Synchronized.getAmount() <= 0) {
            return;
        }
        while (queueTask3Synchronized.getAmount() > 0) {

            queueTask3Synchronized.in(name);
        }
    }
}
