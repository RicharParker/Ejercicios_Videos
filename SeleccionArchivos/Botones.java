/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionArchivos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ARCHV
 */
public class Botones extends JPanel  {
    JButton archivo;
    JButton guardar;
    JButton color;
    BotonesListener listener;

    public Botones(){
        archivo = new JButton("...");
        archivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrirClick();
            }
        });

        guardar = new JButton("Guardar");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.guardarClick();
            }
        });
        
        color = new JButton("Selecionar Color");
        color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.colorClick();
            }
        });

        super.add(archivo);
        super.add(guardar);
        super.add(color);

    }

    void setListener(BotonesListener botonesListener) {
       this.listener=listener;
    }
}