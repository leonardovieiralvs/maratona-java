package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (ArithmeticException  | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws ArrayIndexOutOfBoundsException, FileNotFoundException {

    }
}
