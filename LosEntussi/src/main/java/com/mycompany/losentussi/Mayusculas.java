package com.mycompany.losentussi;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/**
 *
 * @author Pipe
 */
public class Mayusculas {
    
    public Mayusculas(){
        
    }
    
    public void dibujarZ(Graphics2D g2, int x, int y){
        Path2D.Double Z = new Path2D.Double();
        Z.moveTo(30+x,80+y);
        Z.curveTo(0+x,70+y,0+x,55+y,100+x,60+y);
        Z.curveTo(90+x,20+y,30+x,143+y,0+x,143+y);
        Z.curveTo(10+x,110+y,90+x,175+y,100+x,120+y);
        Z.moveTo(30+x,100+y);
        Z.lineTo(70+x,100+y);
        g2.draw(Z);
    }
    
    
    public void dibujarX(Graphics2D g2, int x, int y){
        Path2D.Double X = new Path2D.Double();
        X.moveTo(0+x,60+y);
        X.curveTo(30+x,20+y,70+x,190+y,100+x,130+y);
        X.moveTo(0+x, 135+y);
        X.curveTo(30+x,180+y,70+x,20+y,100+x,60+y);
        g2.draw(X);
    }
    public void dibujarY(Graphics2D g2, int x, int y){
        Path2D.Double Y = new Path2D.Double();
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
        g2.draw(Y);
    }
    public void dibujarW(Graphics2D g2, int x, int y){
        Path2D.Double W = new Path2D.Double();

        W.moveTo(25+x, 75+y);
        W.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
        W.moveTo(40+x,100+y);
        W.curveTo(40+x,190+y,60+x,120+y,60+x,100+y);
        W.moveTo(60+x,100+y);
        W.curveTo(60+x,225+y,100+x,35+y,80+x,70+y);
        g2.draw(W);
    }
    public void dibujarV(Graphics2D g2, int x, int y){
        Path2D.Double V = new Path2D.Double();
        V.moveTo(25+x, 75+y);
        V.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
        V.moveTo(40+x,100+y);
        V.curveTo(50+x,200+y,80+x,100+y,80+x,55+y);
        g2.draw(V);
    }
    public void dibujarU(Graphics2D g2, int x, int y){
        Path2D.Double U = new Path2D.Double();
        U.moveTo(25+x, 75+y);
        U.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
        U.moveTo(40+x,100+y);
        U.curveTo(50+x,200+y,85+x,100+y,80+x,70+y);
        U.moveTo(80+x,70+y);
        U.curveTo(80+x,55+y,75+x,40+y,75+x,120+y);
        U.moveTo(75+x,120+y);
        U.curveTo(75+x,120+y,80+x,143+y,90+x,143+y);
        g2.draw(U);
    }
    public void dibujarT(Graphics2D g2, int x, int y ){
        Path2D.Double T = new Path2D.Double();
        T.moveTo(35+x, 70+y);
        T.curveTo(0+x,75+y,0+x,40+y,70+x,65+y);
        T.moveTo(70+x,65+y);
        T.curveTo(90+x,60+x,120+x,60+y,90+x,55+y);
        T.moveTo(90+x,55+y);
        T.curveTo(50+x,55+y,60+x,120+y,70+x,143+y);
        g2.draw(T);
    }
    public void dibujarS(Graphics2D g2, int x, int y){
        Path2D.Double S = new Path2D.Double();
        S.moveTo(10+x,65+y);
        S.curveTo(0+x,85+y,70+x,100+y,70+x,120+y);
        S.moveTo(10+x,65+y);
        S.curveTo(12+x,50+y,80+x,50+y,75+x,70+y);
        S.moveTo(70+x,120+y);
        S.curveTo(68+x,135+y,50+x,160+y,10+x,130+y);
        g2.draw(S);
    }
    public void dibujarR(Graphics2D g2, int x, int y){
        Path2D.Double R = new Path2D.Double();
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
        g2.draw(R);
    }
    public void dibujarQ(Graphics2D g2, int x, int y){
        Path2D.Double Q = new Path2D.Double();
        Q.moveTo(40+x, 130+y);
        Q.curveTo(0+x, 143+y,0+x,55+y,40+x,55+y);
        Q.moveTo(40+x, 143+y);
        Q.curveTo(80+x, 143+y, 80+x, 55+y, 40+x, 55+y);
        Q.moveTo(40+x, 143+y);
        Q.curveTo(40+x, 120+y, 80+x, 143+y, 80+x, 140+y);
        g2.draw(Q);
    }
      
    public void dibujarP(Graphics2D g2, int x, int y){
        Path2D.Double P = new Path2D.Double();
        P.moveTo(20+x,80+y);
        P.curveTo(20+x,120+y,15+x,143+y,10+x,143+y);
        P.moveTo(10+x,143+y);
        P.curveTo(0+x,143+y,0+x,80+y,10+x,70+y);
        P.moveTo(10+x,70+y);
        P.curveTo(12+x,65+y,40+x,50+y,60+x, 55+y);
        P.moveTo(60+x,55+y);
        P.curveTo(90+x, 65+y, 60+x, 100+y, 20+x, 100+y);
        g2.draw(P);
    }
    public void dibujarO(Graphics2D g2, int x, int y){
        Path2D.Double O = new Path2D.Double();

        O.moveTo(0,143);
        O.lineTo(200, 143);
        O.moveTo(40+x, 143+y);
        O.curveTo(0+x, 143+y,0+x,55+y,25+x,55+y);
        O.moveTo(40+x, 143+y);
        O.curveTo(80+x, 143+y, 80+x, 20+y, 25+x,60+y);
        O.moveTo(25+x,60+y);
        O.curveTo(20+x, 65+y, 15+x, 85+y, 20+x, 100+y );

        g2.draw(O);
    }
}