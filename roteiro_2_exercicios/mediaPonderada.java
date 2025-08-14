public class mediaPonderada {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 6;
        int n3 = 6;
        double mediaFinal;

        mediaFinal = (double)((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
        
        if(mediaFinal >= 7){
            System.out.println("Aprovado com a nota de " +mediaFinal);
        } else{
            System.out.println("Reprovado com a nota de " + mediaFinal);
        }


    }
}
