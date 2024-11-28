package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioVoid {
    public String nome;
    public int idade;
    public double[] salarios = {1200, 2333, 940};

    public void imprimeDados(FuncionarioVoid funcionario) {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario : salarios) {
            System.out.println(salario);
        }
    }

    public void mediaSalario() {
        double soma = 0;
        for(double salario : salarios) {
            soma += salario;
        }
        System.out.println(soma/3);
    }
}
