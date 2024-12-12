package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Endereco {
    private String rua;
    private String endereco;

    public Endereco(String rua, String endereco) {
        this.rua = rua;
        this.endereco = endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
