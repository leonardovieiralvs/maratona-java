package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Seminario {
    private String nomeSeminario;
    private Local local;

    public Seminario(String nomeSeminario, Local local) {
        this.nomeSeminario = nomeSeminario;
        this.local = local;
    }

    public void imprimeSeminario() {
        System.out.println("------------------");
        System.out.println("UM SEMINÁRIO PODERA TER NENHUM OU VÁRIOS ALUNOS && TER UM LOCAL: ");
        System.out.println(this.nomeSeminario);
        System.out.println(local.getEndereco());
    }

    public void setNomeSeminario(String nomeSeminario) {
        this.nomeSeminario = nomeSeminario;
    }

    public String getNomeSeminario() {
        return nomeSeminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
