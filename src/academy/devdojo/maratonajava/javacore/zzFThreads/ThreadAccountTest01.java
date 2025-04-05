package academy.devdojo.maratonajava.javacore.zzFThreads;

import academy.devdojo.maratonajava.javacore.zzFThreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Leo");
        Thread t2 = new Thread(threadAccountTest01, "Bira");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10); // A CADA ITERAÇÃO CHAMA O METODO WITHDRAW E SUBTRAI -10 DO BALANCE QUE É 50.
            if (account.getBalance() <= 0) {
                System.out.println(Thread.currentThread().getName() + " seu saldo é insuficiente para saque!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void withdraw(int amount) {
        synchronized (account) {
            System.out.println(Thread.currentThread().getName() + " Está dentro do SYNCH");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " Está indo sacar o dinheiro");
                account.withdrawl(amount);
                System.out.println(Thread.currentThread().getName() + " Completou o saque, valor atual da conta: " + account.getBalance());
            } else {
                System.out.println(Thread.currentThread().getName() + " Seu saldo é insuficiente: " + account.getBalance());
            }
        }
    }
}
