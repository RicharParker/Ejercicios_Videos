/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionArchivos;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ARCHV
 */
public class ArchivosPanel extends JPanel {
    JLabel adjuntar;
    JTextField nombre;

    JLabel guardar;
    JTextField nombreGuardar;

    public ArchivosPanel(){
        adjuntar = new JLabel("Adjuntar Archivos");
        nombre = new JTextField(15);

        guardar = new JLabel("Guardar archivo");
        nombreGuardar = new JTextField(20);

        super.add(adjuntar);
        super.add(nombre);
        super.add(guardar);
        super.add(nombreGuardar);

    }

    public void nombreDelArchivo(String direccion){
        nombre.setText(direccion);
    }

    public void setNombreGuardar(String direccion){
        nombreGuardar.setText(direccion);
    }

}