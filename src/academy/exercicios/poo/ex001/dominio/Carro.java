package academy.exercicios.poo.ex001.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private double ano;

    public Carro(String marca, String modelo, double ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }
}
