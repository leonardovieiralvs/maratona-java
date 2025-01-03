package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    protected String dataValidade;
    protected String PrecoPorKilo;
    public static final double IMPOSTO_PRODUTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculado imposto do tomate!");
        return this.valor * IMPOSTO_PRODUTO;
    }

    public String getPrecoPorKilo() {
        return PrecoPorKilo;
    }

    public void setPrecoPorKilo(String precoPorKilo) {
        PrecoPorKilo = precoPorKilo;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
