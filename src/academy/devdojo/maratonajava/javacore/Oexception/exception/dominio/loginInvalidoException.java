package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class loginInvalidoException extends Exception{
    public loginInvalidoException() {
        super("Login invalido");
    }

    public loginInvalidoException(String message) {
        super(message);
    }
}
