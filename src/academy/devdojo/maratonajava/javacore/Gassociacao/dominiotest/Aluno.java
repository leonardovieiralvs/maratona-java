package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Aluno {
    private String nome;
    private int idade;
    private Local local;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimeAluno() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (local == null) return;
        System.out.println(this.local);
        System.out.println(this.seminario);
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
}
