package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criandoArquivo();
    }

    public static void criandoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado! "+ isCriado);
            throw new RuntimeException();
        } catch (IOException e) {
            System.out.println("Error");
        }finally {
            System.out.println("Fechando arquivo SO");
        }
    }
}
