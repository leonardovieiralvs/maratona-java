package academy.exercicios.poo.ex006.dominio;

public class Moto extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }
}
