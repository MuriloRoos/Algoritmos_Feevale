import java.util.Scanner;
public class calculoDiv {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            double n1;
            double n2;
            double resultado;

            System.out.println("informe o valor que sera dividido: ");
            n1 = leitor.nextInt();
            
            System.out.println("informe o numero divisor");
            n2 = leitor.nextInt();

            if (n1 < n2){
                System.out.println("Altere o valor do segundo numero, pois e maior que o primeiro");
            } else{
                resultado = n1 /n2;
                System.out.println("resultado da divisao de " + n1 + " por " + n2 + " é " + resultado);
            }
            
            leitor.close();
        }
    }
}
