/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame {
        
    private ColorPanel pnlColor;
    private PanelSlider pnlSlider;
    private PanelSpinner pnlSpiner;

    public PrincipalFrame(){

        super("Colores");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(700, 450);
        super.setLayout(new FlowLayout());
        super.setLocationRelativeTo(null);

        pnlColor = new ColorPanel();
        pnlSlider = new PanelSlider();
        pnlSpiner = new PanelSpinner();
        pnlSlider.setListener(new Listener() {
            @Override
            public void rojoSpinner() {
              pnlSlider.setRojo(pnlSpiner.getRojo());
            }

            @Override
            public void azulSpinner() {
                  pnlSlider.setAzul(pnlSpiner.getAzul());
            }

            @Override
            public void verdeSpinner() {
                pnlSlider.setVerde(pnlSpiner.getVerde());
            }

            @Override
            public void azulSlider() {
                pnlSpiner.setAzul(pnlSlider.getAzul());
                pnlColor.setBack(pnlSlider.getRojo(),
                pnlSlider.getVerde(),
                pnlSlider.getAzul());
            }

            @Override
            public void rojoSlider() {
                 pnlSpiner.setRojo(pnlSlider.getRojo());
                 pnlColor.setBack(pnlSlider.getRojo(),
                 pnlSlider.getVerde(),
                 pnlSlider.getAzul());
            }

            @Override
            public void verdeSlider() {
                pnlSpiner.setVerde(pnlSlider.getVerde());
                pnlColor.setBack(pnlSlider.getRojo(),
                pnlSlider.getVerde(),
                pnlSlider.getAzul());
            }
        });

        super.add(pnlSlider);
        super.add(pnlSpiner);
        super.add(pnlColor, FlowLayout.LEFT);

        PrincipalFrame .this.pack();
        super.setVisible(true);
    }
        
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
