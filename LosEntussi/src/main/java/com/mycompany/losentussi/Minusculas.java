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
        a.curveTo(40+x, 143+y, 40+x, 100+y, 40+x, 100+y);
        a.moveTo(40+x, 100+y);
        a.curveTo(40+x, 40+y, 120+x, 40+y, 120+x, 100+y);
        a.moveTo(40+x, 100+y);
        a.curveTo(40+x, 160+y, 120+x, 160+y, 120+x, 100+y);
        a.moveTo(120+x, 100+y);
        a.curveTo(120+x, 100+y, 120+x, 143+y, 160+x, 143+y);
        g2.draw(a);
    }
    public void dibujarb(Graphics2D g2,int x, int y){
        Path2D.Double b = new Path2D.Double();
        b.moveTo(10+x, 143+y);
        b.curveTo(25+x, 143+y, 35+x, 50+y,25+x , 40+y);
        b.moveTo(23+x,143+y);
        b.curveTo(23+x,143+y, 20+x,45+y, 25+x, 40+y);
        b.moveTo(23+x, 143+y);
        b.curveTo(23+x, 143+y, 60+x, 80+y,30+x , 100+y);
        b.moveTo(30+x, 100+y);
        b.curveTo(45+x,100+y,50+x, 110+y,60+x, 100+y);
        g2.draw(b);
    }
    
    /* Path2D.Double a = new Path2D.Double();
        a.moveTo(0, 143);
        a.curveTo(40, 143, 40, 100, 40, 100);
        a.moveTo(40, 100);
        a.curveTo(40, 40, 120, 40, 120, 100);
        a.moveTo(40, 100);
        a.curveTo(40, 160, 120, 160, 120, 100);
        a.moveTo(120, 100);
        a.curveTo(120, 100, 120, 143, 160, 143);
        g2.draw(a);
        
        //a
        Path2D.Double a = new Path2D.Double();
        a.moveTo(160, 143);
        a.curveTo(200, 143, 200, 100, 200, 100);
        a.moveTo(200, 100);
        a.curveTo(200, 40, 280, 40, 280, 100);
        a.moveTo(200, 100);
        a.curveTo(200, 160, 280, 160, 280, 100);
        a.moveTo(280, 100);
        a.curveTo(280, 100, 280, 143, 320, 143);
        g2.draw(a);
        
  
          */      
       
        /*
        //Funcion b:
        Path2D.Double b = new Path2D.Double();
        b.moveTo(10, 143);
        b.curveTo(25, 143, 35, 50,25 , 40);
        b.moveTo(23,143);
        b.curveTo(23,143, 20,45, 25, 40);
        b.moveTo(23, 143);
        b.curveTo(23, 143, 60, 80,30 , 100);
        b.moveTo(30, 100);
        b.curveTo(45,100,50, 110,60, 100);
        g2.draw(b);
        */
        
        /*
        //Funcion c:
        Path2D.Double c = new Path2D.Double();
        c.moveTo(35,100);
        c.curveTo(30, 115,30,148,70,143);
        c.moveTo(20, 143);
        c.curveTo(50,140,5,85, 68, 95);
        g2.draw(c);
        */    
        
        /*
        //Funcion d :
        Path2D.Double d = new Path2D.Double();
        d.moveTo(35,100);
        d.curveTo(30, 115,30,148,80,143);
        d.moveTo(20, 143);
        d.curveTo(50,140,5,85, 68, 95);
        d.moveTo(80,143);
        d.curveTo(80,143,60, 140,70, 20);
        g2.draw(d);
        */
        
        /*
        //Funcion e :     
        Path2D.Double e = new Path2D.Double();
        e.moveTo(10, 143);
        e.curveTo(25, 143, 35,110,25 , 100);
        e.moveTo(35,143);
        e.curveTo(20,143, 15,100, 25, 100);
        g2.draw(e);        
        */
        
        /*
        //Funcion f :        
        Path2D.Double f = new Path2D.Double();
        f.moveTo(10, 143);
        f.curveTo(25, 143, 35, 50,25 , 60);
        f.moveTo(25,170);
        f.curveTo(20,143, 25,45, 27, 60);
        f.moveTo(25,170);
        f.curveTo(50,150,40,130,23,120);
        f.moveTo(23,130);
        f.curveTo(30,130, 50, 130, 60,120);
        g2.draw(f);
        */
        
        /*
        // Funcion g:
        Path2D.Double g1 = new Path2D.Double();
        g1.moveTo(30,60);
        g1.curveTo(30,30,70,30,70,60);
        g1.moveTo(30,60);
        g1.curveTo(30,90,70,90,70,60);
        g1.moveTo(30,60);
        g1.curveTo(30,70,20,85,20,80);
        g1.moveTo(70,60);
        g1.curveTo(70,60,65,160,40,140);
        g1.moveTo(40,140);
        g1.curveTo(30,130,90,60,90,60);
        g2.draw(g1);
        */
        
        /*
        //Funcion h:
        Path2D.Double h = new Path2D.Double();
        h.moveTo(10,143);
        h.curveTo(15,135,30,60,20,50);
        h.moveTo(20,50);
        h.curveTo(10,60,20,135,20,143);
        h.moveTo(18,110);
        h.curveTo(60,100,30,143,70,143);
        g2.draw(h);
        */
        
        /*
       //Funcion i:
        Path2D.Double i = new Path2D.Double();
        i.moveTo(0,143);
        i.curveTo(0,143,35,143, 30, 60);
        i.moveTo(30,60);
        i.curveTo(30,143,60,143,60,140);
        g2.fillOval(25,40,10,10);
        g2.draw(i);
        */
        
        /*
        //Funcion j:
        Path2D.Double j = new Path2D.Double();
        j.moveTo(0, 143);
        j.curveTo(30, 143, 60, 110, 60, 55);
        j.moveTo(60, 55);
        j.curveTo(60, 55, 70, 180, 45, 180);
        j.moveTo(45, 180);
        j.curveTo(30, 185, 15, 180, 40, 150);
        j.moveTo(40, 150);
        j.curveTo(40, 150, 80, 140, 100, 143);
        g2.setColor(Color.black);
        g2.drawOval(55, 40, 10, 10);
        g2.draw(j);
        */
        
        /*
        //Funcion k:
        Path2D.Double k = new Path2D.Double();
        k.moveTo(0, 100);
        k.curveTo(100, 100, 20, -25, 50, 143);
        k.moveTo(43, 100);
        k.curveTo(43, 100, 70, 40, 80, 55);
        k.moveTo(43, 100);
        k.curveTo(50, 100, 70, 115, 70, 120);
        k.moveTo(70, 120);
        k.curveTo(78, 127, 80, 155, 100, 143);
        g2.draw(k);
        */
        
        /*
        //Funcion l:
        Path2D.Double l = new Path2D.Double();
        l.moveTo(0, 143);
        l.curveTo(40, 143, 60, 40, 40, 55);
        l.moveTo(40, 55);
        l.curveTo(25, 60, 20, 143, 80, 143);
        g2.draw(l);
        */
        
        /*
        //Funcion m:
        Path2D.Double m = new Path2D.Double();
        m.moveTo(0, 143);
        m.curveTo(35, 143, 25, 80, 40, 70);
        m.moveTo(40, 70);
        m.curveTo(70, 50, 70, 143, 70, 143);
        m.moveTo(70, 143);
        m.curveTo(70, 50, 110, 50, 110, 143);
        m.moveTo(110, 143);
        m.curveTo(110, 50, 150, 60, 150, 120);
        m.moveTo(150, 120);
        m.curveTo(150, 140, 145, 160, 190, 143);
        g2.draw(m);
        */
        
        /*
        //Funcion n:
        Path2D.Double n = new Path2D.Double();
        n.moveTo(0, 143);
        n.curveTo(35, 143, 25, 80, 40, 70);
        n.moveTo(40, 70);
        n.curveTo(70, 50, 70, 143, 70, 143);
        n.moveTo(70, 143);
        n.curveTo(70, 50, 110, 60, 110, 120);
        n.moveTo(110, 120);
        n.curveTo(110, 140, 105, 160, 150, 143);
        g2.draw(n);
        */
        
        /*
        //Funcion ñ:
        Path2D.Double ñ = new Path2D.Double();
        ñ.moveTo(0, 143);
        ñ.curveTo(35, 143, 25, 80, 40, 70);
        ñ.moveTo(40, 70);
        ñ.curveTo(70, 50, 70, 143, 70, 143);
        ñ.moveTo(70, 143);
        ñ.curveTo(70, 50, 110, 60, 110, 120);
        ñ.moveTo(110, 120);
        ñ.curveTo(110, 140, 105, 160, 150, 143);
        ñ.moveTo(30, 60);
        ñ.curveTo(60, 20, 80, 80, 110, 50);
        g2.draw(ñ);
        */
        
        /*
        //Funcion o: 
        Path2D.Double o = new Path2D.Double();
        o.moveTo(0, 143);
        o.curveTo(35, 143, 40, 110, 40, 90);
        o.moveTo(40, 100);
        o.curveTo(40, 40, 120, 40, 120, 100);
        o.moveTo(40, 100);
        o.curveTo(40, 160, 120, 160, 120, 100);
        o.moveTo(50, 69);
        o.curveTo(45, 100, 130, 105, 145, 70);
        g2.draw(o);
        */
        
        /*
        //Funcion p:
        Path2D.Double p = new Path2D.Double();
        p.moveTo(0, 143);
        p.curveTo(35, 143, 40, 110, 40, 90);
        p.moveTo(40, 90);
        p.curveTo(45, 110, 45, 170, 35, 180);
        p.moveTo(40, 90);
        p.curveTo(100, 50, 135, 145, 43, 143);
        p.moveTo(40, 130);
        p.curveTo(80, 120, 70, 160, 120, 143);
        p.moveTo(40, 130);
        p.curveTo(30, 135, 33, 145, 43, 143);
        g2.draw(p);
        */
        
        /*
        //Funcion q:
        Path2D.Double q = new Path2D.Double();
        q.moveTo(30,60);
        q.curveTo(30,30,70,30,70,60);
        q.moveTo(30,60);
        q.curveTo(30,90,70,90,70,60);
        q.moveTo(30,60);
        q.moveTo (70,60);
        q.curveTo(70,60,60,180,90,110);
        q.moveTo(90,110);
        q.curveTo(90,110,100,90,50,90);
        q.moveTo(50,90);
        q.curveTo(40,90,50,140,90,70);
        g2.draw(q);
        */
        
        /*
        //Funcion r:
        Path2D.Double r = new Path2D.Double();
        r.moveTo(0, 143);
        r.curveTo(15, 140, 40,143, 40, 55);
        r.moveTo(40, 55);
        r.curveTo(45, 65, 115, 65, 120, 55);
        r.moveTo(120, 55);
        r.curveTo(120, 65, 120,143, 160, 143);
        g2.draw(r);
        */
         
        /*
        //Funcion s:
        Path2D.Double s = new Path2D.Double();
        s.moveTo(0, 143);
        s.curveTo(60, 143, 65,55, 65, 55);
        s.moveTo(65, 55);
        s.curveTo(140, 110, 130,125, 130, 143);
        s.moveTo(80, 140);
        s.curveTo(94, 147, 145,145, 155, 134);
        g2.draw(s);
        */
        
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
