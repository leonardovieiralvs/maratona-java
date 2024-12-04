package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("dentro do bloco de inic.");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
