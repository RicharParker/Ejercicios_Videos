/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumador;

import javax.swing.JOptionPane;
/**
 *
 * @author ARCHV
 */
public class NumeroIncorrecto extends  Exception {
    private String mensaje;
 
    public NumeroIncorrecto () {
        
    }

    public NumeroIncorrecto (String msg) {

        super(msg);
        this.mensaje=msg;
    }

    public void getMensaje() {
    }
}
        