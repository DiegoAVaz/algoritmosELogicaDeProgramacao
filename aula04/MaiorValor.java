// Pedir para o usuário entrar com 2 valores e retornar o maior entre eles

import javax.swing.JOptionPane;

public class MaiorValor {
    public static void main (String[] args){
        double numero1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o primeiro numero: ")
        );
        double numero2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o segundo numero: ")
        );

        if(numero1 >= numero2){
            JOptionPane.showMessageDialog(
                null, "O maior valor digitado e "
                + numero1, "Resultados",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null, "O maior valor digitado e "
                + numero2, "Resultados", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}