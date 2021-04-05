/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author ARCHV
 */
public class ColorSlider extends JPanel{
    private JLabel name;
    private JSlider slider;

    private  Listener sliderListener;

    public ColorSlider(String caption){
        super.setLayout(new BorderLayout());
        name = new JLabel(caption);
        slider = new JSlider(0,255,0);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });


        super.add(name, BorderLayout.NORTH);
        super.add(slider, BorderLayout.SOUTH);
    }

    public void setSliderlistener(Listener sliderlistener) {
        this.sliderListener = sliderListener;
    }

   
}   

