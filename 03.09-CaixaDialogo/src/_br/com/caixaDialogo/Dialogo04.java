package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo04 {

    public static void main(String[] args) {
        String pastaBkp = "/Usuario/psi/backups";

        // cria  jframe
        JFrame mJFrame = new JFrame("Caixa de Mensagem de Erro");

        // exibe a caixa de dialogo informativo
        JOptionPane.showMessageDialog(mJFrame,
                "Não é possível localizar o diretorio: '" + pastaBkp + "'.",
                "Mensagem ocorrência de erro.",
                JOptionPane.ERROR_MESSAGE);

        System.exit(0);
    }
}
