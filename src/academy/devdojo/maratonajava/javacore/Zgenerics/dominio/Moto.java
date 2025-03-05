package academy.devdojo.maratonajava.javacore.Zgenerics.dominio;

public class Moto {
    private String nome;

    public Moto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
