/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author ARCHV
 */
public class Vacio extends JPanel implements ActionListener{
    Seleccion informacion;

    public Vacio(){
        informacion = new Seleccion("Informacion");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == informacion){
            System.out.println("a");
        }
    }
    
}
