import java.util.Scanner;
public class somaDoisValoresArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[8];
        int n1, n2, soma;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 10);
            System.out.println(lista[i]);
        }

        System.out.println("informe um valor entre 0 e 7");
        n1 = leitor.nextInt();

        while (n1 < 0 || n1 > 7) {
            System.out.println("Informe novamente um valor entre 0 e 7");
            n1 = leitor.nextInt();
        }

        System.out.println("informe um valor entre 0 e 7");
        n2 = leitor.nextInt();

        while (n2 < 0 || n2 > 7) {
            System.out.println("Informe novamente um valor entre 0 e 7");
            n2 = leitor.nextInt();
        }

        soma = lista[n1] + lista[n2];
        System.out.println(soma);

    }
}