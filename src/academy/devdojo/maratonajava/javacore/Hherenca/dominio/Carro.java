package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

import java.util.Scanner;

public class Carro {
    public int num;


    public void imprime() {
        do {
            System.out.print("O Carro está ligado! Digite 1 para manter ligado e 2 para desligar: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num == 1) {
                System.out.println("Carro ligado"); return;
            }
        } while (num == 1);
        System.out.println("Carro Desligado!");
    }
}
