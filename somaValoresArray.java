import java.util.Scanner;
public class somaValoresArray {
    public static void main(String[] args) {
        int n1, n2, soma;
        int lista[] = new int[8];
        lista[0] = 0;
        lista[1] = 1;
        lista[2] = 2;
        lista[3] = 3;
        lista[4] = 4;
        lista[5] = 5;
        lista[6] = 6;
        lista[7] = 7;

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < lista.length; i++){
            System.out.println("Valor da posição " + i + " = " + lista[i]);
        }

        System.out.println("escolha um valor para somar");
        n1 = leitor.nextInt();

        System.out.println("Escolha outro valor para somar");
        n2 = leitor.nextInt();

        soma = lista[n1] + lista[n2];
        System.out.println(soma);
    }
}
