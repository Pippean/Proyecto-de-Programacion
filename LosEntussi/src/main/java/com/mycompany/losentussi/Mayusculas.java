package com.mycompany.losentussi;
import java.awt.*;
import java.awt.geom.Path2D;


public class Mayusculas {
    
    public Mayusculas(){
        
    }
    
    public void dibujarA(Graphics2D g2, int x, int y){
        Path2D.Double A = new Path2D.Double();
        A.moveTo(40+x, 55+y);
        A.curveTo(0+x, 55+y, 0+x, 143+y, 40+x, 143+y);
        A.moveTo(40+x, 55+y);
        A.curveTo(80+x, 55+y, 80+x, 143+y, 40+x, 143+y);
        A.moveTo(70+x, 110+y);
        A.curveTo(70+x, 110+y, 70+x, 143+y, 100+x, 143+y);
        g2.draw(A);
    } 
    
    public void dibujarB(Graphics2D g2, int x, int y){
        Path2D.Double B = new Path2D.Double();
        B.moveTo(0+x, 70+y);
        B.curveTo(0+x,70+y, 10+x, 65+y, 10+x, 55+y);
        B.moveTo(10+x, 55+y);
        B.curveTo(10+x, 55+y, 10+x, 143+y, 10+x, 143+y);
        B.moveTo(10+x, 55+y);
        B.curveTo(60+x, 45+y, 60+x, 100+y, 30+x, 100+y);
        B.moveTo(30+x, 100+y);
        B.curveTo(60+x, 100+y, 60+x, 153+y, 10+x, 143+y);
        g2.draw(B);
    } 
    
    public void dibujarC(Graphics2D g2, int x, int y){
        Path2D.Double C = new Path2D.Double();
        C.moveTo(70+x, 55+y);
        C.curveTo(0+x, 45+y, 0+x, 153+y, 70+x, 143+y);
        g2.draw(C);
    }
    
    public void dibujarD(Graphics2D g2, int x, int y){
        Path2D.Double D = new Path2D.Double();
        D.moveTo(70+x, 55+y);
        D.curveTo(0+x, 45+y, 0+x, 153+y, 70+x, 143+y);
        g2.draw(D);
    }
    
    public void dibujarE(Graphics2D g2, int x, int y){
        Path2D.Double E = new Path2D.Double();
        E.moveTo(40+x, 55+y);
        E.curveTo(0+x, 45+y, 0+x, 100+y, 30+x, 90+y);
        E.moveTo(30+x, 90+y);
        E.curveTo(0+x, 90+y, 0+x, 153+y, 50+x, 143+y);
        g2.draw(E);
    } 
    
    public void dibujarF(Graphics2D g2, int x, int y){
        Path2D.Double F = new Path2D.Double();
        F.moveTo(10+x, 60+y);
        F.curveTo(30+x, 50+y, 50+x, 65+y, 70+x, 55+y);
        F.moveTo(40+x, 57+y);
        F.curveTo(40+x, 55+y, 50+x, 133+y, 10+x, 143+y);
        F.moveTo(20+x, 100+y);
        F.curveTo(20+x, 100+y, 40+x, 100+y, 55+x, 100+y);
        g2.draw(F);
    } 
    
    public void dibujarG(Graphics2D g2, int x, int y){
        Path2D.Double G = new Path2D.Double();
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
        g2.draw(G);
    } 
    
    public void dibujarH(Graphics2D g2, int x, int y){
        Path2D.Double H = new Path2D.Double();
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
        g2.draw(H);
    } 
    
    public void dibujarI(Graphics2D g2, int x, int y){
        Path2D.Double I = new Path2D.Double();
        I.moveTo(0+x,55+y);
        I.curveTo(0+x,65+y,40+x,65+y,50+x,55+y);
        I.moveTo(50+x,55+y);
        I.curveTo(70+x,170+y,0+x,170+y,0+x,130+y);
        g2.draw(I);
    } 
    
    public void dibujarJ(Graphics2D g2, int x, int y){
        Path2D.Double J = new Path2D.Double();
        J.moveTo(10+x,110+y);
        J.curveTo(20+x,110+y,40+x,75+y,40+x,75+y);
        J.moveTo(40+x,75+y);
        J.curveTo(60+x,170+y,10+x,190+y,10+x,180+y);
        J.moveTo(10+x,180+y);
        J.curveTo(10+x,140+y,60+x,143+y,60+x,143+y);
        g2.draw(J);
    } 
    
}
