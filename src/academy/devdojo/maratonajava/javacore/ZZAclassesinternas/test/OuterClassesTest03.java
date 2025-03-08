package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Léo";

    static class Nested {
        void print() {
            String lastName = "Souza";
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
