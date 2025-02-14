package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -4320088731483187368L;
    private String id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "EscolaLeozymtdl";
    private transient Turma turma;

    public Aluno(String id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
