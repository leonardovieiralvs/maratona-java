package academy.devdojo.maratonajava.javacore.Gassociacao.dominiotest;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("-----------------------");
        System.out.println("UM PROFESSOR DEVERÁ MINISTRAR VÁRIOS SEMINÁRIOS");
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getNomeSeminario());
            System.out.println(seminario.getLocal().getEndereco());
        }

    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
