package roteiro_6_exercicios;

public class FuncaoMult {
    public static double funcaoMulti(double x, double y){
        double multi = x * y;
        return multi;
    }

    public static void main(String[] args) {
        double resultado;
        int x = 9;
        int y = 4;
        resultado = funcaoMulti(x, y);

        System.out.println(x + " * " + y + " = " + resultado);
    }
}
