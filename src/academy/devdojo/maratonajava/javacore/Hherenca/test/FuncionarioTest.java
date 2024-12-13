package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cloves", "42999291092", 3500);
        Endereco endereco = new Endereco("Marechal Male", "Morro do Dende");
        Pessoa pessoa = new Pessoa("Ramires", "19229330192");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
