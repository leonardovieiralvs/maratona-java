package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Anami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Leo", 6000);
        System.out.println(gerente1);
        System.out.println(dev);
        gerente1.imprime();
        dev.imprime();
    }

}
