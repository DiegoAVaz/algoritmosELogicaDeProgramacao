// ler um número inteiro n, exibir os valores de 0 até n (positivo ou negativo)
import java.util.Scanner;

public class ExibeValores {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();
        int cont = 0;
        if(n >= 0){
            do {
                System.out.print (cont + " ");
                cont++;
            } while (cont <= n);
        } else {
            do {
                System.out.print (cont + " ");
                cont--;
            } while (cont >= n);
        }
        scanner.close();
    }
}