package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.loginInvalidoException;

public class Test01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (loginInvalidoException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (loginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
