package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco("Marechal Male", "Morro do Dende");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ramires");
        pessoa.setCpf("11119339123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        funcionario.setNome("Cloves");
        funcionario.setCpf("1888277366");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2922.32);
        funcionario.imprime();
    }
}
