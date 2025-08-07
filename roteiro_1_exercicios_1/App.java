
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        try (Scanner leitor = new Scanner(System.in)) {

        int n1, n2, soma;
        String nome;
        
        System.out.println("informe seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Esse é o seu nome: " + nome);

        System.out.println("Forneca o primeiro numero: ");
        n1 = leitor.nextInt();
        System.out.println("Esse é o teu primeiro numero: " + n1);

        System.err.println("Forneca o segundo numero: ");
        n2 = leitor.nextInt();
        System.out.println("Esse é o teu segundo numero" + n2);

        soma = n1 + n2;
        System.out.println("Essa é a soma dos dois numeros: " + soma);

        // Exemplo de limpar o Buffer
        leitor.nextLine();
        
        leitor.close();
        }
    }
}
