public class mediaPonderada {
    public static void main(String[] args) {
        int nota1 = 8;
        int peso1 = 2;
        int nota2 = 9;
        int peso2 = 1;
        int nota3 = 8;
        int peso3 = 4;
        double media;

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (double)(peso1 + peso2 + peso3);
        System.out.print(media);
    }
}
