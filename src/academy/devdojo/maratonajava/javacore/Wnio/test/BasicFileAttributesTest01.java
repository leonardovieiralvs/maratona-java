package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        
        File file = new File("pastaTest/subpasta/subsubpasta/file.test");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pastaTest/subpasta/subsubpasta/file2.test");
        Files.createFile(path);
        FileTime from = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, from);
    }
}
