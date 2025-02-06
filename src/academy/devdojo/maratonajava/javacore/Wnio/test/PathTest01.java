package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\IdeaProjects\\maratona-java\\pasta2");
        System.out.println(path.getFileName().toFile().toPath());
    }
}
