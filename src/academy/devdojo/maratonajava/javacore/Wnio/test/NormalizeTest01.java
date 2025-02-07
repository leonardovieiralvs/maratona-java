package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/leo/dev";
        String arquivo = "../../ arquivo.txt";
        Path path = Paths.get(diretorioProjeto, arquivo);
        System.out.println(path.normalize());

        Path normalize = Paths.get("home/leo/dev/../arquivo.txt").normalize();
        System.out.println(normalize);
    }
}
