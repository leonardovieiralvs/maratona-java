package academy.exercicios.poo.ex002.test;

import academy.exercicios.poo.ex002.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Neji", 17, "neji.hyuga@hotmail.com");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getEmail());
        pessoa.setNome("Hinata");
        pessoa.setIdade(15);
        pessoa.setEmail("hinata.hyuga@hotmail.com");
        System.out.println("-----------------");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getEmail());
    }
}
