package academy.exercicios.poo.ex004.test;

import academy.exercicios.poo.ex004.dominio.Animal;
import academy.exercicios.poo.ex004.dominio.Cachorro;
import academy.exercicios.poo.ex004.dominio.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.falar();
        cachorro.falar();
        gato.falar();



    }
}
