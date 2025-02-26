package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidorLvs = new Consumidor("Leonardo The Best");
        Queue<Consumidor> consumidorsQueue = new PriorityQueue<>();
        consumidorsQueue.add(consumidorLvs);
    }
}
