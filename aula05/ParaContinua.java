import java.util.Scanner;

public class ParaContinua {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite \"continua\" para continuar ou qualquer outra coisa para parar: ");
        String opcao = sc.nextLine();
        while (opcao.equals("continua")){
            System.out.print("Para ou continua? ");
            opcao = sc.nextLine();
        }
        sc.close();
    }
}