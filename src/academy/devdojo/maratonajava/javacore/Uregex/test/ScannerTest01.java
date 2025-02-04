package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Berthold,false,true,2000";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int "+i );
            } else if (scanner.hasNextBoolean()) {
                boolean isTrue = scanner.nextBoolean();
                System.out.println("Boolean "+isTrue);
            } else {
                System.out.println(scanner.next());
            }
        }
        System.out.println("------------");
        System.out.println("Fora do loop");
    }
}
