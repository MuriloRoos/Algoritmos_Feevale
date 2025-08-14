public class variosCalculos {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 4;
        int n3 = 3;
        int soma;
        int mult;

        soma = n1 + n2 + n3;
        System.out.println("o resultado da soma é " + soma);

        mult = n1 * n2 * n3;
        System.out.println("o produto da multiplicacao é " + mult);

        if (n1 > n2){
            System.out.println( "numero " + n1 + " é o maior");
        } else if (n2 > n3){
            System.out.println( "numero " + n2 + " é o maior");
        } else{
            System.out.println( "numero " + n3 + " é o maior");
        }


    }
}
