package school.sptech;

public class Exemplo06 {
    public static void main(String[] args) {
        //Interpolação
        String nome = "Bob";
        Integer idade = 10;
        Float altura =1.5f;
        Double peso = 40.3;
        Boolean jogaBola =true;
        //%.2f funciona como o toFixed
        String mensagem = String.format("Meu nome é: %s, tenho %d anos, %.2f de altura e %f de peso. Joga bola: %b", nome, idade, altura, peso, jogaBola);
        String mensagem2 = "Meu nome é: %s, tenho %d anos, %.2f de altura e %f de peso. Joga bola: %b".formatted(nome, idade, altura, peso, jogaBola);
        System.out.println(mensagem);
        System.out.println(mensagem2);
        System.out.printf("Meu nome é: %s",nome); //print formatado

        // String texto = "Meu nomme é Bob\nEu gosto de Java\nE tamo junto\n";
        // text block -> são três aspas duplas
        String texto = """
                Meu nome é Lucas
                Eu não gosto de Java
                TMJ!
                """;
        System.out.println(texto);
    }
}
