package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] idades = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um numero: ");
            idades[i] = input.nextInt();
        }

        for (int i = 0; i < idades.length ; i++) {
            System.out.println(idades[i]);
        }
    }
}
