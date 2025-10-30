import java.util.Scanner;
public class MatrizDiagonalUm {
    // Proponha um algoritmo, em Java, que realize a inicialização da matriz quadrada de x elementos informados pelo usuário, 
    // em que a diagonal principal tem todos os elementos igual a um e os demais iguais a zero.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("infore o valor da matriz quadrada: ");
        int x = leitor.nextInt();

        int[][] Matriz = new int[x][x];

        for (int i = 0; i < x; i++) {
            for(int j = 0; j < x; j ++){
 
                if (i == j) {
                    Matriz[i][j] = 1;
                } else{
                    Matriz[i][j] = 0;
                }
                System.out.print(Matriz[i][j] + "\t");
            }
            System.out.println();
        }

        leitor.close();
    }
}
