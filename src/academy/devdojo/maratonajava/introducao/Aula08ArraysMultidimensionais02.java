package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
         int[][] arrayBase = new int[5][];
         arrayBase [0] = new int [1];
         arrayBase [1] = new int [2];
         arrayBase [2] = new int [3];
         arrayBase [3] = new int [4];
         arrayBase [4] = new int [5];

         for (int[] arrayInt : arrayBase) {
             for(int num : arrayInt) {
                 System.out.print(num);
             }
             System.out.println("");
         }
    }
}
