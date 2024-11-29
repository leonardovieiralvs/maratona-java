package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioVoid;

public class FuncionarioTestVoid {
    public static void main(String[] args) {
        FuncionarioVoid funcionario = new FuncionarioVoid();
        funcionario.setNome("Kisame");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[] {1200, 2333, 940});
        funcionario.imprime();
        System.out.print("A media dos salarios é de: ");
        funcionario.mediaSalario();
    }
}
