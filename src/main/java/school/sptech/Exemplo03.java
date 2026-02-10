package school.sptech;

public class Exemplo03 {
    public static void main(String[] args) {
        // Não utilizamos '==' para tipos Wrapper
        // Utilizaremos .equals
        Integer numero01 = 1000;
        Integer numero02 = 1000;

        if(numero01.equals(numero02)){
            System.out.println("Números iguais!");
        }
        else{
            System.out.println("Números são diferentes");
        }

        String nome01 = "Lucas";
        String nome02 = "Lucas";
        if (!nome01.equals(nome02)){
            System.out.println("Nomes diferentes");
        }else{
            System.out.println("Nomes iguais");
        }

        String nomeBanco = "Bob";
        String nomeDigitado = "bob";

        if (nomeDigitado.equalsIgnoreCase(nomeBanco)){
            System.out.println("Achei o nome");
        }else{
            System.out.println("Não achei o nome");
        }
    }
}
