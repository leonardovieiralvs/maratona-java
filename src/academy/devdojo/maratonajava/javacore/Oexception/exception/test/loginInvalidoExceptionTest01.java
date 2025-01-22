package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.loginInvalidoException;

import java.util.Scanner;

public class loginInvalidoExceptionTest01 {
    public static void main(String[] args) throws loginInvalidoException {
        logar();
    }

    public static void logar() throws loginInvalidoException {
        Scanner input = new Scanner(System.in);
        String loginDB = "rufler";
        String senhaDB = "lvstest";
        System.out.println("Digite seu login: ");
        String loginDigitado = input.next();
        System.out.println("Digite sua senha: ");
        String senhaDigitada = input.next();

        if (!loginDB.equals(loginDigitado) || !senhaDigitada.equals(senhaDigitada)) {
            throw new loginInvalidoException("Login ou senha incorretos.");
        }

        System.out.println("Login efetuado com sucesso");
    }
}
