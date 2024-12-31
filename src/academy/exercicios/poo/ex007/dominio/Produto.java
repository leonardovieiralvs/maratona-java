package academy.exercicios.poo.ex007.dominio;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void calcularTotal() {
        System.out.println("Nome do produto: "+this.nome);
        System.out.println("Preco do produto: "+this.preco);
        System.out.println("Quantidade do produto: "+this.quantidade+ " Unidades");
        System.out.println("Valor total dos produtos foi: "+this.preco * this.quantidade);
    }
}
