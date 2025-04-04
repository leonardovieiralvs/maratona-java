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
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(tempo);
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
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i );
            try {
                Thread.sleep(tempo);
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

        Thread thread2 = new Thread(new ThreadImplements("1", 1100));
        System.out.println("--------");

        Thread thread = new Thread(new ThreadImplements("1", 50));
        ThreadExtends t1 = new ThreadExtends('1', 500);
        t1.start();
    }
}
