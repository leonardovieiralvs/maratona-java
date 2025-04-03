package academy.devdojo.maratonajava.javacore.zzFThreads;

class ThreadImplements implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadExtends extends Thread {
    private final char c;
    private int tempo;

    public ThreadExtends(char c, int tempo) {
        this.c = c;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                 
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread testImplements = new Thread(new ThreadImplements());
        testImplements.start();

        System.out.println("--------");

        ThreadExtends testExtends = new ThreadExtends('1', 500);
        testExtends.start();
    }
}
