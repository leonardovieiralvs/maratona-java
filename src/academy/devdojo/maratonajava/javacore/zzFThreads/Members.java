package academy.devdojo.maratonajava.javacore.zzFThreads;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMembers(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adiciou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(ThreadExtends.currentThread().getName() + " Checando se à emails");
        synchronized (emails) {
            while (this.emails.isEmpty()) {
                if (!open) break;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel na lista, entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }


    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todos que não estamos mais pegando emails");
        }
    }
}
