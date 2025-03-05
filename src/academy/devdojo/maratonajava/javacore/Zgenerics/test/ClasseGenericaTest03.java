package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Moto;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService01;


import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Moto> motosDiponiveis = new ArrayList<>(List.of(new Moto("Hornet"), new Moto("Xre")));
        RentalService01<Moto> motosDisp = new RentalService01<>(motosDiponiveis);
        System.out.println("---LOCAÇÃO DE MOTOS---");
        Moto moto = motosDisp.buscarObjetoDisponivel();
        System.out.println("\nUtilizando automovel por um mês...");
        System.out.println(" ");
        motosDisp.retornarAutomovelAlugado(moto);

        System.out.println("\n---LOCAÇÃO DE CARROS---");
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("MERCEDES")));
        RentalService01<Carro> carrosDisp = new RentalService01<>(carrosDisponiveis);
        Carro carro = carrosDisp.buscarObjetoDisponivel();
        System.out.println("\nUtilizando automovel por um mês...");
        System.out.println(" ");
        carrosDisp.retornarAutomovelAlugado(carro);

        System.out.println("\n---LOCAÇÃO DE BARCOS---");
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService01<Barco> barcoDisp = new RentalService01<>(barcosDisponiveis);
        Barco barco = barcoDisp.buscarObjetoDisponivel();
        System.out.println("\nUtilizando automovel por um mês...");
        System.out.println(" ");
        barcoDisp.retornarAutomovelAlugado(barco);


    }
}
