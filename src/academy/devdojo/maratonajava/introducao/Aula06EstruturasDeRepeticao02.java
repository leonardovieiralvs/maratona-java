package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (double numeroPar = 0; numeroPar < 1000000; numeroPar++) {
            if(numeroPar % 2 == 1) {
                System.out.println(numeroPar);
            }
        }
    }
}
