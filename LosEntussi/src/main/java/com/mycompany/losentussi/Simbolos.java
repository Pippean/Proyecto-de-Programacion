package com.mycompany.losentussi;

import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Pipe
 */
public class Simbolos {

    public Simbolos() {

    }

    public void interrogacionabierto(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((30 + x) * tamaño, (143 + y) * tamaño);
        s.curveTo((0 + x) * tamaño, (143 + y) * tamaño, (0 + x) * tamaño, (65 + y) * tamaño, (35 + x) * tamaño, (70 + y) * tamaño);
        s.moveTo((35 + x) * tamaño, (70 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (70 + y) * tamaño, (30 + x) * tamaño, (50 + y) * tamaño, (30 + x) * tamaño, (50 + y) * tamaño);
        g2.fillOval(25 + x, 30 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(30 + x, 143 + y, 5, 5);
            g2.fillOval(0 + x, 143 + y, 5, 5);
            g2.fillOval(0 + x, 65 + y, 5, 5);
            g2.fillOval(35 + x, 70 + y, 5, 5);
            g2.fillOval(30 + x, 70 + y, 5, 5);
            g2.fillOval(30 + x, 50 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void interrogacioncerrado(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((30 + x) * tamaño, (30 + y) * tamaño);
        s.curveTo((60 + x) * tamaño, (25 + y) * tamaño, (60 + x) * tamaño, (103 + y) * tamaño, (35 + x) * tamaño, (103 + y) * tamaño);
        s.moveTo((35 + x) * tamaño, (103 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (103 + y) * tamaño, (30 + x) * tamaño, (123 + y) * tamaño, (30 + x) * tamaño, (123 + y) * tamaño);
        g2.fillOval(25 + x, 133 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(30 + x, 30 + y, 5, 5);
            g2.fillOval(60 + x, 25 + y, 5, 5);
            g2.fillOval(60 + x, 103 + y, 5, 5);
            g2.fillOval(35 + x, 103 + y, 5, 5);
            g2.fillOval(30 + x, 103 + y, 5, 5);
            g2.fillOval(30 + x, 123 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void exclamacionabierto(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((30 + x) * tamaño, (30 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (30 + y) * tamaño, (30 + x) * tamaño, (103 + y) * tamaño, (30 + x) * tamaño, (103 + y) * tamaño);
        s.moveTo((30 + x) * tamaño, (103 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (103 + y) * tamaño, (30 + x) * tamaño, (123 + y) * tamaño, (30 + x) * tamaño, (123 + y) * tamaño);
        g2.fillOval(25 + x, 133 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(30 + x, 30 + y, 5, 5);
            g2.fillOval(30 + x, 103 + y, 5, 5);
            g2.fillOval(30 + x, 123 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void exclamacioncerrado(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((30 + x) * tamaño, (163 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (163 + y) * tamaño, (30 + x) * tamaño, (90 + y) * tamaño, (30 + x) * tamaño, (90 + y) * tamaño);
        s.moveTo((30 + x) * tamaño, (90 + y) * tamaño);
        s.curveTo((30 + x) * tamaño, (90 + y) * tamaño, (30 + x) * tamaño, (70 + y) * tamaño, (30 + x) * tamaño, (70 + y) * tamaño);
        g2.fillOval(25 + x, 50 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(30 + x, 163 + y, 5, 5);
            g2.fillOval(30 + x, 90 + y, 5, 5);
            g2.fillOval(30 + x, 70 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void punto(Graphics2D g2, int x, int y, boolean bandera) {
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20 + x, 133 + y, 10, 10);
        g2.draw(s);
    }

    public void coma(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((28 + x) * tamaño, (136 + y) * tamaño);
        s.curveTo((28 + x) * tamaño, (136 + y) * tamaño, (30 + x) * tamaño, (148 + y) * tamaño, (20 + x) * tamaño, (156 + y) * tamaño);
        g2.fillOval(20 + x, 133 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(28 + x, 137 + y, 5, 5);
            g2.fillOval(30 + x, 148 + y, 5, 5);
            g2.fillOval(20 + x, 156 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void puntoycoma(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20 + x, 93 + y, 10, 10);
        s.moveTo((28 + x) * tamaño, (136 + y) * tamaño);
        s.curveTo((28 + x) * tamaño, (136 + y) * tamaño, (30 + x) * tamaño, (148 + y) * tamaño, (20 + x) * tamaño, (156 + y) * tamaño);
        g2.fillOval(20 + x, 133 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(28 + x, 136 + y, 5, 5);
            g2.fillOval(30 + x, 148 + y, 5, 5);
            g2.fillOval(20 + x, 156 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void dospuntos(Graphics2D g2, int x, int y, boolean bandera) {
        Path2D.Double s = new Path2D.Double();
        g2.fillOval(20 + x, 93 + y, 10, 10);
        g2.fillOval(20 + x, 133 + y, 10, 10);
        g2.draw(s);
    }

    public void comillasabiertas(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((23 + x) * tamaño, (53 + y) * tamaño);
        s.curveTo((23 + x) * tamaño, (53 + y) * tamaño, (22 + x) * tamaño, (65 + y) * tamaño, (25 + x) * tamaño, (73 + y) * tamaño);
        g2.fillOval(25 + x, 70 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(23 + x, 53 + y, 5, 5);
            g2.fillOval(22 + x, 65 + y, 5, 5);
            g2.fillOval(25 + x, 73 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void comillascerradas(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((28 + x) * tamaño, (53 + y) * tamaño);
        s.curveTo((28 + x) * tamaño, (53 + y) * tamaño, (28 + x) * tamaño, (65 + y) * tamaño, (25 + x) * tamaño, (73 + y) * tamaño);
        g2.fillOval(20 + x, 50 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(28 + x, 53 + y, 5, 5);
            g2.fillOval(28 + x, 65 + y, 5, 5);
            g2.fillOval(25 + x, 73 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void comillasinglesas(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((28 + x) * tamaño, (53 + y) * tamaño);
        s.curveTo((28 + x) * tamaño, (53 + y) * tamaño, (28 + x) * tamaño, (65 + y) * tamaño, (25 + x) * tamaño, (73 + y) * tamaño);
        g2.fillOval(20 + x, 50 + y, 10, 10);
        s.moveTo((40 + x) * tamaño, (53 + y) * tamaño);
        s.curveTo((40 + x) * tamaño, (53 + y) * tamaño, (40 + x) * tamaño, (65 + y) * tamaño, (37 + x) * tamaño, (73 + y) * tamaño);
        g2.fillOval(32 + x, 50 + y, 10, 10);
        if (bandera == true) {
            g2.fillOval(28 + x, 53 + y, 5, 5);
            g2.fillOval(28 + x, 65 + y, 5, 5);
            g2.fillOval(25 + x, 73 + y, 5, 5);
            g2.fillOval(40 + x, 53 + y, 5, 5);
            g2.fillOval(40 + x, 65 + y, 5, 5);
            g2.fillOval(37 + x, 73 + y, 5, 5);
        }

        g2.draw(s);
    }

    public void españolaabierta(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((10 + x) * tamaño, (120 + y) * tamaño);
        s.curveTo((10 + x) * tamaño, (120 + y) * tamaño, (40 + x) * tamaño, (100 + y) * tamaño, (40 + x) * tamaño, (100 + y) * tamaño);
        s.moveTo((10 + x) * tamaño, (120 + y) * tamaño);
        s.curveTo((10 + x) * tamaño, (120 + y) * tamaño, (40 + x) * tamaño, (140 + y) * tamaño, (40 + x) * tamaño, (140 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(10 + x, 120 + y, 5, 5);
            g2.fillOval(40 + x, 100 + y, 5, 5);
            g2.fillOval(10 + x, 120 + y, 5, 5);
            g2.fillOval(40 + x, 140 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void españolacerrada(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((10 + x) * tamaño, (140 + y) * tamaño);
        s.curveTo((10 + x) * tamaño, (140 + y) * tamaño, (40 + x) * tamaño, (120 + y) * tamaño, (40 + x) * tamaño, (120 + y) * tamaño);
        s.moveTo((40 + x) * tamaño, (120 + y) * tamaño);
        s.curveTo((40 + x) * tamaño, (120 + y) * tamaño, (10 + x) * tamaño, (100 + y) * tamaño, (10 + x) * tamaño, (100 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(10 + x, 140 + y, 5, 5);
            g2.fillOval(40 + x, 120 + y, 5, 5);
            g2.fillOval(10 + x, 100 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void parentesisabierto(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((25 + x) * tamaño, (40 + y) * tamaño);
        s.curveTo((0 + x) * tamaño, (40 + y) * tamaño, (0 + x) * tamaño, (155 + y) * tamaño, (25 + x) * tamaño, (155 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(25 + x, 40 + y, 5, 5);
            g2.fillOval(0 + x, 40 + y, 5, 5);
            g2.fillOval(0 + x, 155 + y, 5, 5);
            g2.fillOval(25 + x, 155 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void parentesiscerrado(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((25 + x) * tamaño, (40 + y) * tamaño);
        s.curveTo((50 + x) * tamaño, (40 + y) * tamaño, (50 + x) * tamaño, (155 + y) * tamaño, (25 + x) * tamaño, (155 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(25 + x, 40 + y, 5, 5);
            g2.fillOval(50 + x, 40 + y, 5, 5);
            g2.fillOval(50 + x, 155 + y, 5, 5);
            g2.fillOval(25 + x, 155 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void llavesabiertas(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((30 + x) * tamaño, (140 + y) * tamaño);
        s.curveTo((15 + x) * tamaño, (140 + y) * tamaño, (25 + x) * tamaño, (90 + y) * tamaño, (85 + x) * tamaño, (90 + y) * tamaño);
        s.moveTo((5 + x) * tamaño, (90 + y) * tamaño);
        s.curveTo((25 + x) * tamaño, (90 + y) * tamaño, (15 + x) * tamaño, (40 + y) * tamaño, (30 + x) * tamaño, (40 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(30 + x, 140 + y, 5, 5);
            g2.fillOval(15 + x, 140 + y, 5, 5);
            g2.fillOval(25 + x, 90 + y, 5, 5);
            g2.fillOval(5 + x, 90 + y, 5, 5);
            g2.fillOval(25 + x, 90 + y, 5, 5);
            g2.fillOval(15 + x, 40 + y, 5, 5);
            g2.fillOval(30 + x, 40 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void llavescerradas(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((5 + x) * tamaño, (40 + y) * tamaño);
        s.curveTo((20 + x) * tamaño, (40 + y) * tamaño, (5 + x) * tamaño, (90 + y) * tamaño, (30 + x) * tamaño, (90 + y) * tamaño);
        s.moveTo((30 + x) * tamaño, (90 + y) * tamaño);
        s.curveTo((5 + x) * tamaño, (90 + y) * tamaño, (20 + x) * tamaño, (140 + y) * tamaño, (5 + x) * tamaño, (140 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(5 + x, 40 + y, 5, 5);
            g2.fillOval(20 + x, 40 + y, 5, 5);
            g2.fillOval(5 + x, 90 + y, 5, 5);
            g2.fillOval(30 + x, 90 + y, 5, 5);
            g2.fillOval(20 + x, 140 + y, 5, 5);
            g2.fillOval(5 + x, 140 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void guion(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((5 + x) * tamaño, (120 + y) * tamaño);
        s.curveTo((5 + x) * tamaño, (120 + y) * tamaño, (45 + x) * tamaño, (120 + y) * tamaño, (45 + x) * tamaño, (120 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(5 + x, 120 + y, 5, 5);
            g2.fillOval(45 + x, 120 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void guionbajo(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((5 + x) * tamaño, (143 + y) * tamaño);
        s.curveTo((5 + x) * tamaño, (143 + y) * tamaño, (60 + x) * tamaño, (143 + y) * tamaño, (60 + x) * tamaño, (143 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(5 + x, 143 + y, 5, 5);
            g2.fillOval(60 + x, 143 + y, 5, 5);
        }
        g2.draw(s);
    }

    public void seguirsubrayado(Graphics2D g2, int x, int y, boolean bandera, float tamaño) {
        Path2D.Double s = new Path2D.Double();
        s.moveTo((0 + x) * tamaño, (153 + y) * tamaño);
        s.lineTo((40 + x) * tamaño, (153 + y) * tamaño);
        if (bandera == true) {
            g2.fillOval(0 + x, 153 + y, 5, 5);
            g2.fillOval(40 + x, 153 + y, 5, 5);
        }
        g2.draw(s);
    }
}
