/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame  {

    private Menu1 baresito;

    public PrincipalFrame() {
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        baresito = new Menu1();
        baresito.setListener(new MenuBarListener() {
            @Override
            public void nuevoClick() {
                JOptionPane.showMessageDialog(PrincipalFrame.this,
                        "Vas a crear un nuevo archivo",
                        "Nuevo",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void abrirClick() {
                JOptionPane.showMessageDialog(PrincipalFrame.this,
                        "Abriendo archivo",
                        "Abrir",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            @Override
            public void salirClick() {
                System.exit(0);
            }

            @Override
            public void acercaClick() {
                JOptionPane.showMessageDialog(PrincipalFrame.this,
                        "Acerca de nosotros",
                        "Acerca de",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        this.add(baresito, BorderLayout.NORTH);

        this.setVisible(true);
    }
    public static void main(String[] args) {
        
    }
}
