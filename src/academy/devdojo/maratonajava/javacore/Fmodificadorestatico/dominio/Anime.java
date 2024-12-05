package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private static String nome;
    private static int[] episodios;

    static {
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
        System.out.println("aaaaaaa eu to maluco");
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
