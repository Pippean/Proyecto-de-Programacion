package com.mycompany.losentussi;

import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Pipe
 */
public class Simbolos {
    
    public Simbolos(){
        
    }
    
    public void interrogacionabierto(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(30+x, 143+y);
        s.curveTo(0+x, 143+y, 0+x, 65+y, 35+x, 70+y);
        s.moveTo(35+x, 70+y);
        s.curveTo(30+x, 70+y, 30+x, 50+y, 30+x, 50+y);
        g2.fillOval(25+x,30+y,10,10);
        g2.draw(s);
    }
    
    public void interrogacioncerrado(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(30+x, 30+y);
        s.curveTo(60+x, 25+y, 60+x, 103+y, 35+x, 103+y);
        s.moveTo(35+x, 103+y);
        s.curveTo(30+x, 103+y, 30+x, 123+y, 30+x, 123+y);
        g2.fillOval(25+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void exclamacionabierto(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(30+x, 30+y);
        s.curveTo(30+x, 30+y, 30+x, 103+y, 30+x, 103+y);
        s.moveTo(30+x, 103+y);
        s.curveTo(30+x, 103+y, 30+x, 123+y, 30+x, 123+y);
        g2.fillOval(25+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void exclamacioncerrado(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(30+x, 163+y);
        s.curveTo(30+x, 163+y, 30+x, 90+y, 30+x, 90+y);
        s.moveTo(30+x, 90+y);
        s.curveTo(30+x, 90+y, 30+x, 70+y, 30+x, 70+y);
        g2.fillOval(25+x,50+y,10,10);
        g2.draw(s);
    }
    
    public void punto(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void coma(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(28+x, 136+y);
        s.curveTo(28+x, 136+y, 30+x, 148+y, 20+x, 156+y);
        g2.fillOval(20+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void puntoycoma(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20+x,93+y,10,10);
        s.moveTo(28+x, 136+y);
        s.curveTo(28+x, 136+y, 30+x, 148+y, 20+x, 156+y);
        g2.fillOval(20+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void dospuntos(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20+x,93+y,10,10);
        g2.fillOval(20+x,133+y,10,10);
        g2.draw(s);
    }
    
    public void comillas(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(28+x, 53+y);
        s.curveTo(28+x, 53+y, 28+x, 65+y, 25+x, 73+y);
        g2.fillOval(20+x,50+y,10,10);
        g2.draw(s);
    }
    
    public void españolaabierta(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(10+x, 120+y);
        s.curveTo(10+x, 120+y, 40+x, 100+y, 40+x, 100+y);
        s.moveTo(10+x, 120+y);
        s.curveTo(10+x, 120+y, 40+x, 140+y, 40+x, 140+y);
        g2.draw(s);
    }
    
    public void españolacerrada(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(10+x, 140+y);
        s.curveTo(10+x, 140+y, 40+x, 120+y, 40+x, 120+y);
        s.moveTo(40+x, 120+y);
        s.curveTo(40+x, 120+y, 10+x, 100+y, 10+x, 100+y);
        g2.draw(s);
    }
    
    public void parentesisabierto(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(25+x, 40+y);
        s.curveTo(0+x, 40+y, 0+x, 155+y, 25+x, 155+y);
        g2.draw(s);
    }
    
    public void parentesiscerrado(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(25+x, 40+y);
        s.curveTo(50+x, 40+y, 50+x, 155+y, 25+x, 155+y);
        g2.draw(s);
    }
    
    public void corchetesabiertos(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(25+x, 50+y);
        s.curveTo(25+x, 50+y, 5+x, 50+y, 5+x, 50+y);
        s.moveTo(5+x, 50+y);
        s.curveTo(5+x, 50+y, 5+x, 153+y, 5+x, 153+y);
        s.moveTo(5+x, 153+y);
        s.curveTo(5+x, 153+y, 25+x, 153+y, 25+x, 153+y);
        g2.draw(s);
    }
    
    public void corchetescerrados(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(5+x, 50+y);
        s.curveTo(5+x, 50+y, 25+x, 50+y, 25+x, 50+y);
        s.moveTo(25+x, 50+y);
        s.curveTo(25+x, 50+y, 25+x, 153+y, 25+x, 153+y);
        s.moveTo(25+x, 153+y);
        s.curveTo(25+x, 153+y, 5+x, 153+y, 5+x, 153+y);
        g2.draw(s);
    }
    
    public void llavesabiertas(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(30+x, 140+y);
        s.curveTo(15+x, 140+y, 25+x, 90+y, 5+x, 90+y);
        s.moveTo(5+x, 90+y);
        s.curveTo(25+x, 90+y, 15+x, 40+y, 30+x, 40+y);
        g2.draw(s);
    }
    
    public void llavescerradas(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(5+x, 40+y);
        s.curveTo(20+x, 40+y, 5+x, 90+y, 30+x, 90+y);
        s.moveTo(30+x, 90+y);
        s.curveTo(5+x, 90+y, 20+x, 140+y, 5+x, 140+y);
        g2.draw(s);
    }
    
    public void guion(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(5+x, 120+y);
        s.curveTo(5+x, 120+y, 45+x, 120+y, 45+x, 120+y);
        g2.draw(s);
    }
    
    public void guionbajo(Graphics2D g2, int x, int y){
        Path2D.Double s = new Path2D.Double();
        s.moveTo(5+x, 143+y);
        s.curveTo(5+x, 143+y, 60+x, 143+y, 60+x, 143+y);
        g2.draw(s);
    }
}
