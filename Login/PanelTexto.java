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
public class PanelTexto extends JPanel {
    
    private JLabel lblcaption;
    private JTextField edit;

    public PanelTexto(String caption) {
        this.lblcaption = new JLabel(caption);
        this.edit = new JTextField(25);

        super.add(lblcaption);
        super.add(edit);
    }

    public void clear() {
        edit.setText("");
    }

    public String getValor(){
        return edit.getText();
    }
}
