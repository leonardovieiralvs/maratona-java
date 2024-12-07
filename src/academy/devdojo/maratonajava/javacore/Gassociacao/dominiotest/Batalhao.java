package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Batalhao {
    private String nome;
    private Militares[] militares;

    public Batalhao(String nome, Militares[] militares) {
        this.nome = nome;
        this.militares = militares;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(militares == null) return;
        for (Militares militaresCont : militares) {
            System.out.println(militaresCont.getNome());
        }

    }

    public void setMilitares(Militares[] militares) {
        this.militares = militares;
    }

    public Militares[] getMilitares() {
        return militares;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
