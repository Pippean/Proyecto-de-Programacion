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
    private String texto;
    
    public DibujarCanvas(int w, int h, String texto){
        width = w;
        height = h;
        m1 = new Minusculas();
        this.texto = texto;
    }
  
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        int x= 0, y=0;
        if(!"".equals(texto)){
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                switch(caracter){
                    case ' ':{
                        x+=160;
                        break;
                    }
                    case 'a':{
                        m1.dibujara(g2,x,y);
                        break;
                    }
                    case 'b':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'c':{
                        m1.dibujarc(g2, x, y);
                        break;
                    }
                    case 'd':{
                        m1.dibujard(g2, x, y);
                        break;
                    }
                    case 'e':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'f':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'g':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'h':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'i':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'j':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'k':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'm':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'n':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'ñ':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'o':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'p':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'q':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'r':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 's':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 't':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'u':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'v':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'w':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'x':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'y':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    case 'z':{
                        m1.dibujarb(g2, x, y);
                        break;
                    }
                    default:{
                        break;
                    } 
                }    
            }
        }    
    }
}
