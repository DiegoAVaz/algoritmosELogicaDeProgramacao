// Faça um programa que receba a aultura e o sexo de uma pessoa e cacule
// e mostre o seu peso ideal, utilizando as seguintes fórmulas:
// Homens: (72,7 * altura) - 58
// Mulheres: (62,1 * altura) - 44,7

import java.util.Scanner;

public class CalculaPesoIdeal {
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo (H ou M): ");
        String sexo = sc.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        char primeiroCaractereSexo = sexo.charAt(0);
        primeiroCaractereSexo = Character.toLowerCase(primeiroCaractereSexo);        

        if (primeiroCaractereSexo == 'h'){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal pra voce e: " + pesoIdeal);
        } else if (primeiroCaractereSexo == 'm'){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal pra voce e: " + pesoIdeal);
        }

        sc.close();
    }
}