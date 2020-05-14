//Implementare incapsulamento
package com.company;
import javax.swing.*;
import java.awt.event.*;

public class GestioCaselleR implements ActionListener{
    private JTextField txt;
    private JTextField txt2;

    //costruttore oggetti
    public GestioCaselleR(JTextField txt, JTextField txt2)  {
        this.txt = txt;
        this.txt2 = txt2;
    }

    public void actionPerformed(ActionEvent e)  {
        float base=0,altezza=0;
        Rettangolo ret = new Rettangolo(base,altezza);
        base = Float.parseFloat(txt.getText());
        altezza = Float.parseFloat(txt2.getText());
        ret.setBase(base);
        ret.setAltezza(altezza);
        JOptionPane.showMessageDialog(null,"" + ret.perimetro(),"Perimetro del rettangolo",JOptionPane.INFORMATION_MESSAGE);
    }

}