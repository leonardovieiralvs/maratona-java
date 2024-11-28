package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioReturn {
    public String nome;
    public int idade;
    public double [] salarios = {1500, 1800, 2300};

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios) {
            System.out.println(salario);
        }
        System.out.println("------------------");
    }

    public double mediaSalarios () {
        double soma = 0;
        for (double i : salarios) {
            soma = soma + i;
        }
        return soma / 3;
    }
}
