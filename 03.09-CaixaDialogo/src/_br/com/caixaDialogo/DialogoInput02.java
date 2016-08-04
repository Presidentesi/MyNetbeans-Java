package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogoInput02 {

    public static void main(String[] args) {
        JFrame mJFrame = new JFrame("InputDialog");
        
        String name = JOptionPane.showInputDialog(mJFrame, "Qual o seu nome?");
        
        System.out.printf("O nome do usuário é '%s'.\n", name);
        System.exit(0);
    }
}
