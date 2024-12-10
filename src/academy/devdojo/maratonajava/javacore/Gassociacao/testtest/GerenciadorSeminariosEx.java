package academy.devdojo.maratonajava.javacore.Gassociacao.testtest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest.Seminario;

public class GerenciadorSeminariosEx {
    public static void main(String[] args) {
        Local local = new Local("Local: AV. Carlos Lacerda");

        Aluno aluno1 = new Aluno("Nome: Leonardo", 25);
        Aluno[] alunos = {aluno1};

        Professor professor = new Professor("Professor: Aquiles", "Especialidade: JAVA");
        Professor[] professores = {professor};


        Seminario seminario1 = new Seminario("Seminário: Fenix", local);
        Seminario[] seminarios = {seminario1};


        aluno1.setSeminario(seminario1);
        aluno1.imprimeAluno();

        seminario1.setLocal(local);
        seminario1.imprimeSeminario();

        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
