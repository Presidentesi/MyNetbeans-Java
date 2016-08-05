package _br.com.caixaDialogo;

import javax.swing.JOptionPane;

public class DialogoOpcao02 {

    public static void main(String[] args) {

        // exibe a caixa de dialogo
        int choice = JOptionPane.showOptionDialog(null,
                "Deseja realmente salvar?",
                "Salvar?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);

        // interpreta a escolha do usuário
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Usuário escolheu opção SIM");
            System.exit(0);
        } if (choice == JOptionPane.NO_OPTION) {
            System.out.println("Usuário escolheu opção NÃO");
            System.exit(0);
        } 
        
        System.out.println("Usuário escolheu a opção CANCELAR");
    }
}
