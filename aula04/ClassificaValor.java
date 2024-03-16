// Pede para o usuário entrar com 2 número. 
// Verifique e retorne qual é o maior e ou se os dois são iguais

import javax.swing.JOptionPane;

public class ClassificaValor {
    public static void main (String[] args){
        double numero1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o primeiro numero: ")
        );
        double numero2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o segundo numero: ")
        );

        if(numero1 == numero2){
            JOptionPane.showMessageDialog(
                null, numero1 + " e " + numero2 + " são iguais", 
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else if (numero1 > numero2) {
            JOptionPane.showMessageDialog(
                null, numero1 + " e maior que " + numero2, 
                "Resultados", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null, numero2 + " e maior que " + numero1, 
                "Resultados", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}