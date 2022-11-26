package HomeWork11;

public class SynchronizedLock2 extends Thread{
    public void run() {
        synchronized (Long.class) {
            System.out.println("Aquired lock on Integer.class object");
            synchronized (Integer.class) {
                System.out.println("Aquired lock on String.class object");
                synchronized (String.class) {
                    System.out.println("Aquired lock on Long.class object");
                }
            }
        }
    }
}
