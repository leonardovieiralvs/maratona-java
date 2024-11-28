package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioReturn;

public class FuncionarioTestReturn {
    public static void main(String[] args) {
        FuncionarioReturn funcionario = new FuncionarioReturn();
        funcionario.nome = "\nItachi";
        funcionario.idade = 16;
        funcionario.imprimeFuncionario();

        double result = funcionario.mediaSalarios();
        System.out.println("a media entre os salários é: "+result);
    }
}
