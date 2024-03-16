import javax.swing.JOptionPane;

public class LeituraValores {
    public static void main (String[] args){
        String auxiliar;

        int numero;

        auxiliar = JOptionPane.showInputDialog("digite um  nummero ");
        numero = Integer.parseInt(auxiliar);

        int outroNumero = Integer.parseInt(
            JOptionPane.showInputDialog("digite outro numero ")
        );

        JOptionPane.showMessageDialog(null, "soma = " + (numero + outroNumero));

        double x = Double.parseDouble(
            JOptionPane.showInputDialog("digite um valor decimal")
        );

        JOptionPane.showMessageDialog(null, "Triple X: " + 3 * numero);

    }
}
