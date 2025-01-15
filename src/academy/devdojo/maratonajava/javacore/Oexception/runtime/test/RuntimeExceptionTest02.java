package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(5,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento Ilegal, o numero não pode ser 0.");
        }
        return a/b;
    }
}
