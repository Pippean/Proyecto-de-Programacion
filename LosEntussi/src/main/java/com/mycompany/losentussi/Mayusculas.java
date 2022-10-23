package com.mycompany.losentussi;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/**
 *
 * @author Pipe, Juano, Lázaro
 */
public class Mayusculas {
    
    public Mayusculas(){
        
    }
    public void dibujarA(Graphics2D g2, int x, int y, boolean bandera,boolean tilde,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double A = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                A.moveTo(40+x, 55+y);
                A.curveTo(0+x, 55+y, 0+x, 143+y, 40+x, 143+y);
                A.moveTo(40+x, 55+y);
                A.curveTo(80+x, 55+y, 80+x, 143+y, 40+x, 143+y);
                A.moveTo(70+x, 110+y);
                A.curveTo(70+x, 110+y, 70+x, 143+y, 100+x, 143+y);
            }
            if(subrayado == true){
                A.moveTo(0+x,153+y);
                A.lineTo(110+x, 153+y);
            }
            if(tilde == true){
            A.moveTo(40+x,50+y);
            A.lineTo(60+x,30+y);
            if(bandera==true){
                g2.fillOval(40+x, 50+y, 5, 5);
                g2.fillOval(60+x,30+y , 5, 5);
                }
            }
            x+=1;
            
        }
        
        if(bandera == true){
            g2.fillOval(40+x,55+y, 5, 5);
            g2.fillOval(0+x,55+y, 5, 5);
            g2.fillOval(0+x,143+y, 5, 5);
            g2.fillOval(40+x,143+y, 5, 5);
            g2.fillOval(80+x,55+y, 5, 5);
            g2.fillOval(80+x,143+y, 5, 5);
            g2.fillOval(70+x,110+y, 5, 5);
            g2.fillOval(70+x,143+y, 5, 5);
            g2.fillOval(100+x,143+y, 5, 5);
        }
        
        
        g2.draw(A);
    }
    
    public void dibujarB(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double B = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                B.moveTo(0+x, 70+y);
                B.curveTo(0+x,70+y, 10+x, 65+y, 10+x, 55+y);
                B.moveTo(10+x, 55+y);
                B.curveTo(10+x, 55+y, 10+x, 143+y, 10+x, 143+y);
                B.moveTo(10+x, 55+y);
                B.curveTo(60+x, 45+y, 60+x, 100+y, 30+x, 100+y);
                B.moveTo(30+x, 100+y);
                B.curveTo(60+x, 100+y, 60+x, 153+y, 10+x, 143+y);
            }
            if(subrayado == true){
                B.moveTo(0+x, 153+y);
                B.lineTo(70+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){
            g2.fillOval(0+x,70+y, 5, 5);
            g2.fillOval(10+x,65+y, 5, 5);
            g2.fillOval(10+x,55+y, 5, 5);
            g2.fillOval(10+x,143+y, 5, 5);
            g2.fillOval(60+x,45+y, 5, 5);
            g2.fillOval(60+x,100+y, 5, 5);
            g2.fillOval(30+x,100+y, 5, 5);
            g2.fillOval(60+x,153+y, 5, 5);
        }
        
        g2.draw(B);
      
    }
    
    public void dibujarC(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double C = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                C.moveTo(70+x, 55+y);
        C.curveTo(0+x, 45+y, 0+x, 153+y, 70+x, 143+y);
            }
            if(subrayado == true){
                C.moveTo(0+x, 153+y);
                C.lineTo(80+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(70+x,55+y, 5, 5);
            g2.fillOval(0+x,45+y, 5, 5);
            g2.fillOval(0+x,154+y, 5, 5);
            g2.fillOval(70+x,143+y, 5, 5);
        }
    
        g2.draw(C);
    }
    
    public void dibujarD(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double D = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                D.moveTo(55+x, 55+y);
                D.curveTo(45+x, 65+y, 60+x, 120+y, 47+x, 130+y);
                D.moveTo(47+x, 130+y);       
                D.curveTo(30+x, 160+y, 0+x, 128+y, 30+x, 130+y);
                D.moveTo(30+x, 130+y);       
                D.curveTo(40+x, 145+y, 100+x, 155+y, 110+x, 100+y);
                D.moveTo(110+x, 100+y);       
                D.curveTo(110+x, 60+y, 75+x, 45+y, 30+x, 55+y);
            }
            if(subrayado == true){
                D.moveTo(0+x, 153+y);
                D.lineTo(120+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(55+x,55+y,5,5);
            g2.fillOval(45+x,65+y,5,5);
            g2.fillOval(60+x,120+y,5,5);
            g2.fillOval(47+x,130+y,5,5);
            g2.fillOval(30+x,160+y,5,5);
            g2.fillOval(0+x,128+y,5,5);
            g2.fillOval(30+x,130+y,5,5);
            g2.fillOval(40+x,145+y,5,5);
            g2.fillOval(100+x,155+y,5,5);
            g2.fillOval(110+x,100+y,5,5);
            g2.fillOval(110+x,60+y,5,5);
            g2.fillOval(75+x,45+y,5,5);
            g2.fillOval(30+x,55+y,5,5);
        }
    
        g2.draw(D);
    }
    
    public void dibujarE(Graphics2D g2, int x, int y, boolean bandera, boolean tilde,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double E = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                E.moveTo(10+x, 60+y);
                E.curveTo(30+x, 50+y, 50+x, 65+y, 70+x, 55+y);
                E.moveTo(40+x, 57+y);
                E.curveTo(40+x, 55+y, 50+x, 133+y, 10+x, 143+y);
                E.moveTo(40+x, 100+y);
                E.curveTo(40+x, 100+y, 60+x, 100+y, 55+x, 100+y);
                E.moveTo(10+x, 143+y);
                E.curveTo(30+x, 130+y, 50+x, 145+y, 70+x, 143+y);
            }
            if(subrayado == true){
                E.moveTo(0+x, 153+y);
                E.lineTo(80+x, 153+y);
            }
            if(tilde==true){
            E.moveTo(40+x,50+y);
            E.lineTo(60+x, 30+y);
            if(bandera==true){
                g2.fillOval(40+x, 50+y, 5, 5);
                g2.fillOval(60+x,30+ y, 5, 5);
            }
        }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(10+x,60+y,5,5);
            g2.fillOval(30+x,50+y,5,5);
            g2.fillOval(50+x,65+y,5,5);
            g2.fillOval(70+x,55+y,5,5);
            g2.fillOval(40+x,57+y,5,5);
            g2.fillOval(50+x,130+y,5,5);
            g2.fillOval(10+x,143+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(60+x,100+y,5,5);
            g2.fillOval(55+x,100+y,5,5);
            g2.fillOval(10+x,143+y,5,5);
            g2.fillOval(30+x,130+y,5,5);
            g2.fillOval(50+x,145+y,5,5);
            g2.fillOval(70+x,143+y,5,5);
        }
    
        g2.draw(E);
    } 
    
    public void dibujarF(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double F = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                F.moveTo(10+x, 60+y);
                F.curveTo(30+x, 50+y, 50+x, 65+y, 70+x, 55+y);
                F.moveTo(40+x, 57+y);
                F.curveTo(40+x, 55+y, 50+x, 133+y, 10+x, 143+y);
                F.moveTo(20+x, 100+y);
                F.curveTo(20+x, 100+y, 40+x, 100+y, 55+x, 100+y);
            }
            if(subrayado == true){
                F.moveTo(0+x, 153+y);
                F.lineTo(80+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(10+x,60+y,5,5);
            g2.fillOval(30+x,50+y,5,5);
            g2.fillOval(50+x,65+y,5,5);
            g2.fillOval(70+x,55+y,5,5);
            g2.fillOval(40+x,57+y,5,5);
            g2.fillOval(50+x,133+y,5,5);
            g2.fillOval(10+x,143+y,5,5);
            g2.fillOval(20+x,100+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(55+x,100+y,5,5);
        }
        g2.draw(F);
    } 
    
    public void dibujarG(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double G = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                G.moveTo(60+x, 65+y);
                G.curveTo(0+x, 55+y, 0+x, 153+y, 40+x, 143+y);
                G.moveTo(40+x, 143+y);
                G.curveTo(60+x, 143+y, 70+x, 110+y, 70+x, 100+y);
                G.moveTo(70+x, 100+y);
                G.curveTo(70+x, 100+y, 80+x, 180+y, 55+x, 180+y);
                G.moveTo(55+x, 180+y);
                G.curveTo(40+x, 185+y, 15+x, 180+y, 50+x, 160+y);
                G.moveTo(50+x, 160+y);
                G.curveTo(50+x, 160+y, 90+x, 140+y, 100+x, 143+y);
            }
            if(subrayado == true){
                G.moveTo(0+x, 153+y);
                G.lineTo(120+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(60+x,65+y,5,5);
            g2.fillOval(0+x,55+y,5,5);
            g2.fillOval(0+x,153+y,5,5);
            g2.fillOval(40+x,143+y,5,5);
            g2.fillOval(60+x,143+y,5,5);
            g2.fillOval(70+x,110+y,5,5);
            g2.fillOval(70+x,100+y,5,5);
            g2.fillOval(80+x,180+y,5,5);
            g2.fillOval(55+x,180+y,5,5);
            g2.fillOval(40+x,185+y,5,5);
            g2.fillOval(15+x,180+y,5,5);
            g2.fillOval(50+x,160+y,5,5);
            g2.fillOval(90+x,140+y,5,5);
            g2.fillOval(100+x,143+y,5,5);
        }
        g2.draw(G);
    } 
    
    public void dibujarH(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double H = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                H.moveTo(0+x,55+y);
                H.curveTo(0+x,60+y,30+x,60+y,30+x,55+y);
                H.moveTo(30+x,55+y);
                H.curveTo(50+x,170+y,0+x,170+y,0+x,140+y);
                H.moveTo(0+x,140+y);
                H.curveTo(0+x,120+y,60+x,80+y,60+x,80+y);
                H.moveTo(60+x,80+y);
                H.curveTo(80+x,70+y,60+x,40+y,50+x,60+y);
                H.moveTo(50+x,60+y);
                H.curveTo(50+x,150+y,70+x,143+y,80+x,143+y);
            }
            if(subrayado == true){
                H.moveTo(0+x, 153+y);
                H.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            H.moveTo(0+x,55+y);
            H.curveTo(0+x,60+y,30+x,60+y,30+x,55+y);
            H.moveTo(30+x,55+y);
            H.curveTo(50+x,170+y,0+x,170+y,0+x,140+y);
            H.moveTo(0+x,140+y);
            H.curveTo(0+x,120+y,60+x,80+y,60+x,80+y);
            H.moveTo(60+x,80+y);
            H.curveTo(80+x,70+y,60+x,40+y,50+x,60+y);
            H.moveTo(50+x,60+y);
            H.curveTo(50+x,150+y,70+x,143+y,80+x,143+y);
        }
        g2.draw(H);
    } 
    
    public void dibujarI(Graphics2D g2, int x, int y, boolean bandera, boolean tilde,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double I = new Path2D.Double();
       int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                I.moveTo(0+x,55+y);
                I.curveTo(0+x,65+y,40+x,65+y,50+x,55+y);
                I.moveTo(50+x,55+y);
                I.curveTo(70+x,170+y,0+x,170+y,0+x,130+y);
            }
            if(subrayado == true){
                I.moveTo(0+x, 153+y);
                I.lineTo(70+x, 153+y);
            }
            if(tilde==true){
            I.moveTo(25+x,50+y);
            I.lineTo(45+x, 30+y);
            if(bandera==true){
                g2.fillOval(40+x, 50+y, 5, 5);
                g2.fillOval(60+x,30+ y, 5, 5);
                }
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(0+x,55+y,5,5);
            g2.fillOval(0+x,65+y,5,5);
            g2.fillOval(40+x,65+y,5,5);
            g2.fillOval(50+x,55+y,5,5);
            g2.fillOval(70+x,170+y,5,5);
            g2.fillOval(0+x,170+y,5,5);
            g2.fillOval(0+x,130+y,5,5);
        }
        g2.draw(I);
    } 
    
    public void dibujarJ(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double J = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                J.moveTo(10+x,110+y);
                J.curveTo(20+x,110+y,40+x,75+y,40+x,75+y);
                J.moveTo(40+x,75+y);
                J.curveTo(60+x,170+y,10+x,190+y,10+x,180+y);
                J.moveTo(10+x,180+y);
                J.curveTo(10+x,140+y,60+x,143+y,60+x,143+y);
            }
            if(subrayado == true){
                J.moveTo(0+x, 153+y);
                J.lineTo(70+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(10+x,110+y,5,5);
            g2.fillOval(20+x,110+y,5,5);
            g2.fillOval(40+x,75+y,5,5);
            g2.fillOval(40+x,75+y,5,5);
            g2.fillOval(60+x,170+y,5,5);
            g2.fillOval(10+x,190+y,5,5);
            g2.fillOval(10+x,180+y,5,5);
            g2.fillOval(10+x,140+y,5,5);
            g2.fillOval(60+x,143+y,5,5);
        }
        g2.draw(J);
    }
    
    public void dibujarK(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double K = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                K.moveTo(30+x, 65+y);
                K.curveTo(5+x, 68+y, 0+x, 60+y, 10+x, 57+y);
                K.moveTo(10+x, 57+y);
                K.curveTo(20+x, 52+y, 30+x, 60+y, 55+x, 55+y);
                K.moveTo(55+x, 55+y);
                K.curveTo(45+x, 65+y, 60+x, 110+y, 47+x, 130+y);
                K.moveTo(47+x, 130+y);       
                K.curveTo(30+x, 160+y, 0+x, 128+y, 30+x, 130+y);
                K.moveTo(100+x, 55+y);
                K.curveTo(65+x, 53+y, 80+x, 90+y, 52+x, 103+y);
                K.moveTo(52+x, 103+y);
                K.curveTo(80+x, 103+y, 52+x, 143+y, 100+x, 143+y);
            }
            if(subrayado == true){
                K.moveTo(0+x, 153+y);
                K.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(30+x,65+y,5,5);
            g2.fillOval(5+x,68+y,5,5);
            g2.fillOval(0+x,60+y,5,5);
            g2.fillOval(10+x,57+y,5,5);
            g2.fillOval(20+x,52+y,5,5);
            g2.fillOval(30+x,60+y,5,5);
            g2.fillOval(55+x,55+y,5,5);
            g2.fillOval(45+x,65+y,5,5);
            g2.fillOval(60+x,110+y,5,5);
            g2.fillOval(47+x,130+y,5,5);
            g2.fillOval(30+x,160+y,5,5);
            g2.fillOval(0+x,128+y,5,5);
            g2.fillOval(30+x,130+y,5,5);
            g2.fillOval(100+x,55+y,5,5);
            g2.fillOval(65+x,53+y,5,5);
            g2.fillOval(80+x,90+y,5,5);
            g2.fillOval(52+x,103+y,5,5);
            g2.fillOval(80+x,103+y,5,5);
            g2.fillOval(52+x,143+y,5,5);
            g2.fillOval(100+x,143+y,5,5);
        }
        g2.draw(K);
    } 
    
    public void dibujarL(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double L = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                L.moveTo(30+x, 65+y);
                L.curveTo(5+x, 68+y, 0+x, 60+y, 10+x, 57+y);
                L.moveTo(10+x, 57+y);
                L.curveTo(20+x, 52+y, 30+x, 60+y, 55+x, 55+y);
                L.moveTo(55+x, 55+y);
                L.curveTo(45+x, 65+y, 60+x, 110+y, 47+x, 130+y);
                L.moveTo(47+x, 130+y);       
                L.curveTo(30+x, 160+y, 0+x, 128+y, 30+x, 130+y);
                L.moveTo(30+x, 130+y);       
                L.curveTo(45+x, 130+y, 55+x, 145+y, 100+x, 143+y);
            }
            if(subrayado == true){
                L.moveTo(0+x, 153+y);
                L.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(30+x,65+y,5,5);
            g2.fillOval(5+x,68+y,5,5);
            g2.fillOval(0+x,60+y,5,5);
            g2.fillOval(10+x,57+y,5,5);
            g2.fillOval(20+x,52+y,5,5);
            g2.fillOval(30+x,60+y,5,5);
            g2.fillOval(55+x,55+y,5,5);
            g2.fillOval(45+x,65+y,5,5);
            g2.fillOval(60+x,110+y,5,5);
            g2.fillOval(47+x,130+y,5,5);
            g2.fillOval(30+x,160+y,5,5);
            g2.fillOval(0+x,128+y,5,5);
            g2.fillOval(30+x,130+y,5,5);
            g2.fillOval(30+x,130+y,5,5);
            g2.fillOval(45+x,130+y,5,5);
            g2.fillOval(55+x,145+y,5,5);
            g2.fillOval(100+x,143+y,5,5);
        }
        g2.draw(L);
    } 
    
    public void dibujarM(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double M = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                M.moveTo(25+x, 55+y);
                M.curveTo(25+x, 65+y, 40+x, 110+y, 27+x, 130+y);
                M.moveTo(27+x, 130+y);       
                M.curveTo(10+x, 160+y, -20+x, 128+y, 10+x, 130+y);
                M.moveTo(25+x, 55+y);       
                M.curveTo(25+x, 55+y, 62+x, 143+y, 62+x, 143+y);
                M.moveTo(62+x, 143+y);       
                M.curveTo(62+x, 143+y, 85+x, 55+y, 85+x, 55+y);
                M.moveTo(85+x, 55+y);       
                M.curveTo(85+x, 65+y, 75+x, 143+y, 100+x, 143+y);
                M.moveTo(100+x, 143+y);       
                M.curveTo(122+x, 146+y, 126+x, 126+y, 110+x, 130+y);
            }
            if(subrayado == true){
                M.moveTo(0+x, 153+y);
                M.lineTo(130+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(25+x,65+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(27+x,130+y,5,5);
            g2.fillOval(10+x,160+y,5,5);
            g2.fillOval(10+x,130+y,5,5);
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(62+x,143+y,5,5);
            g2.fillOval(85+x,55+y,5,5);
            g2.fillOval(85+x,65+y,5,5);
            g2.fillOval(75+x,143+y,5,5);
            g2.fillOval(100+x,143+y,5,5);
            g2.fillOval(122+x,146+y,5,5);
            g2.fillOval(126+x,126+y,5,5);
            g2.fillOval(110+x,130+y,5,5);
        }
        g2.draw(M);
    } 
    
    public void dibujarN(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double N = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                N.moveTo(25+x, 55+y);
                N.curveTo(25+x, 65+y, 40+x, 110+y, 27+x, 130+y);
                N.moveTo(27+x, 130+y);       
                N.curveTo(10+x, 160+y, -20+x, 128+y, 10+x, 130+y);
                N.moveTo(25+x, 55+y);       
                N.curveTo(25+x, 65+y, 40+x, 110+y, 80+x, 143+y);
                N.moveTo(80+x, 143+y);       
                N.curveTo(85+x, 120+y, 80+x, 55+y, 120+x, 55+y);
            }
            if(subrayado == true){
                N.moveTo(0+x, 153+y);
                N.lineTo(130+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(25+x,65+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(27+x,130+y,5,5);
            g2.fillOval(10+x,160+y,5,5);
            g2.fillOval(10+x,130+y,5,5);
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(25+x,65+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(85+x,120+y,5,5);
            g2.fillOval(80+x,55+y,5,5);
            g2.fillOval(120+x,55+y,5,5);
        }
        g2.draw(N);
    } 
    
    public void dibujarÑ(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double Ñ = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                Ñ.moveTo(25+x, 55+y);
                Ñ.curveTo(25+x, 65+y, 40+x, 110+y, 27+x, 130+y);
                Ñ.moveTo(27+x, 130+y);       
                Ñ.curveTo(10+x, 160+y, -20+x, 128+y, 10+x, 130+y);
                Ñ.moveTo(25+x, 55+y);       
                Ñ.curveTo(25+x, 65+y, 40+x, 110+y, 80+x, 143+y);
                Ñ.moveTo(80+x, 143+y);       
                Ñ.curveTo(85+x, 120+y, 80+x, 55+y, 120+x, 55+y);
                Ñ.moveTo(25+x, 40+y);       
                Ñ.curveTo(45+x, 25+y, 75+x, 50+y, 115+x, 40+y);
            }
            if(subrayado == true){
                Ñ.moveTo(0+x, 153+y);
                Ñ.lineTo(130+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(25+x,65+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(27+x,130+y,5,5);
            g2.fillOval(10+x,160+y,5,5);
            g2.fillOval(10+x,130+y,5,5);
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(25+x,65+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(85+x,120+y,5,5);
            g2.fillOval(80+x,55+y,5,5);
            g2.fillOval(120+x,55+y,5,5);
            g2.fillOval(25+x,40+y,5,5);
            g2.fillOval(45+x,25+y,5,5);
            g2.fillOval(75+x,50+y,5,5);
            g2.fillOval(115+x,40+y,5,5);
        }
        g2.draw(Ñ);
    } 
    
    public void dibujarO(Graphics2D g2, int x, int y, boolean bandera,boolean tilde,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double O = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                O.moveTo(40+x, 143+y);
                O.curveTo(0+x, 143+y,0+x,55+y,25+x,55+y);
                O.moveTo(40+x, 143+y);
                O.curveTo(80+x, 143+y, 80+x, 20+y, 25+x,60+y);
                O.moveTo(25+x,60+y);
                O.curveTo(20+x, 65+y, 15+x, 85+y, 20+x, 100+y);
            }
            if(subrayado == true){
                O.moveTo(0+x, 153+y);
                O.lineTo(90+x, 153+y);
            }
            if(tilde == true){
            O.moveTo(40+x,45+y);
            O.lineTo(60+x,25+y);
            if(bandera==true){
                g2.fillOval(40+x,45+y, 5, 5);
                g2.fillOval(60+x,25+y , 5, 5);
                }
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(40+x,143+y,5,5);
            g2.fillOval(0+x,143+y,5,5);
            g2.fillOval(0+x,55+y,5,5);
            g2.fillOval(25+x,55+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(80+x,20+y,5,5);
            g2.fillOval(25+x,60+y,5,5);
            g2.fillOval(25+x,60+y,5,5);
            g2.fillOval(20+x,65+y,5,5);
            g2.fillOval(15+x,85+y,5,5);
            g2.fillOval(20+x,100+y,5,5);
        }
        g2.draw(O);
    }
    
    public void dibujarP(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double P = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                P.moveTo(20+x,80+y);
                P.curveTo(20+x,120+y,15+x,143+y,10+x,143+y);
                P.moveTo(10+x,143+y);
                P.curveTo(0+x,143+y,0+x,80+y,10+x,70+y);
                P.moveTo(10+x,70+y);
                P.curveTo(12+x,65+y,40+x,50+y,60+x, 55+y);
                P.moveTo(60+x,55+y);
                P.curveTo(90+x, 65+y, 60+x, 100+y, 20+x, 100+y);
            }
            if(subrayado == true){
                P.moveTo(0+x, 153+y);
                P.lineTo(90+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(20+x,80+y,5,5);
            g2.fillOval(20+x,120+y,5,5);
            g2.fillOval(15+x,143+y,5,5);
            g2.fillOval(10+x,143+y,5,5);
            g2.fillOval(0+x,143+y,5,5);
            g2.fillOval(0+x,80+y,5,5);
            g2.fillOval(10+x,70+y,5,5);
            g2.fillOval(12+x,65+y,5,5);
            g2.fillOval(40+x,50+y,5,5);
            g2.fillOval(60+x,55+y,5,5);
            g2.fillOval(90+x,65+y,5,5);
            g2.fillOval(60+x,100+y,5,5);
            g2.fillOval(20+x,100+y,5,5);
        }
        g2.draw(P);
    }
    
    public void dibujarQ(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double Q = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                Q.moveTo(40+x, 130+y);
                Q.curveTo(0+x, 143+y,0+x,55+y,40+x,55+y);
                Q.moveTo(40+x, 143+y);
                Q.curveTo(80+x, 143+y, 80+x, 55+y, 40+x, 55+y);
                Q.moveTo(40+x, 143+y);
                Q.curveTo(40+x, 120+y, 80+x, 143+y, 80+x, 140+y);
            }
            if(subrayado == true){
                Q.moveTo(0+x, 153+y);
                Q.lineTo(100+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(40+x,130+y,5,5);
            g2.fillOval(0+x,143+y,5,5);
            g2.fillOval(0+x,55+y,5,5);
            g2.fillOval(40+x,55+y,5,5);
            g2.fillOval(40+x,143+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(80+x,55+y,5,5);
            g2.fillOval(40+x,120+y,5,5);
            g2.fillOval(80+x,140+y,5,5);
        }
        g2.draw(Q);
    } 
    
    public void dibujarR(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double R = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                R.moveTo(20+x,80+y);
                R.curveTo(20+x,120+y,15+x,143+y,10+x,143+y);
                R.moveTo(10+x,143+y);
                R.curveTo(0+x,143+y,0+x,80+y,10+x,70+y);
                R.moveTo(10+x,70+y);
                R.curveTo(12+x,65+y,40+x,50+y,60+x, 55+y);
                R.moveTo(60+x,55+y);
                R.curveTo(90+x, 65+y, 60+x, 100+y, 20+x, 100+y);
                R.moveTo(20+x,100+y);
                R.curveTo(40+x, 100+y, 50+x, 143+y, 70+x, 143+y);
            }
            if(subrayado == true){
                R.moveTo(0+x, 153+y);
                R.lineTo(80+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(20+x,80+y,5,5);
            g2.fillOval(20+x,120+y,5,5);
            g2.fillOval(15+x,143+y,5,5);
            g2.fillOval(10+x,143+y,5,5);
            g2.fillOval(0+x,143+y,5,5);
            g2.fillOval(0+x,80+y,5,5);
            g2.fillOval(10+x,70+y,5,5);
            g2.fillOval(12+x,65+y,5,5);
            g2.fillOval(40+x,50+y,5,5);
            g2.fillOval(60+x,55+y,5,5);
            g2.fillOval(60+x,55+y,5,5);
            g2.fillOval(90+x,65+y,5,5);
            g2.fillOval(60+x,100+y,5,5);
            g2.fillOval(20+x,100+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(50+x,143+y,5,5);
            g2.fillOval(70+x,143+y,5,5);
        }
        g2.draw(R);
    }
    
    public void dibujarS(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double S = new Path2D.Double();
       int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                S.moveTo(10+x,65+y);
                S.curveTo(0+x,85+y,70+x,100+y,70+x,120+y);
                S.moveTo(10+x,65+y);
                S.curveTo(12+x,50+y,80+x,50+y,75+x,70+y);
                S.moveTo(70+x,120+y);
                S.curveTo(68+x,135+y,50+x,160+y,10+x,130+y);
            }
            if(subrayado == true){
                S.moveTo(0+x, 153+y);
                S.lineTo(80+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(10+x,65+y,5,5);
            g2.fillOval(0+x,85+y,5,5);
            g2.fillOval(70+x,100+y,5,5);
            g2.fillOval(70+x,120+y,5,5);
            g2.fillOval(12+x,50+y,5,5);
            g2.fillOval(80+x,50+y,5,5);
            g2.fillOval(75+x,70+y,5,5);
            g2.fillOval(68+x,135+y,5,5);
            g2.fillOval(50+x,160+y,5,5);
            g2.fillOval(10+x,130+y,5,5);
        }
        g2.draw(S);
    }
    
    public void dibujarT(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double T = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                T.moveTo(35+x, 70+y);
                T.curveTo(0+x,75+y,0+x,40+y,70+x,65+y);
                T.moveTo(70+x,65+y);
                T.curveTo(90+x,60+y,120+x,60+y,90+x,55+y);
                T.moveTo(90+x,55+y);
                T.curveTo(50+x,55+y,60+x,120+y,70+x,143+y);
            }
            if(subrayado == true){
                T.moveTo(0+x, 153+y);
                T.lineTo(100+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(35+x,70+y,5,5);
            g2.fillOval(0+x,75+y,5,5);
            g2.fillOval(0+x,40+y,5,5);
            g2.fillOval(70+x,65+y,5,5);
            g2.fillOval(90+x,60+y,5,5);
            g2.fillOval(120+x,60+y,5,5);
            g2.fillOval(90+x,55+y,5,5);
            g2.fillOval(50+x,55+y,5,5);
            g2.fillOval(60+x,120+y,5,5);
            g2.fillOval(70+x,143+y,5,5);
        }
        g2.draw(T);
    }
    
    public void dibujarU(Graphics2D g2, int x, int y, boolean bandera,boolean tilde,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double U = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                U.moveTo(25+x, 75+y);
                U.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
                U.moveTo(40+x,100+y);
                U.curveTo(50+x,200+y,85+x,100+y,80+x,70+y);
                U.moveTo(80+x,70+y);
                U.curveTo(80+x,55+y,75+x,40+y,75+x,120+y);
                U.moveTo(75+x,120+y);
                U.curveTo(75+x,120+y,80+x,143+y,90+x,143+y);
            }
            if(subrayado == true){
                U.moveTo(0+x, 153+y);
                U.lineTo(100+x, 153+y);
            }
            if(tilde == true){
            U.moveTo(60+x,50+y);
            U.lineTo(80+x,30+y);
            if(bandera==true){
                g2.fillOval(60+x, 50+y, 5, 5);
                g2.fillOval(80+x,30+y , 5, 5);
                }
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,75+y,5,5);
            g2.fillOval(0+x,85+y,5,5);
            g2.fillOval(40+x,15+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(50+x,200+y,5,5);
            g2.fillOval(85+x,100+y,5,5);
            g2.fillOval(80+x,70+y,5,5);
            g2.fillOval(80+x,55+y,5,5);
            g2.fillOval(75+x,40+y,5,5);
            g2.fillOval(75+x,120+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(90+x,143+y,5,5);
        }
        g2.draw(U);
    }
    
    public void dibujarV(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double V = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                V.moveTo(25+x, 75+y);
                V.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
                V.moveTo(40+x,100+y);
                V.curveTo(50+x,200+y,80+x,100+y,80+x,55+y);
            }
            if(subrayado == true){
                V.moveTo(0+x, 153+y);
                V.lineTo(90+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,75+y,5,5);
            g2.fillOval(0+x,85+y,5,5);
            g2.fillOval(40+x,15+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(50+x,200+y,5,5);
            g2.fillOval(80+x,100+y,5,5);
            g2.fillOval(80+x,55+y,5,5);
        }
        g2.draw(V);
    }
    
    public void dibujarW(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double W = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                W.moveTo(25+x, 75+y);
                W.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
                W.moveTo(40+x,100+y);
                W.curveTo(40+x,190+y,60+x,120+y,60+x,100+y);
                W.moveTo(60+x,100+y);
                W.curveTo(60+x,225+y,100+x,35+y,80+x,70+y);
            }
            if(subrayado == true){
                W.moveTo(0+x, 153+y);
                W.lineTo(120+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,75+y,5,5);
            g2.fillOval(0+x,85+y,5,5);
            g2.fillOval(40+x,15+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(40+x,190+y,5,5);
            g2.fillOval(60+x,120+y,5,5);
            g2.fillOval(60+x,100+y,5,5);
            g2.fillOval(60+x,225+y,5,5);
            g2.fillOval(100+x,35+y,5,5);
            g2.fillOval(80+x,70+y,5,5);
        }
        g2.draw(W);
    }
    
    public void dibujarX(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double X = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                X.moveTo(0+x,60+y);
                X.curveTo(30+x,20+y,70+x,190+y,100+x,130+y);
                X.moveTo(0+x, 135+y);
                X.curveTo(30+x,180+y,70+x,20+y,100+x,60+y);
            }
            if(subrayado == true){
                X.moveTo(0+x, 153+y);
                X.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(0+x,60+y,5,5);
            g2.fillOval(30+x,20+y,5,5);
            g2.fillOval(70+x,190+y,5,5);
            g2.fillOval(100+x,130+y,5,5);
            g2.fillOval(0+x,135+y,5,5);
            g2.fillOval(30+x,180+y,5,5);
            g2.fillOval(70+x,20+y,5,5);
            g2.fillOval(100+x,60+y,5,5);
        }
        g2.draw(X);
    }
    
    public void dibujarY(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double Y = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                Y.moveTo(25+x, 75+y);
                Y.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
                Y.moveTo(40+x,100+y);
                Y.curveTo(40+x,110+y,70+x,100+y,70+x, 60+y);
                Y.moveTo(70+x,60+y);
                Y.curveTo(70+x,45+y,65+x,70+y,65+x,140+y);
                Y.moveTo(65+x,140+y);
                Y.curveTo(65+x,170+y,35+x,200+y,40+x,160+y);
                Y.moveTo(40+x,160+y);
                Y.curveTo(50+x,120+y,65+x,110+y,70+x,115+y);
                Y.moveTo(70+x,115+y);
                Y.curveTo(70+x,115+y,80+x,143+y,100+x,143+y);
            }
            if(subrayado == true){
                Y.moveTo(0+x, 153+y);
                Y.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(25+x,75+y,5,5);
            g2.fillOval(0+x,85+y,5,5);
            g2.fillOval(40+x,15+y,5,5);
            g2.fillOval(40+x,100+y,5,5);
            g2.fillOval(40+x,110+y,5,5);
            g2.fillOval(70+x,100+y,5,5);
            g2.fillOval(70+x,60+y,5,5);
            g2.fillOval(70+x,45+y,5,5);
            g2.fillOval(65+x,70+y,5,5);
            g2.fillOval(65+x,140+y,5,5);
            g2.fillOval(65+x,170+y,5,5);
            g2.fillOval(35+x,200+y,5,5);
            g2.fillOval(40+x,160+y,5,5);
            g2.fillOval(50+x,120+y,5,5);
            g2.fillOval(65+x,110+y,5,5);
            g2.fillOval(70+x,115+y,5,5);
            g2.fillOval(80+x,143+y,5,5);
            g2.fillOval(100+x,143+y,5,5);
        }
        g2.draw(Y);
    }
    
    public void dibujarZ(Graphics2D g2, int x, int y, boolean bandera,boolean negrita, boolean subrayado, boolean cursiva){
        Path2D.Double Z = new Path2D.Double();
        int limite = 1;
        if(negrita == true){
            limite = 5;
        }
        for(int i = 0; i<limite;i++){
            if(cursiva==true){
                
            }
            else{
                Z.moveTo(30+x,80+y);
                Z.curveTo(0+x,70+y,0+x,55+y,100+x,60+y);
                Z.curveTo(90+x,20+y,30+x,143+y,0+x,143+y);
                Z.curveTo(10+x,110+y,90+x,175+y,100+x,120+y);
                Z.moveTo(30+x,100+y);
                Z.lineTo(70+x,100+y);
            }
            if(subrayado == true){
                Z.moveTo(0+x, 153+y);
                Z.lineTo(110+x, 153+y);
            }
            x+=1;
        }        
        if(bandera == true){ 
            g2.fillOval(30+x,80+y,5,5);
            g2.fillOval(0+x,70+y,5,5);
            g2.fillOval(0+x,55+y,5,5);
            g2.fillOval(100+x,60+y,5,5);
            g2.fillOval(90+x,20+y,5,5);
            g2.fillOval(30+x,143+y,5,5);
            g2.fillOval(0+x,143+y,5,5);
            g2.fillOval(10+x,110+y,5,5);
            g2.fillOval(90+x,175+y,5,5);
            g2.fillOval(100+x,120+y,5,5);
            g2.fillOval(30+x,100+y,5,5);
            g2.fillOval(70+x,100+y,5,5);
        }
        g2.draw(Z);
    }
}