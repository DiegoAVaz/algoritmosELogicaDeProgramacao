// ler um valor double, calcular e mostrar sua raiz quadrada e o valor ao cubo

import javax.swing.JOptionPane;

public class ClasseMatematica {
    public static void main (String[] args){
        double numero1 = Double.parseDouble(
            JOptionPane.showInputDialog("digite um numero qualquer: ")
        );

        double raiz = Math.sqrt(numero1);

        double potencia = Math.pow(numero1, 5);

        double result = Math.cbrt(potencia) + Math.sin(2 * numero1);

        double raiQuinta = Math.pow(numero1, 1.0 / 5);

        String saida = "Raiz de " + numero1 + " = " + raiz + "\n" +
                        numero1 + " a quinta pontencia = " + potencia +
                        "\nresultado grande = " + result +
                        "\nraiz quinta de " + numero1 + " = " + raiQuinta;
        
        JOptionPane.showMessageDialog(null, saida, "meus resultados ", 1);
    }
}