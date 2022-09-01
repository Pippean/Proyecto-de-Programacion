package com.mycompany.losentussi;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.*;


/**
 *
 * @author Pipe, Juano, Lazaro
 */
public class Dibujar {
    
    public static void main(String[] args){
        int w = 850;
        int h = 550;
        Button Convertir;
        Convertir = new Button("Convertir");
        Convertir.setBounds(720, 480, 100, 22);
        TextField t1 = new TextField("  ");
        t1.setBounds(10, 480, 700, 22);  
        JFrame f = new JFrame();
        DibujarCanvas dc = new DibujarCanvas(w,h);
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.add(Convertir);
        f.add(t1);
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);        
    }
    
}
