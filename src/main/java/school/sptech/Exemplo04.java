package school.sptech;

public class Exemplo04 {
    public static void main(String[] args) {
        // Laços de repetição: for, while

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Número da vez: "+i);
        }

        int contador = 0;
        while(contador<10){
            contador++;
            System.out.println("Contador da vez: "+contador);
        }

        int contadorDoWhile = 0;
        do{
            System.out.println("Contador doWhile da vez: "+contadorDoWhile);
            contadorDoWhile++;
        }while(contadorDoWhile<10);
    }
}
