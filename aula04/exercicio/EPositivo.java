// ler um número inteiro e verificar se ele é positivo (>= 0) ou negativo

import java.util.Scanner;

public class EPositivo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();
        if(numero >= 0){
            System.out.println(numero + " e positivo");
        } else {
            System.out.println(numero + " e negativo");

        }

        sc.close();
    }
}