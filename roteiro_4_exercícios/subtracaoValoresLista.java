import java.util.Arrays;

public class subtracaoValoresLista {
    //5 - Faça um programa Java que receba do usuário dois arrays, A e B, com 10 números inteiros cada. Crie um novo array C = A – B, mostre na tela os dados do array C.
    public static void main(String[] args) {
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) (Math.random() * 10);
            listaB[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < listaC.length; i++) {
            listaC[i] = listaA[i] - listaB[i];
        }

        System.out.println(Arrays.toString(listaA));
        System.out.println(Arrays.toString(listaB));
        System.out.println(Arrays.toString(listaC));
    }    
}