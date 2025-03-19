package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Anime {
    private String name;
    private int episodes;

    public Anime(String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
