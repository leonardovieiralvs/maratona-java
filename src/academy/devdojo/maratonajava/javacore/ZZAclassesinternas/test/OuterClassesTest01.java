package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Leozymtdl";

    class Inner {
        public void printOuterClassesAtribute() {
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest = new OuterClassesTest01();
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner1 = outerClass.new Inner();
        inner1.printOuterClassesAtribute();

        System.out.println("------");

        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassesAtribute();
    }
}
