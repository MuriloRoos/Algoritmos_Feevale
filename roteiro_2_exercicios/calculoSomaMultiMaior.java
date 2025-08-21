import java.util.Scanner;
public class calculoSomaMultiMaior {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            double n1, n2, n3, soma, produto;
            
            System.out.println("informe o primeiro valor: ");
            n1 = leitor.nextInt();
            
            System.out.println("informe o segundo valor");
            n2 = leitor.nextInt();

            System.out.println("informe o terceiro valor");
            n3 = leitor.nextInt();
            
            soma = n1 + n2 + n3;
            System.out.println("Soma = " + soma);

            produto = n1 * n2 * n3;
            System.out.println("produto = " + produto);

            if(n1 > n2 && n1 > n3){
                System.out.println(n1 + " é o maior");
            } else if (n2 > n3 && n2 > n1) {
                System.out.println(n2 + " é o maior");
            } else {
                System.out.println(n3 + " é o maior");
            }
            
            leitor.close();
        }
    }
}
