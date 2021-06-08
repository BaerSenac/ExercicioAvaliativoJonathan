package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora1 {
    private JPanel JPanelPrincipal;
    private javax.swing.JLabel JLabelCalculadora;
    private JButton botaoClicar;
    private JTextField textNumero1;
    private JTextField textNumero2;

    public calculadora1() {
        botaoClicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var primeirocampo = Integer.parseInt(textNumero1.getText());
                var segundocampo = Integer.parseInt(textNumero2.getText());

                JLabelCalculadora.setText(String.valueOf(primeirocampo + segundocampo));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =  new JFrame();
        frame.setTitle("Calculadora");
        frame.setContentPane(new calculadora1().JPanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setResizable(false);
        frame.pack();

    }







}
