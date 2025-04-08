package academy.devdojo.maratonajava.javacore.zzFThreads.service;

import academy.devdojo.maratonajava.javacore.zzFThreads.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Começando a entrega de emails");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (!email.isEmpty()) continue;
                System.out.println(threadName+ " Enviando email para"+ email);
                Thread.sleep(2000);
                System.out.println(threadName+ " Enviou email com sucesso para"+ email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Emails enviado com sucesso");
    }
}
