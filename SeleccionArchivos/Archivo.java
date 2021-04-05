/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionArchivos;

import javax.swing.*;
/**
 *
 * @author ARCHV
 */
public class Archivo extends JFileChooser{
    public void abrir(){
        this.showOpenDialog(null);
    }

    public String direccion(){
        return this.getSelectedFile().getAbsolutePath();
    }

    public void guardar(){
        this.showSaveDialog(null);
    }
}
