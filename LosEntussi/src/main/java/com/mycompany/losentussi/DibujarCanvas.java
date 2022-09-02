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
        Graphics2D g2d = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        m1.dibujara(g2d,250,0);
        m1.dibujarb(g2d,0,143);
        
    }
}
