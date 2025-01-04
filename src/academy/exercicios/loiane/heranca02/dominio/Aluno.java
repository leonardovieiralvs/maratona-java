package academy.exercicios.loiane.heranca02.dominio;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereço, String telefone, String cpf) {
        super(nome, endereço, telefone, cpf);
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("3231212");
    }
}
