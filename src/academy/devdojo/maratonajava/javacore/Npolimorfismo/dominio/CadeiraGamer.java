package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class CadeiraGamer extends Produto{
    public String ApoioCabeca;
    public final double IMPOSTO_PRODUTO = 0.10;
    public CadeiraGamer(String nome, double valor) {
        super(nome, valor);
    }

    public String getApoioCabeca() {
        return ApoioCabeca;
    }

    public void setApoioCabeca(String apoioCabeca) {
        ApoioCabeca = apoioCabeca;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculado imposto da cadeira gamer!");
        return this.valor * IMPOSTO_PRODUTO;
    }
}
