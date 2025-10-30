import java.util.Random;
public class MatrizRestoDivisao {
    // Proponha um programa em Java que lê uma matriz A, com 2 linhas e 2 colunas. A matriz A deve aceitar apenas números positivos. 
    // O programa também deve ter uma matriz B com as mesmas dimensões de A, por sua vez, inicializada como valor 2 em todas as posições. 
    // A partir das duas matrizes, crie a matriz R, correspondente ao resto da divisão inteira dos elementos correspondentes nas matrizes A e B, e a exiba no formato de matriz.

    public static void main(String[] args) {
        int[][] M1 = new int[2][2];
        int[][] M2 = new int[2][2];
        int[][] MR = new int[2][2];
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                M1[i][j] = random.nextInt(10) + 1;
                System.out.print(M1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                M2[i][j] = 2;
                System.out.print(M2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                MR[i][j] = M1[i][j] % M2[i][j];
                System.out.print(MR[i][j] + "\t");
            }
            System.out.println();
        }
        

    }
}
