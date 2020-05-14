package com.company;
import javax.swing.*;
import java.awt.*;

public class Finestra_Grafica  extends JFrame {
    //Inizializzazione bottoni scelta figura
    private String[] figure = new String[]{"Quadrato", "Rettangolo", "Trapezio", "Triangolo"};
    JButton Quadrato = new JButton(figure[0]);
    JButton Rettangolo = new JButton(figure[1]);
    JButton Trapezio = new JButton(figure[2]);
    JButton Triangolo = new JButton(figure[3]);

    //costruttore per creazione con evento grazie intefaccia ActionListener scelta figure geometriche
    public Finestra_Grafica() {
        super("Perimetro ed Area Figure Geometriche");//questo è il titolo
        Container c = this.getContentPane();
        c.setLayout(new GridLayout(4, 1));
        c.add(Quadrato);
        Quadrato.addActionListener(new ClickButton());
        c.add(Rettangolo);
        Rettangolo.addActionListener(new ClickButton());
        c.add(Trapezio);
        Trapezio.addActionListener(new ClickButton());
        c.add(Triangolo);
        Triangolo.addActionListener(new ClickButton());
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

