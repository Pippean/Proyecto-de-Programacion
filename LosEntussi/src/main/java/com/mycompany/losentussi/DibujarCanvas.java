package com.mycompany.losentussi;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.geom.Path2D;     

/**
 *
 * @author Pipe, Juano, Lázaro
 */

public class DibujarCanvas extends JComponent {
    
    private int width;
    private int height;
    private Minusculas m1;
    private Mayusculas m2;
    
    public DibujarCanvas(int w, int h){
        width = w;
        height = h;
        m1 = new Minusculas();
        m2 = new Mayusculas();
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);

        //m1.dibujara2(g2,50,0);
        //m1.dibujara(g2,200,0);
        //m1.dibujarb(g2,360,0);
        //m1.dibujarc(g2,132,0);
        //m1.dibujare(g2,10,0);
 
        //m2.dibujarA(g2,10,0);
        //m2.dibujarB(g2,10,0);       
        //m2.dibujarC(g2,10,0);
        //m2.dibujarF(g2,10,0);
        
        m2.dibujarH(g2,10,0);
       
        //m2.dibujarD(g2,10,0);
        //m1.dibujarf(g2,10,0);
        //m1.dibujarg(g2,10,0);
        //m1.dibujarh(g2,10,0);
        //m1.dibujard(g2,10,0);
        //m1.dibujarq(g2,10,0);
        //m1.dibujarb(g2,0,143);
        
    }
}
