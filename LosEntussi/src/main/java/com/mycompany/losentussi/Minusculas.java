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
    public void dibujaracaso(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                a1.moveTo((0*EY)+x, 120+y);
                a1.curveTo((10*EY)+x, 90+y, (60*EY)+x, 90+y, (50*EY)+x, 120+y);
                a1.moveTo((0*EY)+x, 120+y);
                a1.curveTo((-10*EY)+x, 160+y, (40*EY)+x, 160+y, (50*EY)+x, 120+y);
                a1.moveTo((50*EY)+x, 120+y);
                a1.curveTo((50*EY)+x, 120+y, (50*EY)+x, 143+y, (70*EY)+x, 143+y);                
            }
            else{
                a1.moveTo((0*EY)+x, 120+y);
                a1.curveTo((0*EY)+x, 90+y, (50*EY)+x, 90+y, (50*EY)+x, 120+y);
                a1.moveTo((0*EY)+x, 120+y);
                a1.curveTo((0*EY)+x, 160+y, (50*EY)+x, 160+y, (50*EY)+x, 120+y);
                a1.moveTo((50*EY)+x, 120+y);
                a1.curveTo((50*EY)+x, 120+y, (50*EY)+x, 143+y, (70*EY)+x, 143+y);
            }            
            
            if(subrayado==true){
                a1.moveTo((0*EY)+x, 153+y);
                a1.lineTo((70*EY)+x, 153+y);
            }
            
            if(tilde==true){
                a1.moveTo((25*EY)+x,85+y);
                a1.lineTo((45*EY)+x,70+y);
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
    
    public void dibujarb(Graphics2D g2,int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY){
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
                b.moveTo((0*EY)+x, 143+y);
                b.curveTo((15*EY)+x, 143+y, (35*EY)+x, 50+y,(35*EY)+x , 40+y);
                b.moveTo((18*EY)+x,143+y);
                b.curveTo((18*EY)+x,143+y, (20*EY)+x,45+y, (35*EY)+x, 40+y);
                b.moveTo((18*EY)+x, 143+y);
                b.curveTo((18*EY)+x, 143+y, (65*EY)+x, 90+y,(25*EY)+x , 100+y);
                b.moveTo((25*EY)+x, 100+y);
                b.curveTo((40*EY)+x,100+y,(45*EY)+x, 115+y,(55*EY)+x, 110+y);
            }
            else{
                b.moveTo((0*EY)+x, 143+y);
                b.curveTo((15*EY)+x, 143+y, (25*EY)+x, 50+y,(15*EY)+x , 40+y);
                b.moveTo((13*EY)+x,143+y);
                b.curveTo((13*EY)+x,143+y, (10*EY)+x,45+y, (15*EY)+x, 40+y);
                b.moveTo((13*EY)+x, 143+y);
                b.curveTo((13*EY)+x, 143+y, (60*EY)+x, 90+y,(20*EY)+x , 100+y);
                b.moveTo((20*EY)+x, 100+y);
                b.curveTo((35*EY)+x,100+y,(40*EY)+x, 115+y,(50*EY)+x, 110+y);
            }
            
            if(subrayado==true){
                b.moveTo((0*EY)+x, 153+y);
                b.lineTo((50*EY)+x, 153+y);
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

    public void dibujarc(Graphics2D g2,int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY){
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
                c.moveTo((0*EY)+x, 143+y);
                c.curveTo((30*EY)+x,140+y,(5*EY)+x*EY,85+y, (60*EY)+x, 95+y);
                c.moveTo((29*EY)+x,100+y);
                c.curveTo((10*EY)+x, 115+y,(20*EY)+x*EY,148+y,(68*EY)+x,143+y);
            }
            else{
                c.moveTo((29*EY)+x,100+y);
                c.curveTo((10*EY)+x, 115+y,(20*EY)+x,148+y,(68*EY)+x,143+y);
                c.moveTo((0*EY)+x, 143+y);
                c.curveTo((30*EY)+x,140+y,(5*EY)+x,85+y, (60*EY)+x, 95+y);
            }
            
           
           if(subrayado==true){
                c.moveTo((0*EY)+x, 153+y);
                c.lineTo((68*EY)+x, 153+y);
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

    public void dibujard(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                d.moveTo((0*EY)+x, 143+y);
                d.curveTo((10*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                d.moveTo((20*EY)+x, 125+y);
                d.curveTo((25*EY)+x, 95+y,(65*EY)+x, 95+y, (60*EY)+x, 125+y);
                d.moveTo((20*EY)+x, 125+y);
                d.curveTo((15*EY)+x, 155+y, (55*EY)+x, 155+y, (60*EY)+x, 125+y);
                d.moveTo((80*EY)+x, 55+y);
                d.curveTo((70*EY)+x, 55+y, (50*EY)+x, 143+y, (70*EY)+x, 143+y);
            }
            else{
                d.moveTo((0*EY)+x, 143+y);
                d.curveTo((20*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                d.moveTo((20*EY)+x, 125+y);
                d.curveTo((20*EY)+x, 95+y, (60*EY)+x, 95+y, (60*EY)+x, 125+y);
                d.moveTo((20*EY)+x, 125+y);
                d.curveTo((20*EY)+x, 155+y, (60*EY)+x, 155+y, (60*EY)+x, 125+y);
                d.moveTo((60*EY)+x, 55+y);
                d.curveTo((60*EY)+x, 55+y, (55*EY)+x, 143+y, (70*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                d.moveTo((0*EY)+x, 153+y);
                d.lineTo((70*EY)+x, 153+y);
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

    public void dibujare(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY){
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
                e.moveTo((0*EY)+x, 143+y);
                e.curveTo((10*EY)+x, 143+y, (45*EY)+x,105+y,(40*EY)+x , 95+y);
                e.moveTo((35*EY)+x,143+y);
                e.curveTo((10*EY)+x,143+y, (20*EY)+x,90+y, (40*EY)+x, 95+y);
            }
            else{
                e.moveTo((0*EY)+x, 143+y);
                e.curveTo((25*EY)+x, 143+y, (25*EY)+x,100+y,(15*EY)+x , 90+y);
                e.moveTo((35*EY)+x,143+y);
                e.curveTo((10*EY)+x,143+y, (5*EY)+x,90+y, (15*EY)+x, 90+y);
            }
            
            if(subrayado==true){
                e.moveTo((0*EY)+x, 153+y);
                e.lineTo((35*EY)+x, 153+y);
            }
            if(tilde== true){
                e.moveTo((15*EY)+x,85+y);
                e.lineTo((30*EY)+x,70+y);
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
    
    public void dibujarecaso(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                e1.moveTo((0*EY)+x,110+y);
                e1.curveTo((0*EY)+x,110+y,(25*EY)+x,90+y,(20*EY)+x,80+y);
                e1.moveTo((20*EY)+x,80+y);
                e1.curveTo((0*EY)+x,60+y,(15*EY)+x,143+y,(25*EY)+x,143+y);
            }
            else{
                e1.moveTo((0*EY)+x,110+y);
                e1.curveTo((0*EY)+x,110+y,(25*EY)+x,90+y,(20*EY)+x,80+y);
                e1.moveTo((20*EY)+x,80+y);
                e1.curveTo((0*EY)+x,60+y,(15*EY)+x,143+y,(25*EY)+x,143+y);
            }
            
           if(subrayado==true){
                e1.moveTo((0*EY)+x, 153+y);
                e1.lineTo((25*EY)+x, 153+y);
            }
            if(tilde==true){
                e1.moveTo((20*EY)+x, 70+y);
                e1.lineTo((35*EY)+x,50+y);
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
    
    public void dibujarf(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                f.moveTo((0*EY)+x, 143+y);
                f.curveTo((25+x*EY), 143+y, (35*EY)+x, 50+y,(25*EY)+x , 60+y);
                f.moveTo((5*EY)+x,170+y);
                f.curveTo((0*EY)+x,143+y, (25*EY)+x,45+y, (25*EY)+x, 60+y);
                f.moveTo((5*EY)+x,170+y);
                f.curveTo((25*EY)+x,150+y,(25*EY)+x,130+y,(10*EY)+x,120+y);
                f.moveTo((8*EY)+x,130+y);
                f.curveTo((20*EY)+x,140+y, (40*EY)+x, 145+y, (45*EY)+x,143+y); 
            }
            else{
                f.moveTo((0*EY)+x, 143+y);
                f.curveTo((15*EY)+x, 143+y, (25*EY)+x, 50+y,(15*EY)+x , 60+y);
                f.moveTo((15*EY)+x,170+y);
                f.curveTo((10*EY)+x,143+y, (15*EY)+x,45+y, (17*EY)+x, 60+y);
                f.moveTo((15*EY)+x,170+y);
                f.curveTo((40*EY)+x,150+y,(30*EY)+x,130+y,(13*EY)+x,120+y);
                f.moveTo((13*EY)+x,130+y);
                f.curveTo((20*EY)+x,140+y, (40*EY)+x, 145+y, (50*EY)+x,143+y);
            }
            
            if(subrayado==true){
                f.moveTo((0*EY)+x, 153+y);
                f.lineTo((50*EY)+x, 153+y);
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
    
    public void dibujarg(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((20*EY)+x,90+y,(60*EY)+x,90+y,(50*EY)+x,120+y);
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((0*EY)+x,150+y,(40*EY)+x,150+y,(50*EY)+x,120+y);
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((10*EY)+x,130+y,(0*EY)+x,145+y,(0*EY)+x,143+y);
                g1.moveTo((50*EY)+x,120+y);
                g1.curveTo((40*EY)+x,120+y,(35*EY)+x,220+y,(10*EY)+x,200+y);
                g1.moveTo((10*EY)+x,200+y);
                g1.curveTo((0*EY)+x,180+y,(60*EY)+x,143+y,(60*EY)+x,143+y);
            }
            else{
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((10*EY)+x,90+y,(50*EY)+x,90+y,(50*EY)+x,120+y);
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((10*EY)+x,150+y,(50*EY)+x,150+y,(50*EY)+x,120+y);
                g1.moveTo((10*EY)+x,120+y);
                g1.curveTo((10*EY)+x,130+y,(0*EY)+x,145+y,(0*EY)+x,143+y);
                g1.moveTo((50*EY)+x,120+y);
                g1.curveTo((50*EY)+x,120+y,(45*EY)+x,220+y,(20*EY)+x,200+y);
                g1.moveTo((20*EY)+x,200+y);
                g1.curveTo((10*EY)+x,180+y,(70*EY)+x,143+y,(70*EY)+x,143+y);
            }
            
            
            if(subrayado==true){
                g1.moveTo((0*EY)+x, 153+y);
                g1.lineTo((70*EY)+x, 153+y);
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
    
    public void dibujarh(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                h.moveTo((0*EY)+x,143+y);
                h.curveTo((10*EY)+x,135+y,(25*EY)+x,60+y,(25*EY)+x,50+y);
                h.moveTo((25*EY)+x,50+y);
                h.curveTo((10*EY)+x,60+y,(10*EY)+x,135+y,(10*EY)+x,143+y);
                h.moveTo((8*EY)+x,110+y);
                h.curveTo((50*EY)+x,100+y,(20*EY)+x,143+y,(60*EY)+x,143+y);
            }
            else{
                h.moveTo((0*EY)+x,143+y);
                h.curveTo((5*EY)+x,135+y,(20*EY)+x,60+y,(10*EY)+x,50+y);
                h.moveTo((10*EY)+x,50+y);
                h.curveTo((0*EY)+x,60+y,(10*EY)+x,135+y,(10*EY)+x,143+y);
                h.moveTo((8*EY)+x,110+y);
                h.curveTo((50*EY)+x,100+y,(20*EY)+x,143+y,(60*EY)+x,143+y);
            }
            
            
            if(subrayado==true){
                h.moveTo((0*EY)+x, 153+y);
                h.lineTo((60*EY)+x, 153+y);
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
        
    public void dibujari(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                i.moveTo((0*EY)+x,143+y);
                i.curveTo((0*EY)+x,143+y,(30*EY)+x,115+y, (30*EY)+x, 100+y);
                i.moveTo((30*EY)+x,100+y);
                i.curveTo((30*EY)+x,143+y,(60*EY)+x,143+y,(60*EY)+x,143+y);
                g2.fillOval((30*EY)+x,70+y,10,10);
            }
            else{
                i.moveTo((0*EY)+x,143+y);
                i.curveTo((0*EY)+x,143+y,(25*EY)+x,143+y, (30*EY)+x, 100+y);
                i.moveTo((30*EY)+x,100+y);
                i.curveTo((30*EY)+x,143+y,(60*EY)+x,143+y,(60*EY)+x,143+y);
                g2.fillOval((25*EY)+x,70+y,10,10);
            }
            
            if(subrayado==true){
                i.moveTo((0*EY)+x, 153+y);
                i.lineTo((60*EY)+x, 153+y);
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
            i.moveTo((30*EY)+x,90+y);
            i.lineTo((50*EY)+x,70+y);
            if(bandera==true){
                g2.fillOval((30*EY)+x,90+ y, 5, 5);
                g2.fillOval((50*EY)+x, 70+y, 5, 5);
            }
        }
        else{
        
        }
        g2.draw(i);
    }
    
    public void dibujaricaso(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                i1.moveTo((0*EY)+x, 110+y);
                i1.curveTo((5*EY)+x,110+y,(20*EY)+x,90+y,(20*EY)+x,80+y);
                i1.moveTo((20*EY)+x,80+y);
                i1.curveTo((20*EY)+x,80+y,(20*EY)+x,143+y,(30*EY)+x,143+y);                
            }
            else{
                i1.moveTo((0*EY)+x, 110+y);
                i1.curveTo((5*EY)+x,110+y,(20*EY)+x,90+y,(20*EY)+x,80+y);
                i1.moveTo((20*EY)+x,80+y);
                i1.curveTo((20*EY)+x,80+y,(20*EY)+x,143+y,(30*EY)+x,143+y); 
            }
               
            if(subrayado==true){
                i1.moveTo((0*EY)+x, 153+y);
                i1.lineTo((30*EY)+x, 153+y);
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
            i1.moveTo((20*EY)+x,75+y);
            i1.lineTo((35*EY)+x,55+y);
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
    
    public void dibujarj(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                j.moveTo((0*EY)+x, 143+y);
                j.curveTo((20*EY)+x, 143+y, (40*EY)+x, 110+y, (40*EY)+x, 100+y);
                j.moveTo((40*EY)+x, 100+y);
                j.curveTo((40*EY)+x, 100+y, (40*EY)+x, 180+y, (15*EY)+x, 180+y);
                j.moveTo((15*EY)+x, 180+y);
                j.curveTo((0*EY)+x, 185+y, (-15*EY)+x, 180+y, (10*EY)+x, 160+y);
                j.moveTo((10*EY)+x, 160+y);
                j.curveTo((10*EY)+x, 160+y, (50*EY)+x, 140+y, (60*EY)+x, 143+y);
                g2.fillOval((40*EY)+x,80+y,10,10);
            }
            else{
                j.moveTo((0*EY)+x, 143+y);
                j.curveTo((30*EY)+x, 143+y, (30*EY)+x, 110+y, (30*EY)+x, 100+y);
                j.moveTo((30*EY)+x, 100+y);
                j.curveTo((30*EY)+x, 100+y, (40*EY)+x, 180+y, (15*EY)+x, 180+y);
                j.moveTo((15*EY)+x, 180+y);
                j.curveTo((0*EY)+x, 185+y, (-15*EY)+x, 180+y, (10*EY)+x, 160+y);
                j.moveTo((10*EY)+x, 160+y);
                j.curveTo((10*EY)+x, 160+y, (50*EY)+x, 140+y, (60*EY)+x, 143+y);
                g2.fillOval((25*EY)+x,80+y,10,10);
            }
            
            if(subrayado==true){
                j.moveTo((0*EY)+x, 153+y);
                j.lineTo((60*EY)+x, 153+y);
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
    
    public void dibujark(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                k.moveTo((0*EY)+x, 143+y);
                k.curveTo((110*EY)+x, 90+y, (30*EY)+x, -25+y, (50*EY)+x, 143+y);
                k.moveTo((43*EY)+x, 100+y);
                k.curveTo((50*EY)+x, 90+y, (90*EY)+x, 120+y, (45*EY)+x, 120+y);
                k.moveTo((55*EY)+x, 120+y);
                k.curveTo((60*EY)+x, 120+y, (80*EY)+x, 150+y, (80*EY)+x, 143+y);
            }
            else{                               
                k.moveTo((0*EY)+x, 143+y);
                k.curveTo((100*EY)+x, 90+y, (20*EY)+x, -25+y, (50*EY)+x, 143+y);
                k.moveTo((43*EY)+x, 100+y);
                k.curveTo((50*EY)+x, 90+y, (90*EY)+x, 120+y, (45*EY)+x, 120+y);
                k.moveTo((45*EY)+x, 120+y);
                k.curveTo((50*EY)+x, 120+y, (70*EY)+x, 150+y, (80*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                k.moveTo((0*EY)+x, 153+y);
                k.lineTo((100*EY)+x, 153+y);
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
    
    public void dibujarl(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                l.moveTo((0*EY)+x, 143+y);
                l.curveTo((45*EY)+x, 143+y, (55*EY)+x, 40+y, (35*EY)+x, 55+y);
                l.moveTo((35*EY)+x, 55+y);
                l.curveTo((20*EY)+x, 60+y, (30*EY)+x, 143+y, (40*EY)+x, 143+y);
            }
            else{
                l.moveTo((0*EY)+x, 143+y);
                l.curveTo((30*EY)+x, 143+y, (40*EY)+x, 40+y, (20*EY)+x, 55+y);
                l.moveTo((20*EY)+x, 55+y);
                l.curveTo((5*EY)+x, 60+y, (20*EY)+x, 143+y, (40*EY)+x, 143+y);
            }
             
            if(subrayado==true){
                l.moveTo((0*EY)+x, 153+y);
                l.lineTo((40*EY)+x, 153+y);
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
    
    public void dibujarlcaso(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                l1.moveTo((0*EY)+x,110+y);
                l1.curveTo((5*EY)+x,110+y,(30*EY)+x,60+y,(25*EY)+x,50+y);
                l1.curveTo((10*EY)+x,30+y,(10*EY)+x,143+y,(30*EY)+x,143+y);
            }
            else{
                l1.moveTo((0*EY)+x,110+y);
                l1.curveTo((5*EY)+x,110+y,(30*EY)+x,60+y,(25*EY)+x,50+y);
                l1.curveTo((10*EY)+x,30+y,(10*EY)+x,143+y,(30*EY)+x,143+y);
            }
            
            if(subrayado==true){
                l1.moveTo((0*EY)+x, 153+y);
                l1.lineTo((30*EY)+x, 153+y);
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

    public void dibujarm(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                m.moveTo((0*EY)+x, 143+y);
                m.curveTo((5*EY)+x, 143+y, (10*EY)+x, 105+y, (30*EY)+x, 100+y);
                m.moveTo((30*EY)+x, 100+y);
                m.curveTo((70*EY)+x, 100+y, (50*EY)+x, 143+y, (50*EY)+x, 143+y);
                m.moveTo((50*EY)+x, 143+y);
                m.curveTo((60*EY)+x, 80+y, (100*EY)+x, 80+y, (90*EY)+x, 143+y);
                m.moveTo((90*EY)+x, 143+y);
                m.curveTo((90*EY)+x, 80+y, (130*EY)+x, 90+y, (130*EY)+x, 130+y);
                m.moveTo((130*EY)+x, 130+y);
                m.curveTo((130*EY)+x, 150+y, (150*EY)+x, 143+y, (155*EY)+x, 143+y); 
            }
            else{
                m.moveTo((0*EY)+x, 143+y);
                m.curveTo((15*EY)+x, 143+y, (5*EY)+x, 105+y, (20*EY)+x, 100+y);
                m.moveTo((20*EY)+x, 100+y);
                m.curveTo((60*EY)+x, 100+y, (50*EY)+x, 143+y, (50*EY)+x, 143+y);
                m.moveTo((50*EY)+x, 143+y);
                m.curveTo((50*EY)+x, 80+y, (90*EY)+x, 80+y, (90*EY)+x, 143+y);
                m.moveTo((90*EY)+x, 143+y);
                m.curveTo((90*EY)+x, 80+y, (130*EY)+x, 90+y, (130*EY)+x, 130+y);
                m.moveTo((130*EY)+x, 130+y);
                m.curveTo((130*EY)+x, 150+y, (150*EY)+x, 143+y, (155*EY)+x, 143+y); 
            }
            
            if(subrayado==true){
                m.moveTo((0*EY)+x, 153+y);
                m.lineTo((155*EY)+x, 153+y);
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
    
    public void dibujarn(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                n.moveTo((0*EY)+x, 143+y);
                n.curveTo((15*EY)+x, 143+y, (10*EY)+x, 110+y, (30*EY)+x, 100+y);
                n.moveTo((30*EY)+x, 100+y);
                n.curveTo((70*EY)+x, 100+y, (50*EY)+x, 165+y, (50*EY)+x, 143+y);
                n.moveTo((50*EY)+x, 143+y);
                n.curveTo((50*EY)+x, 143+y, (50*EY)+x, 100+y, (70*EY)+x, 100+y);
                n.moveTo((70*EY)+x, 100+y);
                n.curveTo((105*EY)+x, 100+y, (80*EY)+x, 143+y, (95*EY)+x, 143+y);
            }
            else{
                n.moveTo((0*EY)+x, 143+y);
                n.curveTo((15*EY)+x, 143+y, (5*EY)+x, 110+y, (20*EY)+x, 100+y);
                n.moveTo((20*EY)+x, 100+y);
                n.curveTo((60*EY)+x, 100+y, (50*EY)+x, 165+y, (50*EY)+x, 143+y);
                n.moveTo((50*EY)+x, 143+y);
                n.curveTo((50*EY)+x, 143+y, (40*EY)+x, 100+y, (70*EY)+x, 100+y);
                n.moveTo((70*EY)+x, 100+y);
                n.curveTo((95*EY)+x, 100+y, (80*EY)+x, 143+y, (95*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                n.moveTo((0*EY)+x, 153+y);
                n.lineTo((95*EY)+x, 153+y);
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
    
    public void dibujarñ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                ñ.moveTo((0*EY)+x, 143+y);
                ñ.curveTo((15*EY)+x, 143+y, (10*EY)+x, 110+y, (30*EY)+x, 100+y);
                ñ.moveTo((30*EY)+x, 100+y);
                ñ.curveTo((70*EY)+x, 100+y, (50*EY)+x, 165+y, (50*EY)+x, 143+y);
                ñ.moveTo((50*EY)+x, 143+y);
                ñ.curveTo((50*EY)+x, 143+y, (50*EY)+x, 100+y, (70*EY)+x, 100+y);
                ñ.moveTo((70*EY)+x, 100+y);
                ñ.curveTo((105*EY)+x, 100+y, (80*EY)+x, 143+y, (95*EY)+x, 143+y);
                ñ.moveTo((10*EY)+x, 80+y);
                ñ.curveTo((40*EY)+x, 40+y, (60*EY)+x, 100+y, (90*EY)+x, 70+y);
            }
            else{
                ñ.moveTo((0*EY)+x, 143+y);
                ñ.curveTo((15*EY)+x, 143+y, (5*EY)+x, 110+y, (20*EY)+x, 100+y);
                ñ.moveTo((20*EY)+x, 100+y);
                ñ.curveTo((60*EY)+x, 100+y, (50*EY)+x, 173+y, (50*EY)+x, 143+y);
                ñ.moveTo((50*EY)+x, 143+y);
                ñ.curveTo((50*EY)+x, 80+y, (90*EY)+x, 80+y, (90*EY)+x, 143+y);
                ñ.moveTo((90*EY)+x, 143+y);
                ñ.curveTo((90*EY)+x, 150+y, (100*EY)+x, 143+y, (100*EY)+x, 143+y);
                ñ.moveTo((10*EY)+x, 80+y);
                ñ.curveTo((40*EY)+x, 40+y, (60*EY)+x, 100+y, (90*EY)+x, 70+y);
            }
            
            if(subrayado==true){
                ñ.moveTo((0*EY)+x, 153+y);
                ñ.lineTo((10*EY)+x, 153+y);
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
    
    public void dibujaro(Graphics2D g2, int x, int y, boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                o.moveTo((0*EY)+x, 143+y);
                o.curveTo((10*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                o.moveTo((20*EY)+x, 120+y);
                o.curveTo((30*EY)+x, 90+y, (80*EY)+x, 90+y, (70*EY)+x, 120+y);
                o.moveTo((20*EY)+x, 120+y);
                o.curveTo((10*EY)+x, 160+y, (60*EY)+x, 160+y, (70*EY)+x, 120+y);
                o.moveTo((24*EY)+x,110+y);
                o.curveTo((30*EY)+x,130+y,(50*EY)+x,130+y,(90*EY)+x,143+y);
            }
            else{
                o.moveTo((0*EY)+x, 143+y);
                o.curveTo((20*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                o.moveTo((20*EY)+x, 120+y);
                o.curveTo((20*EY)+x, 90+y, (70*EY)+x, 90+y, (70*EY)+x, 120+y);
                o.moveTo((20*EY)+x, 120+y);
                o.curveTo((20*EY)+x, 160+y, (70*EY)+x, 160+y, (70*EY)+x, 120+y);
                o.moveTo((22*EY)+x,110+y);
                o.curveTo((30*EY)+x,130+y,(50*EY)+x,130+y,(90*EY)+x,143+y);
            }
            
            if(subrayado==true){
                o.moveTo((0*EY)+x, 153+y);
                o.lineTo((90*EY)+x, 153+y);
            }
            if(tilde==true){
                o.moveTo((45*EY)+x,90+y);
                o.lineTo((70*EY)+x,70+y);
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
    
        public void dibujarocaso(Graphics2D g2, int x, int y,boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                o1.moveTo((0*EY)+x, 120+y);
                o1.curveTo((0*EY)+x, 90+y, (50*EY)+x, 90+y, (50*EY)+x, 120+y);
                o1.moveTo((0*EY)+x, 120+y);
                o1.curveTo((0*EY)+x, 160+y, (50*EY)+x, 160+y, (50*EY)+x, 120+y);
                o1.moveTo((2*EY)+x,110+y);
                o1.curveTo((10*EY)+x,130+y,(30*EY)+x,130+y,(60*EY)+x,143+y);
            }
            else{
                o1.moveTo((0*EY)+x, 120+y);
                o1.curveTo((0*EY)+x, 90+y, (50*EY)+x, 90+y, (50*EY)+x, 120+y);
                o1.moveTo((0*EY)+x, 120+y);
                o1.curveTo((0*EY)+x, 160+y, (50*EY)+x, 160+y, (50*EY)+x, 120+y);
                o1.moveTo((2*EY)+x,110+y);
                o1.curveTo((10*EY)+x,130+y,(30*EY)+x,130+y,(60*EY)+x,143+y);
            }
            
            if(subrayado==true){
                o1.moveTo((0*EY)+x, 153+y);
                o1.lineTo((60*EY)+x, 153+y);
            }
            if(tilde==true){
                o1.moveTo((25*EY)+x,85+y);
                o1.lineTo((45*EY)+x,70+y);
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
    
    public void dibujarp(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                p.moveTo((0*EY)+x, 143+y);
                p.curveTo((15*EY)+x, 143+y, (30*EY)+x, 110+y, (40*EY)+x, 100+y);
                p.moveTo((40*EY)+x, 100+y);
                p.curveTo((45*EY)+x, 110+y, (25*EY)+x, 170+y, (15*EY)+x, 180+y);
                p.moveTo((40*EY)+x, 100+y);
                p.curveTo((60*EY)+x, 60+y, (105*EY)+x, 145+y, (33*EY)+x, 143+y);
                p.moveTo((30*EY)+x, 130+y);
                p.curveTo((70*EY)+x, 120+y, (60*EY)+x, 150+y, (100*EY)+x, 143+y);
                p.moveTo((30*EY)+x, 130+y);
                p.curveTo((20*EY)+x, 135+y, (23*EY)+x, 145+y, (33*EY)+x, 143+y);
            }
            else{
                p.moveTo((0*EY)+x, 143+y);
                p.curveTo((35*EY)+x, 143+y, (30*EY)+x, 110+y, (30*EY)+x, 100+y);
                p.moveTo((30*EY)+x, 100+y);
                p.curveTo((35*EY)+x, 110+y, (35*EY)+x, 170+y, (25*EY)+x, 180+y);
                p.moveTo((30*EY)+x, 100+y);
                p.curveTo((60*EY)+x, 70+y, (105*EY)+x, 145+y, (33*EY)+x, 143+y);
                p.moveTo((30*EY)+x, 130+y);
                p.curveTo((70*EY)+x, 120+y, (60*EY)+x, 150+y, (100*EY)+x, 143+y);
                p.moveTo((30*EY)+x, 130+y);
                p.curveTo((20*EY)+x, 135+y, (23*EY)+x, 145+y, (33*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                p.moveTo((0*EY)+x, 153+y);
                p.lineTo((100*EY)+x, 153+y);
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
    
    public void dibujarq(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                q.moveTo((0*EY)+x, 143+y);
                q.curveTo((10*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                q.moveTo((20*EY)+x,120+y);
                q.curveTo((30*EY)+x,90+y,(70*EY)+x,90+y,(60*EY)+x,120+y);
                q.moveTo((20*EY)+x,120+y);
                q.curveTo((10*EY)+x,150+y,(50*EY)+x,150+y,(60*EY)+x,120+y);
                q.moveTo ((60*EY)+x,120+y);
                q.curveTo((50*EY)+x,120+y,(40*EY)+x,240+y,(70*EY)+x,170+y);
                q.moveTo((70*EY)+x,170+y);
                q.curveTo((70*EY)+x,170+y,(80*EY)+x,150+y,(30*EY)+x,150+y);
                q.moveTo((30*EY)+x,150+y);
                q.curveTo((20*EY)+x,150+y,(30*EY)+x,200+y,(80*EY)+x,143+y);
            }
            else{
                q.moveTo((0*EY)+x, 143+y);
                q.curveTo((20*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 120+y);
                q.moveTo((20*EY)+x,120+y);
                q.curveTo((20*EY)+x,90+y,(60*EY)+x,90+y,(60*EY)+x,120+y);
                q.moveTo((20*EY)+x,120+y);
                q.curveTo((20*EY)+x,150+y,(60*EY)+x,150+y,(60*EY)+x,120+y);
                q.moveTo((20*EY)+x,120+y);
                q.moveTo ((60*EY)+x,120+y);
                q.curveTo((60*EY)+x,120+y,(50*EY)+x,240+y,(80*EY)+x,170+y);
                q.moveTo((80*EY)+x,170+y);
                q.curveTo((80*EY)+x,170+y,(90*EY)+x,150+y,(40*EY)+x,150+y);
                q.moveTo((40*EY)+x,150+y);
                q.curveTo((30*EY)+x,150+y,(40*EY)+x,200+y,(80*EY)+x,143+y);
            }
            
            if(subrayado==true){
                q.moveTo((0*EY)+x, 153+y);
                q.lineTo((80*EY)+x, 153+y);
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
    
    public void dibujarr(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                r.moveTo((0*EY)+x, 143+y);
                r.curveTo((5*EY)+x, 143+y, (20*EY)+x,100+y, (20*EY)+x, 100+y);
                r.moveTo((20*EY)+x, 100+y);
                r.curveTo((15*EY)+x, 110+y, (70*EY)+x, 110+y, (60*EY)+x, 100+y);
                r.moveTo((60*EY)+x, 100+y);
                r.curveTo((60*EY)+x, 115+y, (60*EY)+x,143+y, (70*EY)+x, 143+y);
            }
            else{
                r.moveTo((0*EY)+x, 143+y);
                r.curveTo((15*EY)+x, 143+y, (10*EY)+x,100+y, (10*EY)+x, 100+y);
                r.moveTo((10*EY)+x, 100+y);
                r.curveTo((15*EY)+x, 110+y, (60*EY)+x, 110+y, (60*EY)+x, 100+y);
                r.moveTo((60*EY)+x, 100+y);
                r.curveTo((60*EY)+x, 115+y, (60*EY)+x,143+y, (70*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                r.moveTo((0*EY)+x, 153+y);
                r.lineTo((70*EY)+x, 153+y);
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
    
    public void dibujarrcaso(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                r1.moveTo((0*EY)+x,110+y);
                r1.curveTo((5*EY)+x,100+y,(10*EY)+x,80+y,(15*EY)+x,80+y);
                r1.curveTo((20*EY)+x,80+y,(20*EY)+x,85+y,(35*EY)+x,80+y);
                r1.curveTo((40*EY)+x,80+y,(35*EY)+x,143+y, (45*EY)+x,143+y);
            }
            else{
                r1.moveTo((0*EY)+x,110+y);
                r1.curveTo((5*EY)+x,100+y,(10*EY)+x,80+y,(15*EY)+x,80+y);
                r1.curveTo((20*EY)+x,80+y,(20*EY)+x,85+y,(35*EY)+x,80+y);
                r1.curveTo((40*EY)+x,80+y,(35*EY)+x,143+y, (45*EY)+x,143+y);
            }
            
            if(subrayado==true){
                r1.moveTo((0*EY)+x, 153+y);
                r1.lineTo((45*EY)+x, 153+y);
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
    
    public void dibujars(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                s.moveTo((0*EY)+x, 143+y);
                s.curveTo((10*EY)+x, 143+y, (30*EY)+x,100+y, (30*EY)+x, 100+y);
                s.moveTo((30*EY)+x, 100+y);
                s.curveTo((80*EY)+x, 120+y, (70*EY)+x,135+y, (70*EY)+x, 143+y);
                s.moveTo((40*EY)+x, 140+y);
                s.curveTo((44*EY)+x, 147+y, (80*EY)+x,145+y, (85*EY)+x, 143+y);
            }
            else{
                s.moveTo((0*EY)+x, 143+y);
                s.curveTo((20*EY)+x, 143+y, (25*EY)+x,100+y, (25*EY)+x, 100+y);
                s.moveTo((25*EY)+x, 100+y);
                s.curveTo((80*EY)+x, 120+y, (70*EY)+x,135+y, (70*EY)+x, 143+y);
                s.moveTo((40*EY)+x, 140+y);
                s.curveTo((44*EY)+x, 147+y, (80*EY)+x,145+y, (85*EY)+x, 143+y); 
            }
              
            if(subrayado==true){
                s.moveTo((0*EY)+x, 153+y);
                s.lineTo((85*EY)+x, 153+y);
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
    
    public void dibujart(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                t.moveTo((0*EY)+x,143+y);
                t.curveTo((10*EY)+x,133+y,(20*EY)+x,143+y, (30*EY)+x, 55+y);
                t.moveTo((30*EY)+x,55+y);
                t.curveTo((20*EY)+x,143+y,(20*EY)+x,133+y,(40*EY)+x,143+y);
                t.moveTo((10*EY)+x,75+y);
                t.curveTo((0*EY)+x,75+y,(40*EY)+x,80+y,(40*EY)+x,80+y);
            }
            else{
                t.moveTo((0*EY)+x,143+y);
                t.curveTo((20*EY)+x,133+y,(20*EY)+x,143+y, (20*EY)+x, 55+y);
                t.moveTo((20*EY)+x,55+y);
                t.curveTo((20*EY)+x,143+y,(20*EY)+x,133+y,(40*EY)+x,143+y);
                t.moveTo((0*EY)+x,80+y);
                t.curveTo((0*EY)+x,80+y,(40*EY)+x,80+y,(40*EY)+x,80+y);
            }
            
            if(subrayado==true){
                t.moveTo((0*EY)+x, 153+y);
                t.lineTo((40*EY)+x, 153+y);
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
    
    public void dibujaru(Graphics2D g2, int x, int y,boolean bandera,boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                u.moveTo((0*EY)+x, 143+y);
                u.curveTo((10*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 100+y);
                u.moveTo((20*EY)+x, 100+y);
                u.curveTo((10*EY)+x, 160+y, (60*EY)+x, 160+y, (70*EY)+x, 100+y);
                u.moveTo((70*EY)+x, 100+y);
                u.curveTo((70*EY)+x,110+y, (60*EY)+x, 143+y, (90*EY)+x, 143+y);
            }
            else{
                u.moveTo((0*EY)+x, 143+y);
                u.curveTo((20*EY)+x, 143+y, (20*EY)+x, 130+y, (20*EY)+x, 100+y);
                u.moveTo((20*EY)+x, 100+y);
                u.curveTo((20*EY)+x, 160+y, (70*EY)+x, 160+y, (70*EY)+x, 100+y);
                u.moveTo((70*EY)+x, 100+y);
                u.curveTo((70*EY)+x, 120+y, (70*EY)+x, 143+y, (90*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                u.moveTo((0*EY)+x, 153+y);
                u.lineTo((90*EY)+x, 153+y);
            }
            if(tilde==true){
                u.moveTo((45*EY)+x,90+y);
                u.lineTo((70*EY)+x,70+y);
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
    
    public void dibujarucaso(Graphics2D g2, int x, int y,boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva,boolean EspejoY){
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
                u1.moveTo((0*EY)+x, 110+y);
                u1.curveTo((0*EY)+x, 160+y, (50*EY)+x, 160+y, (50*EY)+x, 110+y);
                u1.moveTo((50*EY)+x, 110+y);
                u1.curveTo((50*EY)+x, 120+y, (50*EY)+x, 143+y, (70*EY)+x, 143+y);
            }
            else{
                u1.moveTo((0*EY)+x, 110+y);
                u1.curveTo((0*EY)+x, 160+y, (50*EY)+x, 160+y, (50*EY)+x, 110+y);
                u1.moveTo((50*EY)+x, 110+y);
                u1.curveTo((50*EY)+x, 120+y, (50*EY)+x, 143+y, (70*EY)+x, 143+y);
            }
            
            if(subrayado==true){
                u1.moveTo((0*EY)+x, 153+y);
                u1.lineTo((70*EY)+x, 153+y);
            }
            if(tilde==true){
                u1.moveTo((25*EY)+x,90+y);
                u1.lineTo((45*EY)+x,70+y);
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
    
    public void dibujarv(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY) {
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
                v.moveTo((0*EY) + x, 143 + y);
                v.curveTo((10*EY) + x, 143 + y, (10*EY) + x, 100 + y, (35*EY) + x, 100 + y);
                v.moveTo((35*EY) + x, 100 + y);
                v.curveTo((50*EY) + x, 100 + y, (25*EY) + x, 143 + y, (45*EY) + x, 143 + y);
                v.moveTo((45*EY) + x, 143 + y);
                v.curveTo((65*EY) + x, 143 + y, (80*EY) + x, 100 + y, (80*EY) + x, 100 + y);
                v.moveTo((80*EY) + x, 100 + y);
                v.curveTo((90*EY) + x, 105 + y, (105*EY) + x, 115 + y, (110*EY) + x, 110 + y);
            } else {
                v.moveTo((0*EY) + x, 143 + y);
                v.curveTo((20*EY) + x, 143 + y, (0*EY) + x, 100 + y, (25*EY) + x, 100 + y);
                v.moveTo((25*EY) + x, 100 + y);
                v.curveTo((50*EY) + x, 100 + y, (35*EY) + x, 143 + y, (55*EY) + x, 143 + y);
                v.moveTo((55*EY) + x, 143 + y);
                v.curveTo((75*EY) + x, 143 + y, (70*EY) + x, 100 + y, (70*EY) + x, 100 + y);
                v.moveTo((70*EY) + x, 100 + y);
                v.curveTo((80*EY) + x, 105 + y, (105*EY) + x, 115 + y, (110*EY) + x, 110 + y);
            }

            if (subrayado == true) {
                v.moveTo((0 * EY) + x, 153 + y);
                v.lineTo((110 * EY) + x, 153 + y);
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

    public void dibujarw(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY) {
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
                w.moveTo((0 * EY) + x, 143 + y);
                w.curveTo((10 * EY) + x, 143 + y, (10 * EY) + x, 100 + y, (25 * EY) + x, 100 + y);
                w.moveTo((25 * EY) + x, 100 + y);
                w.curveTo((60 * EY) + x, 100 + y, (15 * EY) + x, 143 + y, (35 * EY) + x, 143 + y);
                w.moveTo((35 * EY) + x, 143 + y);
                w.curveTo((75 * EY) + x, 153 + y, (65 * EY) + x, 100 + y, (75 * EY) + x, 100 + y);
                w.moveTo((75 * EY) + x, 100 + y);
                w.curveTo((75 * EY) + x, 100 + y, (45 * EY) + x, 153 + y, (95 * EY) + x, 143 + y);
                w.moveTo((95 * EY) + x, 143 + y);
                w.curveTo((100 * EY) + x, 143 + y, (110 * EY) + x, 100 + y, (110 * EY) + x, 100 + y);
                w.moveTo((110 * EY) + x, 100 + y);
                w.curveTo((120 * EY) + x, 105 + y, (150 * EY) + x, 115 + y, (150 * EY) + x, 110 + y);
            } else {
                w.moveTo((0 * EY) + x, 143 + y);
                w.curveTo((10 * EY) + x, 143 + y, (0 * EY) + x, 100 + y, (15 * EY) + x, 100 + y);
                w.moveTo((15 * EY) + x, 100 + y);
                w.curveTo((50 * EY) + x, 100 + y, (25 * EY) + x, 143 + y, (45 * EY) + x, 143 + y);
                w.moveTo((45 * EY) + x, 143 + y);
                w.curveTo((85 * EY) + x, 153 + y, (75 * EY) + x, 100 + y, (75 * EY) + x, 100 + y);
                w.moveTo((75 * EY) + x, 100 + y);
                w.curveTo((75 * EY) + x, 100 + y, (65 * EY) + x, 153 + y, (105 * EY) + x, 143 + y);
                w.moveTo((105 * EY) + x, 143 + y);
                w.curveTo((120 * EY) + x, 143 + y, (120 * EY) + x, 100 + y, (120 * EY) + x, 100 + y);
                w.moveTo((120 * EY) + x, 100 + y);
                w.curveTo((120 * EY) + x, 105 + y, (150 * EY) + x, 115 + y, (150 * EY) + x, 110 + y);
            }

            if (subrayado == true) {
                w.moveTo((0 * EY) + x, 153 + y);
                w.lineTo((150 * EY) + x, 153 + y);
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

    public void dibujarx1(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY) {
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
                x1.moveTo((0 * EY) + x, 143 + y);
                x1.curveTo((40 * EY) + x, 143 + y, (40 * EY) + x, 100 + y, (60 * EY) + x, 100 + y);
                x1.moveTo((0 * EY) + x, 100 + y);
                x1.curveTo((30 * EY) + x, 100 + y, (30 * EY) + x, 143 + y, (60 * EY) + x, 143 + y);
            } else {
                x1.moveTo((0 * EY) + x, 143 + y);
                x1.curveTo((40 * EY) + x, 143 + y, (40 * EY) + x, 100 + y, (60 * EY) + x, 100 + y);
                x1.moveTo((0 * EY) + x, 100 + y);
                x1.curveTo((30 * EY) + x, 100 + y, (30 * EY) + x, 143 + y, (60 * EY) + x, 143 + y);
            }

            if (subrayado == true) {
                x1.moveTo((0 * EY) + x, 153 + y);
                x1.lineTo((60 * EY) + x, 153 + y);
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

    public void dibujary1(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY) {
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
                y1.moveTo((0 * EY) + x, 143 + y);
                y1.curveTo((0 * EY) + x, 143 + y, (30 * EY) + x, 143 + y, (40 * EY) + x, 100 + y);
                y1.moveTo((40 * EY) + x, 100 + y);
                y1.curveTo((10 * EY) + x, 174 + y, (78 * EY) + x, 138 + y, (78 * EY) + x, 138 + y);
                y1.moveTo((90 * EY) + x, 100 + y);
                y1.curveTo((80 * EY) + x, 100 + y, (70 * EY) + x, 200 + y, (70 * EY) + x, 200 + y);
                y1.moveTo((70 * EY) + x, 200 + y);
                y1.curveTo((70 * EY) + x, 225 + y, (30 * EY) + x, 225 + y, (30 * EY) + x, 200 + y);
                y1.moveTo((30 * EY) + x, 200 + y);
                y1.curveTo((30 * EY) + x, 180 + y, (50 * EY) + x, 143 + y, (120 * EY) + x, 143 + y);
            } else {
                y1.moveTo((0 * EY) + x, 143 + y);
                y1.curveTo((0 * EY) + x, 143 + y, (30 * EY) + x, 143 + y, (30 * EY) + x, 100 + y);
                y1.moveTo((30 * EY) + x, 100 + y);
                y1.curveTo((20 * EY) + x, 174 + y, (80 * EY) + x, 138 + y, (80 * EY) + x, 138 + y);
                y1.moveTo((80 * EY) + x, 100 + y);
                y1.curveTo((80 * EY) + x, 100 + y, (80 * EY) + x, 200 + y, (80 * EY) + x, 200 + y);
                y1.moveTo((80 * EY) + x, 200 + y);
                y1.curveTo((80 * EY) + x, 225 + y, (40 * EY) + x, 225 + y, (40 * EY) + x, 200 + y);
                y1.moveTo((40 * EY) + x, 200 + y);
                y1.curveTo((40 * EY) + x, 180 + y, (60 * EY) + x, 143 + y, (120 * EY) + x, 143 + y);
            }

            if (subrayado == true) {
                y1.moveTo((0 * EY) + x, 153 + y);
                y1.lineTo((120 * EY) + x, 153 + y);
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

    public void dibujarz(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, boolean EspejoY) {
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
                z.moveTo((0 * EY) + x, 143 + y);
                z.curveTo((25 * EY) + x, 143 + y, (35 * EY) + x, 100 + y, (50 * EY) + x, 100 + y);
                z.moveTo((50 * EY) + x, 100 + y);
                z.curveTo((70 * EY) + x, 100 + y, (50 * EY) + x, 143 + y, (30 * EY) + x, 143 + y);
                z.moveTo((30 * EY) + x, 143 + y);
                z.curveTo((70 * EY) + x, 130 + y, (50 * EY) + x, 200 + y, (30 * EY) + x, 200 + y);
                z.moveTo((70 * EY) + x, 143 + y);
                z.curveTo((60 * EY) + x, 150 + y, (20 * EY) + x, 175 + y, (30 * EY) + x, 200 + y);
            } else {
                z.moveTo((0 * EY) + x, 143 + y);
                z.curveTo((25 * EY) + x, 143 + y, (25 * EY) + x, 100 + y, (40 * EY) + x, 100 + y);
                z.moveTo((40 * EY) + x, 100 + y);
                z.curveTo((70 * EY) + x, 100 + y, (60 * EY) + x, 143 + y, (40 * EY) + x, 143 + y);
                z.moveTo((40 * EY) + x, 143 + y);
                z.curveTo((80 * EY) + x, 130 + y, (60 * EY) + x, 200 + y, (40 * EY) + x, 200 + y);
                z.moveTo((70 * EY) + x, 143 + y);
                z.curveTo((60 * EY) + x, 150 + y, (30 * EY) + x, 175 + y, (40 * EY) + x, 200 + y);
            }

            if (subrayado == true) {
                z.moveTo((0 * EY) + x, 153 + y);
                z.lineTo((70 * EY) + x, 153 + y);
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