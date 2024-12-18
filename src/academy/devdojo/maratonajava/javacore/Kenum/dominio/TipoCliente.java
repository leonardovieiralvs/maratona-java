package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Jurídica"),
    PESSOA_FISICA(2, "Pessoa Física");
    public final int VALOR;
    public final String NOME_RELATORIO;

    TipoCliente(int VALOR, String NOME_RELATORIO) {
        this.VALOR = VALOR;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }


}
