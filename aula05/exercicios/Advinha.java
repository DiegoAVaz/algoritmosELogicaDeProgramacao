// Gerar um valor entre 1 e 100 e deixar o usuário advinhar

import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main (String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sorteado = random.nextInt(20) + 1;
        int chances = 3;
        System.out.print("Advinhe um valor entre 1 e 20: ");
        int chute = scanner.nextInt();

        while(chute != sorteado && chances <= 3){
            System.out.print("Você tem " + chances + " chances");
            if (chute > sorteado){
                System.out.print("\nUm pouco menor... ");
            } else {
                System.out.print("\nUm pouco maior... ");
            }
            chute = scanner.nextInt();
            chances--;
        }
        
        if(chute == sorteado){
            System.out.println("Acertoooou!");
        } else {
            System.out.println("Tente outra vez");
        }

        scanner.close();
    }
}