package HomeWork11;

public class SynchronizedLock1 extends Thread{
    @Override
    public void run() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");
            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
                synchronized (Long.class) {
                    System.out.println("Aquired lock on Long.class object");
                }
            }
        }
    }
}
