package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;

class AllFiles extends SimpleFileVisitor<Path> {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
            return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new AllFiles());
    }
}


