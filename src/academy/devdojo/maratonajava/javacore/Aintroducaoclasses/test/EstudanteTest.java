package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[]  args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante2.nome = "OBITO";
        estudante2.idade = 17;
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);

        System.out.println(estudante.nome);
    }
}
