package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo03 {

    public static void main(String[] args) {
        String pastaBkp = "/Usuario/psi/backups";

        // cria  jframe
        JFrame mJFrame = new JFrame("Caixa de Mensagem Informativa");

        // exibe a caixa de dialogo informativo
        JOptionPane.showMessageDialog(mJFrame,
                "Problemas ao gravar o backup no diretorio: '" + pastaBkp + "'.",
                "Mensagem informativa.",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
