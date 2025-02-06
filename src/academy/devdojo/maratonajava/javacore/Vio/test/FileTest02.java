package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada? "+isDirectoryCreated); // pasta criada

        File isFileCreated = new File(fileDirectory,"arquivo_renamed");
        boolean fileCreated = isFileCreated.createNewFile();
        System.out.println("Arquivo criado? "+fileCreated); // arquivo dentro da pasta criado
        
        File fileRenamed = new File(fileDirectory, "arquivo_renamed.txt");
        boolean isRenamed = isFileCreated.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? "+isRenamed); // arquivo dentro da pasta renomeado

        File folderRenamed = new File("pasta2");
        boolean isFolderRenamed = fileDirectory.renameTo(folderRenamed);
        System.out.println("Pasta renomeada? "+isFolderRenamed);
    }
}
