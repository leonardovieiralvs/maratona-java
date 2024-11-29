package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.PessoaSetGet;

public class PessoaSetGetTest01 {
    public static void main(String[] args) {
        PessoaSetGet pessoa = new PessoaSetGet();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(40);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
