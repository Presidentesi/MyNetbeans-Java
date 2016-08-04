package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogoInput01 {

    public static void main(String[] args) {
        JFrame mJFrame = new JFrame("InputDialog");
        String key = JOptionPane.showInputDialog(
                mJFrame,
                "Entre com a chave para continuar (label)",
                "A chave é necessária (title)",
                JOptionPane.WARNING_MESSAGE
        );
        // Caso o usuario pressione cancelar, o resultado será nulo
        System.out.printf("A chave é '%s'.\n", key);
        System.exit(0);
    }
}
