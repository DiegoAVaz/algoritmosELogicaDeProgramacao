import java.util.Scanner;

public class SomaComVetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int soma = 0;
        System.out.println("Digite 5 valores: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Valor " + i);
            v[i] = sc.nextInt();
            soma = soma + v[i];
        }

        System.out.println("Soma = " + soma);

        System.out.println("Os valores digitados foram: ");
        for(int i = 0; i < 5; i++){
            System.out.println(v[i] + " ");
        }

        sc.close();
    }
}