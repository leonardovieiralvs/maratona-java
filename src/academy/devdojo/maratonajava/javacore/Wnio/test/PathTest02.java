package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pastaTest");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath); // se nao existir pasta, crie a pasta;
        }

        Path subPasta = Paths.get("pastaTest/subpasta/subsubpasta");
        Files.createDirectories(subPasta);
        Path fileDirectories = subPasta.resolve("arquivo.txt"); // criando arquivo dentro de uma pasta;
        if (Files.notExists(fileDirectories)) {
            Files.createFile(fileDirectories);
            System.out.println("Arquivo criado!");
        } else {
            System.out.println("Arquivo ja existente");
        }

        Path source = fileDirectories;
        Path target = Paths.get(fileDirectories.getParent().toString(),"arquivo_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

}
