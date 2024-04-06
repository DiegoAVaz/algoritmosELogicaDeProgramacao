import java.util.Scanner;

public class VerificaPremiacao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Boolean maisPerguntas = true;

        while(maisPerguntas){
            System.out.print("Digite sua posicao em numero (1, 2, 3...) na classificacao para exibir sua medalha: ");
            int posicao = sc.nextInt();
            sc.nextLine();

            switch(posicao){
                case 1:
                    System.out.println("Medalha de ouro");
                    break;
                case 2:
                    System.out.println("Medalha de prata");
                    break;
                case 3:
                    System.out.println("Medalha de bronze");
                    break;
                default:
                    System.out.println("Sem medalhas");
                    break;
            }

            System.out.println("Deseja verificar a premiacao de mais alguem? Digite S para \"Sim\" ou N para \"Nao\". ");
            String respostaMaisPerguntas = sc.nextLine();
            
            switch(respostaMaisPerguntas){
                case "N":
                    System.out.print("Obrigado por participar!");
                    maisPerguntas = false;
                    break;
            }

        }

        sc.close();
    }
}