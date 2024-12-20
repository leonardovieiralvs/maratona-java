package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Márcio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println();
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100 ));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente.getNOME_RELATORIO());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("PESSOA_JURIDICA222");
        System.out.println(tipoCliente2);
    }
}
