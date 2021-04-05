/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author ARCHV
 */
public class Panel extends JPanel {
    JLabel label;
    JTextField textField;

    public Panel(){
        
        super.setBackground(Color.ORANGE);

        label = new JLabel("CANTIDAD");

        textField = new JTextField(20);
        textField.setSize(150,150);


        label.setBackground(Color.CYAN);
        label.setForeground(Color.MAGENTA);
        label.setOpaque(true);


        super.add(label);
        super.add(textField);
    }

    public Integer getValue(){
        return Integer.parseInt(textField.getText());
    }
}
