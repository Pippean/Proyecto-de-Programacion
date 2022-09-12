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
    private Simbolos s1;
    private String texto;
    private String color;
    
    public DibujarCanvas(int w, int h, String texto, String color){
        width = w;
        height = h;
        m1 = new Minusculas();
        s1 = new Simbolos();
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
                        m1.dibujara(g2,x,y);
                        x+=90;
                        break;
                    }
                    case 'b':{
                        m1.dibujarb(g2, x, y);
                        x+=60;
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
                        m1.dibujare(g2, x, y);
                        x+=35;
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
                        m1.dibujari(g2, x, y);
                        x+=60;
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
                        m1.dibujarl(g2, x, y);
                        x+=40;
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
                        m1.dibujaro(g2, x, y);
                        x+=90;
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
                        m1.dibujarr(g2, x, y);
                        x+=70;
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
                        m1.dibujaru(g2, x, y);
                        x+=90;
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
                    case '¿':{
                        s1.interrogacionabierto(g2, x, y);
                        x+=45;
                        break;
                    }
                    case '?':{
                        s1.interrogacioncerrado(g2, x, y);
                        x+=55;
                        break;
                    }
                    case '!':{
                        s1.exclamacionabierto(g2, x, y);
                        x+=40;
                        break;
                    }
                    case '¡':{
                        s1.exclamacioncerrado(g2, x, y);
                        x+=40;
                        break;
                    }
                    case '.':{
                        s1.punto(g2, x, y);
                        x+=25;
                        break;
                    }
                    case ',':{
                        s1.coma(g2, x, y);
                        x+=25;
                        break;
                    }
                    case ';':{
                        s1.puntoycoma(g2, x, y);
                        x+=25;
                        break;
                    }
                    case ':':{
                        s1.dospuntos(g2, x, y);
                        x+=25;
                        break;
                    }
                    case '\'':{
                        s1.comillas(g2, x, y);
                        x+=35;
                        break;
                    }
                    case '<':{
                        s1.españolaabierta(g2, x, y);
                        x+=50;
                        break;
                    }
                    case '>':{
                        s1.españolacerrada(g2, x, y);
                        x+=50;
                        break;
                    }
                    case '(':{
                        s1.parentesisabierto(g2, x, y);
                        x+=35;
                        break;
                    }
                    case ')':{
                        s1.parentesiscerrado(g2, x, y);
                        x+=35;
                        break;
                    }
                    case '[':{
                        s1.corchetesabiertos(g2, x, y);
                        x+=35;
                        break;
                    }
                    case ']':{
                        s1.corchetescerrados(g2, x, y);
                        x+=35;
                        break;
                    }
                    case '{':{
                        s1.llavesabiertas(g2, x, y);
                        x+=45;
                        break;
                    }
                    case '}':{
                        s1.llavescerradas(g2, x, y);
                        x+=45;
                        break;
                    }
                    case '-':{
                        x+=25;
                        s1.guion(g2, x, y);
                        x+=25;
                        break;
                    }
                    case '_':{
                        x+=30;
                        s1.guionbajo(g2, x, y);
                        x+=30;
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
