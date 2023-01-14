package HomeWork11;


public class HomeWork11Synchronized {
    public static void main(String[] args) throws InterruptedException {
        /* 1. Создать метод, который печатает название потока и засыпает на 2 секунды.
        Запустить одновременно 10 потоков. Реализовать механизм синхронизации, чтобы
        все потоки выполнились последовательно.*/
        for (int i = 1; i <= 10; i++) {
            SynchronizedTask1 synchronizedTask1 = new SynchronizedTask1("Thread-" + String.valueOf(i));
            synchronizedTask1.start();
            synchronizedTask1.join();
        }
        /*2. Создать программу, которая реализует deadlock между тремя потоками.*/
        SynchronizedLock1 synchronizedLock1 = new SynchronizedLock1();
        SynchronizedLock2 synchronizedLock2 = new SynchronizedLock2();
        SynchronizedLock3 synchronizedLock3 = new SynchronizedLock3();
        synchronizedLock1.start();
        synchronizedLock2.start();
        synchronizedLock3.start();
        /* 3. Есть 3 производителя и 2 потребителя, все разные потоки и работают все
        одновременно. Есть очередь с 200 элементами. Производители добавляют
        случайное число от 1..100, а потребители берут эти числа. Если в очереди
        элементов >= 100 производители спят, если нет элементов в очереди – потребители
        спят. Если элементов стало <= 80, производители просыпаются. Все это работает до
        тех пор, пока обработанных элементов не станет 10000, только потом программа
        завершается.*/

        QueueTask3Synchronized queueTask3Synchronized = new QueueTask3Synchronized();

        Thread producer1 = new Thread(new Producer(queueTask3Synchronized, "Производитель 1"));
        Thread producer2 = new Thread(new Producer(queueTask3Synchronized, "Производитель 2"));
        Thread producer3 = new Thread(new Producer(queueTask3Synchronized, "Производитель 3"));
        Thread consumer1 = new Thread(new Consumer(queueTask3Synchronized, "Потребитель 1"));
        Thread consumer2 = new Thread(new Consumer(queueTask3Synchronized, "Потребитель 2"));

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();

    }
}
