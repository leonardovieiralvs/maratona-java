package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;
    private Funcionario funcionario;

    static {
        System.out.println("STATIC PESSOA");
    }
    {
        System.out.println("PAI");
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getEndereco() + ", " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
