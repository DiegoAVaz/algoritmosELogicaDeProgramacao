/* 
Ler um vertor tamanho 10
Exibir os elementos das posiçoes pares
Somar os valores das posições ímpares e mostrar o resultado
*/

import java.util.Scanner;

public class VetorTamanho10{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int somaImpares = 0;

        System.out.println("Digite 10 valores: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Valor " + i);
            v[i] = sc.nextInt();
        }

        System.out.println("Elementos das posicoes pares: ");
        for(int i = 0; i < v.length; i++){
            if(i % 2 == 0){
                System.out.print(v[i] + " ");
            }
        }

        for(int i = 0; i < v.length; i++){
            if(i % 2 != 0){
                somaImpares += v[i];
            }
        }

        System.out.println("Soma dos elementos das posicoes impares: " + somaImpares);
    }
}