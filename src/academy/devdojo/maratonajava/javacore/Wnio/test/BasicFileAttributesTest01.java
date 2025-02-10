package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("example.txt"); // Caminho do arquivo
        Files.createFile(file);

        try {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("Data de criação: " + attr.creationTime());
            System.out.println("Última modificação: " + attr.lastModifiedTime());
            System.out.println("Tamanho (bytes): " + attr.size());
            System.out.println("É diretório? " + attr.isDirectory());
            System.out.println("É arquivo? " + attr.isRegularFile());

        } catch (IOException e) {
            System.out.println("Erro ao obter atributos: " + e.getMessage());
        }
    }
}

