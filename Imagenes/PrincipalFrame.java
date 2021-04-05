/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame {
    
    Box box;
    
    public PrincipalFrame() {
        
        box = new Box();
        super.setTitle("IMAGENES");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        super.add(box);
        super.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
