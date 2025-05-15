package INF62Lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcolatriceSwing extends JFrame implements ActionListener {
    private final JTextField display = new JTextField();
    private double primoNumero = 0;
    private String operatore = "";

    public CalcolatriceSwing() {
        setTitle("Calcolatrice Swing");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        JPanel pannello = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] tasti = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
        };

        for (String testo : tasti) {
            JButton bottone = new JButton(testo);
            bottone.setFont(new Font("Arial", Font.BOLD, 20));
            bottone.addActionListener(this);
            pannello.add(bottone);
        }

        add(pannello, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        switch (input) {
            case "C" -> {
                display.setText("");
                primoNumero = 0;
                operatore = "";
            }
            case "=" -> {
                double secondoNumero = Double.parseDouble(display.getText());
                double risultato = switch (operatore) {
                    case "+" -> primoNumero + secondoNumero;
                    case "-" -> primoNumero - secondoNumero;
                    case "*" -> primoNumero * secondoNumero;
                    case "/" -> secondoNumero != 0 ? primoNumero / secondoNumero : 0;
                    default -> 0;
                };
                display.setText(String.valueOf(risultato));
                operatore = "";
            }
            case "+", "-", "*", "/" -> {
                primoNumero = Double.parseDouble(display.getText());
                operatore = input;
                display.setText("");
            }
            default -> display.setText(display.getText() + input);
        }
    }

    public static void main(String[] args) {
        new CalcolatriceSwing();
    }
}

