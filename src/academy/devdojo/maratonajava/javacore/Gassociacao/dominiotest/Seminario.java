package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Seminario {
    private String nomeSeminario;
    private Local local;
    private Professor[] professores;

    public Seminario(String nomeSeminario, Local local) {
        this.nomeSeminario = nomeSeminario;
        this.local = local;
    }

    public String getNomeSeminario() {
        return nomeSeminario;
    }

    public void setNomeSeminario(String nomeSeminario) {
        this.nomeSeminario = nomeSeminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
