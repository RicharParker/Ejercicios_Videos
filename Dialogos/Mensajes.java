/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ARCHV
 */
public class Mensajes extends JPanel implements ActionListener {

    JLabel label;
    JLabel titulo;
    JTextField textField;
    JTextField tittle;
    JRadioButton informacion;
    JRadioButton pregunta;
    JRadioButton precaucion;
    JRadioButton error;

    public Mensajes(){
        label = new JLabel("Mensaje:");
        titulo = new JLabel("TITULO");
        textField = new JTextField(50);
        tittle = new JTextField(50);

        informacion = new JRadioButton("Informacion");
        pregunta = new JRadioButton("Pregunta");
        precaucion = new JRadioButton("Precaucion");
        error = new JRadioButton("Error");


        informacion.addActionListener(this);
        pregunta.addActionListener(this);
        precaucion.addActionListener(this);
        error.addActionListener(this);

        ButtonGroup grupo = new ButtonGroup();

        grupo.add(informacion);
        grupo.add(pregunta);
        grupo.add(precaucion);
        grupo.add(error);

        super.add(informacion);
        super.add(pregunta);
        super.add(precaucion);
        super.add(error);
        super.add(label);
        super.add(textField);
        super.add(titulo);
        super.add(tittle);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == informacion){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.INFORMATION_MESSAGE);
        }if (actionEvent.getSource() == pregunta){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.QUESTION_MESSAGE);
        }if (actionEvent.getSource() == precaucion){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.WARNING_MESSAGE);
        }if (actionEvent.getSource() == error){
            JOptionPane.showMessageDialog(this,textField.getText(),tittle.getText(),JOptionPane.ERROR_MESSAGE);
        }
    }
}
