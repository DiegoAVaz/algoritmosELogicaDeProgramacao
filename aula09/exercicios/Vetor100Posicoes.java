/* 
Gerar um vetor randômico com 100 posiçoes com valores de 0 a 99
Contar quantos valores são pares
 */

import java.util.Scanner;
import java.util.Random;

public class Vetor100Posicoes{
    public static void main(String[] args){

    Random random = new Random();

    int[] v = new int[100];

    int pares = 0;

    for(int i = 0; i < 100; i++){
        v[i] = random.nextInt(100);
    }

    for(int i = 0; i < v.length; i++){
        if(i % 2 == 0){
            pares++;
        }
    }

    System.out.print("Numero de pares: " + pares);
    System.out.println("\nVetor: ");
    for(int i = 0; i < v.length; i++){
        System.out.print(v[i] + " ");
    }
    

    }
}