package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
    double salario = 5000;
    String mensagemDoar = "Vou doar 500$ para o DevDojo";
    String mensagemNaoDoar = "Ainda não tenho condições";
    String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
