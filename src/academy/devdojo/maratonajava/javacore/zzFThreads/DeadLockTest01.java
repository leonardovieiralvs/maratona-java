package academy.devdojo.maratonajava.javacore.zzFThreads;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread1: Segurando LOCK1");
                System.out.println("Thread1: Esperando LOCK2");
                synchronized (lock2) {
                    System.out.println("Thread1: Segurando do LOCK2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread2: Segurando LOCK2");
                System.out.println("Thread2: Esperando LOCK1");
                synchronized (lock1) {
                    System.out.println("Thread2: Segurando do LOCK1");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
