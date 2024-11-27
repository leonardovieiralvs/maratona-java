package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "\nItachi";
        funcionario.idade = 16;
        funcionario.imprimeFuncionario();

        double result = funcionario.mediaSalarios();
        System.out.println("a media entre os salários é: "+result);
    }
}
