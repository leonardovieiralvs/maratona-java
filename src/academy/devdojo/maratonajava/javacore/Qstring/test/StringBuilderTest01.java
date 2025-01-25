package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "L e ozym";
        nome = nome.concat("TDL");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Leozym");
        sb.append("TDl");
        System.out.println(sb);
        String substring = sb.substring(0, 3);
        System.out.println(substring);
        System.out.println(nome);
        nome = nome.trim();
        nome = nome.replaceAll("ASAS","");
        System.out.println(nome);
    }
}
