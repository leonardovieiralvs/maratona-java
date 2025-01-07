package academy.exercicios.loiane.heranca02.dominio;

import academy.exercicios.loiane.heranca02.dominio.Pessoa;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Double.compare(salario, professor.salario) == 0 && Objects.equals(departamento, professor.departamento) && Objects.equals(nomeCurso, professor.nomeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento, nomeCurso, salario);
    }
}
