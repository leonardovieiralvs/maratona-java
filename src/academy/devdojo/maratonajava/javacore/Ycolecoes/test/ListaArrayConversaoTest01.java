package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] integerArrays = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integerArrays));
        System.out.println("----------");

        Integer[] numerosaArray = new Integer[3];
        numerosaArray[0] = 1;
        numerosaArray[1] = 2;
        numerosaArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosaArray);
        arrayToList.set(0, 20);
        System.out.println(Arrays.toString(numerosaArray));
        System.out.println(arrayToList);
        System.out.println("----------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosaArray));
        numerosList.add(11);
        System.out.println(numerosList);
        System.out.println("----------");
        List<String> listString = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> listIntegers = List.of(1, 2, 3, 4, 5);
        System.out.println(listString);
        System.out.println(listIntegers);

    }
}
