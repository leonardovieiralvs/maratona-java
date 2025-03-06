package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClasses02 {
    private String name = "Leo";

    void print() {
        class LocalClass {
            public void printLocal() {
                System.out.println(name);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        new OuterClasses02().print();
    }
}
