/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sumador;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author ARCHV
 */
public class PanelNumeros extends JPanel{

    private ArrayList<TEdit> lista;

    public PanelNumeros(){

        lista = new ArrayList<>();


    }

    public void limpiar(){
        for (TEdit tEdit : lista) {
            tEdit.clear();
        }
    }

    public Integer suma() throws NumeroIncorrecto {
        Integer a=0;
        for (TEdit tEdit : lista) {
            a+= tEdit.getValue();
        }
        return a;
    }

    public void agregar(Integer a){
        lista.clear();
        super.removeAll();
        for (int i = 0; i < a; i++) {            
            TEdit n = new TEdit("Numero "+(i+1));
            lista.add(n);
            super.add(n);
        }
    }

}