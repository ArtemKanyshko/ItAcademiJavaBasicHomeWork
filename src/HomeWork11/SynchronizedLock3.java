package HomeWork11;

public class SynchronizedLock3 extends Thread{
    public void run() {
        synchronized (String.class) {
            System.out.println("Aquired lock on Integer.class object");
            synchronized (Long.class) {
                System.out.println("Aquired lock on String.class object");
                synchronized (Integer.class) {
                    System.out.println("Aquired lock on Long.class object");
                }
            }
        }
    }
    }
