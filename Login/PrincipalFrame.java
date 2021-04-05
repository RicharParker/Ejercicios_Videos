/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ARCHV
 */
public class PrincipalFrame extends JFrame {
    
    private JLabel lblTitulo;
    private JPanel pntitulo;
    private JPanel pningreso;
    private Datos texto;
    private JButton btnIngreso;
    
    public PrincipalFrame(){
        super("Login");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        lblTitulo = new JLabel("Abarrotas Rosa");
        lblTitulo.setFont(new Font("Arial", Font.ROMAN_BASELINE,25));
        pntitulo= new JPanel();
        pntitulo.add(lblTitulo, BorderLayout.CENTER);
        texto = new Datos();
        btnIngreso = new JButton("Ingresar");
        pningreso = new JPanel();
        pningreso.setLayout(new FlowLayout());
        pningreso.add(btnIngreso);
        btnIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PrincipalFrame.this, 
                        String.format("Bienvenido %s !", 
                                texto.getUsuario(),
                                JOptionPane.INFORMATION_MESSAGE));
            }
        });

        super.add(texto, BorderLayout.CENTER);
        super.add(pntitulo, BorderLayout.NORTH);
        super.add(pningreso, BorderLayout.SOUTH);

        super.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new PrincipalFrame();
    }
}
