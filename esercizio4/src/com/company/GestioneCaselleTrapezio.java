//Implementare incapsulamento!!!
package com.company;
import javax.swing.*;
import java.awt.event.*;

public class GestioCaselleTrapezio implements ActionListener{
    private JTextField txt;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;

    //costruttore oggetti
    public GestioCaselleTrapezio(JTextField txt, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5)  {
        this.txt = txt;
        this.txt2 = txt2;
        this.txt3=txt3;
        this.txt4=txt4;
        this.txt5=txt5;
    }

    public void actionPerformed(ActionEvent e)  {
        float base=0,altezza=0,baseM=0,lato1=0,lato2=0;;
        Trapezio tra = new Trapezio(base,altezza,baseM,lato1,lato2);
        base = Float.parseFloat(txt.getText());
        altezza = Float.parseFloat(txt2.getText());
        baseM=Float.parseFloat(txt3.getText());
        lato1=Float.parseFloat(txt4.getText());
        lato2=Float.parseFloat((txt5.getText()));
        tra.setBase(base);
        tra.setAltezza(altezza);
        JOptionPane.showMessageDialog(null,"" + tra.perimetro(),"Perimetro del rettangolo",JOptionPane.INFORMATION_MESSAGE);
    }
