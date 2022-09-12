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
        X.moveTo(0,143);
        X.lineTo(200,143);
        X.moveTo(0,55);
        X.lineTo(200,55);
        g2.draw(X);
    }
    public void dibujarY(Graphics2D g2, int x, int y){
        Path2D.Double Y = new Path2D.Double();
        Y.moveTo(20+x,80+y);
        Y.curveTo(15+x,90+y,10+x,80+y,55+x,90+y);
        g2.draw(Y);
        
    }
}
