
import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        try(Scanner leitor = new Scanner(System.in)){
            double aluno1nota1, aluno1nota2, aluno1nota3;
            double aluno2nota1, aluno2nota2, aluno2nota3;
            double aluno3nota1, aluno3nota2, aluno3nota3;
            double mediaAluno1, mediaAluno2, mediaAluno3;   

            System.out.println("informe as notas do aluno 1 separando por espaços: ");
            aluno1nota1 = leitor.nextDouble();
            aluno1nota2 = leitor.nextDouble();
            aluno1nota3 = leitor.nextDouble();
            
            System.out.println("informe as notas do aluno 2 separando por espaços: ");
            aluno2nota1 = leitor.nextDouble();
            aluno2nota2 = leitor.nextDouble();
            aluno2nota3 = leitor.nextDouble();

            System.out.println("informe as notas do aluno 3 separando por espaços: ");
            aluno3nota1 = leitor.nextDouble();
            aluno3nota2 = leitor.nextDouble();
            aluno3nota3 = leitor.nextDouble();


        }
    }
}