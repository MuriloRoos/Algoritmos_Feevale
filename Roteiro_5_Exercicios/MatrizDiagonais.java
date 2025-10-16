import java.util.Scanner;
import java.util.Random;

public class MatrizDiagonais{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //System.out.printf("informe umvalor inteiro e positivo para a linha %d e da coluna %d:  ", i, j);
                matriz[i][j] = random.nextInt(10) + 1;
                // while (matriz[i][j] < 0) {
                //     System.out.printf("informe um valor valido para a linha %d e da coluna %d: ", i, j);
                //     matriz[i][j] = leitor.nextInt();
                // }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Diagonal Principal:");

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]+ "\t");
        }

        System.out.println();
        System.out.println("Diagonal Secundária");

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][2 - i] + "\t");
        }

        

        leitor.close();
    }
}