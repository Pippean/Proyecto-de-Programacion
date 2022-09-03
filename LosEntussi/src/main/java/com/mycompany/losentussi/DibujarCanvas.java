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
    
    public DibujarCanvas(int w, int h){
        width = w;
        height = h;
        m1 = new Minusculas();
    }
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
        
        /*
        if(!"".equals(texto)){
            for (int i = 0; i < texto.length(); i++) {
                if(texto.charAt(i)== 'a'){
                    m1.dibujara(g2,250,0);
                }
                if(texto.charAt(i)=='b'){
                    m1.dibujarb(g2, 250, 0);
                }
            }
        }
        */
        
        if(texto == null){
            System.out.println("No hay texto ingresado");
        }
        else{
            System.out.println(texto);
           if(!texto.equals("hola"))
            m1.dibujara(g2,250,0);
        else{
            m1.dibujarb(g2, 250, 0);
        } 
        }
        
        //m1.dibujarb(g2,0,143);
           
    }
}
