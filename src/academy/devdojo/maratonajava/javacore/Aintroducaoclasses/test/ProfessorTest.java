package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Minato";
        professor.idade = 23;
        professor.sexo = 'M';
        System.out.print(professor.nome + professor.idade + professor.sexo);
    }
}
