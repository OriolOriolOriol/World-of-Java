package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ClickButton implements ActionListener {
    int count = 1;
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        switch (button.getText()) {
            case "Quadrato": {
                JFrame f = new JFrame("Inserimento lato Quadrato");
                JPanel p = new JPanel();
                JTextField txtNumero = new JTextField(10);
                txtNumero.addActionListener(new GestoreCasella(txtNumero));
                p.add(txtNumero);
                //Caratteristiche della finestra Rettangolo che si apre
                f.getContentPane().add(p);
                f.setSize(250,150);
                f.setLocation(100,100);
                f.setVisible(true);
                break;

            }

            case "Rettangolo": {
                JFrame f = new JFrame("Inserimento base e altezza Rettangolo");
                JPanel p = new JPanel();
                JTextField txtNumero = new JTextField(10);;
                JTextField txtNumero2 = new JTextField(10);

                txtNumero.addActionListener(new GestioCaselleR(txtNumero,txtNumero2));
                p.add(new JLabel("Base"));
                p.add(txtNumero);
                f.getContentPane().add(p);
                p.add(new JLabel("Altezza"));
                p.add(txtNumero2);
                f.getContentPane().add(p);
                p.add(new JLabel("Premi Invio"));
                //Caratteristiche della finestra che si apre
                f.setSize(250,150);
                f.setLocation(100,100);
                f.setVisible(true);
                break;
            }

            case "Trapezio": {
                JOptionPane.showMessageDialog(null, "È stato premuto --> " + "Trapezio");
                break;
            }

            case "Triangolo": {
                JOptionPane.showMessageDialog(null, "È stato premuto --> " + "Triangolo");
                break;
            }
        }

    }
}
