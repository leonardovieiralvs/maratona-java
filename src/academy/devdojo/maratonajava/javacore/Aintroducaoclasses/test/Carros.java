package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carros {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        Carro carro03 = new Carro();
        System.out.println("Carro: "+carro01.nome+" Modelo: "+carro01.modelo+" Ano: "+carro01.ano);

        System.out.println("-----------------------------------------");

        carro02.nome = "ix35";
        carro02.modelo = "Hyundai";
        carro02.ano = 2020;
        System.out.println("Carro: "+carro02.nome+" Modelo: "+carro02.modelo+" Ano: "+carro02.ano);

        System.out.println("-----------------------------------------");

        carro03.nome = "Veloster";
        carro03.modelo = "Hyundai";
        carro03.ano = 2017;
        System.out.println("Carro: "+carro03.nome+" Modelo: "+carro03.modelo+" Ano: "+carro03.ano);



    }
}
