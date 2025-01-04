package academy.exercicios.loiane.heranca02.dominio;

public class Professor extends Pessoa {
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(String nome, String endereço, String telefone, String cpf) {
        super(nome, endereço, telefone, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
