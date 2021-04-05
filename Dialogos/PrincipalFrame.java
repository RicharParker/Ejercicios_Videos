/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame{
    Mensajes mensajes = new Mensajes();
    public PrincipalFrame(){
        super.setTitle("DIALOGOS");
        super.setSize(600,600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        
        super.add(mensajes);
        
        super.setVisible(true);
    }
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }

}
