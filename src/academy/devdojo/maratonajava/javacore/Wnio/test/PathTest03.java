package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path diretorio = Paths.get("home/leo");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = diretorio.resolve(arquivo);
        System.out.println(diretorio);
        System.out.println(arquivo);
        System.out.println(resolve);
    }
}
