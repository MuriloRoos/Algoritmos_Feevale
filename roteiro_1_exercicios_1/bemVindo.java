import java.util.Scanner;

public class bemVindo {
    public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
        String nome;
        int idade;

        System.out.println("Qual é o seu nome?");
        nome = leitor.nextLine();
        System.out.println("Qual é a sua idade?");
        idade = leitor.nextInt();

        System.out.println("Boas vindas " + nome + ", sua idade é: " + idade);
        
        leitor.close();
    }

    }
}
