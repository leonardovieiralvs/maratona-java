package academy.devdojo.maratonajava.javacore.zzFThreads;

class ThreadImplements2 implements Runnable {
    private String nome;

    public ThreadImplements2(String nome) {
        this.nome = nome;
    }


    @Override
    public void run() {
        System.out.println("############### " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(nome);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadImplements2("KA"));
        Thread t2 = new Thread(new ThreadImplements2("ME"));
        Thread t3 = new Thread(new ThreadImplements2("HA"));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
