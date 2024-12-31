package academy.exercicios.poo.ex009.dominio;

public class Estatisticas {
    public int[] elementos = new int[10];

    public void somar(){
        for (int num = 1; num < 10; num++) {
            System.out.print(" "+num);
        }
    }

    public void calcularMedia() {
        for (int num2 = 1; num2 < 10; num2++) {
            num2 += num2;
            System.out.println(" "+num2/elementos.length);
        }
    }
}
