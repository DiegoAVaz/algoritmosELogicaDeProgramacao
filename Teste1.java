import java.util.Scanner;
public class Teste1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um inteiro: ");
        int n = sc.nextInt();
        int valor1 = 0, valor2 = 1, cont = 2;

        if(n == 1){
            System.out.println(valor2);
        }
        if(n == 0){
            System.out.println(valor1);
        }
        else{
            System.out.println(valor1 + "\n" + valor2);
            while(cont <= n && cont > 2){
                valor1 = valor1 + valor2;
                System.out.println(valor1);
                valor2 = valor1 + valor2;
                cont++;
            }
        }
        sc.close();
    }
    

}