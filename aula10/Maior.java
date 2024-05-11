import java.util.Scanner;
import java.util.Random;

public class Maior {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n;
        System.out.print("Digite o tamanho do vetor. 0 encerra. ");
        n = sc.nextInt();

        while (n > 0){

            int[] v = new int[n];
            for (int i = 0; i < v.length; i++){
                v[i] = random.nextInt(10 * v.length);
                System.out.print(v[i] + " ");
            }

            int maior = v[0];

            for(int i = 1; i < v.length; i++){
                if(v[i] > maior){
                    maior = v[i];
                }
            }

            System.out.println("\n\nMaior da lista: " + maior);

            System.out.print("\n\nEscolhe um novo valor. 0 encerra. ");
            n = sc.nextInt();
        }

        sc.close();
    }
}