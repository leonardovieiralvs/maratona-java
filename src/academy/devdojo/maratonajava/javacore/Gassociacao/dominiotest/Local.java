package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Local {
    private String Local;
    private Seminario seminario;
    private Aluno[] alunos;
    private Professor[] professores;

    public Local(String local) {
        Local = local;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }
}
