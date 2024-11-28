package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioVoid;

public class FuncionarioTestVoid {
    public static void main(String[] args) {
        FuncionarioVoid funcionario = new FuncionarioVoid();
        funcionario.nome = "Kisame";
        funcionario.idade = 21;
        funcionario.imprimeDados(funcionario);

        System.out.print("A media dos salarios é de: ");
        funcionario.mediaSalario();
    }
}
