package _br.com.caixaDialogo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo07 {

    public static void main(String[] args) {
        // cria o jframe
        JFrame mJFrame = new JFrame("Caixa de Mensagem de ...");

        // exibe a caixa de mensagem
        JOptionPane.showMessageDialog(mJFrame,
                "Seus arquivos foram gravados",
                "Arquivos em nuvem",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Dialogo07.class.getResource("icon-nuvem_32x32.png")));

//        Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/icon-nuvem_32x32.png"))); 
//        JOptionPane.showMessageDialog(mJFrame,
//                "Seus arquivos foram gravados",
//                "Arquivos em nuvem",
//                JOptionPane.INFORMATION_MESSAGE, figura);

        System.exit(0);
    }

}
