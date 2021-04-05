/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionArchivos;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame {
    Color color;

    ArchivosPanel panelArchivos;
    Botones botones;
    Archivo archivos;
    PanelColor panelito;

    public PrincipalFrame(){
        panelito = new PanelColor();


        panelArchivos = new ArchivosPanel();
        super.setTitle("Seleccion de Archivos");
        super.setSize(500,500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botones = new Botones();

        botones.setListener(new BotonesListener () {
            @Override
            public void abrirClick() {
                archivos = new Archivo();
                archivos.abrir();
                panelArchivos.nombreDelArchivo(archivos.direccion());
                PrincipalFrame.this.setVisible(true);
            }

            @Override
            public void guardarClick() {
                archivos = new Archivo();
                archivos.guardar();
                panelArchivos.setNombreGuardar(archivos.direccion());
                PrincipalFrame.this.setVisible(true);
            }

            @Override
            public void colorClick(){
                JColorChooser Selectorcolor=new JColorChooser();
                color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
                panelito.cambiarDeColor(color);

            }
        });


        super.add(panelito, BorderLayout.EAST);
        super.add(panelArchivos, BorderLayout.CENTER);
        super.add(botones, BorderLayout.SOUTH);
        super.setVisible(true);
    }

    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
