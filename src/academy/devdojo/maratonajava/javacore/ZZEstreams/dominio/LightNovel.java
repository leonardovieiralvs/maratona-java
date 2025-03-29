package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LightNovel {
    private String tittle;
    private double price;
    private Category category;
    private Promotion promotion;

    public LightNovel(String tittle, double price) {
        this.tittle = tittle;
        this.price = price;
    }

    public LightNovel(String tittle, double price, Category category) {
        this.tittle = tittle;
        this.price = price;
        this.category = category;
    }


    @Override
    public String toString() {
        return "LightNovel{" +
                "tittle='" + tittle + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(tittle, that.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tittle);
    }

    public String getTittle() {
        return tittle;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
