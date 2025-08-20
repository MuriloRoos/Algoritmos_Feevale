import java.util.Scanner;
public class calculoDiv {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            double n1, n2, soma, diferenca, produto, divisao;
            
            System.out.println("informe o primeiro valor: ");
            n1 = leitor.nextInt();
            
            System.out.println("informe o segundo valor");
            n2 = leitor.nextInt();
            
            soma = n1 + n2;
            System.out.println("Soma = " + soma);

            diferenca = n1 - n2;
            System.out.println("Diferenca = " + diferenca);

            produto = n1 * n2;
            System.out.println("produto = " + produto);
            
            if (n1 < n2){
                System.out.println("O valor do divisor é maior que o que será divido");
            } else{
                divisao = n1 /n2;
                System.out.println("resultado da divisao de " + n1 + " por " + n2 + " é " + divisao);
            }
            
            leitor.close();
        }
    }
}
