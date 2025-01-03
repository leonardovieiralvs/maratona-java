package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.CadeiraGamer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("-----------------------");
        System.out.println("RELATÓRIO IMPOSTO");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto "+ produto.getNome());
        System.out.println("Valor "+ produto.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
        if (produto instanceof Tomate)  {
            String precoKilo = ((Tomate) produto).getPrecoPorKilo();
           String dataValidade = ((Tomate) produto).getDataValidade(); // CAST PARA O JAVA ENTENDER QUE O TOMATE É UM PRODUTO;
           System.out.println("Data de Valdade: " + dataValidade);
           System.out.println("Preço por kilo: " + precoKilo);
        }
        if (produto instanceof CadeiraGamer) { // USADO PARA CASO TENHA ALGUM ATRIBUTO DIFERENTE DAS DEMAIS CLASSES INSTANCIADAS. DEVEMOS FAZER O CAST!
            String valorCadeira = ((CadeiraGamer) produto).getApoioCabeca();
            System.out.println("Valor encosto de cabeça adicional: "+valorCadeira);
        }
    }
}
