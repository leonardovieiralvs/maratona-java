package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class PessoaSetGet {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }



    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}

