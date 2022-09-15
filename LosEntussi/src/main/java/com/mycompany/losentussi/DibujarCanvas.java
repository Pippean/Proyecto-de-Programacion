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
    private String color;
    private Mayusculas m2;
    
    public DibujarCanvas(int w, int h, String texto, String color){
        width = w;
        height = h;
        m1 = new Minusculas();
        m2 = new Mayusculas();
        this.texto = texto;
        this.color = color;
    }
  
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        //g2.setColor(Color.red); Para cambiar los colores de las letras
        switch(color){
            case "Negro":{
                g2.setColor(Color.black);
                break;
            }
            case "Rojo":{
                g2.setColor(Color.red);
                break;
            }
            case "Azul":{
                g2.setColor(Color.blue);
                break;
            }
            case "Amarillo":{
                g2.setColor(Color.yellow);
                break;
            }
            case "Verde":{
                g2.setColor(Color.green);
                break;
            }
            case "Naranjo":{
                g2.setColor(Color.orange);
                break;
            }
            case "Morado":{
                g2.setColor(Color.magenta);
                break;
            }
            case "Rosado":{
                g2.setColor(Color.pink);
                break;
            }
            case "Celeste":{
                g2.setColor(Color.cyan);
                break;
            }
            case "Blanco":{
                g2.setColor(Color.white);
                break;
            }
        }
        
        int x= 10, y=0;
        m2.dibujarO(g2, x, y);
    
        if(!"".equals(texto)){
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if(x>=1200){
                    y+=180;
                    x=10;
                }                
                switch(caracter){
                    case ' ':{   
                        x+=40;
                        break;
                    }
                    case 'a':{
                        if(i== 0){
                            m1.dibujara(g2, x, y);
                            x+=90;
                        }
                        else if(texto.charAt(i-1)=='b'){
                            m1.dibujaracaso(g2, x, y);
                            x+=70;
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujaracaso(g2, x, y);
                            x+=70; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujaracaso(g2, x, y);
                            x+=70;
                        }
                        
                        else{
                            m1.dibujara(g2, x, y);
                            x+=90;
                        }
                        break;
                    }
                    case 'b':{
                        m1.dibujarb(g2, x, y);
                        x+=50;
                        break;
                    }
                    case 'c':{
                        m1.dibujarc(g2, x, y);
                        x+=68;
                        break;
                    }
                    case 'd':{
                        m1.dibujard(g2, x, y);
                        x+=70;
                        break;
                    }
                    case 'e':{
                        if(i== 0){
                            m1.dibujare(g2, x, y);
                        }
                        else if(texto.charAt(i-1) == 'b'){
                            m1.dibujarecaso(g2, x, y);
                            x+=25;                            
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujarecaso(g2, x, y);
                            x+=25; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujarecaso(g2, x, y);
                            x+=25;
                        }
                        else{
                            m1.dibujare(g2, x, y);
                            x+=35;
                        }
                        break;
                    }
                    case 'f':{
                        m1.dibujarf(g2, x, y);
                        x+=50;
                        break;
                    }
                    case 'g':{
                        m1.dibujarg(g2, x, y);
                        x+=70;
                        break;
                    }
                    case 'h':{
                        m1.dibujarh(g2, x, y);
                        x+=60;
                        break;
                    }
                    case 'i':{
                        if(i==0){
                          m1.dibujari(g2, x, y);
                          x+=60;
                        }
                        else if(texto.charAt(i-1) == 'b'){
                            m1.dibujaricaso(g2, x, y);
                            x+=30;                            
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujaricaso(g2, x, y);
                            x+=30; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujaricaso(g2, x, y);
                            x+=30;
                        }
                        else{
                            m1.dibujari(g2, x, y);
                            x+=60;
                        }
                        break;
                    }
                    case 'j':{
                        m1.dibujarj(g2, x, y);
                        x+=60;
                        break;
                    }
                    case 'k':{
                        m1.dibujark(g2, x, y);
                        x+=100;
                        break;
                    }
                    case 'l':{
                        if(i==0){
                          m1.dibujarl(g2, x, y);
                          x+=40;   
                        }
                        else if(texto.charAt(i-1)=='b'){
                          m1.dibujarlcaso(g2, x, y);
                        }
                        else{
                          m1.dibujarl(g2, x, y);
                          x+=40;
                        }
                        break;
                    }
                    case 'm':{
                        m1.dibujarm(g2, x, y);
                        x+=155;
                        break;
                    }
                    case 'n':{
                        m1.dibujarn(g2, x, y);
                        x+=95;
                        break;
                    }
                    case 'ñ':{
                        m1.dibujarñ(g2, x, y);
                        x+=100;
                        break;
                    }
                    case 'o':{
                        if (i == 0){
                          m1.dibujaro(g2, x, y);
                          x+=90; 
                        }
                        else if(texto.charAt(i-1) == 'b'){
                            m1.dibujarocaso(g2, x, y);
                            x+=60;                            
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujarocaso(g2, x, y);
                            x+=60; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujarocaso(g2, x, y);
                            x+=60;
                        }
                        else{
                        m1.dibujaro(g2, x, y);
                        x+=90;
                        }
                        break;
                    
                    }
                    case 'p':{
                        m1.dibujarp(g2, x, y);
                        x+=100;
                        break;
                    }
                    case 'q':{
                        m1.dibujarq(g2, x, y);
                        x+=80;
                        break;
                    }
                    case 'r':{
                        if(i==0){
                          m1.dibujarr(g2, x, y);
                          x+=70;    
                        }
                        else if(texto.charAt(i-1) == 'b'){
                            m1.dibujarrcaso(g2, x, y);
                            x+=45;                            
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujarrcaso(g2, x, y);
                            x+=45; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujarrcaso(g2, x, y);
                            x+=45;
                        }
                        else{
                            m1.dibujarr(g2, x, y);
                            x+=70;
                        }
                        break;
                    }
                    case 's':{
                        m1.dibujars(g2, x, y);
                        x+=85;
                        break;
                    }
                    case 't':{
                        m1.dibujart(g2, x, y);
                        x+=40;
                        break;
                    }
                    case 'u':{
                        if(i==0){
                          m1.dibujaru(g2, x, y);
                          x+=90;    
                        }
                        else if(texto.charAt(i-1) == 'b'){
                            m1.dibujarucaso(g2, x, y);
                            x+=70;                            
                        }
                        else if(texto.charAt(i-1) == 'v'){
                             m1.dibujarucaso(g2, x, y);
                            x+=70; 
                        }
                        else if(texto.charAt(i-1)== 'w'){
                            m1.dibujarucaso(g2, x, y);
                            x+=70;
                        }
                        else{
                            m1.dibujaru(g2, x, y);
                            x+=90;
                        }
                        break;
                    }
                    case 'v':{
                        m1.dibujarv(g2, x, y);
                        x+=110;
                        break;
                    }
                    case 'w':{
                        m1.dibujarw(g2, x, y);
                        x+=150;
                        break;
                    }
                    case 'x':{
                        m1.dibujarx1(g2, x, y); 
                        x+=60;
                        break;
                    }
                    case 'y':{
                        m1.dibujary1(g2, x, y);
                        x+=120;
                        break;
                    }
                    case 'z':{
                        m1.dibujarz(g2, x, y);
                        x+=70;
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
