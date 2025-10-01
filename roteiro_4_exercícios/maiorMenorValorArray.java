package roteiro_4_exercícios;
import java.util.Random;
import java.util.Arrays;

public class maiorMenorValorArray {
    public static void main(String[] args) {
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++){
            numero[i] = (int) (Math.random() * 100);
        }

        int maior = numero[0];
        int menor = numero[0];


        for (int i = 0; i < numero.length; i++){
            if(numero[i] > maior)
                maior = numero[i];

            if (numero[i]< menor)
                menor = numero[1];
        }

        System.out.println(Arrays.toString(numero));
        System.out.println("Esse é o maior numero: " + maior);
        System.out.println("Esse é o menor numero: " + menor);
    }
}
