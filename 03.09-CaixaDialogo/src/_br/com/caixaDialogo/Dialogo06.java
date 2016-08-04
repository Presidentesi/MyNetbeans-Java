package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo06 {

    public static void main(String[] args) {
        String pastaBkp = "/Usuario/psi/backups";

        // cria  jframe
        JFrame mJFrame = new JFrame("Caixa de Mensagem de Confirmação");

        // exibe a caixa de dialogo informativo
        JOptionPane.showMessageDialog(mJFrame,
                "Os dados foram gravados no diretorio: '" + pastaBkp + "'.",
                "Mensagem de confirmação.",
                JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
