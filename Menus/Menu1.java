/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
/**
 *
 * @author ARCHV
 */
public class Menu1 extends JMenuBar{
    
    //JMenuBar menu;
    
    JMenu archivo;
    JMenu ayuda;
    
    JMenuItem nuevo;
    JMenuItem abrir;
    JSeparator jSeparator;
    JMenuItem salir;
    
    
    JMenuItem acerca;
    
    MenuBarListener listener;
    
    
       
    
    public Menu1(){
        archivo = new JMenu("Archivo");
        ayuda = new JMenu("Ayuda");
        
        nuevo = new JMenuItem("Nuevo");
        nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.nuevoClick();
            }
        });
        
        abrir = new JMenuItem("Abrir");
        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.abrirClick();
            }
        });
        
        salir = new JMenuItem("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.salirClick();
            }
        });
        
        acerca = new JMenuItem("Acerca de");
        acerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.acercaClick();
            }
        });
        
        archivo.add(abrir);
        archivo.add(nuevo);
        archivo.add(new JSeparator());
        archivo.add(salir);
        
        ayuda.add(acerca);
        
        
        super.add(archivo);
        super.add(ayuda);
    }

    void setListener(MenuBarListener menuListener) {
        this.listener= menuListener;
    }
}
