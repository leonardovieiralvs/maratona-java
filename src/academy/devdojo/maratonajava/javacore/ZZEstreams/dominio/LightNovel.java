package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

public class LightNovel {
    private String tittle;
    private double price;

    public LightNovel(String tittle, double price) {
        this.tittle = tittle;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "tittle='" + tittle + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTittle() {
        return tittle;
    }

    public double getPrice() {
        return price;
    }
}
