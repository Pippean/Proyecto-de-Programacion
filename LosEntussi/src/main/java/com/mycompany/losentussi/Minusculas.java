package com.mycompany.losentussi;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author Pipe
 */

public class Minusculas {
    
    public Minusculas(){
        
    }
    
    public void dibujara(Graphics2D g2, int x, int y){
        Path2D.Double a = new Path2D.Double();
        a.moveTo(0+x, 143+y);
        a.curveTo(20+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        a.moveTo(20+x, 120+y);
        a.curveTo(20+x, 90+y, 70+x, 90+y, 70+x, 120+y);
        a.moveTo(20+x, 120+y);
        a.curveTo(20+x, 160+y, 70+x, 160+y, 70+x, 120+y);
        a.moveTo(70+x, 120+y);
        a.curveTo(70+x, 120+y, 70+x, 143+y, 90+x, 143+y);
        g2.draw(a);
    } 
    
    public void dibujarb(Graphics2D g2,int x, int y){
        Path2D.Double b = new Path2D.Double();
        b.moveTo(0+x, 143+y);
        b.curveTo(15+x, 143+y, 25+x, 50+y,15+x , 40+y);
        b.moveTo(13+x,143+y);
        b.curveTo(13+x,143+y, 10+x,45+y, 15+x, 40+y);
        b.moveTo(13+x, 143+y);
        b.curveTo(13+x, 143+y, 50+x, 80+y,20+x , 100+y);
        b.moveTo(20+x, 100+y);
        b.curveTo(35+x,100+y,40+x, 110+y,50+x, 100+y);
        g2.draw(b);
    }
    
     public void dibujarc(Graphics2D g2,int x, int y){
        Path2D.Double c = new Path2D.Double();
        c.moveTo(35+x,100+y);
        c.curveTo(30+x, 115+y,30+x,148+y,70+x,143+y);
        c.moveTo(20+x, 143+y);
        c.curveTo(50+x,140+y,5+x,85+y, 68+x, 95+y);
        g2.draw(c);
     }
     
     //modificar
     /*
     public void dibujard(Graphics2D g2,int x, int y){
        Path2D.Double d = new Path2D.Double();
        d.moveTo(35,100);
        d.curveTo(30, 115,30,148,80,143);
        d.moveTo(20, 143);
        d.curveTo(50,140,5,85, 68, 95);
        d.moveTo(80,143);
        d.curveTo(80,143,60, 140,70, 20);
        g2.draw(d);
     }*/
     
     
    public void dibujare(Graphics2D g2,int x, int y){
        Path2D.Double e = new Path2D.Double();
        e.moveTo(10+x, 143+y);
        e.curveTo(25+x, 143+y, 35+x,110+y,25+x , 100+y);
        e.moveTo(35+x,143+y);
        e.curveTo(20+x,143+y, 15+x,100+y, 25+x, 100+y);
        g2.draw(e); 
    }
    
    public void dibujarf(Graphics2D g2,int x, int y){
        Path2D.Double f = new Path2D.Double();
        f.moveTo(10+x, 143+y);
        f.curveTo(25+x, 143+y, 35+x, 50+y,25+x , 60+y);
        f.moveTo(25+x,170+y);
        f.curveTo(20+x,143+y, 25+x,45+y, 27+x, 60+y);
        f.moveTo(25+x,170+y);
        f.curveTo(50+x,150+y,40+x,130+y,23+x,120+y);
        f.moveTo(23+x,130+y);
        f.curveTo(30+x,130+y, 50+x, 130+y, 60+x,120+y);
        g2.draw(f);
    }
    
    public void dibujarg(Graphics2D g2,int x, int y){
        Path2D.Double g1 = new Path2D.Double();
        g1.moveTo(30+x,120+y);
        g1.curveTo(30+x,90+y,70+x,90+y,70+x,120+y);
        g1.moveTo(30+x,120+y);
        g1.curveTo(30+x,150+y,70+x,150+y,70+x,120+y);
        g1.moveTo(30+x,120+y);
        g1.curveTo(30+x,130+y,20+x,145+y,20+x,140+y);
        g1.moveTo(70+x,120+y);
        g1.curveTo(70+x,120+y,65+x,220+y,40+x,200+y);
        g1.moveTo(40+x,200+y);
        g1.curveTo(30+x,180+y,90+x,143+y,90+x,143+y);
        g2.draw(g1);
    }
    
    public void dibujarh(Graphics2D g2,int x, int y){
        Path2D.Double h = new Path2D.Double();
        h.moveTo(10+x,143+y);
        h.curveTo(15+x,135+y,30+x,60+y,20+x,50+y);
        h.moveTo(20+x,50+y);
        h.curveTo(10+x,60+y,20+x,135+y,20+x,143+y);
        h.moveTo(18+x,110+y);
        h.curveTo(60+x,100+y,30+x,143+y,70+x,143+y);
        g2.draw(h);
    }
        
    public void dibujari(Graphics2D g2,int x, int y){
        Path2D.Double i = new Path2D.Double();
        i.moveTo(0+x,143+y);
        i.curveTo(0+x,143+y,25+x,143+y, 30+x, 100+y);
        i.moveTo(30+x,100+y);
        i.curveTo(30+x,143+y,60+x,143,60+x,143+y);
        g2.fillOval(25+x,70+y,10,10);
        g2.draw(i);
    }
    
    public void dibujarj(Graphics2D g2,int x, int y){
        Path2D.Double j = new Path2D.Double();
        j.moveTo(30+x, 143+y);
        j.curveTo(60+x, 143+y, 60+x, 110+y, 60+x, 100+y);
        j.moveTo(60+x, 100+y);
        j.curveTo(60+x, 100+y, 70+x, 180+y, 45+x, 180+y);
        j.moveTo(45+x, 180+y);
        j.curveTo(30+x, 185+y, 15+x, 180+y, 40+x, 160+y);
        j.moveTo(40+x, 160+y);
        j.curveTo(40+x, 160+y, 80+x, 140+y, 90+x, 143+y);
        g2.fillOval(55+x,80+y,10,10);
        g2.draw(j);  
    }
    
    public void dibujark(Graphics2D g2,int x, int y){    
        Path2D.Double k = new Path2D.Double();
        k.moveTo(0+x, 143);
        k.curveTo(100+x, 90, 20+x, -25, 50+x, 143);
        k.moveTo(43+x, 100);
        k.curveTo(43+x, 100, 70+x, 40, 80+x, 55);
        k.moveTo(43+x, 100);
        k.curveTo(50+x, 100, 70+x, 115, 70+x, 120);
        k.moveTo(70+x, 120);
        k.curveTo(78+x, 127, 80+x, 155, 100+x, 143);
        g2.draw(k);
    }
    
    public void dibujarl(Graphics2D g2,int x, int y){  
    Path2D.Double l = new Path2D.Double();
    l.moveTo(20+x, 143+y);
    l.curveTo(50+x, 143+y, 60+x, 40+y, 40+x, 55+y);
    l.moveTo(40+x, 55+y);
    l.curveTo(25+x, 60+y, 40+x, 143+y, 60+x, 143+y);
    g2.draw(l);
    }

    public void dibujarm(Graphics2D g2,int x, int y){
        Path2D.Double m = new Path2D.Double();
        m.moveTo(0+x, 143+y);
        m.curveTo(15+x, 143+y, 5+x, 110+y, 20+x, 100+y);
        m.moveTo(20+x, 100+y);
        m.curveTo(60+x, 100+y, 50+x, 173+y, 50+x, 143+y);
        m.moveTo(50+x, 143+y);
        m.curveTo(50+x, 80+y, 90+x, 80+y, 90+x, 143+y);
        m.moveTo(90+x, 143+y);
        m.curveTo(90+x, 80+y, 130+x, 90+y, 130+x, 143+y);
        m.moveTo(130+x, 143+y);
        m.curveTo(130+x, 150+y, 160+x, 143+y, 150+x, 143+y);
        g2.draw(m); 
    }  
    
    public void dibujarn(Graphics2D g2,int x, int y){
        Path2D.Double n = new Path2D.Double();
        n.moveTo(0+x, 143+y);
        n.curveTo(15+x, 143+y, 5+x, 110+y, 20+x, 100+y);
        n.moveTo(20+x, 100+y);
        n.curveTo(60+x, 100+y, 50+x, 173+y, 50+x, 143+y);
        n.moveTo(50+x, 143+y);
        n.curveTo(50+x, 80+y, 90+x, 80+y, 90+x, 143+y);
        n.moveTo(90+x, 143+y);
        n.curveTo(90+x, 150+y, 100+x, 143+y, 100+x, 143+y);
        g2.draw(n);
    }
    
    public void dibujarñ(Graphics2D g2,int x, int y){
        Path2D.Double ñ = new Path2D.Double();
        ñ.moveTo(0+x, 143+y);
        ñ.curveTo(15+x, 143+y, 5+x, 110+y, 20+x, 100+y);
        ñ.moveTo(20+x, 100+y);
        ñ.curveTo(60+x, 100+y, 50+x, 173+y, 50+x, 143+y);
        ñ.moveTo(50+x, 143+y);
        ñ.curveTo(50+x, 80+y, 90+x, 80+y, 90+x, 143+y);
        ñ.moveTo(90+x, 143+y);
        ñ.curveTo(90+x, 150+y, 100+x, 143+y, 100+x, 143+y);
        ñ.moveTo(10+x, 80+y);
        ñ.curveTo(40+x, 40+y, 60+x, 100+y, 90+x, 70+y);
        g2.draw(ñ);
    }
    
    public void dibujaro(Graphics2D g2,int x, int y){
        Path2D.Double o = new Path2D.Double();
        o.moveTo(0+x, 143+y);
        o.curveTo(20+x, 143+y, 20+x, 130+y, 20+x, 120+y);
        o.moveTo(20+x, 120+y);
        o.curveTo(20+x, 90+y, 70+x, 90+y, 70+x, 120+y);
        o.moveTo(20+x, 120+y);
        o.curveTo(20+x, 160+y, 70+x, 160+y, 70+x, 120+y);
        o.moveTo(30+x, 101+y);
        o.curveTo(55+x, 132+y, 100+x, 120+y, 100+x, 120+y);
        g2.draw(o);
    }
    
    public void dibujarp(Graphics2D g2,int x, int y){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(10+x, 143+y);
        p.curveTo(45+x, 143+y, 40+x, 110+y, 40+x, 100+y);
        p.moveTo(40+x, 100+y);
        p.curveTo(45+x, 110+y, 45+x, 170+y, 35+x, 180+y);
        p.moveTo(40+x, 100+y);
        p.curveTo(70+x, 70+y, 115+x, 145+y, 43+x, 143+y);
        p.moveTo(40+x, 130+y);
        p.curveTo(80+x, 120+y, 70+x, 160+y, 110+x, 143+y);
        p.moveTo(40+x, 130+y);
        p.curveTo(30+x, 135+y, 33+x, 145+y, 43+x, 143+y);
        g2.draw(p);
    }

    public void dibujarq(Graphics2D g2,int x, int y){
        Path2D.Double q = new Path2D.Double();
        q.moveTo(30+x,120+y);
        q.curveTo(30+x,90+y,70+x,90+y,70+x,120+y);
        q.moveTo(30+x,120+y);
        q.curveTo(30+x,150+y,70+x,150+y,70+x,120+y);
        q.moveTo(30+x,120+y);
        q.moveTo (70+x,120+y);
        q.curveTo(70+x,120+y,60+x,240+y,90+x,170+y);
        q.moveTo(90+x,170+y);
        q.curveTo(90+x,170+y,100+x,150+y,50+x,150+y);
        q.moveTo(50+x,150+y);
        q.curveTo(40+x,150+y,50+x,200+y,90+x,143+y);
        g2.draw(q);
        }
    
    public void dibujarr(Graphics2D g2,int x, int y){
        Path2D.Double r = new Path2D.Double();
        r.moveTo(0+x, 143);
        r.curveTo(15+x, 143, 10+x,100, 10+x, 100);
        r.moveTo(10+x, 100);
        r.curveTo(15+x, 110, 60+x, 110, 60+x, 100);
        r.moveTo(60+x, 100);
        r.curveTo(60+x, 115, 60+x,143, 70+x, 143);
        g2.draw(r);
    }
    
    public void dibujars(Graphics2D g2,int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(0+x, 143);
        s.curveTo(20+x, 143, 25+x,100, 25+x, 100);
        s.moveTo(25+x, 100);
        s.curveTo(80+x, 120, 70+x,135, 70+x, 143);
        s.moveTo(40+x, 140);
        s.curveTo(44+x, 147, 80+x,145, 85+x, 143);
        g2.draw(s);
        
    }
 
        /*
        //Funcion t:
        Path2D.Double t = new Path2D.Double();
        t.moveTo(0,300);
        t.curveTo(20,290,30,300, 30, 150);
        t.moveTo(30,150);
        t.curveTo(30,300,40,290,60,300);
        t.moveTo(0,180);
        t.curveTo(0,180,60,180,60,180);
        g2.draw(t);
        */
        
        /*
        //Funcion u:
        Path2D.Double u =new Path2D.Double();
        u.moveTo(0,143);
        u.curveTo(0,143,30,143,30,55);
        u.moveTo(30,55);
        u.curveTo(20,174,140,174,130,55);
        u.moveTo(130,55);
        u.curveTo(130,55,130,143,160,143);
        g2.draw(u);
        */
        
        /*
        //Funcion v:
        Path2D.Double v =new Path2D.Double();
        v.moveTo(0,143);
        v.curveTo(20,143,15,55,40,55);
        v.moveTo(40,55);
        v.curveTo(65,55,60,143,80,143);
        v.moveTo(80,143);
        v.curveTo(100,143,110,55,110,55);
        v.moveTo(110,55);
        v.curveTo(115,60,155,60,160,55);
        g2.draw(v);
        */
                
        /*
        //Funcion w:
        Path2D.Double w =new Path2D.Double();
        w.moveTo(0,143);
        w.curveTo(20,143,15,55,40,55);
        w.moveTo(40,55);
        w.curveTo(65,55,60,143,80,143);
        w.moveTo(80,143);
        w.curveTo(120,153,110,55,110,55);
        w.moveTo(110,55);
        w.curveTo(110,55,100,153,140,143);       
        w.moveTo(140,143);
        w.curveTo(160,143,160,55,160,55);
        w.moveTo(160,55);
        w.curveTo(165,60,195,60,200,55);
        g2.draw(w);
        */
              
        /*
        //Funcion x:
        Path2D.Double x =new Path2D.Double();
        x.moveTo(0,143);
        x.curveTo(60,143,60,55,100,55);
        x.moveTo(0,55);
        x.curveTo(50,55,50,143,100,143);
        g2.draw(x);
        */
        
        /*
        //Funcion y:
        Path2D.Double  y =new Path2D.Double();
        y.moveTo(0,143);
        y.curveTo(0,143,30,143,30,55);
        y.moveTo(30,55);
        y.curveTo(20,174,80,138,80,138);
        y.moveTo(80,55);
        y.curveTo(80,55,80,200,80,200);
        y.moveTo(80,200);
        y.curveTo(80,225,40,225,40,200);
        y.moveTo(40,200);
        y.curveTo(40,180,60,143,120,143);
        g2.draw(y);
        */
                
        /*
        //Funcion z:
        Path2D.Double  z =new Path2D.Double();
        z.moveTo(20,143);
        z.curveTo(50,143,0,90,70,90);
        z.moveTo(70,90);
        z.curveTo(100,90,90,143,70,143);
        z.moveTo(70,143);
        z.curveTo(45,143,45,125,70,130);     
        z.moveTo(70,130);
        z.curveTo(100,140,110,175,100,200);
        z.moveTo(100,200);
        z.curveTo(95,220,60,220,60,200);
        z.moveTo(60,200);
        z.curveTo(60,185,100,150,120,143);
        g2.draw(z);
        */
    
}
