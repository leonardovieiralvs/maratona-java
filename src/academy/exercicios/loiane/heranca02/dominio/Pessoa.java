package academy.exercicios.loiane.heranca02.dominio;

public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    public String cpf;
    protected String visiblidade;



    public Pessoa(String nome, String endereço, String telefone, String cpf) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String obterEtiquetaEndereco() {

        return endereço;
    }
}
