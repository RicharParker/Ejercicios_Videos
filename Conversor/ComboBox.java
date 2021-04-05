/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ARCHV
 */
public class ComboBox extends JPanel implements ActionListener{
    public final Double dolar = 20.29;

    JComboBox comboBox;
    Panel panel;
    JLabel cantidad;


    public ComboBox(){
        super.setBackground(Color.white);

        String[] monedas = {"PESOS a DOLARES", "DOLARES a PESOS"};

        comboBox = new JComboBox(monedas);
        panel = new Panel();
        cantidad = new JLabel("$0.00");

        comboBox.setSelectedIndex(-1);
        comboBox.addActionListener(this);


        super.add(comboBox);
        super.add(panel);
        super.add(cantidad);


    }


    public void limpiarCantidad(){
        cantidad.setText("$0.00");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == comboBox){
            if (comboBox.getSelectedIndex() == 0){
                limpiarCantidad();
                double x = panel.getValue() / dolar ;
                cantidad.setText(String.format("Tienes un total de $"+x +" dolares"));

            }else{
                limpiarCantidad();
                double x = panel.getValue() * dolar ;
                cantidad.setText(String.format("Tienes un total de $"+x+" pesos Mexicanos"));
            }
        }
    }
}
