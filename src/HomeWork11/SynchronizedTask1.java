package HomeWork11;

public class SynchronizedTask1 extends Thread{
    /* 1. Создать метод, который печатает название потока и засыпает на 2 секунды.
    Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы
    все потоки выполнились последовательно.*/
    String name;
    public SynchronizedTask1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception" + e);
        }
    }
}
