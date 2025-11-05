public class FuncaoDivisao {
    public static double funcaoDivisao(double x, double y){
        if (y == 0){
            System.out.println("Divisão invalida");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        double divisao;
        double a = 81;
        double b = 9;
        divisao = funcaoDivisao( a, b);

        System.out.println(a + " / " + b + " = " + divisao);
    }
}

