package academy.exercicios.loiane.heranca02.dominio;

import academy.exercicios.loiane.heranca02.dominio.Pessoa;

public class Professor extends Pessoa {
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(String nome, String endereço, String telefone, String cpf) {
        super(nome, endereço, telefone, cpf);
    }

    public void testVisibilidade() {
        super.cpf = "1111111111";
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

    @Override
    public String obterEtiquetaEndereco() {
        return "Endereço do Professor: " + this.getEndereço();
    }
}
