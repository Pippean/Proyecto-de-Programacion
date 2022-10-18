
package com.mycompany.losentussi;

import java.awt.*;
import java.awt.geom.*;

public class Cursivas {
    
    public Cursivas(){
        
    }

    public void dibujaraC(Graphics2D g2, int x, int y){
        Path2D.Double a = new Path2D.Double();
        a.moveTo(0+x, 143+y);
        a.curveTo(20+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        a.moveTo(20+x, 120+y);
        a.curveTo(30+x, 90+y, 80+x, 90+y, 70+x, 120+y);
        a.moveTo(20+x, 120+y);
        a.curveTo(10+x, 160+y, 60+x, 160+y, 70+x, 120+y);
        a.moveTo(70+x, 120+y);
        a.curveTo(70+x, 120+y, 70+x, 143+y, 90+x, 143+y);
        g2.draw(a);
    }
    
    public void dibujaracasoC(Graphics2D g2, int x, int y){
        Path2D.Double a1 = new Path2D.Double();
        a1.moveTo(0+x, 120+y);
        a1.curveTo(10+x, 90+y, 60+x, 90+y, 50+x, 120+y);
        a1.moveTo(0+x, 120+y);
        a1.curveTo(-10+x, 160+y, 40+x, 160+y, 50+x, 120+y);
        a1.moveTo(50+x, 120+y);
        a1.curveTo(50+x, 120+y, 50+x, 143+y, 70+x, 143+y);
        g2.draw(a1);
    }
    
    public void dibujarbC(Graphics2D g2,int x, int y){
        Path2D.Double b = new Path2D.Double();
        b.moveTo(0+x, 143+y);
        b.curveTo(15+x, 143+y, 35+x, 50+y,35+x , 40+y);
        b.moveTo(18+x,143+y);
        b.curveTo(18+x,143+y, 20+x,45+y, 35+x, 40+y);
        b.moveTo(18+x, 143+y);
        b.curveTo(18+x, 143+y, 65+x, 90+y,25+x , 100+y);
        b.moveTo(25+x, 100+y);
        b.curveTo(40+x,100+y,45+x, 115+y,55+x, 110+y);
        g2.draw(b);
    }
    
    public void dibujarcC(Graphics2D g2,int x, int y){
        Path2D.Double c = new Path2D.Double();
        
        c.moveTo(0+x, 143+y);
        c.curveTo(30+x,140+y,5+x,85+y, 60+x, 95+y);
        c.moveTo(29+x,100+y);
        c.curveTo(10+x, 115+y,20+x,148+y,68+x,143+y);
        g2.draw(c);
    }
    
    public void dibujardC(Graphics2D g2, int x, int y){
        Path2D.Double d = new Path2D.Double();
        d.moveTo(0+x, 143+y);
        d.curveTo(10+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        d.moveTo(20+x, 125+y);
        d.curveTo(25+x, 95+y,65+x, 95+y, 60+x, 125+y);
        d.moveTo(20+x, 125+y);
        d.curveTo(15+x, 155+y, 55+x, 155+y, 60+x, 125+y);
        d.moveTo(80+x, 55+y);
        d.curveTo(70+x, 55+y, 50+x, 143+y, 70+x, 143+y);
        g2.draw(d);
    }
    
    public void dibujareC(Graphics2D g2, int x, int y){
        Path2D.Double e = new Path2D.Double();
        e.moveTo(0+x, 143+y);
        e.curveTo(10+x, 143+y, 45+x,105+y,40+x , 95+y);
        e.moveTo(35+x,143+y);
        e.curveTo(10+x,143+y, 20+x,90+y, 40+x, 95+y);
        g2.draw(e); 
    }
    
    public void dibujarecasoC(Graphics2D g2, int x, int y){
        Path2D.Double e1 = new Path2D.Double();
        e1.moveTo(0+x,110+y);
        e1.curveTo(0+x,110+y,25+x,90+y,20+x,80+y);
        e1.moveTo(20+x,80+y);
        e1.curveTo(0+x,60+y,15+x,143+y,25+x,143+y);
        g2.draw(e1); 
    }
    
    public void dibujarfC(Graphics2D g2,int x, int y){
        Path2D.Double f = new Path2D.Double();
        f.moveTo(0+x, 143+y);
        f.curveTo(15+x, 143+y, 25+x, 50+y,15+x , 60+y);
        f.moveTo(15+x,170+y);
        f.curveTo(10+x,143+y, 15+x,45+y, 17+x, 60+y);
        f.moveTo(15+x,170+y);
        f.curveTo(40+x,150+y,30+x,130+y,13+x,120+y);
        f.moveTo(13+x,130+y);
        f.curveTo(20+x,140+y, 40+x, 145+y, 50+x,143+y);
        g2.draw(f);
    }
}
