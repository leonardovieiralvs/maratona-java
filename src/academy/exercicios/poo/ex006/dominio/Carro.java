package academy.exercicios.poo.ex006.dominio;

public class Carro extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }
}
