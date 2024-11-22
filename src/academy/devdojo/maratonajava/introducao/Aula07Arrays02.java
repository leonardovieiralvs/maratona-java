package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] dias = new int[3][4];
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print("Digite um numero: ");
                dias[i][j] = input.nextInt();
            }
        }

        for (int[] arrayBase : dias) {
            for(int num : arrayBase) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}



