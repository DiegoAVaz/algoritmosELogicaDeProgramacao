import java.util.Scanner;

public class LeituraCaracteres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer coisa");
        String s = sc.nextLine();

        System.out.println("Tamanho da String: " + s.length());
        System.out.println("Primeira letra: " + s.charAt(0));
        System.out.println("Ultima letra: " + s.charAt(s.length() - 1));

        sc.close();
    }
}