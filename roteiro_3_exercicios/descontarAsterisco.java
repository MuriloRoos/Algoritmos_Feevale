
import java.util.Scanner;


public class descontarAsterisco{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;
        System.out.print("Insira um numero: ");
        n = leitor.nextInt();

        if (n <= 0){
            System.out.println("Insita um numero acima de zero!");
            return;
        }

        for (int i = 0; i < n; i++) {
            //System.out.println("Valor de n: " + n);
            for (int j = n-i; j > 0; j--){

                System.out.print("*");
            
            }
            System.err.println("");
        }
        leitor.close();
    }
}