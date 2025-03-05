package academy.devdojo.maratonajava.javacore.Zgenerics.service;


import java.util.List;

public class RentalService01<T> {
    private List<T> automoveisDisponiveis;

    public RentalService01(List<T> automoveisDisponiveis) {
        this.automoveisDisponiveis = automoveisDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando automovel disponivel");
        T T = automoveisDisponiveis.remove(0);
        System.out.println("Alugando automovel: "+T);
        System.out.println("automovel disponiveis para locação: ");
        System.out.println(automoveisDisponiveis);
        return T;
    }

    public void retornarAutomovelAlugado(T T) {
        System.out.println("Devolvendo automovel: "+T);
        automoveisDisponiveis.add(T);
        System.out.println("automovel disponiveis para locação: ");
        System.out.println(automoveisDisponiveis);
    }
}
