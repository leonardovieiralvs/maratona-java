package academy.exercicios.loiane.heranca02.test;

import academy.exercicios.loiane.heranca02.dominio.Aluno;
import academy.exercicios.loiane.heranca02.dominio.Pessoa;
import academy.exercicios.loiane.heranca02.dominio.Professor;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Itachi", "Katom", "21782717", "192892");
        Aluno aluno = new Aluno("Itachi", "JdL", "21782717", "192892");
        Professor professor = new Professor("Itachi", "Pq dos Monstros", "21782717", "192892");


        System.out.println("------");
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(pessoa);
    }
}
