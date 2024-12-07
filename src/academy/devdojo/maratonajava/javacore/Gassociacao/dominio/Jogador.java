package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {  // construtor Jogador
        this.nome = nome;
    }

    public Jogador(String nome, Time time) { // sobrecarga de metodos
        this.nome = nome;
        this.time = time;
    }

    public void imprime() { // imprimir
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
