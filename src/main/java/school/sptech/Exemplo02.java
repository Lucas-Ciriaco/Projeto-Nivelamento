package school.sptech;

public class Exemplo02 {
    public static void main(String[] args) {
        // Condicionais: if, else, else if

        Boolean temCarro = false;
        if(temCarro){
            System.out.println("Tem BMW");
        }
        // ||(ou) e &&(e) mantém
        Integer idade=17;
        if (idade<16){
            System.out.println("Não pode votar");
        }else if (idade<18){
            System.out.println("Pode votar, mas não pode dirigir");
        }else{
            System.out.println("Pode votar e dirigir :");
        }
    }
}
