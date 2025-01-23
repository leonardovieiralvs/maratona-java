package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte b = 1;
        Byte byteW = 1;
        Short shortW = 1;
        Integer a = 2;
        Character baaa = 'a';
        Integer intW = 1;

        int i = intW;

        Boolean booleanW = true;

        Integer intP = Integer.parseInt("2");

        Boolean verdadeiro = Boolean.parseBoolean("LA ELE");
        System.out.println(verdadeiro);

        String texto = "3.14";
        Double numero = Double.parseDouble(texto); // Converte a String "3.14" para o valor double 3.14
        System.out.println(numero); // Vai imprimir 3.14

    }
}
