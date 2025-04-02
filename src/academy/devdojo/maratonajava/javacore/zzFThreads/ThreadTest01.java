package academy.devdojo.maratonajava.javacore.zzFThreads;

class ThreadImplements implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class ThreadExtends extends Thread {
    private final char c;

    public ThreadExtends(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread testImplements = new Thread(new ThreadImplements());
        testImplements.start();
        System.out.println("--------");
        ThreadExtends testExtends = new ThreadExtends('1');
        testExtends.start();
    }
}
