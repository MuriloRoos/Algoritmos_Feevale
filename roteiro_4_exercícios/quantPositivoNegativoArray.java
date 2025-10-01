package roteiro_4_exercícios;
import java.util.Random;
import java.util.Arrays;

public class quantPositivoNegativoArray {
    public static void main(String[] args) {
        int[] lista = new int[10];
        int numerosNegativos = 0, soma = 0;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * 100)-50);
        }

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] < 0)
                numerosNegativos++;

            if (lista[i] > 0 )
                soma = soma + lista[i];
        }

        System.out.println(Arrays.toString(lista));
        System.out.println("Quantidade de numeros negativos: " + numerosNegativos);
        System.out.println("Soma dos numeros positivos: " + soma);

    }
}
