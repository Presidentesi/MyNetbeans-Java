package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo05 {

    public static void main(String[] args) {
        String pastaBkp = "/Usuario/psi/backups";

        // cria  jframe
        JFrame mJFrame = new JFrame("Caixa de Mensagem de Perigo");

        // exibe a caixa de dialogo informativo
        JOptionPane.showMessageDialog(mJFrame,
                "Houve um erro na gravação\n"
                        + "os dados no diretorio: '" + pastaBkp + "'.",
                "Mensagem ocorrência de perigo.",
                JOptionPane.WARNING_MESSAGE);

        System.exit(0);
    }
}
