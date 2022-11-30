package com.mycompany.losentussi;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author Pipe, Juano, Lazaro
 */

public class Minusculas {
    
    public Minusculas(){
        
    }
    
    public void dibujara(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY){
        Path2D.Double a = new Path2D.Double();
        int limite = 1;
        int EY =1;
        
        if(EspejoY){
            EY= -1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite; i++){
            if(cursiva == true){
                a.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                a.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((30*EY)+x)*tamaño, (90+y)*tamaño, ((80*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((10*EY)+x)*tamaño, (160+y)*tamaño, ((60*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((70*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                a.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                a.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((20*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((20*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.moveTo(((70*EY)+x)*tamaño, (120+y)*tamaño);
                a.curveTo(((70*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
            }            
            if(subrayado==true){
                a.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                a.lineTo(((90*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                a.moveTo(((45*EY)+x)*tamaño,(90+y)*tamaño);
                a.lineTo(((70*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((45*EY)+x,90+y, 5, 5);
                    g2.fillOval((70*EY)+x,70+y, 5, 5);
                }
            }
            x+=1;
        }
        if (bandera == true){
                g2.fillOval((0*EY)+x, 143+y, 5, 5);
                g2.fillOval((20*EY)+x, 143+y, 5, 5);
                g2.fillOval((20*EY)+x, 130+y, 5, 5);
                g2.fillOval((20*EY)+x, 120+y, 5, 5);
                g2.fillOval((20*EY)+x, 90+y, 5, 5);
                g2.fillOval((70*EY)+x, 90+y, 5, 5);
                g2.fillOval((70*EY)+x, 120+y, 5, 5);
                g2.fillOval((20*EY)+x, 160+y, 5, 5);
                g2.fillOval((70*EY)+x, 160+y, 5, 5);
                g2.fillOval((70*EY)+x, 120+y, 5, 5);
                g2.fillOval((70*EY)+x, 143+y, 5, 5);
                g2.fillOval((90*EY)+x, 143+y, 5, 5);
            }
        g2.draw(a);
    }
    public void dibujaracaso(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double a1 = new Path2D.Double();
        int limite = 1;
        
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                a1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((10*EY)+x)*tamaño, (90+y)*tamaño, ((60*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((-10*EY)+x)*tamaño, (160+y)*tamaño, ((40*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.moveTo(((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((50*EY)+x)*tamaño, (120+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);                
            }
            else{
                a1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((0*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((0*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.moveTo(((50*EY)+x)*tamaño, (120+y)*tamaño);
                a1.curveTo(((50*EY)+x)*tamaño, (120+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }            
            
            if(subrayado==true){
                a1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                a1.lineTo(((70*EY)+x)*tamaño, (153+y)*tamaño);
            }
            
            if(tilde==true){
                a1.moveTo(((25*EY)+x)*tamaño,(85+y)*tamaño);
                a1.lineTo(((45*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((25*EY)+x,85+y, 5, 5);
                    g2.fillOval((45*EY)+x,70+y, 5, 5);
                }
            }
            x+=1;
        }
        if (bandera == true){
            g2.fillOval((0*EY)+x, 120+y, 5, 5);
            g2.fillOval((0*EY)+x, 90+y, 5, 5);
            g2.fillOval((50*EY)+x, 90+y, 5, 5);
            g2.fillOval((50*EY)+x, 120+y, 5, 5);
            g2.fillOval((0*EY)+x, 160+y, 5, 5);
            g2.fillOval((50*EY)+x, 160+y, 5, 5);
            g2.fillOval((50*EY)+x, 120+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
            g2.fillOval((70*EY)+x, 143+y, 5, 5);
        }
        
        g2.draw(a1);
    }
    
    public void dibujarb(Graphics2D g2,int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY){
        Path2D.Double b = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            
            if (cursiva==true) {
                b.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                b.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((35*EY)+x)*tamaño, (50+y)*tamaño,((35*EY)+x)*tamaño , (40+y)*tamaño);
                b.moveTo(((18*EY)+x)*tamaño,(143+y)*tamaño);
                b.curveTo(((18*EY)+x)*tamaño,(143+y)*tamaño, ((20*EY)+x)*tamaño,(45+y)*tamaño, ((35*EY)+x)*tamaño, (40+y)*tamaño);
                b.moveTo(((18*EY)+x)*tamaño, (143+y)*tamaño);
                b.curveTo(((18*EY)+x)*tamaño, (143+y)*tamaño, ((65*EY)+x)*tamaño, (90+y)*tamaño,((25*EY)+x)*tamaño , (100+y)*tamaño);
                b.moveTo(((25*EY)+x)*tamaño, (100+y)*tamaño);
                b.curveTo(((40*EY)+x)*tamaño,(100+y)*tamaño,((45*EY)+x)*tamaño, (115+y)*tamaño,((55*EY)+x)*tamaño, (110+y)*tamaño);
            }
            else{
                b.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                b.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((25*EY)+x)*tamaño, (50+y)*tamaño,((15*EY)+x)*tamaño , (40+y)*tamaño);
                b.moveTo(((13*EY)+x)*tamaño,(143+y)*tamaño);
                b.curveTo(((13*EY)+x)*tamaño,(143+y)*tamaño, ((10*EY)+x)*tamaño,(45+y)*tamaño, ((15*EY)+x)*tamaño, (40+y)*tamaño);
                b.moveTo(((13*EY)+x)*tamaño, (143+y)*tamaño);
                b.curveTo(((13*EY)+x)*tamaño, (143+y)*tamaño, ((60*EY)+x)*tamaño, (90+y)*tamaño,((20*EY)+x)*tamaño , (100+y)*tamaño);
                b.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                b.curveTo(((35*EY)+x)*tamaño,(100+y)*tamaño,((40*EY)+x)*tamaño, (115+y)*tamaño,((50*EY)+x)*tamaño, (110+y)*tamaño);
            }
            
            if(subrayado==true){
                b.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                b.lineTo(((50*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 143+y, 5, 5);
            g2.fillOval((25*EY)+x, 50+y, 5, 5);
            g2.fillOval((15*EY)+x, 40+y, 5, 5);
            g2.fillOval((13*EY)+x, 143+y, 5, 5);
            g2.fillOval((10*EY)+x, 45+y, 5, 5);
            g2.fillOval((60*EY)+x, 90+y, 5, 5);
            g2.fillOval((20*EY)+x, 100+y, 5, 5);
            g2.fillOval((35*EY)+x, 100+y, 5, 5);
            g2.fillOval((40*EY)+x, 115+y, 5, 5);
            g2.fillOval((50*EY)+x, 110+y, 5, 5);
        }
        g2.draw(b);
    }

    public void dibujarc(Graphics2D g2,int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY){
        Path2D.Double c = new Path2D.Double();
        int limite = 1;
        
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                c.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                c.curveTo(((30*EY)+x)*tamaño,(140+y)*tamaño,((5*EY)+x)*tamaño,(85+y)*tamaño, ((60*EY)+x)*tamaño, (95+y)*tamaño);
                c.moveTo(((29*EY)+x)*tamaño,(100+y)*tamaño);
                c.curveTo(((10*EY)+x)*tamaño, (115+y)*tamaño,((20*EY)+x)*tamaño,(148+y)*tamaño,((68*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                c.moveTo(((29*EY)+x)*tamaño,(100+y)*tamaño);
                c.curveTo(((10*EY)+x)*tamaño, (115+y)*tamaño,((20*EY)+x)*tamaño,(148+y)*tamaño,((68*EY)+x)*tamaño,(143+y)*tamaño);
                c.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                c.curveTo(((30*EY)+x)*tamaño,(140+y)*tamaño,((5*EY)+x)*tamaño,(85+y)*tamaño, ((60*EY)+x)*tamaño, (95+y)*tamaño);
            }
            
           
           if(subrayado==true){
                c.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                c.lineTo(((68*EY)+x)*tamaño, (153+y)*tamaño);
           }
           x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((29*EY)+x, 100+y, 5, 5);
            g2.fillOval((10*EY)+x, 115+y, 5, 5);
            g2.fillOval((20*EY)+x, 148+y, 5, 5);
            g2.fillOval((68*EY)+x, 143+y, 5, 5);
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 140+y, 5, 5);
            g2.fillOval((5*EY)+x, 85+y, 5, 5);
            g2.fillOval((60*EY)+x, 95+y, 5, 5);
        }
        g2.draw(c);
    }

    public void dibujard(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY){
        Path2D.Double d = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            
            if (cursiva==true) {
                d.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                d.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                d.moveTo(((20*EY)+x)*tamaño, (125+y)*tamaño);
                d.curveTo(((25*EY)+x)*tamaño, (95+y)*tamaño,((65*EY)+x)*tamaño, (95+y)*tamaño, ((60*EY)+x)*tamaño, (125+y)*tamaño);
                d.moveTo(((20*EY)+x)*tamaño, (125+y)*tamaño);
                d.curveTo(((15*EY)+x)*tamaño, (155+y)*tamaño, ((55*EY)+x)*tamaño, (155+y)*tamaño, ((60*EY)+x)*tamaño, (125+y)*tamaño);
                d.moveTo(((80*EY)+x)*tamaño, (55+y)*tamaño);
                d.curveTo(((70*EY)+x)*tamaño, (55+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                d.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                d.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                d.moveTo(((20*EY)+x)*tamaño, (125+y)*tamaño);
                d.curveTo(((20*EY)+x)*tamaño, (95+y)*tamaño, ((60*EY)+x)*tamaño, (95+y)*tamaño, ((60*EY)+x)*tamaño, (125+y)*tamaño);
                d.moveTo(((20*EY)+x)*tamaño, (125+y)*tamaño);
                d.curveTo(((20*EY)+x)*tamaño, (155+y)*tamaño, ((60*EY)+x)*tamaño, (155+y)*tamaño, ((60*EY)+x)*tamaño, (125+y)*tamaño);
                d.moveTo(((60*EY)+x)*tamaño, (55+y)*tamaño);
                d.curveTo(((60*EY)+x)*tamaño, (55+y)*tamaño, ((55*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                d.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                d.lineTo(((70*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((20*EY)+x, 143+y, 5, 5);
            g2.fillOval((20*EY)+x, 130+y, 5, 5);
            g2.fillOval((20*EY)+x, 120+y, 5, 5);
            g2.fillOval((20*EY)+x, 125+y, 5, 5);
            g2.fillOval((20*EY)+x, 95+y, 5, 5);
            g2.fillOval((60*EY)+x, 95+y, 5, 5);
            g2.fillOval((60*EY)+x, 125+y, 5, 5);
            g2.fillOval((20*EY)+x, 155+y, 5, 5);
            g2.fillOval((60*EY)+x, 155+y, 5, 5);
            g2.fillOval((60*EY)+x, 55+y, 5, 5);
            g2.fillOval((55*EY)+x, 143+y, 5, 5);
            g2.fillOval((70*EY)+x, 143+y, 5, 5);  
        }
        g2.draw(d);
    }

    public void dibujare(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY){
        Path2D.Double e = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            
            if (cursiva==true) {                
                e.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                e.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((45*EY)+x)*tamaño,(105+y)*tamaño,((40*EY)+x)*tamaño, (95+y)*tamaño);
                e.moveTo(((35*EY)+x)*tamaño,(143+y)*tamaño);
                e.curveTo(((10*EY)+x)*tamaño,(143+y)*tamaño, ((20*EY)+x)*tamaño,(90+y)*tamaño, ((40*EY)+x)*tamaño, (95+y)*tamaño);
            }
            else{
                e.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                e.curveTo(((25*EY)+x)*tamaño, (143+y)*tamaño, ((25*EY)+x)*tamaño,(100+y)*tamaño,((15*EY)+x)*tamaño, (90+y)*tamaño);
                e.moveTo(((35*EY)+x)*tamaño,(143+y)*tamaño);
                e.curveTo(((10*EY)+x)*tamaño,(143+y)*tamaño, ((5*EY)+x)*tamaño,(90+y)*tamaño, ((15*EY)+x)*tamaño, (90+y)*tamaño);
            }
            
            if(subrayado==true){
                e.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                e.lineTo(((35*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde== true){
                e.moveTo(((15*EY)+x)*tamaño,(85+y)*tamaño);
                e.lineTo(((30*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((15*EY)+x, 85+y, 5, 5);
                    g2.fillOval((30*EY)+x, 70+y, 5, 5);
                    if(bandera==true){
                        g2.fillOval((15*EY)+x, 85+y, 5, 5);
                        g2.fillOval((30*EY)+x,70+ y, 5, 5);
                    }
                }
            }
            x+=1;        
        }
        if (bandera == true){
                g2.fillOval((0*EY)+x, 143+y, 5, 5);
                g2.fillOval((25*EY)+x, 143+y, 5, 5);
                g2.fillOval((25*EY)+x, 100+y, 5, 5);
                g2.fillOval((15*EY)+x, 90+y, 5, 5);
                g2.fillOval((35*EY)+x, 143+y, 5, 5);
                g2.fillOval((10*EY)+x, 143+y, 5, 5);
                g2.fillOval((5*EY)+x, 90+y, 5, 5);
                g2.fillOval((15*EY)+x, 90+y, 5, 5);
            }
        
        g2.draw(e); 
    }
    
    public void dibujarecaso(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double e1 = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                e1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                e1.curveTo(((0*EY)+x)*tamaño,(110+y)*tamaño,((25*EY)+x)*tamaño,(90+y)*tamaño,((20*EY)+x)*tamaño,(80+y)*tamaño);
                e1.moveTo(((20*EY)+x)*tamaño,(80+y)*tamaño);
                e1.curveTo(((0*EY)+x)*tamaño,(60+y)*tamaño,((15*EY)+x)*tamaño,(143+y)*tamaño,((25*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                e1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                e1.curveTo(((0*EY)+x)*tamaño,(110+y)*tamaño,((25*EY)+x)*tamaño,(90+y)*tamaño,((20*EY)+x)*tamaño,(80+y)*tamaño);
                e1.moveTo(((20*EY)+x)*tamaño,(80+y)*tamaño);
                e1.curveTo(((0*EY)+x)*tamaño,(60+y)*tamaño,((15*EY)+x)*tamaño,(143+y)*tamaño,((25*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
           if(subrayado==true){
                e1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                e1.lineTo(((25*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                e1.moveTo(((20*EY)+x)*tamaño, (70+y)*tamaño);
                e1.lineTo(((35*EY)+x)*tamaño,(50+y)*tamaño);
                if(bandera==true){
                    g2.fillOval((20*EY)+x, 70+y, 5, 5);
                    g2.fillOval((35*EY)+x, 50+y, 5, 5);
                }
            }
            x+=1;
        }
         if (bandera == true){
                g2.fillOval((0*EY)+x, 110+y, 5, 5);
                g2.fillOval((25*EY)+x, 90+y, 5, 5);
                g2.fillOval((20*EY)+x, 80+y, 5, 5);
                g2.fillOval((0*EY)+x, 60+y, 5, 5);
                g2.fillOval((15*EY)+x, 143+y, 5, 5);
                g2.fillOval((25*EY)+x, 143+y, 5, 5);
            }
         
        g2.draw(e1); 
    }
    
    public void dibujarf(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double f = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            
            if (cursiva==true) {
                f.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                f.curveTo(((25*EY)+x)*tamaño, (143+y)*tamaño, ((35*EY)+x)*tamaño, (50+y)*tamaño,((25*EY)+x)*tamaño , (60+y)*tamaño);
                f.moveTo(((5*EY)+x)*tamaño,(170+y)*tamaño);
                f.curveTo(((0*EY)+x)*tamaño,(143+y)*tamaño, ((25*EY)+x)*tamaño,(45+y)*tamaño, ((25*EY)+x)*tamaño, (60+y)*tamaño);
                f.moveTo(((5*EY)+x)*tamaño,(170+y)*tamaño);
                f.curveTo(((25*EY)+x)*tamaño,(150+y)*tamaño,((25*EY)+x)*tamaño,(130+y)*tamaño,((10*EY)+x)*tamaño,(120+y)*tamaño);
                f.moveTo(((8*EY)+x)*tamaño,(130+y)*tamaño);
                f.curveTo(((20*EY)+x)*tamaño,(140+y)*tamaño, ((40*EY)+x)*tamaño, (145+y)*tamaño, ((45*EY)+x)*tamaño,(143+y)*tamaño); 
            }
            else{
                f.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                f.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((25*EY)+x)*tamaño, (50+y)*tamaño,((15*EY)+x)*tamaño , (60+y)*tamaño);
                f.moveTo(((15*EY)+x)*tamaño,(170+y)*tamaño);
                f.curveTo(((10*EY)+x)*tamaño,(143+y)*tamaño, ((15*EY)+x)*tamaño,(45+y)*tamaño, ((17*EY)+x)*tamaño, (60+y)*tamaño);
                f.moveTo(((15*EY)+x)*tamaño,(170+y)*tamaño);
                f.curveTo(((40*EY)+x)*tamaño,(150+y)*tamaño,((30*EY)+x)*tamaño,(130+y)*tamaño,((13*EY)+x)*tamaño,(120+y)*tamaño);
                f.moveTo(((13*EY)+x)*tamaño,(130+y)*tamaño);
                f.curveTo(((20*EY)+x)*tamaño,(140+y)*tamaño, ((40*EY)+x)*tamaño, (145+y)*tamaño, ((50*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                f.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                f.lineTo(((50*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 143+y, 5, 5);
            g2.fillOval((25*EY)+x, 50+y, 5, 5);
            g2.fillOval((15*EY)+x, 60+y, 5, 5);
            g2.fillOval((15*EY)+x, 170+y, 5, 5);
            g2.fillOval((10*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 45+y, 5, 5);
            g2.fillOval((17*EY)+x, 60+y, 5, 5);
            g2.fillOval((40*EY)+x, 150+y, 5, 5);
            g2.fillOval((30*EY)+x, 130+y, 5, 5);
            g2.fillOval((13*EY)+x, 130+y, 5, 5);
            g2.fillOval((20*EY)+x, 140+y, 5, 5);
            g2.fillOval((40*EY)+x, 145+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
        }
        g2.draw(f);
    }
    
    public void dibujarg(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double g1 = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((20*EY)+x)*tamaño,(90+y)*tamaño,((60*EY)+x)*tamaño,(90+y)*tamaño,((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((0*EY)+x)*tamaño,(150+y)*tamaño,((40*EY)+x)*tamaño,(150+y)*tamaño,((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((10*EY)+x)*tamaño,(130+y)*tamaño,((0*EY)+x)*tamaño,(145+y)*tamaño,((0*EY)+x)*tamaño,(143+y)*tamaño);
                g1.moveTo(((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((40*EY)+x)*tamaño,(120+y)*tamaño,((35*EY)+x)*tamaño,(220+y)*tamaño,((10*EY)+x)*tamaño,(200+y)*tamaño);
                g1.moveTo(((10*EY)+x)*tamaño,(200+y)*tamaño);
                g1.curveTo(((0*EY)+x)*tamaño,(180+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((10*EY)+x)*tamaño,(90+y)*tamaño,((50*EY)+x)*tamaño,(90+y)*tamaño,((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((10*EY)+x)*tamaño,(150+y)*tamaño,((50*EY)+x)*tamaño,(150+y)*tamaño,((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.moveTo(((10*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((10*EY)+x)*tamaño,(130+y)*tamaño,((0*EY)+x)*tamaño,(145+y)*tamaño,((0*EY)+x)*tamaño,(143+y)*tamaño);
                g1.moveTo(((50*EY)+x)*tamaño,(120+y)*tamaño);
                g1.curveTo(((50*EY)+x)*tamaño,(120+y)*tamaño,((45*EY)+x)*tamaño,(220+y)*tamaño,((20*EY)+x)*tamaño,(200+y)*tamaño);
                g1.moveTo(((20*EY)+x)*tamaño,(200+y)*tamaño);
                g1.curveTo(((10*EY)+x)*tamaño,(180+y)*tamaño,((70*EY)+x)*tamaño,(143+y)*tamaño,((70*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            
            if(subrayado==true){
                g1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                g1.lineTo(((70*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((10*EY)+x, 120+y, 5, 5);
            g2.fillOval((10*EY)+x, 90+y, 5, 5);
            g2.fillOval((50*EY)+x, 90+y, 5, 5);
            g2.fillOval((50*EY)+x, 120+y, 5, 5);
            g2.fillOval((10*EY)+x, 120+y, 5, 5);
            g2.fillOval((10*EY)+x, 150+y, 5, 5);
            g2.fillOval((50*EY)+x, 150+y, 5, 5);
            g2.fillOval((50*EY)+x, 120+y, 5, 5);
            g2.fillOval((10*EY)+x, 130+y, 5, 5);
            g2.fillOval((0*EY)+x, 145+y, 5, 5);
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((45*EY)+x, 220+y, 5, 5);
            g2.fillOval((20*EY)+x, 200+y, 5, 5);
            g2.fillOval((10*EY)+x, 180+y, 5, 5);
            g2.fillOval((70*EY)+x, 143+y, 5, 5);
        }
        g2.draw(g1);
    }
    
    public void dibujarh(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double h = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                h.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                h.curveTo(((10*EY)+x)*tamaño,(135+y)*tamaño,((25*EY)+x)*tamaño,(60+y)*tamaño,((25*EY)+x)*tamaño,(50+y)*tamaño);
                h.moveTo(((25*EY)+x)*tamaño,(50+y)*tamaño);
                h.curveTo(((10*EY)+x)*tamaño,(60+y)*tamaño,((10*EY)+x)*tamaño,(135+y)*tamaño,((10*EY)+x)*tamaño,(143+y)*tamaño);
                h.moveTo(((8*EY)+x)*tamaño,(110+y)*tamaño);
                h.curveTo(((50*EY)+x)*tamaño,(100+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                h.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                h.curveTo(((5*EY)+x)*tamaño,(135+y)*tamaño,((20*EY)+x)*tamaño,(60+y)*tamaño,((10*EY)+x)*tamaño,(50+y)*tamaño);
                h.moveTo(((10*EY)+x)*tamaño,(50+y)*tamaño);
                h.curveTo(((0*EY)+x)*tamaño,(60+y)*tamaño,((10*EY)+x)*tamaño,(135+y)*tamaño,((10*EY)+x)*tamaño,(143+y)*tamaño);
                h.moveTo(((8*EY)+x)*tamaño,(110+y)*tamaño);
                h.curveTo(((50*EY)+x)*tamaño,(100+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            
            if(subrayado==true){
                h.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                h.lineTo(((60*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((5*EY)+x, 135+y, 5, 5);
            g2.fillOval((20*EY)+x, 60+y, 5, 5);
            g2.fillOval((10*EY)+x, 50+y, 5, 5);
            g2.fillOval((0*EY)+x, 60+y, 5, 5);
            g2.fillOval((10*EY)+x, 135+y, 5, 5);
            g2.fillOval((10*EY)+x, 143+y, 5, 5);
            g2.fillOval((8*EY)+x, 110+y, 5, 5);
            g2.fillOval((50*EY)+x, 100+y, 5, 5);
            g2.fillOval((20*EY)+x, 143+y, 5, 5);
            g2.fillOval((60*EY)+x, 143+y, 5, 5);
        }
        g2.draw(h);
    }
        
    public void dibujari(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double i = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i1 = 0; i1<limite;i1++){
            if (cursiva==true) {
                i.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                i.curveTo(((0*EY)+x)*tamaño,(143+y)*tamaño,((30*EY)+x)*tamaño,(115+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                i.moveTo(((30*EY)+x)*tamaño,(100+y)*tamaño);
                i.curveTo(((30*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
                g2.fillOval((30*EY)+x,70+y,10,10);
            }
            else{
                i.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                i.curveTo(((0*EY)+x)*tamaño,(143+y)*tamaño,((25*EY)+x)*tamaño,(143+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                i.moveTo(((30*EY)+x)*tamaño,(100+y)*tamaño);
                i.curveTo(((30*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
                g2.fillOval((25*EY)+x,70+y,10,10);
            }
            
            if(subrayado==true){
                i.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                i.lineTo(((60*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((25*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 100+y, 5, 5);
            g2.fillOval((30*EY)+x, 143+y, 5, 5);
            g2.fillOval((60*EY)+x, 143+y, 5, 5);
        }
        if(tilde==true){
            i.moveTo(((30*EY)+x)*tamaño,(90+y)*tamaño);
            i.lineTo(((50*EY)+x)*tamaño,(70+y)*tamaño);
            if(bandera==true){
                g2.fillOval((30*EY)+x,90+ y, 5, 5);
                g2.fillOval((50*EY)+x, 70+y, 5, 5);
            }
        }
        else{
        
        }
        g2.draw(i);
    }
    
    public void dibujaricaso(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double i1 = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                i1.moveTo(((0*EY)+x)*tamaño, (110+y)*tamaño);
                i1.curveTo(((5*EY)+x)*tamaño,(110+y)*tamaño,((20*EY)+x)*tamaño,(90+y)*tamaño,((20*EY)+x)*tamaño,(80+y)*tamaño);
                i1.moveTo(((20*EY)+x)*tamaño,(80+y)*tamaño);
                i1.curveTo(((20*EY)+x)*tamaño,(80+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño,((30*EY)+x)*tamaño,(143+y)*tamaño);                
            }
            else{
                i1.moveTo(((0*EY)+x)*tamaño, (110+y)*tamaño);
                i1.curveTo(((5*EY)+x)*tamaño,(110+y)*tamaño,((20*EY)+x)*tamaño,(90+y)*tamaño,((20*EY)+x)*tamaño,(80+y)*tamaño);
                i1.moveTo(((20*EY)+x)*tamaño,(80+y)*tamaño);
                i1.curveTo(((20*EY)+x)*tamaño,(80+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño,((30*EY)+x)*tamaño,(143+y)*tamaño); 
            }
               
            if(subrayado==true){
                i1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                i1.lineTo(((30*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 110+y, 5, 5);
            g2.fillOval((5*EY)+x, 110+y, 5, 5);
            g2.fillOval((20*EY)+x, 90+y, 5, 5);
            g2.fillOval((20*EY)+x, 80+y, 5, 5);
            g2.fillOval((20*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 143+y, 5, 5);
        }
        if(tilde==true){
            i1.moveTo(((20*EY)+x)*tamaño,(75+y)*tamaño);
            i1.lineTo(((35*EY)+x)*tamaño,(55+y)*tamaño);
            if(bandera==true){
                g2.fillOval((20*EY)+x, 75+y, 5, 5);
                g2.fillOval((35*EY)+x, 55+y, 5, 5);
            }
        }
        else{
            g2.fillOval((15*EY)+x,65+y,10,10);   
        }
        g2.draw(i1);  
    }
    
    public void dibujarj(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double j = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                j.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                j.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((40*EY)+x)*tamaño, (110+y)*tamaño, ((40*EY)+x)*tamaño, (100+y)*tamaño);
                j.moveTo(((40*EY)+x)*tamaño, (100+y)*tamaño);
                j.curveTo(((40*EY)+x)*tamaño, (100+y)*tamaño, ((40*EY)+x)*tamaño, (180+y)*tamaño, ((15*EY)+x)*tamaño, (180+y)*tamaño);
                j.moveTo(((15*EY)+x)*tamaño, (180+y)*tamaño);
                j.curveTo(((0*EY)+x)*tamaño, (185+y)*tamaño, ((-15*EY)+x)*tamaño, (180+y)*tamaño, ((10*EY)+x)*tamaño, (160+y)*tamaño);
                j.moveTo(((10*EY)+x)*tamaño, (160+y)*tamaño);
                j.curveTo(((10*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (140+y)*tamaño, ((60*EY)+x)*tamaño, (143+y)*tamaño);
                g2.fillOval((40*EY)+x,80+y,10,10);
            }
            else{
                j.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                j.curveTo(((30*EY)+x)*tamaño, (143+y)*tamaño, ((30*EY)+x)*tamaño, (110+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                j.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                j.curveTo(((30*EY)+x)*tamaño, (100+y)*tamaño, ((40*EY)+x)*tamaño, (180+y)*tamaño, ((15*EY)+x)*tamaño, (180+y)*tamaño);
                j.moveTo(((15*EY)+x)*tamaño, (180+y)*tamaño);
                j.curveTo(((0*EY)+x)*tamaño, (185+y)*tamaño, ((-15*EY)+x)*tamaño, (180+y)*tamaño, ((10*EY)+x)*tamaño, (160+y)*tamaño);
                j.moveTo(((10*EY)+x)*tamaño, (160+y)*tamaño);
                j.curveTo(((10*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (140+y)*tamaño, ((60*EY)+x)*tamaño, (143+y)*tamaño);
                g2.fillOval((25*EY)+x,80+y,10,10);
            }
            
            if(subrayado==true){
                j.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                j.lineTo(((60*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 110+y, 5, 5);
            g2.fillOval((30*EY)+x, 100+y, 5, 5);
            g2.fillOval((40*EY)+x, 180+y, 5, 5);
            g2.fillOval((15*EY)+x, 180+y, 5, 5);
            g2.fillOval((0*EY)+x, 185+y, 5, 5);
            g2.fillOval((-15*EY)+x, 180+y, 5, 5);
            g2.fillOval((10*EY)+x, 160+y, 5, 5);
            g2.fillOval((50*EY)+x, 140+y, 5, 5);
            g2.fillOval((60*EY)+x, 143+y, 5, 5);
        }
        
        g2.draw(j);  
    }
    
    public void dibujark(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double k = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                k.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                k.curveTo(((110*EY)+x)*tamaño, (90+y)*tamaño, ((30*EY)+x)*tamaño, (-25+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                k.moveTo(((43*EY)+x)*tamaño, (100+y)*tamaño);
                k.curveTo(((50*EY)+x)*tamaño, (90+y)*tamaño, ((90*EY)+x)*tamaño, (120+y)*tamaño, ((45*EY)+x)*tamaño, (120+y)*tamaño);
                k.moveTo(((55*EY)+x)*tamaño, (120+y)*tamaño);
                k.curveTo(((60*EY)+x)*tamaño, (120+y)*tamaño, ((80*EY)+x)*tamaño, (150+y)*tamaño, ((80*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{                               
                k.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                k.curveTo(((100*EY)+x)*tamaño, (90+y)*tamaño, ((20*EY)+x)*tamaño, (-25+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                k.moveTo(((43*EY)+x)*tamaño, (100+y)*tamaño);
                k.curveTo(((50*EY)+x)*tamaño, (90+y)*tamaño, ((90*EY)+x)*tamaño, (120+y)*tamaño, ((45*EY)+x)*tamaño, (120+y)*tamaño);
                k.moveTo(((45*EY)+x)*tamaño, (120+y)*tamaño);
                k.curveTo(((50*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño, (150+y)*tamaño, ((80*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                k.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                k.lineTo(((100*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((100*EY)+x, 90+y, 5, 5);
            g2.fillOval((2*EY)+x, -25+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
            g2.fillOval((43*EY)+x, 100+y, 5, 5);
            g2.fillOval((70*EY)+x, 40+y, 5, 5);
            g2.fillOval((80*EY)+x, 55+y, 5, 5);
            g2.fillOval((50*EY)+x, 100+y, 5, 5);
            g2.fillOval((70*EY)+x, 115+y, 5, 5);
            g2.fillOval((70*EY)+x, 120+y, 5, 5);
            g2.fillOval((78*EY)+x, 127+y, 5, 5);
            g2.fillOval((80*EY)+x, 155+y, 5, 5);
            g2.fillOval((100*EY)+x, 143+y, 5, 5);
        }
        g2.draw(k);
    }
    
    public void dibujarl(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double l = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                l.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                l.curveTo(((45*EY)+x)*tamaño, (143+y)*tamaño, ((55*EY)+x)*tamaño, (40+y)*tamaño, ((35*EY)+x)*tamaño, (55+y)*tamaño);
                l.moveTo(((35*EY)+x)*tamaño, (55+y)*tamaño);
                l.curveTo(((20*EY)+x)*tamaño, (60+y)*tamaño, ((30*EY)+x)*tamaño, (143+y)*tamaño, ((40*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                l.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                l.curveTo(((30*EY)+x)*tamaño, (143+y)*tamaño, ((40*EY)+x)*tamaño, (40+y)*tamaño, ((20*EY)+x)*tamaño, (55+y)*tamaño);
                l.moveTo(((20*EY)+x)*tamaño, (55+y)*tamaño);
                l.curveTo(((5*EY)+x)*tamaño, (60+y)*tamaño, ((20*EY)+x)*tamaño, (143+y)*tamaño, ((40*EY)+x)*tamaño, (143+y)*tamaño);
            }
             
            if(subrayado==true){
                l.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                l.lineTo(((40*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 143+y, 5, 5);
            g2.fillOval((40*EY)+x, 40+y, 5, 5);
            g2.fillOval((20*EY)+x, 55+y, 5, 5);
            g2.fillOval((5*EY)+x,60+y, 5, 5);
            g2.fillOval((20*EY)+x, 143+y, 5, 5);
            g2.fillOval((40*EY)+x, 143+y, 5, 5);
        }
        g2.draw(l);
    }
    
    public void dibujarlcaso(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double l1 = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                l1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                l1.curveTo(((5*EY)+x)*tamaño,(110+y)*tamaño,((30*EY)+x)*tamaño,(60+y)*tamaño,((25*EY)+x)*tamaño,(50+y)*tamaño);
                l1.curveTo(((10*EY)+x)*tamaño,(30+y)*tamaño,((10*EY)+x)*tamaño,(143+y)*tamaño,((30*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                l1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                l1.curveTo(((5*EY)+x)*tamaño,(110+y)*tamaño,((30*EY)+x)*tamaño,(60+y)*tamaño,((25*EY)+x)*tamaño,(50+y)*tamaño);
                l1.curveTo(((10*EY)+x)*tamaño,(30+y)*tamaño,((10*EY)+x)*tamaño,(143+y)*tamaño,((30*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                l1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                l1.lineTo(((30*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 110+y, 5, 5);
            g2.fillOval((5*EY)+x, 110+y, 5, 5);
            g2.fillOval((25*EY)+x, 50+y, 5, 5);
            g2.fillOval((10*EY)+x, 30+y, 5, 5);
            g2.fillOval((10*EY)+x, 143+y, 5, 5);
            g2.fillOval((30*EY)+x, 143+y, 5, 5);
        }
        g2.draw(l1);
    }

    public void dibujarm(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double m = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                m.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((5*EY)+x)*tamaño, (143+y)*tamaño, ((10*EY)+x)*tamaño, (105+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                m.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                m.curveTo(((70*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                m.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((60*EY)+x)*tamaño, (80+y)*tamaño, ((100*EY)+x)*tamaño, (80+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
                m.moveTo(((90*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((90*EY)+x)*tamaño, (80+y)*tamaño, ((130*EY)+x)*tamaño, (90+y)*tamaño, ((130*EY)+x)*tamaño, (130+y)*tamaño);
                m.moveTo(((130*EY)+x)*tamaño, (130+y)*tamaño);
                m.curveTo(((130*EY)+x)*tamaño, (150+y)*tamaño, ((150*EY)+x)*tamaño, (143+y)*tamaño, ((155*EY)+x)*tamaño, (143+y)*tamaño); 
            }
            else{
                m.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((5*EY)+x)*tamaño, (105+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                m.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                m.curveTo(((60*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                m.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((50*EY)+x)*tamaño, (80+y)*tamaño, ((90*EY)+x)*tamaño, (80+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
                m.moveTo(((90*EY)+x)*tamaño, (143+y)*tamaño);
                m.curveTo(((90*EY)+x)*tamaño, (80+y)*tamaño, ((130*EY)+x)*tamaño, (90+y)*tamaño, ((130*EY)+x)*tamaño, (130+y)*tamaño);
                m.moveTo(((130*EY)+x)*tamaño, (130+y)*tamaño);
                m.curveTo(((130*EY)+x)*tamaño, (150+y)*tamaño, ((150*EY)+x)*tamaño, (143+y)*tamaño, ((155*EY)+x)*tamaño, (143+y)*tamaño); 
            }
            
            if(subrayado==true){
                m.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                m.lineTo(((155*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 143+y, 5, 5);
            g2.fillOval((5*EY)+x, 105+y, 5, 5);
            g2.fillOval((20*EY)+x, 100+y, 5, 5);
            g2.fillOval((60*EY)+x, 100+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
            g2.fillOval((50*EY)+x, 80+y, 5, 5);
            g2.fillOval((90*EY)+x, 80+y, 5, 5);
            g2.fillOval((90*EY)+x, 143+y, 5, 5);
            g2.fillOval((130*EY)+x, 90+y, 5, 5);
            g2.fillOval((130*EY)+x, 130+y, 5, 5);
            g2.fillOval((130*EY)+x, 150+y, 5, 5);
            g2.fillOval((150*EY)+x, 143+y, 5, 5);
            g2.fillOval((155*EY)+x, 143+y, 5, 5);
        }
        g2.draw(m);
    }
    
    public void dibujarn(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double n = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                n.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                n.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((10*EY)+x)*tamaño, (110+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                n.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                n.curveTo(((70*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (165+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                n.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                n.curveTo(((50*EY)+x)*tamaño, (143+y)*tamaño, ((50*EY)+x)*tamaño, (100+y)*tamaño, ((70*EY)+x)*tamaño, (100+y)*tamaño);
                n.moveTo(((70*EY)+x)*tamaño, (100+y)*tamaño);
                n.curveTo(((105*EY)+x)*tamaño, (100+y)*tamaño, ((80*EY)+x)*tamaño, (143+y)*tamaño, ((95*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                n.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                n.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((5*EY)+x)*tamaño, (110+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                n.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                n.curveTo(((60*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (165+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                n.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                n.curveTo(((50*EY)+x)*tamaño, (143+y)*tamaño, ((40*EY)+x)*tamaño, (100+y)*tamaño, ((70*EY)+x)*tamaño, (100+y)*tamaño);
                n.moveTo(((70*EY)+x)*tamaño, (100+y)*tamaño);
                n.curveTo(((95*EY)+x)*tamaño, (100+y)*tamaño, ((80*EY)+x)*tamaño, (143+y)*tamaño, ((95*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                n.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                n.lineTo(((95*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 143+y, 5, 5);
            g2.fillOval((5*EY)+x, 110+y, 5, 5);
            g2.fillOval((20*EY)+x, 100+y, 5, 5);
            g2.fillOval((60*EY)+x, 100+y, 5, 5);
            g2.fillOval((50*EY)+x, 165+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
            g2.fillOval((40*EY)+x, 100+y, 5, 5);
            g2.fillOval((70*EY)+x, 100+y, 5, 5);
            g2.fillOval((95*EY)+x, 100+y, 5, 5);
            g2.fillOval((80*EY)+x, 143+y, 5, 5);
            g2.fillOval((95*EY)+x, 143+y, 5, 5);
        }
        g2.draw(n);
    }
    
    public void dibujarñ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double ñ = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                ñ.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((10*EY)+x)*tamaño, (110+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.curveTo(((70*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (165+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.curveTo(((50*EY)+x)*tamaño, (143+y)*tamaño, ((50*EY)+x)*tamaño, (100+y)*tamaño, ((70*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.moveTo(((70*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.curveTo(((105*EY)+x)*tamaño, (100+y)*tamaño, ((80*EY)+x)*tamaño, (143+y)*tamaño, ((95*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.moveTo(((10*EY)+x)*tamaño, (80+y)*tamaño);
                ñ.curveTo(((40*EY)+x)*tamaño, (40+y)*tamaño, ((60*EY)+x)*tamaño, (100+y)*tamaño, ((90*EY)+x)*tamaño, (70+y)*tamaño);
            }
            else{
                ñ.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((5*EY)+x)*tamaño, (110+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                ñ.curveTo(((60*EY)+x)*tamaño, (100+y)*tamaño, ((50*EY)+x)*tamaño, (173+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.moveTo(((50*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.curveTo(((50*EY)+x)*tamaño, (80+y)*tamaño, ((90*EY)+x)*tamaño, (80+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.moveTo(((90*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.curveTo(((90*EY)+x)*tamaño, (150+y)*tamaño, ((100*EY)+x)*tamaño, (143+y)*tamaño, ((100*EY)+x)*tamaño, (143+y)*tamaño);
                ñ.moveTo(((10*EY)+x)*tamaño, (80+y)*tamaño);
                ñ.curveTo(((40*EY)+x)*tamaño, (40+y)*tamaño, ((60*EY)+x)*tamaño, (100+y)*tamaño, ((90*EY)+x)*tamaño, (70+y)*tamaño);
            }
            
            if(subrayado==true){
                ñ.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                ñ.lineTo(((10*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
       
        if (bandera == true){
            g2.fillOval((0*EY)+x, 143+y, 5, 5);
            g2.fillOval((15*EY)+x, 143+y, 5, 5);
            g2.fillOval((5*EY)+x, 110+y, 5, 5);
            g2.fillOval((20*EY)+x, 100+y, 5, 5);
            g2.fillOval((60*EY)+x, 100+y, 5, 5);
            g2.fillOval((50*EY)+x, 173+y, 5, 5);
            g2.fillOval((50*EY)+x, 143+y, 5, 5);
            g2.fillOval((50*EY)+x, 80+y, 5, 5);
            g2.fillOval((90*EY)+x, 80+y, 5, 5);
            g2.fillOval((90*EY)+x, 143+y, 5, 5);
            g2.fillOval((90*EY)+x, 150+y, 5, 5);
            g2.fillOval((100*EY)+x, 143+y, 5, 5);
            g2.fillOval((10*EY)+x, 80+y, 5, 5);
            g2.fillOval((40*EY)+x, 40+y, 5, 5);
            g2.fillOval((60*EY)+x, 100+y, 5, 5);
            g2.fillOval((90*EY)+x, 70+y, 5, 5);
        }
        g2.draw(ñ);
    }
    
    public void dibujaro(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double o = new Path2D.Double(); 
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                o.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                o.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.curveTo(((30*EY)+x)*tamaño, (90+y)*tamaño, ((80*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.curveTo(((10*EY)+x)*tamaño, (160+y)*tamaño, ((60*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((24*EY)+x)*tamaño,(110+y)*tamaño);
                o.curveTo(((30*EY)+x)*tamaño,(130+y)*tamaño,((50*EY)+x)*tamaño,(130+y)*tamaño,((90*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                o.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                o.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.curveTo(((20*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (90+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((20*EY)+x)*tamaño, (120+y)*tamaño);
                o.curveTo(((20*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (120+y)*tamaño);
                o.moveTo(((22*EY)+x)*tamaño,(110+y)*tamaño);
                o.curveTo(((30*EY)+x)*tamaño,(130+y)*tamaño,((50*EY)+x)*tamaño,(130+y)*tamaño,((90*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                o.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                o.lineTo(((90*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                o.moveTo(((45*EY)+x)*tamaño,(90+y)*tamaño);
                o.lineTo(((70*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((45*EY)+x,90+y, 5, 5);
                    g2.fillOval((70*EY)+x,70+y, 5, 5);
                }
            } 
            x+=1;
        }
        if (bandera == true){
                g2.fillOval((0*EY)+x, 143+y, 5, 5);
                g2.fillOval((20*EY)+x, 143+y, 5, 5);
                g2.fillOval((20*EY)+x, 130+y, 5, 5);
                g2.fillOval((20*EY)+x, 120+y, 5, 5);
                g2.fillOval((20*EY)+x, 90+y, 5, 5);
                g2.fillOval((70*EY)+x, 90+y, 5, 5);
                g2.fillOval((70*EY)+x, 120+y, 5, 5);
                g2.fillOval((20*EY)+x, 160+y, 5, 5);
                g2.fillOval((70*EY)+x, 160+y, 5, 5);
                g2.fillOval((70*EY)+x, 120+y, 5, 5);
                g2.fillOval((22*EY)+x, 110+y, 5, 5);
                g2.fillOval((30*EY)+x, 130+y, 5, 5);
                g2.fillOval((50*EY)+x, 130+y, 5, 5);
                g2.fillOval((90*EY)+x, 143+y, 5, 5);
            }
        
        g2.draw(o);
    }
    
        public void dibujarocaso(Graphics2D g2, int x, int y,boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double o1 = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                o1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                o1.curveTo(((0*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                o1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                o1.curveTo(((0*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                o1.moveTo(((2*EY)+x)*tamaño,(110+y)*tamaño);
                o1.curveTo(((10*EY)+x)*tamaño,(130+y)*tamaño,((30*EY)+x)*tamaño,(130+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                o1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                o1.curveTo(((0*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (90+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                o1.moveTo(((0*EY)+x)*tamaño, (120+y)*tamaño);
                o1.curveTo(((0*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (120+y)*tamaño);
                o1.moveTo(((2*EY)+x)*tamaño,(110+y)*tamaño);
                o1.curveTo(((10*EY)+x)*tamaño,(130+y)*tamaño,((30*EY)+x)*tamaño,(130+y)*tamaño,((60*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                o1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                o1.lineTo(((60*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                o1.moveTo(((25*EY)+x)*tamaño,(85+y)*tamaño);
                o1.lineTo(((45*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((25*EY)+x,85+y, 5, 5);
                    g2.fillOval((45*EY)+x,70+y, 5, 5);
                }
            } 
            x+=1;
        }
        if(bandera==true){
            g2.fillOval((0*EY)+x,120+y, 5, 5);
            g2.fillOval((0*EY)+x,90+y, 5, 5);
            g2.fillOval((50*EY)+x,90+y, 5, 5);
            g2.fillOval((50*EY)+x,120+y, 5, 5);
            g2.fillOval((0*EY)+x,120+y, 5, 5);
            g2.fillOval((0*EY)+x,160+y, 5, 5);
            g2.fillOval((50*EY)+x,160+y, 5, 5);
            g2.fillOval((50*EY)+x,120+y, 5, 5);
            g2.fillOval((2*EY)+x,110+y, 5, 5);
            g2.fillOval((10*EY)+x,130+y, 5, 5);
            g2.fillOval((30*EY)+x,130+y, 5, 5);
            g2.fillOval((60*EY)+x,143+y, 5, 5);
        }
        
        g2.draw(o1);
    }
    
    public void dibujarp(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double p = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                p.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                p.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((30*EY)+x)*tamaño, (110+y)*tamaño, ((40*EY)+x)*tamaño, (100+y)*tamaño);
                p.moveTo(((40*EY)+x)*tamaño, (100+y)*tamaño);
                p.curveTo(((45*EY)+x)*tamaño, (110+y)*tamaño, ((25*EY)+x)*tamaño, (170+y)*tamaño, ((15*EY)+x)*tamaño, (180+y)*tamaño);
                p.moveTo(((40*EY)+x)*tamaño, (100+y)*tamaño);
                p.curveTo(((60*EY)+x)*tamaño, (60+y)*tamaño, ((105*EY)+x)*tamaño, (145+y)*tamaño, ((33*EY)+x)*tamaño, (143+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (130+y)*tamaño);
                p.curveTo(((70*EY)+x)*tamaño, (120+y)*tamaño, ((60*EY)+x)*tamaño, (150+y)*tamaño, ((100*EY)+x)*tamaño, (143+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (130+y)*tamaño);
                p.curveTo(((20*EY)+x)*tamaño, (135+y)*tamaño, ((23*EY)+x)*tamaño, (145+y)*tamaño, ((33*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                p.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                p.curveTo(((35*EY)+x)*tamaño, (143+y)*tamaño, ((30*EY)+x)*tamaño, (110+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                p.curveTo(((35*EY)+x)*tamaño, (110+y)*tamaño, ((35*EY)+x)*tamaño, (170+y)*tamaño, ((25*EY)+x)*tamaño, (180+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                p.curveTo(((60*EY)+x)*tamaño, (70+y)*tamaño, ((105*EY)+x)*tamaño, (145+y)*tamaño, ((33*EY)+x)*tamaño, (143+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (130+y)*tamaño);
                p.curveTo(((70*EY)+x)*tamaño, (120+y)*tamaño, ((60*EY)+x)*tamaño, (150+y)*tamaño, ((100*EY)+x)*tamaño, (143+y)*tamaño);
                p.moveTo(((30*EY)+x)*tamaño, (130+y)*tamaño);
                p.curveTo(((20*EY)+x)*tamaño, (135+y)*tamaño, ((23*EY)+x)*tamaño, (145+y)*tamaño, ((33*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                p.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                p.lineTo(((100*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((35*EY)+x,143+y, 5, 5);
            g2.fillOval((30*EY)+x,110+y, 5, 5);
            g2.fillOval((30*EY)+x,100+y, 5, 5);
            g2.fillOval((35*EY)+x,110+y, 5, 5);
            g2.fillOval((35*EY)+x,170+y, 5, 5);
            g2.fillOval((25*EY)+x,180+y, 5, 5);
            g2.fillOval((30*EY)+x,100+y, 5, 5);
            g2.fillOval((60*EY)+x,70+y, 5, 5);
            g2.fillOval((105*EY)+x,145+y, 5, 5);
            g2.fillOval((33*EY)+x,143+y, 5, 5);
            g2.fillOval((30*EY)+x,130+y, 5, 5);
            g2.fillOval((70*EY)+x,120+y, 5, 5);
            g2.fillOval((60*EY)+x,150+y, 5, 5);
            g2.fillOval((100*EY)+x,143+y, 5, 5);
            g2.fillOval((30*EY)+x,130+y, 5, 5);
            g2.fillOval((20*EY)+x,135+y, 5, 5);
            g2.fillOval((23*EY)+x,145+y, 5, 5);
            g2.fillOval((33*EY)+x,143+y, 5, 5);
        }
        g2.draw(p);
    }
    
    public void dibujarq(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double q = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                q.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                q.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño,(130+y)*tamaño,((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo(((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((30*EY)+x)*tamaño,(90+y)*tamaño,((70*EY)+x)*tamaño,(90+y)*tamaño,((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo(((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((10*EY)+x)*tamaño,(150+y)*tamaño,((50*EY)+x)*tamaño,(150+y)*tamaño,((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo (((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((50*EY)+x)*tamaño,(120+y)*tamaño,((40*EY)+x)*tamaño,(240+y)*tamaño,((70*EY)+x)*tamaño,(170+y)*tamaño);
                q.moveTo(((70*EY)+x)*tamaño,(170+y)*tamaño);
                q.curveTo(((70*EY)+x)*tamaño,(170+y)*tamaño,((80*EY)+x)*tamaño,(150+y)*tamaño,((30*EY)+x)*tamaño,(150+y)*tamaño);
                q.moveTo(((30*EY)+x)*tamaño,(150+y)*tamaño);
                q.curveTo(((20*EY)+x)*tamaño,(150+y)*tamaño,((30*EY)+x)*tamaño,(200+y)*tamaño,((80*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                q.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                q.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño,(130+y)*tamaño,((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo(((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((20*EY)+x)*tamaño,(90+y)*tamaño,((60*EY)+x)*tamaño,(90+y)*tamaño,((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo(((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((20*EY)+x)*tamaño,(150+y)*tamaño,((60*EY)+x)*tamaño,(150+y)*tamaño,((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo(((20*EY)+x)*tamaño,(120+y)*tamaño);
                q.moveTo (((60*EY)+x)*tamaño,(120+y)*tamaño);
                q.curveTo(((60*EY)+x)*tamaño,(120+y)*tamaño,((50*EY)+x)*tamaño,(240+y)*tamaño,((80*EY)+x)*tamaño,(170+y)*tamaño);
                q.moveTo(((80*EY)+x)*tamaño,(170+y)*tamaño);
                q.curveTo(((80*EY)+x)*tamaño,(170+y)*tamaño,((90*EY)+x)*tamaño,(150+y)*tamaño,((40*EY)+x)*tamaño,(150+y)*tamaño);
                q.moveTo(((40*EY)+x)*tamaño,(150+y)*tamaño);
                q.curveTo(((30*EY)+x)*tamaño,(150+y)*tamaño,((40*EY)+x)*tamaño,(200+y)*tamaño,((80*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                q.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                q.lineTo(((80*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,130+y, 5, 5);
            g2.fillOval((20*EY)+x,120+y, 5, 5);
            g2.fillOval((20*EY)+x,90+y, 5, 5);
            g2.fillOval((60*EY)+x,90+y, 5, 5);
            g2.fillOval((60*EY)+x,120+y, 5, 5);
            g2.fillOval((20*EY)+x,120+y, 5, 5);
            g2.fillOval((60*EY)+x,120+y, 5, 5);
            g2.fillOval((50*EY)+x,240+y, 5, 5);
            g2.fillOval((80*EY)+x,170+y, 5, 5);
            g2.fillOval((90*EY)+x,150+y, 5, 5);
            g2.fillOval((40*EY)+x,150+y, 5, 5);
            g2.fillOval((30*EY)+x,150+y, 5, 5);
            g2.fillOval((40*EY)+x,200+y, 5, 5);
            g2.fillOval((80*EY)+x,143+y, 5, 5);
        }
        g2.draw(q);        
    }
    
    public void dibujarr(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double r = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                r.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                r.curveTo(((5*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño,(100+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                r.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                r.curveTo(((15*EY)+x)*tamaño, (110+y)*tamaño, ((70*EY)+x)*tamaño, (110+y)*tamaño, ((60*EY)+x)*tamaño, (100+y)*tamaño);
                r.moveTo(((60*EY)+x)*tamaño, (100+y)*tamaño);
                r.curveTo(((60*EY)+x)*tamaño, (115+y)*tamaño, ((60*EY)+x)*tamaño,(143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                r.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                r.curveTo(((15*EY)+x)*tamaño, (143+y)*tamaño, ((10*EY)+x)*tamaño,(100+y)*tamaño, ((10*EY)+x)*tamaño, (100+y)*tamaño);
                r.moveTo(((10*EY)+x)*tamaño, (100+y)*tamaño);
                r.curveTo(((15*EY)+x)*tamaño, (110+y)*tamaño, ((60*EY)+x)*tamaño, (110+y)*tamaño, ((60*EY)+x)*tamaño, (100+y)*tamaño);
                r.moveTo(((60*EY)+x)*tamaño, (100+y)*tamaño);
                r.curveTo(((60*EY)+x)*tamaño, (115+y)*tamaño, ((60*EY)+x)*tamaño,(143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                r.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                r.lineTo(((70*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((15*EY)+x,143+y, 5, 5);
            g2.fillOval((10*EY)+x,100+y, 5, 5);
            g2.fillOval((15*EY)+x,100+y, 5, 5);
            g2.fillOval((60*EY)+x,110+y, 5, 5);
            g2.fillOval((60*EY)+x,100+y, 5, 5);
            g2.fillOval((60*EY)+x,115+y, 5, 5);
            g2.fillOval((60*EY)+x,143+y, 5, 5);
            g2.fillOval((70*EY)+x,143+y, 5, 5);
        }
        g2.draw(r);
    }
    
    public void dibujarrcaso(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double r1= new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                r1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                r1.curveTo(((5*EY)+x)*tamaño,(100+y)*tamaño,((10*EY)+x)*tamaño,(80+y)*tamaño,((15*EY)+x)*tamaño,(80+y)*tamaño);
                r1.curveTo(((20*EY)+x)*tamaño,(80+y)*tamaño,((20*EY)+x)*tamaño,(85+y)*tamaño,((35*EY)+x)*tamaño,(80+y)*tamaño);
                r1.curveTo(((40*EY)+x)*tamaño,(80+y)*tamaño,((35*EY)+x)*tamaño,(143+y)*tamaño, ((45*EY)+x)*tamaño,(143+y)*tamaño);
            }
            else{
                r1.moveTo(((0*EY)+x)*tamaño,(110+y)*tamaño);
                r1.curveTo(((5*EY)+x)*tamaño,(100+y)*tamaño,((10*EY)+x)*tamaño,(80+y)*tamaño,((15*EY)+x)*tamaño,(80+y)*tamaño);
                r1.curveTo(((20*EY)+x)*tamaño,(80+y)*tamaño,((20*EY)+x)*tamaño,(85+y)*tamaño,((35*EY)+x)*tamaño,(80+y)*tamaño);
                r1.curveTo(((40*EY)+x)*tamaño,(80+y)*tamaño,((35*EY)+x)*tamaño,(143+y)*tamaño, ((45*EY)+x)*tamaño,(143+y)*tamaño);
            }
            
            if(subrayado==true){
                r1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                r1.lineTo(((45*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,110+y, 5, 5);
            g2.fillOval((5*EY)+x,100+y, 5, 5);
            g2.fillOval((10*EY)+x,80+y, 5, 5);
            g2.fillOval((15*EY)+x,80+y, 5, 5);
            g2.fillOval((20*EY)+x,80+y, 5, 5);
            g2.fillOval((20*EY)+x,85+y, 5, 5);
            g2.fillOval((35*EY)+x,80+y, 5, 5);
            g2.fillOval((40*EY)+x,80+y, 5, 5);
            g2.fillOval((35*EY)+x,143+y, 5, 5);
            g2.fillOval((45*EY)+x,143+y, 5, 5);
        }
        g2.draw(r1);
    }
    
    public void dibujars(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double s = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                s.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                s.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((30*EY)+x)*tamaño,(100+y)*tamaño, ((30*EY)+x)*tamaño, (100+y)*tamaño);
                s.moveTo(((30*EY)+x)*tamaño, (100+y)*tamaño);
                s.curveTo(((80*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño,(135+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
                s.moveTo(((40*EY)+x)*tamaño, (140+y)*tamaño);
                s.curveTo(((44*EY)+x)*tamaño, (147+y)*tamaño, ((80*EY)+x)*tamaño,(145+y)*tamaño, ((85*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                s.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                s.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((25*EY)+x)*tamaño,(100+y)*tamaño, ((25*EY)+x)*tamaño, (100+y)*tamaño);
                s.moveTo(((25*EY)+x)*tamaño, (100+y)*tamaño);
                s.curveTo(((80*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño,(135+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
                s.moveTo(((40*EY)+x)*tamaño, (140+y)*tamaño);
                s.curveTo(((44*EY)+x)*tamaño, (147+y)*tamaño, ((80*EY)+x)*tamaño,(145+y)*tamaño, ((85*EY)+x)*tamaño, (143+y)*tamaño); 
            }
              
            if(subrayado==true){
                s.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                s.lineTo(((85*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,143+y, 5, 5);
            g2.fillOval((25*EY)+x,100+y, 5, 5);
            g2.fillOval((80*EY)+x,120+y, 5, 5);
            g2.fillOval((70*EY)+x,135+y, 5, 5);
            g2.fillOval((70*EY)+x,143+y, 5, 5);
            g2.fillOval((40*EY)+x,140+y, 5, 5);
            g2.fillOval((44*EY)+x,147+y, 5, 5);
            g2.fillOval((80*EY)+x,145+y, 5, 5);
            g2.fillOval((85*EY)+x,143+y, 5, 5);
        }
        g2.draw(s);   
        
    }
    
    public void dibujart(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double t = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                t.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                t.curveTo(((10*EY)+x)*tamaño,(133+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño, ((30*EY)+x)*tamaño, (55+y)*tamaño);
                t.moveTo(((30*EY)+x)*tamaño,(55+y)*tamaño);
                t.curveTo(((20*EY)+x)*tamaño,(143+y)*tamaño,((20*EY)+x)*tamaño,(133+y)*tamaño,((40*EY)+x)*tamaño,(143+y)*tamaño);
                t.moveTo(((10*EY)+x)*tamaño,(75+y)*tamaño);
                t.curveTo(((0*EY)+x)*tamaño,(75+y)*tamaño,((40*EY)+x)*tamaño,(80+y)*tamaño,((40*EY)+x)*tamaño,(80+y)*tamaño);
            }
            else{
                t.moveTo(((0*EY)+x)*tamaño,(143+y)*tamaño);
                t.curveTo(((20*EY)+x)*tamaño,(133+y)*tamaño,((20*EY)+x)*tamaño,(143+y)*tamaño, ((20*EY)+x)*tamaño, (55+y)*tamaño);
                t.moveTo(((20*EY)+x)*tamaño,(55+y)*tamaño);
                t.curveTo(((20*EY)+x)*tamaño,(143+y)*tamaño,((20*EY)+x)*tamaño,(133+y)*tamaño,((40*EY)+x)*tamaño,(143+y)*tamaño);
                t.moveTo(((0*EY)+x)*tamaño,(80+y)*tamaño);
                t.curveTo(((0*EY)+x)*tamaño,(80+y)*tamaño,((40*EY)+x)*tamaño,(80+y)*tamaño,((40*EY)+x)*tamaño,(80+y)*tamaño);
            }
            
            if(subrayado==true){
                t.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                t.lineTo(((40*EY)+x)*tamaño, (153+y)*tamaño);
            }
            x+=1;
        }
        
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,133+y, 5, 5);
            g2.fillOval((20*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,55+y, 5, 5);
            g2.fillOval((40*EY)+x,143+y, 5, 5);
            g2.fillOval((0*EY)+x,80+y, 5, 5);
            g2.fillOval((40*EY)+x,80+y, 5, 5);
        }
        g2.draw(t);
    }
    
    public void dibujaru(Graphics2D g2, int x, int y,boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double u = new Path2D.Double();
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                u.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                u.curveTo(((10*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                u.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                u.curveTo(((10*EY)+x)*tamaño, (160+y)*tamaño, ((60*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (100+y)*tamaño);
                u.moveTo(((70*EY)+x)*tamaño, (100+y)*tamaño);
                u.curveTo(((70*EY)+x)*tamaño,(110+y)*tamaño, ((60*EY)+x)*tamaño, (143+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                u.moveTo(((0*EY)+x)*tamaño, (143+y)*tamaño);
                u.curveTo(((20*EY)+x)*tamaño, (143+y)*tamaño, ((20*EY)+x)*tamaño, (130+y)*tamaño, ((20*EY)+x)*tamaño, (100+y)*tamaño);
                u.moveTo(((20*EY)+x)*tamaño, (100+y)*tamaño);
                u.curveTo(((20*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (160+y)*tamaño, ((70*EY)+x)*tamaño, (100+y)*tamaño);
                u.moveTo(((70*EY)+x)*tamaño, (100+y)*tamaño);
                u.curveTo(((70*EY)+x)*tamaño, (120+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño, ((90*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                u.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                u.lineTo(((90*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                u.moveTo(((45*EY)+x)*tamaño,(90+y)*tamaño);
                u.lineTo(((70*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((45*EY)+x,90+y, 5, 5);
                    g2.fillOval((70*EY)+x,70+y, 5, 5);
                }
            }
            x+=1;
        }
        if(bandera==true){
            g2.fillOval((0*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,143+y, 5, 5);
            g2.fillOval((20*EY)+x,130+y, 5, 5);
            g2.fillOval((20*EY)+x,100+y, 5, 5);
            g2.fillOval((20*EY)+x,160+y, 5, 5);
            g2.fillOval((70*EY)+x,160+y, 5, 5);
            g2.fillOval((70*EY)+x,100+y, 5, 5);
            g2.fillOval((70*EY)+x,120+y, 5, 5);
            g2.fillOval((70*EY)+x,143+y, 5, 5);
            g2.fillOval((90*EY)+x,143+y, 5, 5);
        }
        
        g2.draw(u);
    }
    
    public void dibujarucaso(Graphics2D g2, int x, int y,boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,float tamaño,boolean EspejoY){
        Path2D.Double u1 = new Path2D.Double(); 
        int limite = 1;
        int EY=1;
        if(EspejoY){
            EY=-1;
        }
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if (cursiva==true) {
                u1.moveTo(((0*EY)+x)*tamaño, (110+y)*tamaño);
                u1.curveTo(((0*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (110+y)*tamaño);
                u1.moveTo(((50*EY)+x)*tamaño, (110+y)*tamaño);
                u1.curveTo(((50*EY)+x)*tamaño, (120+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            else{
                u1.moveTo(((0*EY)+x)*tamaño, (110+y)*tamaño);
                u1.curveTo(((0*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (160+y)*tamaño, ((50*EY)+x)*tamaño, (110+y)*tamaño);
                u1.moveTo(((50*EY)+x)*tamaño, (110+y)*tamaño);
                u1.curveTo(((50*EY)+x)*tamaño, (120+y)*tamaño, ((50*EY)+x)*tamaño, (143+y)*tamaño, ((70*EY)+x)*tamaño, (143+y)*tamaño);
            }
            
            if(subrayado==true){
                u1.moveTo(((0*EY)+x)*tamaño, (153+y)*tamaño);
                u1.lineTo(((70*EY)+x)*tamaño, (153+y)*tamaño);
            }
            if(tilde==true){
                u1.moveTo(((25*EY)+x)*tamaño,(90+y)*tamaño);
                u1.lineTo(((45*EY)+x)*tamaño,(70+y)*tamaño);
                if(bandera == true){
                    g2.fillOval((25*EY)+x,90+y, 5, 5);
                    g2.fillOval((45*EY)+x,70+y, 5, 5);
                }
            }
            x+=1;
        }
        if(bandera==true){
            g2.fillOval((0*EY)+x,110+y, 5, 5);
            g2.fillOval((0*EY)+x,160+y, 5, 5);
            g2.fillOval((50*EY)+x,160+y, 5, 5);
            g2.fillOval((50*EY)+x,110+y, 5, 5);
            g2.fillOval((50*EY)+x,120+y, 5, 5);
            g2.fillOval((50*EY)+x,143+y, 5, 5);
            g2.fillOval((70*EY)+x,143+y, 5, 5);
        }
        
        g2.draw(u1);
    }
    
    public void dibujarv(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY) {
        Path2D.Double v = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                v.moveTo(((0*EY) + x)*tamaño, (143 + y)*tamaño);
                v.curveTo(((10*EY) + x)*tamaño, (143 + y)*tamaño, ((10*EY) + x)*tamaño, (100 + y)*tamaño, ((35*EY) + x)*tamaño, (100 + y)*tamaño);
                v.moveTo(((35*EY) + x)*tamaño, (100 + y)*tamaño);
                v.curveTo(((50*EY) + x)*tamaño, (100 + y)*tamaño, ((25*EY) + x)*tamaño, (143 + y)*tamaño, ((45*EY) + x)*tamaño, (143 + y)*tamaño);
                v.moveTo(((45*EY) + x)*tamaño, (143 + y)*tamaño);
                v.curveTo(((65*EY) + x)*tamaño, (143 + y)*tamaño, ((80*EY) + x)*tamaño, (100 + y)*tamaño, ((80*EY) + x)*tamaño, (100 + y)*tamaño);
                v.moveTo(((80*EY) + x)*tamaño, (100 + y)*tamaño);
                v.curveTo(((90*EY) + x)*tamaño, (105 + y)*tamaño, ((105*EY) + x)*tamaño, (115 + y)*tamaño, ((110*EY) + x)*tamaño, (110 + y)*tamaño);
            } else {
                v.moveTo(((0*EY) + x)*tamaño, (143 + y)*tamaño);
                v.curveTo(((20*EY) + x)*tamaño, (143 + y)*tamaño, ((0*EY) + x)*tamaño, (100 + y)*tamaño, ((25*EY) + x)*tamaño, (100 + y)*tamaño);
                v.moveTo(((25*EY) + x)*tamaño, (100 + y)*tamaño);
                v.curveTo(((50*EY) + x)*tamaño, (100 + y)*tamaño, ((35*EY) + x)*tamaño, (143 + y)*tamaño, ((55*EY) + x)*tamaño, (143 + y)*tamaño);
                v.moveTo(((55*EY) + x)*tamaño, (143 + y)*tamaño);
                v.curveTo(((75*EY) + x)*tamaño, (143 + y)*tamaño, ((70*EY) + x)*tamaño, (100 + y)*tamaño, ((70*EY) + x)*tamaño, (100 + y)*tamaño);
                v.moveTo(((70*EY) + x)*tamaño, (100 + y)*tamaño);
                v.curveTo(((80*EY) + x)*tamaño, (105 + y)*tamaño, ((105*EY) + x)*tamaño,(115 + y)*tamaño, ((110*EY) + x)*tamaño, (110 + y)*tamaño);
            }

            if (subrayado == true) {
                v.moveTo(((0 * EY) + x)*tamaño, (153 + y)*tamaño);
                v.lineTo(((110 * EY) + x)*tamaño, (153 + y)*tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((20 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((0 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((25 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((50 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((35 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((55 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((75 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((70 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 105 + y, 5, 5);
            g2.fillOval((105 * EY) + x, 115 + y, 5, 5);
            g2.fillOval((110 * EY) + x, 110 + y, 5, 5);
        }
        g2.draw(v);
    }

    public void dibujarw(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY) {
        Path2D.Double w = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                w.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((10 * EY) + x)*tamaño, (143 + y)*tamaño, ((10 * EY) + x)*tamaño, (100 + y)*tamaño, ((25 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((25 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((60 * EY) + x)*tamaño, (100 + y)*tamaño, ((15 * EY) + x)*tamaño, (143 + y)*tamaño, ((35 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.moveTo(((35 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((75 * EY) + x)*tamaño, (153 + y)*tamaño, ((65 * EY) + x)*tamaño, (100 + y)*tamaño, ((75 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((75 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((75 * EY) + x)*tamaño, (100 + y)*tamaño, ((45 * EY) + x)*tamaño, (153 + y)*tamaño, ((95 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.moveTo(((95 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((100 * EY) + x)*tamaño, (143 + y)*tamaño, ((110 * EY) + x)*tamaño, (100 + y)*tamaño, ((110 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((110 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((120 * EY) + x)*tamaño, (105 + y)*tamaño, ((150 * EY) + x)*tamaño, (115 + y)*tamaño, ((150 * EY) + x)*tamaño, (110 + y)*tamaño);
            } else {
                w.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((10 * EY) + x)*tamaño, (143 + y)*tamaño, ((0 * EY) + x)*tamaño, (100 + y)*tamaño, ((15 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((15 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((50 * EY) + x)*tamaño, (100 + y)*tamaño, ((25 * EY) + x)*tamaño, (143 + y)*tamaño, ((45 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.moveTo(((45 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((85 * EY) + x)*tamaño, (153 + y)*tamaño, ((75 * EY) + x)*tamaño, (100 + y)*tamaño, ((75 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((75 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((75 * EY) + x)*tamaño, (100 + y)*tamaño, ((65 * EY) + x)*tamaño, (153 + y)*tamaño, ((105 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.moveTo(((105 * EY) + x)*tamaño, (143 + y)*tamaño);
                w.curveTo(((120 * EY) + x)*tamaño, (143 + y)*tamaño, ((120 * EY) + x)*tamaño, (100 + y)*tamaño, ((120 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.moveTo(((120 * EY) + x)*tamaño, (100 + y)*tamaño);
                w.curveTo(((120 * EY) + x)*tamaño, (105 + y)*tamaño, ((150 * EY) + x)*tamaño, (115 + y)*tamaño, ((150 * EY) + x)*tamaño, (110 + y)*tamaño);
            }

            if (subrayado == true) {
                w.moveTo(((0 * EY) + x)*tamaño, (153 + y)*tamaño);
                w.lineTo(((150 * EY) + x)*tamaño, (153 + y)*tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((10 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((0 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((15 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((50 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((25 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((45 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((85 * EY) + x, 153 + y, 5, 5);
            g2.fillOval((75 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((65 * EY) + x, 153 + y, 5, 5);
            g2.fillOval((105 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((120 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((120 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((120 * EY) + x, 105 + y, 5, 5);
            g2.fillOval((150 * EY) + x, 115 + y, 5, 5);
            g2.fillOval((150 * EY) + x, 110 + y, 5, 5);
        }

        g2.draw(w);
    }

    public void dibujarx1(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY) {
        Path2D.Double x1 = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                x1.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                x1.curveTo(((40 * EY) + x)*tamaño, (143 + y)*tamaño, ((40 * EY) + x)*tamaño, (100 + y)*tamaño, ((60 * EY) + x)*tamaño, (100 + y)*tamaño);
                x1.moveTo(((0 * EY) + x)*tamaño, (100 + y)*tamaño);
                x1.curveTo(((30 * EY) + x)*tamaño, (100 + y)*tamaño, ((30 * EY) + x)*tamaño, (143 + y)*tamaño, ((60 * EY) + x)*tamaño, (143 + y)*tamaño);
            } else {
                x1.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                x1.curveTo(((40 * EY) + x)*tamaño, (143 + y)*tamaño, ((40 * EY) + x)*tamaño, (100 + y)*tamaño, ((60 * EY) + x)*tamaño, (100 + y)*tamaño);
                x1.moveTo(((0 * EY) + x)*tamaño, (100 + y)*tamaño);
                x1.curveTo(((30 * EY) + x)*tamaño, (100 + y)*tamaño, ((30 * EY) + x)*tamaño, (143 + y)*tamaño, ((60 * EY) + x)*tamaño, (143 + y)*tamaño);
            }

            if (subrayado == true) {
                x1.moveTo(((0 * EY) + x)*tamaño, (153 + y)*tamaño);
                x1.lineTo(((60 * EY) + x)*tamaño, (153 + y)*tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((0 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((30 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((30 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 143 + y, 5, 5);
        }

        g2.draw(x1);
    }

    public void dibujary1(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY) {
        Path2D.Double y1 = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                y1.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                y1.curveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño, ((30 * EY) + x)*tamaño, (143 + y)*tamaño, ((40 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.moveTo(((40 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.curveTo(((10 * EY) + x)*tamaño, (174 + y)*tamaño, ((78 * EY) + x)*tamaño, (138 + y)*tamaño, ((78 * EY) + x)*tamaño, (138 + y)*tamaño);
                y1.moveTo(((90 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.curveTo(((80 * EY) + x)*tamaño, (100 + y)*tamaño, ((70 * EY) + x)*tamaño, (200 + y)*tamaño, ((70 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.moveTo(((70 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.curveTo(((70 * EY) + x)*tamaño, (225 + y)*tamaño, ((30 * EY) + x)*tamaño, (225 + y)*tamaño, ((30 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.moveTo(((30 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.curveTo(((30 * EY) + x)*tamaño, (180 + y)*tamaño, ((50 * EY) + x)*tamaño, (143 + y)*tamaño, ((120 * EY) + x)*tamaño, (143 + y)*tamaño);
            } else {
                y1.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                y1.curveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño, ((30 * EY) + x)*tamaño, (143 + y)*tamaño, ((30 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.moveTo(((30 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.curveTo(((20 * EY) + x)*tamaño, (174 + y)*tamaño, ((80 * EY) + x)*tamaño, (138 + y)*tamaño, ((80 * EY) + x)*tamaño, (138 + y)*tamaño);
                y1.moveTo(((80 * EY) + x)*tamaño, (100 + y)*tamaño);
                y1.curveTo(((80 * EY) + x)*tamaño, (100 + y)*tamaño, ((80 * EY) + x)*tamaño, (200 + y)*tamaño, ((80 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.moveTo(((80 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.curveTo(((80 * EY) + x)*tamaño, (225 + y)*tamaño, ((40 * EY) + x)*tamaño, (225 + y)*tamaño, ((40 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.moveTo(((40 * EY) + x)*tamaño, (200 + y)*tamaño);
                y1.curveTo(((40 * EY) + x)*tamaño, (180 + y)*tamaño, ((60 * EY) + x)*tamaño, (143 + y)*tamaño, ((120 * EY) + x)*tamaño, (143 + y)*tamaño);
            }

            if (subrayado == true) {
                y1.moveTo(((0 * EY) + x)*tamaño, (153 + y)*tamaño);
                y1.lineTo(((120 * EY) + x)*tamaño, (153 + y)*tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((30 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((30 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((20 * EY) + x, 174 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 138 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 200 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 225 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 225 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 200 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 180 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((120 * EY) + x, 143 + y, 5, 5);
        }

        g2.draw(y1);
    }

    public void dibujarz(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,float tamaño, boolean EspejoY) {
        Path2D.Double z = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                z.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((25 * EY) + x)*tamaño, (143 + y)*tamaño, ((35 * EY) + x)*tamaño, (100 + y)*tamaño, ((50 * EY) + x)*tamaño, (100 + y)*tamaño);
                z.moveTo(((50 * EY) + x)*tamaño, (100 + y)*tamaño);
                z.curveTo(((70 * EY) + x)*tamaño, (100 + y)*tamaño, ((50 * EY) + x)*tamaño, (143 + y)*tamaño, ((30 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.moveTo(((30 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((70 * EY) + x)*tamaño, (130 + y)*tamaño, ((50 * EY) + x)*tamaño, (200 + y)*tamaño, ((30 * EY) + x)*tamaño, (200 + y)*tamaño);
                z.moveTo(((70 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((60 * EY) + x)*tamaño, (150 + y)*tamaño, ((20 * EY) + x)*tamaño, (175 + y)*tamaño, ((30 * EY) + x)*tamaño, (200 + y)*tamaño);
            } else {
                z.moveTo(((0 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((25 * EY) + x)*tamaño, (143 + y)*tamaño, ((25 * EY) + x)*tamaño, (100 + y)*tamaño, ((40 * EY) + x)*tamaño, (100 + y)*tamaño);
                z.moveTo(((40 * EY) + x)*tamaño, (100 + y)*tamaño);
                z.curveTo(((70 * EY) + x)*tamaño, (100 + y)*tamaño, ((60 * EY) + x)*tamaño, (143 + y)*tamaño, ((40 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.moveTo(((40 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((80 * EY) + x)*tamaño, (130 + y)*tamaño, ((60 * EY) + x)*tamaño, (200 + y)*tamaño, ((40 * EY) + x)*tamaño, (200 + y)*tamaño);
                z.moveTo(((70 * EY) + x)*tamaño, (143 + y)*tamaño);
                z.curveTo(((60 * EY) + x)*tamaño, (150 + y)*tamaño, ((30 * EY) + x)*tamaño, (175 + y)*tamaño, ((40 * EY) + x)*tamaño, (200 + y)*tamaño);
            }

            if (subrayado == true) {
                z.moveTo(((0 * EY) + x)*tamaño, (153 + y)*tamaño);
                z.lineTo(((70 * EY) + x)*tamaño, (153 + y)*tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((25 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((25 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((70 * EY) + x, 100 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((80 * EY) + x, 130 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 200 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 200 + y, 5, 5);
            g2.fillOval((70 * EY) + x, 143 + y, 5, 5);
            g2.fillOval((60 * EY) + x, 150 + y, 5, 5);
            g2.fillOval((30 * EY) + x, 175 + y, 5, 5);
            g2.fillOval((40 * EY) + x, 200 + y, 5, 5);
        }

        g2.draw(z);
    }
    
}