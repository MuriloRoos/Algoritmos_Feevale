package roteiro_6_exercicios;
import java.util.Scanner;

public class FuncaoCalculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, resultado;
        int conta;
        
        System.out.println("qual é a operação que voce quer fazer? " + "\n" +
                "Digite 1 para soma." + "\n" +
                "Digite 2 para subtracao." + "\n" +
                "Digite 3 para multiplicacao." + "\n" +
                "Digite 4 para Divisão." + "\n");
        conta = leitor.nextInt();

        System.out.print("Informe o primeiro valor: ");
        n1 = leitor.nextDouble();

        System.out.print("Informe o segundo valor: ");
        n2 = leitor.nextDouble();

        switch (conta) {
            case 1:
                resultado = soma(n1, n2);
                System.out.println("Soma de " + n1 + " + " + n2 + " = " + resultado);
                break;
        }
        leitor.close();

    }

    public static double soma(double n1, double n2){
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }

    public static double divisao(double n1, double n2){
        if (n2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return n1 / n2;
    }
}
