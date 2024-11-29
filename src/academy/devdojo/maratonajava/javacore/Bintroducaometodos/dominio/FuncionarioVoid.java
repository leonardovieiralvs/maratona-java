package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioVoid {
    private String nome;
    private int idade;
    private double[] salarios = {1200, 2333, 940};
    private double soma = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double num : salarios) {
            System.out.println(num);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void mediaSalario() {
        for(double salario : salarios) {
            soma += salario;
        }
        System.out.println(soma/3);
    }
}
