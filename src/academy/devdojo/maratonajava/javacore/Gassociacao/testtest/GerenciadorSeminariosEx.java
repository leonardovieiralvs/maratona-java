package academy.devdojo.maratonajava.javacore.Gassociacao.testtest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Seminario;

public class GerenciadorSeminariosEx {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo", 25);
        Aluno aluno2 = new Aluno("Bira", 33);
        Aluno[] alunos = {aluno1, aluno2};

        Professor professor1 = new Professor("Aquiles", "JAVA");
        Professor professor2 = new Professor("Aquiles", "JAVA");
        Professor[] professores = {professor1, professor2};

        Local local = new Local("Avenida Tunico");

        Seminario seminario = new Seminario("Fenix", local);







        System.out.println(aluno1);
    }
}
