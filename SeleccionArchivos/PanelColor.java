/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionArchivos;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ARCHV
 */

public class PanelColor extends JPanel {

    public PanelColor(){
        super.setBackground(Color.white);
        super.setSize(200,300);
    }

    public void cambiarDeColor(Color a){
        this.setBackground(a);
    }
}