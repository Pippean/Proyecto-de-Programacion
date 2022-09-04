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
    
    public DibujarCanvas(int w, int h){
        width = w;
        height = h;
        m1 = new Minusculas();
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);

        //m1.dibujara2(g2,50,0);
        m1.dibujara(g2,200,0);
        m1.dibujarb(g2,360,0);
        //m1.dibujarc(g2,132,0);
        //m1.dibujare(g2,10,0);
        //m1.dibujari(g2,50,0);
        //m1.dibujarj(g2,50,0);
        //m1.dibujark(g2,50,0);
        //m1.dibujarl(g2,50,0);
        //m1.dibujarm(g2,50,0);
        //m1.dibujarn(g2,50,0);
        //m1.dibujarñ(g2,50,0);
        //m1.dibujaro(g2,50,0);
        //m1.dibujarp(g2,50,0);
        //m1.dibujarq(g2,100,0);
        //m1.dibujarr(g2,100,0);
        //m1.dibujars(g2,10,0);
        //m1.dibujart(g2,10,0);
        //m1.dibujaru(g2,10,0);
        //m1.dibujarv(g2,10,0);
        //m1.dibujarw(g2,10,0);
        //m1.dibujarx1(g2,10,0);
        //m1.dibujary1(g2,10,0);
        m1.dibujarz(g2,10,0);
        //m1.dibujarf(g2,10,0);
        //m1.dibujarg(g2,10,0);
        //m1.dibujarh(g2,10,0);
        //m1.dibujard(g2,10,0);
        //m1.dibujarq(g2,10,0);
        //m1.dibujarb(g2,0,143);
        
    }
}
