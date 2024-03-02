// Ler uma temperatura em graus celsius, converte-la para Fahrenheit e exibir o resultado
// Fórmula da conversão: f = 9/5 * c + 32

import java.util.Scanner;

public class Temperaturas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double temperaturaEmCelsius;
        double temperaturaEmFahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaEmCelsius = sc.nextDouble();
        
        temperaturaEmFahrenheit = 9.0 / 5.0 * temperaturaEmCelsius + 32;

        System.out.println("A temperatura em Fahrenheit e: " + temperaturaEmFahrenheit);

        sc.close();

    }
}