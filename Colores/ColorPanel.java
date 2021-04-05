/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author ARCHV
 */
public class ColorPanel extends JPanel{
    
    public ColorPanel(){
        super.setBackground(Color.BLACK);
        super.setLayout(new FlowLayout());
        super.setPreferredSize(new Dimension(200,200));
    }
    
   public void setBack(Integer x, Integer y, Integer z){
        Color color= new Color(x,y,z);
        super.setBackground(color);
    }

}
