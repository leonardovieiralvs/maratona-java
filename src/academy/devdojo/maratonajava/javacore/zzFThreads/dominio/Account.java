package academy.devdojo.maratonajava.javacore.zzFThreads.dominio;

public class Account {
    private int balance = 50;

    public void withdrawl(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
