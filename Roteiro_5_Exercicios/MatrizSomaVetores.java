import java.util.Random;
public class MatrizSomaVetores {
//     Faça um programa em Java que leia dois vetores, denominados A e B, de 5 elementos cada um, respeitando as seguintes regras:

// - Vetor A deve conter apenas valores pares;

// - Vetor B deve conter apenas valores ímpares.

// A partir dos dois vetores, crie uma matriz que:

// Na primeira linha armazene o vetor A
// Na segunda linha armazene o vetor B
// Na terceira linha, contenha para cada coluna a soma dos elementos da primeira e da segunda linha correspondentes à mesma coluna.
// Por fim, exiba a matriz resultante organizada em linhas e colunas.

    public static void main(String[] args) {
        Random random = new Random();

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 5; i++) {
            do {
                vetorA[i] = random.nextInt(10) + 1;
            } while (vetorA[i] % 2 != 0);
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            do {
                vetorB[i] = random.nextInt(10) + 1;
            } while (vetorB[i] % 2 == 0);
            System.out.print(vetorB[i]+" ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            matriz[0][j] = vetorA[j]; 
            matriz[1][j] = vetorB[j];
            matriz[2][j] = vetorA[j] + vetorB[j]; 
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
