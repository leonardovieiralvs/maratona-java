package academy.exercicios.poo.ex008.servicos;

import academy.exercicios.poo.ex008.dominio.Imprimivel;

public class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Test");
    }
}
