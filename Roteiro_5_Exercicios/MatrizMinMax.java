import java.util.Random;
public class MatrizMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][4];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            int menor = matriz[i][0];
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < menor)
                    menor = matriz[i][j];
            }
            System.out.println("Menor elemento da linha " + i + ": " + menor);
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            int maior = matriz[0][j];
            for (int i = 0; i < 3; i++) {
                if (matriz[i][j] > maior)
                    maior = matriz[i][j];

                }
            System.out.println("Maior elemento da coluna " + j + ": " + maior);
        }

    }
}
