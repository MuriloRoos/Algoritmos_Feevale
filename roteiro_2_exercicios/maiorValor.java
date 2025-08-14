import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {
        
        
        try (Scanner leitor = new Scanner(System.in)){
            int n1, n2;
            System.out.println("informe o primeiro valor");
            n1 = leitor.nextInt();
            System.out.println("informe o segundo valor");
            n2 = leitor.nextInt();
        
            if (n1 > n2){
                System.out.println(n1 + " valor maior");
            } else if(n1 < n2){
                System.out.println(n2 + " valor maior");
            } else {
                System.out.println("valores iguas");
            }
            leitor.close();
            
        }
    }    
}
