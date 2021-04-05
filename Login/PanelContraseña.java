/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.*;
/**
 *
 * @author ARCHV
 */
public class PanelContraseña extends JPanel{
    private JLabel lblcaption;
    private JPasswordField edit;

    public PanelContraseña(String caption) {
        this.lblcaption = new JLabel(caption);
        this.edit = new JPasswordField(15);


        super.add(lblcaption);
        super.add(edit);
    }

    public String getValor(){
        return String.valueOf(edit.getPassword());
    }
}
