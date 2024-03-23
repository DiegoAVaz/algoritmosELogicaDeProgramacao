// ler valores até que a soma deles atinja 1000

import java.util.Scanner;

public class AteSomar1000 {
    public static void main (String[] args){
        int soma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seus valores ate chegar em 1000: ");
        n = sc.nextInt();
        soma += n;
        while (soma <= 1000){
            System.out.print("Mais um pouquinho... ");
            n = sc.nextInt();
            soma += n;
        }
        sc.close();

        System.out.println("Voce atingiu " + soma);

    }
}