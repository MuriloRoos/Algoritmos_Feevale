import java.util.Scanner;

public class soma {

    public static void main(String []args){
        try (Scanner leitor = new Scanner(System.in)) {
            int n1, n2, soma;
            System.out.println("Insira o primeiro numero da soma: ");
            n1 = leitor.nextInt();
            System.out.println("Insira o segundo numero da som: ");
            n2 = leitor.nextInt();
            soma = n1 + n2;
            System.out.println("Resultado da soma de "+ n1 +" + " + n2 + " é igual a " + soma);
            
        }
    }
}