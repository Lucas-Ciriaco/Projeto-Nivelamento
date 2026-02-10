package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {
    public static void main(String[] args) {
        // Números Aleatórios
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(10);
        System.out.println(numeroAleatorio);

        Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(0, 1);
        System.out.println(numeroQuebradoAleatorio);

        Boolean booleanAleatorio = ThreadLocalRandom.current().nextBoolean();
        System.out.println(booleanAleatorio);
    }
}
