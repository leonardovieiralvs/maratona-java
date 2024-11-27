package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
       // ImprimeEstudante imprime = new ImprimeEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sakura";
        estudante01.idade = 14;
        estudante01.sexo = 'F';

        estudante02.nome = "Minato";
        estudante02.idade = 23;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
