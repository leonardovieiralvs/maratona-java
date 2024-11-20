package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 15;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+i);
        }
    }
}
