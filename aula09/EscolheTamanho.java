import java.util.Scanner;
import java.util.Random;

public class EscolheTamanho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o tamanho do vetor, 0 encerra: ");
        int tamanho = sc.nextInt();

        while(tamanho > 0){
            int[] v = new int[tamanho];
            for(int i = 0; i < tamanho; i++){
                v[i] = random.nextInt(100);
            }
            System.out.println("Valores na ordem inversa: ");
            for (int i = tamanho - 1; i >= 0; i--){
                System.out.print(v[i] + " ");
            }
            System.out.println("Digite o tamanho do vetor, 0 encerra: ");
            tamanho = sc.nextInt();
        }

        sc.close();
    }
}