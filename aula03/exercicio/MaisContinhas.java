// ler 3 valores quaisquer e multiplicar o primeiro pela soma dos outros 2

import javax.swing.JOptionPane;

public class MaisContinhas {
    public static void main (String[] args){

        double numero1 = Double.parseDouble(
            JOptionPane.showInputDialog("digite o primeiro numero ")
        );

        double numero2 = Double.parseDouble(
            JOptionPane.showInputDialog("digite o segundo numero ")
        );

        double numero3 = Double.parseDouble(
            JOptionPane.showInputDialog("digite o terceiro numero ")
        );
                                                                                        //  Título janela        Tipo ícone 
        JOptionPane.showMessageDialog(null, "resultado = " + numero1 * (numero2 + numero3), "Valor calculado: ", 1);

    }
}