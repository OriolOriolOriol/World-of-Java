package com.company;
import javax.swing.*;
import java.awt.event.*;

public class GestoreCasella implements ActionListener{
        private JTextField txt;

        //costruttore oggetti
        public GestoreCasella(JTextField txt)  {
            this.txt = txt;
        }

        public void actionPerformed(ActionEvent e)  {
                float numero;
                numero = Float.parseFloat(txt.getText());
        }

}
