package academy.devdojo.maratonajava.introducao;
// imprima os meses e quantos dias tem cada mes.


import java.util.Scanner;
public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dias = new int[12];
        for (int i = 1; i < dias.length; i++) {
            System.out.print("Digite q quantidade de dias do mes "+ i + ": ");
            dias[i] = input.nextInt();
        }

        for (int i = 1; i <= 11; i++) {
            System.out.println("o mês "+i+" tem o total de "+dias[i]+" dias.");


        }
    }
}