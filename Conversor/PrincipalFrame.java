/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame  {
    
    BotonSalir boton;
    ComboBox moneda;

    public PrincipalFrame(){

        super("CONVERSOR");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(600, 400);
        super.setVisible(true);
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        


        boton = new BotonSalir();
        moneda = new ComboBox();

        super.add(boton, BorderLayout.SOUTH);
        super.add(moneda, BorderLayout.CENTER);


        super.setVisible(true);
    }
        
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
