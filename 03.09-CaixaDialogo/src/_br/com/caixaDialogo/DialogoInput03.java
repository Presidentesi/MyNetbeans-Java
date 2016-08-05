package _br.com.caixaDialogo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogoInput03 {

    public static final String[] pizzas = {"Calabresa", "Palmito", "Queijo", "Portuguesa"};

    public static void main(String[] args) {
        JFrame mJFrame = new JFrame("Input Dialog");
        String pizzaFavorita = (String) JOptionPane.showInputDialog(mJFrame,
                "Qual a sua pizza favorita?",
                "Pizza favorita",
                JOptionPane.QUESTION_MESSAGE,
                null,
                pizzas,
                pizzas[0]);

        // será nulo se o usuário cancelar
        System.out.printf("Pizza favorita é %s.\n", pizzaFavorita);
        System.exit(0);
    }

}
