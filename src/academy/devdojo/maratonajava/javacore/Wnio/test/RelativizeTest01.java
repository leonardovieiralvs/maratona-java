package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/leo");
        Path path2 = Paths.get("/dev/olamundo.txt");

        Path relativePath = path1.relativize(path2);
        System.out.println(relativePath);
    }
}
