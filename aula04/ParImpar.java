// ler um número inteiro e verificar se ele é par ou impar

import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        int resto = numero % 2;
        if(resto == 0){
            System.out.println(numero + " e par");
        } else {
            System.out.println(numero + " e impar");

        }

        sc.close();
    }
}