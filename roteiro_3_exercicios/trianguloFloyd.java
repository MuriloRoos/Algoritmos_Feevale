
import java.util.Scanner;

public class trianguloFloyd {

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int n;
            int i, j, valor = 1;
            System.out.print("Informe um numero: ");
            n = leitor.nextInt();

            if (n <= 0) {
                System.out.println("Informe um valor acima de 0");
                return;
            }

            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(valor + " ");

                    valor++;
                }
                System.out.println("");
            }
            leitor.close();
        }
    }

}
