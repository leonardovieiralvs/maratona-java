package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " +isCreated);
            if (file.exists()) {
                System.out.println("Path "+ file.getPath());
                System.out.println("Last Modified "+ new Date(file.lastModified()));
                boolean isDeleted = file.delete();
                System.out.println("Deleted: " +isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
