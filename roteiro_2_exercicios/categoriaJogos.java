import java.util.Scanner;
public class categoriaJogos{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            int idade;

            System.err.println("Informe sua idade");
            idade = leitor.nextInt();

            if (idade >= 6 && idade <= 8){
                System.out.println("Sua categoria é a Infantil A");
            } else if(idade >= 9 && idade <= 12){
                System.out.println("Sua categoria é a Infantil B");
            } else if(idade >= 13 && idade <= 14){
                System.out.println("Sua categoria é a Juvenil A");
            } else if(idade >= 15 && idade <= 18){
                System.out.println("Sua categoria é a Juvenil B");
            } else{
                System.out.println("Você não pode participar da competição");
            }
            leitor.close();
        }
    }
}