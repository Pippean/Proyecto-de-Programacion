package com.mycompany.losentussi;

import javax.swing.JFrame;

/**
 *
 * @author Pipe, Juano, Lazaro
 */
public class Dibujar {
    
    public static void main(String[] args){
        int w = 850;
        int h = 550;
        JFrame f = new JFrame();
        DibujarCanvas dc = new DibujarCanvas(w,h);
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);        
    }
    
}
