package _br.com.caixaDialogo;

import javax.swing.JOptionPane;

public class DialogoOpcao01 {

    public static void main(String[] args) {

        // exibe a caixa de dialogo
        int choice = JOptionPane.showOptionDialog(null,
                "Deseja realmente sair?",
                "Sair?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);

        // interpreta a escolha do usuário
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Usuário escolheu opção SIM");
            System.exit(0);
        } 
        
        System.out.println("Usuário escolheu a opção NÃO");
    }
}
