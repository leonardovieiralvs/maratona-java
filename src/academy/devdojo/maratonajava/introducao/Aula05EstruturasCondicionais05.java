package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 12;
        switch (dia) {
            case 1:
                System.out.println("Domigo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia Inexistente");
                break;
        }

        char sexo = 'm';
        switch (sexo) {
            case 'M':
                System.out.println("HOMEM");
                break;
            case 'F':
                System.out.println("MULHER");
                break;
        }
    }
}
