package roteiro_4_exercícios;
import java.util.Random;
import java.util.Arrays;

public class somaQuantValoresParesArray {
    public static void main(String[] args) {
        int quant = 0;
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i< numeros.length; i ++){
            if(numeros[i] % 2 == 0){
                quant++;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("Quantidade de numeros pares == " + quant);
    }
}
