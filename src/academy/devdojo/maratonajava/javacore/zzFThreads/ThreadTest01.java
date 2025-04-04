package academy.devdojo.maratonajava.javacore.zzFThreads;

class ThreadImplements implements Runnable {
    private String nome;
    private int tempo;

    public ThreadImplements(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("############### "+Thread.currentThread().getName());
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadExtends extends Thread {
    private String name;
    private final char c;

    public ThreadExtends(char c, String name) {
        this.c = c;
        this.name = name;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("############### " +Thread.currentThread().getName() + " " +name );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
//        Thread testImplements = new Thread(new ThreadImplements("1", 900));
//        Thread testImplements1 = new Thread(new ThreadImplements("1", 600));
//
//        Thread thread2 = new Thread(new ThreadImplements("1", 1));
//        Thread thread3 = new Thread(new ThreadImplements("2", 1));
//        Thread thread4 = new Thread(new ThreadImplements("3", 1));
//        System.out.println("--------");

        ThreadExtends t1 = new ThreadExtends('A', "T1A");
        ThreadExtends t2 = new ThreadExtends('B', "T2B");
        ThreadExtends t3 = new ThreadExtends('c', "T3C");
        t3.setPriority(Thread.MAX_PRIORITY);
    }
}
