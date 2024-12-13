package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    static {
        System.out.println("FUNCIONARIO");
    }

    {
        System.out.println("FILHO");
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
        System.out.println("OlÁ funcionário");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
