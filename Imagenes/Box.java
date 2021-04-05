/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagenes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ARCHV
 */
public class Box extends JPanel {
    JCheckBox barbilla;
    JCheckBox lentes;
    JCheckBox cabello;
    JCheckBox dientes;
    ImagenListener listen;
    public Box(){
        barbilla = new JCheckBox("barbilla");
        barbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.barbilla();
            }
        });

        lentes = new JCheckBox("lentes");
        lentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.lentes();
            }
        });

        cabello = new JCheckBox("cabello");
        cabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.cabello();
            }
        });

        dientes = new JCheckBox("dientes");
        dientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.dientes();
            }
        });


        super.add(barbilla);
        super.add(lentes);
        super.add(cabello);
        super.add(dientes);

    }

    public void setListen(ImagenListener listen) {
        this.listen = listen;
    }


    public boolean isSelectBarbilla(){
        return barbilla.isSelected();
    }

    public boolean isSelectLentes(){
        return lentes.isSelected();
    }

    public boolean isSelectCabello(){
        return cabello.isSelected();
    }

    public boolean isSelectDientes(){
        return dientes.isSelected();
    }


}