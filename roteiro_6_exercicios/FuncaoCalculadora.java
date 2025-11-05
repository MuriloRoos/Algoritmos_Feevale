package roteiro_6_exercicios;
import java.util.Scanner;

public class FuncaoCalculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, resultado;

        System.out.print("Informe o primeiro valor: ");
        n1 = leitor.nextDouble();

        System.out.println("Informe o segundo valor");
        n2 = leitor.nextDouble();

        System.out.println("qual é a operação que voce quer fazer? " +
                "Digite 1 para soma." +
                "Digite 2 para subtracao." +
                "Digite 3 para multiplicacao." +
                "Digite 4 para Divisão.");
    }

    public static double soma(double n1, double n2){
        return soma = n1 + n2;
    }
}
