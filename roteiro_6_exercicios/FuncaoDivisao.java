package roteiro_6_exercicios;

public class FuncaoDivisao {
    public static double funcaoDivisao(double x, double y){
        double resultDiv = x / y;
        return resultDiv;
    }

    public static void main(String[] args) {
        double divisao;
        double a = 81;
        double b = 9;
        divisao = funcaoDivisao( a, b);

        System.out.println(a + " / " + b + " = " + divisao);
    }
}
