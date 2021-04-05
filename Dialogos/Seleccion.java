/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ARCHV
 */
public class Seleccion extends JPanel implements ActionListener {
    JRadioButton boton;
    public Seleccion(String titulo){

        boton = new JRadioButton(titulo);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == boton){
            System.out.println("a");
        }
    }
    
}
