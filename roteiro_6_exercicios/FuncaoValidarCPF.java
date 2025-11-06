import java.util.Arrays;

public class FuncaoValidarCPF {
    public static void main(String[] args) {
        int[] cpf;
        cpf = new int[]{0, 3, 4, 2, 5, 0, 8, 1, 0, 0, 0};
        int valorMultiplicador = 10;
        int acumulador = 0;
        int somaFinalArray = 0;
        int restoSomaValorFinal, primeiroDigitoVerificador, segundoDigitoVerificador;

        for (int i = 0; i < cpf.length; i++) {
            acumulador = cpf[i] * valorMultiplicador;
            somaFinalArray += acumulador ;
            System.out.println(cpf[i] + " * " + valorMultiplicador + " = " + acumulador);
            valorMultiplicador-- ;
        }
        System.out.println("Soma do Valor final: " + somaFinalArray);

        restoSomaValorFinal = somaFinalArray % 11;
        System.out.println("resto da soma valor final ao ser dividida por 11: " + restoSomaValorFinal);

        primeiroDigitoVerificador = 11 - restoSomaValorFinal;
        System.out.println("Primeiro digito verificador: " + primeiroDigitoVerificador);
        if(primeiroDigitoVerificador >= 10){
            cpf[10] = 0;
        } else{
            cpf[10] = primeiroDigitoVerificador;
        }
        System.out.println(Arrays.toString(cpf));
        valorMultiplicador = 11;
        somaFinalArray = 0;

        for (int i = 0; i < cpf.length; i++) {
            acumulador = cpf[i] * valorMultiplicador;
            somaFinalArray += acumulador ;
            System.out.println(cpf[i] + " * " + valorMultiplicador + " = " + acumulador);
            valorMultiplicador-- ;
        }
        System.out.println("Soma do Valor final: " + somaFinalArray);

        restoSomaValorFinal = somaFinalArray % 11;
        System.out.println("resto da soma valor final ao ser dividida por 11: " + restoSomaValorFinal);

        segundoDigitoVerificador = 11 - restoSomaValorFinal;
        System.out.println("Primeiro digito verificador: " + segundoDigitoVerificador);
        if(segundoDigitoVerificador >= 10){
            cpf[10] = 0;
        } else{
            cpf[10] = segundoDigitoVerificador;
        }

        System.out.println(Arrays.toString(cpf));
    }
}
