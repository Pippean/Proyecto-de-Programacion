
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
        f.curveTo(25+x, 143+y, 35+x, 50+y,25+x , 60+y);
        f.moveTo(5+x,170+y);
        f.curveTo(0+x,143+y, 25+x,45+y, 25+x, 60+y);
        f.moveTo(5+x,170+y);
        f.curveTo(25+x,150+y,25+x,130+y,10+x,120+y);
        f.moveTo(8+x,130+y);
        f.curveTo(20+x,140+y, 40+x, 145+y, 45+x,143+y);
        g2.draw(f);
    }
    
    public void dibujargC(Graphics2D g2,int x, int y){
        Path2D.Double g1 = new Path2D.Double();
        g1.moveTo(10+x,120+y);
        g1.curveTo(20+x,90+y,60+x,90+y,50+x,120+y);
        g1.moveTo(10+x,120+y);
        g1.curveTo(0+x,150+y,40+x,150+y,50+x,120+y);
        g1.moveTo(10+x,120+y);
        g1.curveTo(10+x,130+y,0+x,145+y,0+x,143+y);
        g1.moveTo(50+x,120+y);
        g1.curveTo(40+x,120+y,35+x,220+y,10+x,200+y);
        g1.moveTo(10+x,200+y);
        g1.curveTo(0+x,180+y,60+x,143+y,60+x,143+y);
        g2.draw(g1);
    }

    public void dibujarhC(Graphics2D g2,int x, int y){
        Path2D.Double h = new Path2D.Double();
        h.moveTo(0+x,143+y);
        h.curveTo(10+x,135+y,25+x,60+y,25+x,50+y);
        h.moveTo(25+x,50+y);
        h.curveTo(10+x,60+y,10+x,135+y,10+x,143+y);
        h.moveTo(8+x,110+y);
        h.curveTo(50+x,100+y,20+x,143+y,60+x,143+y);
        g2.draw(h);
    }
    
    public void dibujariC(Graphics2D g2,int x, int y){
        Path2D.Double i = new Path2D.Double();
        i.moveTo(0+x,143+y);
        i.curveTo(0+x,143+y,30+x,115+y, 30+x, 100+y);
        i.moveTo(30+x,100+y);
        i.curveTo(30+x,143+y,60+x,143+y,60+x,143+y);
        g2.fillOval(30+x,70+y,10,10);
        g2.draw(i);
    }
    
    public void dibujaricasoC(Graphics2D g2,int x,int y){
        Path2D.Double i1 = new Path2D.Double();
        i1.moveTo(0+x, 110+y);
        i1.curveTo(5+x,110+y,20+x,90+y,20+x,80+y);
        i1.moveTo(20+x,80+y);
        i1.curveTo(20+x,80+y,20+x,143+y,30+x,143+y);
        g2.fillOval(15+x,65+y,10,10);
        g2.draw(i1);  
    }
    
    public void dibujarjC(Graphics2D g2,int x, int y){
        Path2D.Double j = new Path2D.Double();
        j.moveTo(0+x, 143+y);
        j.curveTo(20+x, 143+y, 40+x, 110+y, 40+x, 100+y);
        j.moveTo(40+x, 100+y);
        j.curveTo(40+x, 100+y, 40+x, 180+y, 15+x, 180+y);
        j.moveTo(15+x, 180+y);
        j.curveTo(0+x, 185+y, -15+x, 180+y, 10+x, 160+y);
        j.moveTo(10+x, 160+y);
        j.curveTo(10+x, 160+y, 50+x, 140+y, 60+x, 143+y);
        g2.fillOval(40+x,80+y,10,10);
        g2.draw(j);  
    }
    
    public void dibujarkC(Graphics2D g2,int x, int y){    
        Path2D.Double k = new Path2D.Double();
        k.moveTo(0+x, 143+y);
        k.curveTo(100+x, 90+y, 20+x, -25+y, 50+x, 143+y);
        k.moveTo(43+x, 100+y);
        k.curveTo(43+x, 100+y, 70+x, 40+y, 80+x, 55+y);
        k.moveTo(43+x, 100+y);
        k.curveTo(50+x, 100+y, 70+x, 115+y, 60+x, 120+y);
        k.moveTo(60+x, 120+y);
        k.curveTo(68+x, 127+y, 70+x, 155+y, 90+x, 143+y);
        g2.draw(k);
    }
    
    public void dibujarlC(Graphics2D g2,int x, int y){  
        Path2D.Double l = new Path2D.Double();
        l.moveTo(0+x, 143+y);
        l.curveTo(45+x, 143+y, 55+x, 40+y, 35+x, 55+y);
        l.moveTo(35+x, 55+y);
        l.curveTo(20+x, 60+y, 30+x, 143+y, 40+x, 143+y);
        g2.draw(l);
    }
    
    public void dibujarlcasoC(Graphics2D g2,int x, int y){
        Path2D.Double l1 = new Path2D.Double();
        l1.moveTo(0+x,110+y);
        l1.curveTo(5+x,110+y,30+x,60+y,25+x,50+y);
        l1.curveTo(10+x,30+y,10+x,143+y,30+x,143+y);
        g2.draw(l1);
    }
    
    public void dibujarmC(Graphics2D g2,int x, int y){
        Path2D.Double m = new Path2D.Double();
        m.moveTo(0+x, 143+y);
        m.curveTo(5+x, 143+y, 10+x, 105+y, 30+x, 100+y);
        m.moveTo(30+x, 100+y);
        m.curveTo(70+x, 100+y, 50+x, 143+y, 50+x, 143+y);
        m.moveTo(50+x, 143+y);
        m.curveTo(60+x, 80+y, 100+x, 80+y, 90+x, 143+y);
        m.moveTo(90+x, 143+y);
        m.curveTo(90+x, 80+y, 130+x, 90+y, 130+x, 130+y);
        m.moveTo(130+x, 130+y);
        m.curveTo(130+x, 150+y, 150+x, 143+y, 155+x, 143+y);
        g2.draw(m); 
    }
    
    public void dibujarnC(Graphics2D g2,int x, int y){
        Path2D.Double n = new Path2D.Double();
        n.moveTo(0+x, 143+y);
        n.curveTo(15+x, 143+y, 10+x, 110+y, 30+x, 100+y);
        n.moveTo(30+x, 100+y);
        n.curveTo(70+x, 100+y, 50+x, 165+y, 50+x, 143+y);
        n.moveTo(50+x, 143+y);
        n.curveTo(50+x, 143+y, 50+x, 100+y, 70+x, 100+y);
        n.moveTo(70+x, 100+y);
        n.curveTo(105+x, 100+y, 80+x, 143+y, 95+x, 143+y);
        g2.draw(n);
    }
    
    public void dibujarñC(Graphics2D g2,int x, int y){
        Path2D.Double ñ = new Path2D.Double();
        ñ.moveTo(0+x, 143+y);
        ñ.curveTo(15+x, 143+y, 10+x, 110+y, 30+x, 100+y);
        ñ.moveTo(30+x, 100+y);
        ñ.curveTo(70+x, 100+y, 50+x, 165+y, 50+x, 143+y);
        ñ.moveTo(50+x, 143+y);
        ñ.curveTo(50+x, 143+y, 50+x, 100+y, 70+x, 100+y);
        ñ.moveTo(70+x, 100+y);
        ñ.curveTo(105+x, 100+y, 80+x, 143+y, 95+x, 143+y);
        ñ.moveTo(10+x, 80+y);
        ñ.curveTo(40+x, 40+y, 60+x, 100+y, 90+x, 70+y);
        g2.draw(ñ);
    }
    
    
    public void dibujaroC(Graphics2D g2, int x, int y){
        Path2D.Double o = new Path2D.Double(); 
        o.moveTo(0+x, 143+y);
        o.curveTo(10+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        o.moveTo(20+x, 120+y);
        o.curveTo(30+x, 90+y, 80+x, 90+y, 70+x, 120+y);
        o.moveTo(20+x, 120+y);
        o.curveTo(10+x, 160+y, 60+x, 160+y, 70+x, 120+y);
        o.moveTo(24+x,110+y);
        o.curveTo(30+x,130+y,50+x,130+y,90+x,143+y);
        g2.draw(o);
    }
    
    public void dibujarocasoC(Graphics2D g2, int x, int y){
        Path2D.Double o1 = new Path2D.Double();
        o1.moveTo(0+x, 120+y);
        o1.curveTo(0+x, 90+y, 50+x, 90+y, 50+x, 120+y);
        o1.moveTo(0+x, 120+y);
        o1.curveTo(0+x, 160+y, 50+x, 160+y, 50+x, 120+y);
        o1.moveTo(2+x,110+y);
        o1.curveTo(10+x,130+y,30+x,130+y,60+x,143+y);
        g2.draw(o1);
    }
    
    public void dibujarpC(Graphics2D g2, int x, int y){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(0+x, 143+y);
        p.curveTo(15+x, 143+y, 30+x, 110+y, 40+x, 100+y);
        p.moveTo(40+x, 100+y);
        p.curveTo(45+x, 110+y, 25+x, 170+y, 15+x, 180+y);
        p.moveTo(40+x, 100+y);
        p.curveTo(60+x, 60+y, 105+x, 145+y, 33+x, 143+y);
        p.moveTo(30+x, 130+y);
        p.curveTo(70+x, 120+y, 60+x, 150+y, 100+x, 143+y);
        p.moveTo(30+x, 130+y);
        p.curveTo(20+x, 135+y, 23+x, 145+y, 33+x, 143+y);
        g2.draw(p);
    }
    
    public void dibujarqC(Graphics2D g2, int x, int y){
        Path2D.Double q = new Path2D.Double();
        q.moveTo(0+x, 143+y);
        q.curveTo(10+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        q.moveTo(20+x,120+y);
        q.curveTo(30+x,90+y,70+x,90+y,60+x,120+y);
        q.moveTo(20+x,120+y);
        q.curveTo(10+x,150+y,50+x,150+y,60+x,120+y);
        q.moveTo (60+x,120+y);
        q.curveTo(50+x,120+y,40+x,240+y,70+x,170+y);
        q.moveTo(70+x,170+y);
        q.curveTo(70+x,170+y,80+x,150+y,30+x,150+y);
        q.moveTo(30+x,150+y);
        q.curveTo(20+x,150+y,30+x,200+y,80+x,143+y);
        g2.draw(q);      
    }
    
    public void dibujarrC(Graphics2D g2, int x, int y){
        Path2D.Double r = new Path2D.Double();
        r.moveTo(0+x, 143+y);
        r.curveTo(5+x, 143+y, 20+x,100+y, 20+x, 100+y);
        r.moveTo(20+x, 100+y);
        r.curveTo(15+x, 110+y, 70+x, 110+y, 60+x, 100+y);
        r.moveTo(60+x, 100+y);
        r.curveTo(60+x, 115+y, 60+x,143+y, 70+x, 143+y);
        g2.draw(r);
    }
    
    public void dibujarrcasoC(Graphics2D g2, int x, int y,boolean bandera){
        Path2D.Double r1= new Path2D.Double();
        r1.moveTo(0+x,110+y);
        r1.curveTo(5+x,100+y,10+x,80+y,15+x,80+y);
        r1.curveTo(20+x,80+y,20+x,85+y,35+x,80+y);
        r1.curveTo(40+x,80+y,35+x,143+y, 45+x,143+y);
        g2.draw(r1);
    }
    
    public void dibujarsC(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(0+x, 143+y);
        s.curveTo(10+x, 143+y, 30+x,100+y, 30+x, 100+y);
        s.moveTo(30+x, 100+y);
        s.curveTo(80+x, 120+y, 70+x,135+y, 70+x, 143+y);
        s.moveTo(40+x, 140+y);
        s.curveTo(44+x, 147+y, 80+x,145+y, 85+x, 143+y);
        g2.draw(s);   
    }
    
    public void dibujartC(Graphics2D g2, int x, int y){
        Path2D.Double t = new Path2D.Double();
        t.moveTo(0+x,143+y);
        t.curveTo(10+x,133+y,20+x,143+y, 30+x, 55+y);
        t.moveTo(30+x,55+y);
        t.curveTo(20+x,143+y,20+x,133+y,40+x,143+y);
        t.moveTo(10+x,75+y);
        t.curveTo(0+x,75+y,40+x,80+y,40+x,80+y);
        g2.draw(t);
    }
    
    public void dibujaruC(Graphics2D g2, int x, int y){
        Path2D.Double u = new Path2D.Double();
        u.moveTo(0+x, 143+y);
        u.curveTo(10+x, 143+y, 20+x, 130+y, 20+x, 100+y);
        u.moveTo(20+x, 100+y);
        u.curveTo(10+x, 160+y, 60+x, 160+y, 70+x, 100+y);
        u.moveTo(70+x, 100+y);
        u.curveTo(70+x, 110+y, 60+x, 143+y, 90+x, 143+y);
        g2.draw(u);
    }
    
    public void dibujarucasoC(Graphics2D g2, int x, int y){
        Path2D.Double u1 = new Path2D.Double();        
        u1.moveTo(0+x, 110+y);
        u1.curveTo(0+x, 160+y, 50+x, 160+y, 50+x, 110+y);
        u1.moveTo(50+x, 110+y);
        u1.curveTo(50+x, 120+y, 50+x, 143+y, 70+x, 143+y);
        g2.draw(u1);
    }
    
    public void dibujarvC(Graphics2D g2, int x, int y){
        Path2D.Double v =new Path2D.Double();
        v.moveTo(0+x,143+y);
        v.curveTo(10+x,143+y,10+x,100+y,35+x,100+y);
        v.moveTo(35+x,100+y);
        v.curveTo(50+x,100+y,25+x,143+y,45+x,143+y);
        v.moveTo(45+x,143+y);
        v.curveTo(65+x,143+y,80+x,100+y,80+x,100+y);
        v.moveTo(80+x,100+y);
        v.curveTo(90+x,105+y,105+x,115+y,110+x,110+y);
        g2.draw(v);
    }
    
    public void dibujarwC(Graphics2D g2, int x, int y){
        Path2D.Double w =new Path2D.Double();
        w.moveTo(0+x,143+y);
        w.curveTo(10+x,143+y,10+x,100+y,25+x,100+y);
        w.moveTo(25+x,100+y);
        w.curveTo(60+x,100+y,15+x,143+y,35+x,143+y);
        w.moveTo(35+x,143+y);
        w.curveTo(75+x,153+y,65+x,100+y,75+x,100+y);
        w.moveTo(75+x,100+y);
        w.curveTo(75+x,100+y,45+x,153+y,95+x,143+y);       
        w.moveTo(95+x,143+y);
        w.curveTo(100+x,143+y,110+x,100+y,110+x,100+y);
        w.moveTo(110+x,100+y);
        w.curveTo(120+x,105+y,150+x,115+y,150+x,110+y);
        g2.draw(w);
    }
    
    public void dibujarx1C(Graphics2D g2, int x, int y){
        Path2D.Double x1 =new Path2D.Double();
        x1.moveTo(0+x,143+y);
        x1.curveTo(40+x,143+y,40+x,100+y,60+x,100+y);
        x1.moveTo(0+x,100+y);
        x1.curveTo(30+x,100+y,30+x,143+y,60+x,143+y);
        g2.draw(x1);
    }
    
    public void dibujary1C(Graphics2D g2, int x, int y){
        Path2D.Double  y1 =new Path2D.Double();
        y1.moveTo(0+x,143+y);
        y1.curveTo(0+x,143+y,30+x,143+y,40+x,100+y);
        y1.moveTo(40+x,100+y);
        y1.curveTo(10+x,174+y,78+x,138+y,78+x,138+y);
        y1.moveTo(90+x,100+y);
        y1.curveTo(80+x,100+y,70+x,200+y,70+x,200+y);
        y1.moveTo(70+x,200+y);
        y1.curveTo(70+x,225+y,30+x,225+y,30+x,200+y);
        y1.moveTo(30+x,200+y);
        y1.curveTo(30+x,180+y,50+x,143+y,120+x,143+y);
        g2.draw(y1);
    }
    
    public void dibujarzC(Graphics2D g2, int x, int y){
        Path2D.Double  z =new Path2D.Double();
        z.moveTo(0+x,143+y);
        z.curveTo(25+x,143+y,35+x,100+y,50+x,100+y);
        z.moveTo(50+x,100+y);
        z.curveTo(70+x,100+y,50+x,143+y,30+x,143+y);
        z.moveTo(30+x,143+y);
        z.curveTo(70+x,130+y,50+x,200+y,30+x,200+y);
        z.moveTo(70+x,143+y);
        z.curveTo(60+x,150+y,20+x,175+y,30+x,200+y);
        g2.draw(z);
    }
    
    public void dibujarZC(Graphics2D g2, int x, int y){
        Path2D.Double Z = new Path2D.Double();
        Z.moveTo(40+x,80+y);
        Z.curveTo(10+x,70+y,10+x,55+y,110+x,60+y);
        Z.curveTo(90+x,20+y,30+x,143+y,0+x,135+y);
        Z.curveTo(10+x,110+y,80+x,175+y,100+x,120+y);
        Z.moveTo(30+x,100+y);
        Z.lineTo(70+x,100+y);
        g2.draw(Z);
    }
    
    public void dibujarYC(Graphics2D g2, int x, int y){
        Path2D.Double Y = new Path2D.Double();
        Y.moveTo(25+x, 75+y);
        Y.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
        Y.moveTo(40+x,100+y);
        Y.curveTo(50+x,110+y,60+x,100+y,70+x, 60+y);
        Y.moveTo(70+x,60+y);
        Y.curveTo(70+x,45+y,55+x,70+y,55+x,140+y);
        Y.moveTo(55+x,140+y);
        Y.curveTo(55+x,170+y,25+x,200+y,30+x,160+y);
        Y.moveTo(30+x,160+y);
        Y.curveTo(40+x,120+y,55+x,110+y,60+x,115+y);
        Y.moveTo(60+x,115+y);
        Y.curveTo(70+x,115+y,80+x,143+y,100+x,143+y);  
        g2.draw(Y);
    }
    
    public void dibujarXC(Graphics2D g2, int x, int y){
        Path2D.Double X = new Path2D.Double();
        X.moveTo(10+x,60+y);
        X.curveTo(40+x,20+y,70+x,190+y,100+x,130+y);
        X.moveTo(0+x, 135+y);
        X.curveTo(10+x,180+y,90+x,20+y,100+x,60+y);
        g2.draw(X);
    }
    
    public void dibujarWC(Graphics2D g2, int x, int y){
        Path2D.Double W = new Path2D.Double();
        W.moveTo(25+x, 75+y);
        W.curveTo(0+x,85+y,40+x,15+y,40+x,100+y);
        W.moveTo(40+x,100+y);
        W.curveTo(40+x,190+y,60+x,120+y,60+x,100+y);
        W.moveTo(60+x,100+y);
        W.curveTo(60+x,225+y,100+x,35+y,80+x,70+y);
        g2.draw(W);
    }
}
