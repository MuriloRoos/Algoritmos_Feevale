public class jurusSimples {
    public static void main(String[] args) {
        double capitalInicial = 50000;
        double taxaDeJuros = 3;
        int tempo = 12;
        double valorFinal;

        valorFinal = capitalInicial * (1 + (taxaDeJuros / 100) * tempo);

        System.out.println(valorFinal);

    }

}
