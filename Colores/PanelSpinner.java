/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ARCHV
 */
public class PanelSpinner extends JPanel{
    private JSpinner spRojo;
    private JSpinner spVerde;
    private JSpinner spAzul;

    private Listener spinnerListener;

    public PanelSpinner() {
        super.setLayout(new BorderLayout(5,15));
        spRojo = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        spRojo.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spinnerListener.rojoSpinner();
            }
        });
        spVerde = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        spVerde.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spinnerListener.verdeSpinner();
            }
        });
        spAzul = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        spAzul.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spinnerListener.azulSpinner();
            }
        });

        super.add(spRojo, BorderLayout.NORTH);
        super.add(spVerde, BorderLayout.CENTER);
        super.add(spAzul, BorderLayout.SOUTH);

    }

    public void setSpinnerListener(Listener spinnerListener) {
        this.spinnerListener = spinnerListener;
    }


    public void setRojo(Integer i) {
        spRojo.setValue(i);
    }

    public Integer getRojo() {
        return (Integer) spRojo.getValue();
    }

    public void setVerde(Integer i) {
        spVerde.setValue(i);
    }

    public Integer getVerde() {
        return (Integer) spVerde.getValue();
    }

    public void setAzul(Integer i) {
        spAzul.setValue(i);
    }

    public Integer getAzul() {
        return (Integer) spAzul.getValue();
    }
}
