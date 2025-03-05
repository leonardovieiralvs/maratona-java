package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel");
        Barco barco = barcoDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Carros disponiveis para locação: ");
        System.out.println(barcoDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco: "+barco);
        barcoDisponiveis.add(barco);
        System.out.println("Carros disponiveis para locação: ");
        System.out.println(barcoDisponiveis);
    }
}
