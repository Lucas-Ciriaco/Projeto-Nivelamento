package school.sptech;

public class Exemplo05 {
    public static void main(String[] args) {
        // Opereções Matemáticas
        Integer numero01 = 10;
        Integer numero02 =10;
        System.out.println("Adição: "+(numero01+numero02));
        System.out.println("Subtração: "+(numero01-numero02));
        System.out.println("Multiplicação: "+(numero01*numero02));
        System.out.println("Divisão: "+(numero01/numero02));
        System.out.println("Resto: "+(numero01%numero02));
        System.out.println("Potenciação: "+(Math.pow(numero01, numero02)));

        Integer numeroA = 5;
        Integer numeroB = 10;

        System.out.println("Divisão: "+(Double.valueOf(numeroA)/ numeroB));
    }
}
