package com.mycompany.losentussi;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

/**
 *
 * @author Pipe, Juano, Lázaro
 */
public class Mayusculas {

    public Mayusculas() {

    }

    public void dibujarA(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double A = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                A.moveTo(((55 * EY) + x) * tamaño, ((53*EX) + y) * tamaño);
                A.curveTo(((0 * EY) + x) * tamaño, ((53*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((25 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                A.moveTo(((55 * EY) + x) * tamaño, ((53*EX) + y) * tamaño);
                A.curveTo(((80 * EY) + x) * tamaño, ((53*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((25 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                A.moveTo(((66 * EY) + x) * tamaño, ((110*EX) + y) * tamaño);
                A.curveTo(((67 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                A.moveTo(((40 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                A.curveTo(((0 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                A.moveTo(((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                A.curveTo(((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                A.moveTo(((70 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño);
                A.curveTo(((70 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                A.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                A.lineTo(((110 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            if (tilde == true) {
                A.moveTo(((40 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño);
                A.lineTo(((60 * EY) + x) * tamaño, ((30 *EX)+ y) * tamaño);
                if (bandera == true) {
                    g2.fillOval((40 * EY) + x, (50 *EX)+ y, 5, 5);
                    g2.fillOval((60 * EY) + x, (30 *EX)+ y, 5, 5);
                }
            }
            x += 1;

        }

        if (bandera == true) {
            g2.fillOval((40 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(A);
    }

    public void dibujarB(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double B = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                B.moveTo(((0 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                B.curveTo(((0 * EY) + x) * tamaño, ((70*EX) + y) * tamaño, ((15 * EY) + x) * tamaño, ((70*EX) + y) * tamaño, ((20 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.moveTo(((20 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.curveTo(((20 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                B.moveTo(((20 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.curveTo(((70 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                B.moveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                B.curveTo(((50 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((153*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            } else {
                B.moveTo(((0 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                B.curveTo(((0 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.moveTo(((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.curveTo(((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                B.moveTo(((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                B.curveTo(((60 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                B.moveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                B.curveTo(((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                B.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                B.lineTo(((70 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (143*EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (45 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((30 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (153 *EX)+ y, 5, 5);
        }

        g2.draw(B);

    }

    public void dibujarC(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double C = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                C.moveTo(((80 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                C.curveTo(((0 * EY) + x) * tamaño, ((45*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                C.moveTo(((70 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                C.curveTo(((0 * EY) + x) * tamaño, ((45*EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                C.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                C.lineTo(((80 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((70 * EY) + x, (55*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (45*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (154*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (143*EX) + y, 5, 5);
        }

        g2.draw(C);
    }

    public void dibujarD(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double D = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                D.moveTo(((75 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                D.curveTo(((60 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((52 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                D.moveTo(((52 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.curveTo(((32 * EY) + x) * tamaño, ((160*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                D.moveTo(((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.curveTo(((40 * EY) + x) * tamaño, ((145 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((155*EX) + y) * tamaño, ((110 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                D.moveTo(((110 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                D.curveTo(((110 * EY) + x) * tamaño, ((60*EX) + y) * tamaño, ((65 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
            } else {
                D.moveTo(((55 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                D.curveTo(((45 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((47 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.moveTo(((47 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.curveTo(((30 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.moveTo(((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                D.curveTo(((40 * EY) + x) * tamaño, ((145 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((155*EX) + y) * tamaño, ((110 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                D.moveTo(((110 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                D.curveTo(((110 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                D.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                D.lineTo(((120 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((55 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((45 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((47 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (128 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (130*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (145 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (155*EX) + y, 5, 5);
            g2.fillOval((110 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((110 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (45 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (55*EX) + y, 5, 5);
        }

        g2.draw(D);
    }

    public void dibujarE(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double E = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                E.moveTo(((20 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                E.curveTo(((30 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                E.moveTo(((50 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                E.curveTo(((50 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((133 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                E.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                E.curveTo(((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                E.moveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                E.curveTo(((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((145 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            } else {
                E.moveTo(((10 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                E.curveTo(((30 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                E.moveTo(((40 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                E.curveTo(((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((133 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                E.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                E.curveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                E.moveTo(((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                E.curveTo(((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((145 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                E.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                E.lineTo(((80 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            if (tilde == true) {
                E.moveTo(((40 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño);
                E.lineTo(((60 * EY) + x) * tamaño, ((30 *EX)+ y) * tamaño);
                if (bandera == true) {
                    g2.fillOval((40 * EY) + x, (50 *EX)+ y, 5, 5);
                    g2.fillOval((60 * EY) + x, (30 *EX)+ y, 5, 5);
                }
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((10 * EY) + x, (60*EX) + y, 5, 5);
            g2.fillOval((30 * EY) + x, (50*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (55*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (57*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (130*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((60 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((55 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((30 * EY) + x, (130*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (145*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (143*EX) + y, 5, 5);
        }

        g2.draw(E);
    }

    public void dibujarF(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double F = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                F.moveTo(((20 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                F.curveTo(((30 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                F.moveTo(((50 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                F.curveTo(((50 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((133 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                F.moveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                F.curveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((65 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            } else {
                F.moveTo(((10 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                F.curveTo(((30 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                F.moveTo(((40 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                F.curveTo(((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((133 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                F.moveTo(((20 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                F.curveTo(((20 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                F.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                F.lineTo(((80 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((10 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((50 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (57*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (133*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((55 * EY) + x,(100*EX) + y, 5, 5);
        }
        g2.draw(F);
    }

    public void dibujarG(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double G = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                G.moveTo(((75 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                G.curveTo(((0 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                G.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                G.curveTo(((60 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                G.moveTo(((80 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                G.curveTo(((80 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                G.moveTo(((50 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                G.curveTo(((35 * EY) + x) * tamaño, ((183*EX) + y) * tamaño, ((20 * EY) + x) * tamaño, ((180*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño);
                G.moveTo(((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño);
                G.curveTo(((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((140*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            } else {
                G.moveTo(((60 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                G.curveTo(((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((153*EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                G.moveTo(((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                G.curveTo(((60 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                G.moveTo(((70 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                G.curveTo(((70 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((180*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((180*EX) + y) * tamaño);
                G.moveTo(((55 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                G.curveTo(((40 * EY) + x) * tamaño, ((185 *EX)+ y) * tamaño, ((15 * EY) + x) * tamaño, ((180*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño);
                G.moveTo(((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño);
                G.curveTo(((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((140*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                G.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                G.lineTo(((120 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((60 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (153 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((60 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (110*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (180*EX) + y, 5, 5);
            g2.fillOval((55 * EY) + x, (180*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (185*EX) + y, 5, 5);
            g2.fillOval((15 * EY) + x, (180*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (160*EX) + y, 5, 5);
            g2.fillOval((90 * EY) + x, (140*EX) + y, 5, 5);
            g2.fillOval((100 * EY) + x, (143*EX) + y, 5, 5);
        }
        g2.draw(G);
    }

    public void dibujarH(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double H = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                H.moveTo(((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                H.curveTo(((10 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                H.moveTo(((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                H.curveTo(((50 * EY) + x) * tamaño, ((170 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                H.moveTo(((0 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño);
                H.curveTo(((0 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((80*EX) + y) * tamaño);
                H.moveTo(((60 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                H.curveTo(((90 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((40 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                H.moveTo(((60 * EY) + x) * tamaño, ((60*EX)+ y) * tamaño);
                H.curveTo(((60 * EY) + x) * tamaño, ((150*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                H.moveTo(((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                H.curveTo(((0 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((60*EX) + y) * tamaño, ((30 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                H.moveTo(((30 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                H.curveTo(((50 * EY) + x) * tamaño, ((170 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                H.moveTo(((0 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño);
                H.curveTo(((0 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((80*EX) + y) * tamaño);
                H.moveTo(((60 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                H.curveTo(((80 * EY) + x) * tamaño, ((70*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((40*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                H.moveTo(((50 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                H.curveTo(((50 * EY) + x) * tamaño, ((150 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                H.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                H.lineTo(((110 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            H.moveTo((0 * EY) + x, (55*EX) + y);
            H.curveTo((0 * EY) + x, (60 *EX)+ y, (30 * EY) + x, (60*EX) + y, (30 * EY) + x, (55 *EX)+ y);
            H.moveTo((30 * EY) + x, (55 *EX)+ y);
            H.curveTo((50 * EY) + x, (170*EX) + y, (0 * EY) + x, (170*EX) + y, (0 * EY) + x, (140*EX) + y);
            H.moveTo((0 * EY) + x, (140 *EX)+ y);
            H.curveTo((0 * EY) + x, (120 *EX)+ y, (60 * EY) + x, (80*EX) + y, (60 * EY) + x, (80*EX) + y);
            H.moveTo((60 * EY) + x, (80 *EX)+ y);
            H.curveTo((80 * EY) + x, (70*EX) + y, (60 * EY) + x, (40 *EX)+ y, (50 * EY) + x, (60 *EX)+ y);
            H.moveTo((50 * EY) + x, (60 *EX)+ y);
            H.curveTo((50 * EY) + x, (150*EX) + y, (70 * EY) + x, (143*EX) + y, (80 * EY) + x, (143*EX) + y);
        }
        g2.draw(H);
    }

    public void dibujarI(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double I = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                I.moveTo(((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                I.curveTo(((0 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                I.moveTo(((50 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                I.curveTo(((40 * EY) + x) * tamaño, ((170 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
            } else {
                I.moveTo(((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                I.curveTo(((0 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                I.moveTo(((50 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                I.curveTo(((70 * EY) + x) * tamaño, ((170 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                I.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                I.lineTo(((70 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            if (tilde == true) {
                I.moveTo(((25 * EY) + x) * tamaño, ((50*EX) + y) * tamaño);
                I.lineTo(((45 * EY) + x) * tamaño, ((30*EX) + y) * tamaño);
                if (bandera == true) {
                    g2.fillOval((40 * EY) + x, (50 *EX)+ y, 5, 5);
                    g2.fillOval((60 * EY) + x, (30*EX) + y, 5, 5);
                }
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, (55*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (65*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (65*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (55*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (170*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (170*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (130*EX) + y, 5, 5);
        }
        g2.draw(I);
    }

    public void dibujarJ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double J = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                J.moveTo(((10 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                J.curveTo(((20 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((75*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                J.moveTo(((40 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                J.curveTo(((30 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((190 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((180*EX) + y) * tamaño);
                J.moveTo(((0 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                J.curveTo(((0 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                J.moveTo(((10 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño);
                J.curveTo(((20 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                J.moveTo(((40 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                J.curveTo(((60 * EY) + x) * tamaño, ((170 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((190 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                J.moveTo(((10 * EY) + x) * tamaño, ((180 *EX)+ y) * tamaño);
                J.curveTo(((10 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                J.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                J.lineTo(((70 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((10 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (170 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (190 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (180 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (140 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(J);
    }

    public void dibujarK(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double K = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                K.moveTo(((40 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                K.curveTo(((15 * EY) + x) * tamaño, ((68 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                K.moveTo(((20 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                K.curveTo(((30 * EY) + x) * tamaño, ((52 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((65 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                K.moveTo(((65 * EY) + x) * tamaño, ((55*EX)+ y) * tamaño);
                K.curveTo(((35 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((37 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                K.moveTo(((37 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                K.curveTo(((20 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                K.moveTo(((100 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                K.curveTo(((65 * EY) + x) * tamaño, ((53 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((90*EX) + y) * tamaño, ((52 * EY) + x) * tamaño, ((103*EX) + y) * tamaño);
                K.moveTo(((52 * EY) + x) * tamaño, ((103 *EX)+ y) * tamaño);
                K.curveTo(((80 * EY) + x) * tamaño, ((103 *EX)+ y) * tamaño, ((52 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                K.moveTo(((30 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                K.curveTo(((5 * EY) + x) * tamaño, ((68 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((60*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((57*EX) + y) * tamaño);
                K.moveTo(((10 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                K.curveTo(((20 * EY) + x) * tamaño, ((52*EX) + y) * tamaño, ((30 * EY) + x) * tamaño, ((60*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                K.moveTo(((55 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                K.curveTo(((45 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((47 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                K.moveTo(((47 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                K.curveTo(((30 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                K.moveTo(((100 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                K.curveTo(((65 * EY) + x) * tamaño, ((53 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((90 *EX)+ y) * tamaño, ((52 * EY) + x) * tamaño, ((103*EX) + y) * tamaño);
                K.moveTo(((52 * EY) + x) * tamaño, ((103 *EX)+ y) * tamaño);
                K.curveTo(((80 * EY) + x) * tamaño, ((103 *EX)+ y) * tamaño, ((52 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                K.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                K.lineTo(((110 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((30 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((5 * EY) + x, (68 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (57 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (52 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((55 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((45 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (110*EX) + y, 5, 5);
            g2.fillOval((47 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (160*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (128 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (130*EX) + y, 5, 5);
            g2.fillOval((100 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((65 * EY) + x, (53 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (90*EX) + y, 5, 5);
            g2.fillOval((52 * EY) + x, (103 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (103 *EX)+ y, 5, 5);
            g2.fillOval((52 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(K);
    }

    public void dibujarL(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double L = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                L.moveTo(((30 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                L.curveTo(((5 * EY) + x) * tamaño, ((68 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                L.moveTo(((10 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                L.curveTo(((20 * EY) + x) * tamaño, ((52 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                L.moveTo(((55 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                L.curveTo(((40 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((25 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                L.moveTo(((25 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                L.curveTo(((-5 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((128*EX) + y) * tamaño, ((20 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                L.moveTo(((20 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                L.curveTo(((45 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((145*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                L.moveTo(((30 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                L.curveTo(((5 * EY) + x) * tamaño, ((68 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                L.moveTo(((10 * EY) + x) * tamaño, ((57 *EX)+ y) * tamaño);
                L.curveTo(((20 * EY) + x) * tamaño, ((52 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                L.moveTo(((55 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                L.curveTo(((45 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((47 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                L.moveTo(((47 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                L.curveTo(((30 * EY) + x) * tamaño, ((160*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                L.moveTo(((30 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                L.curveTo(((45 * EY) + x) * tamaño, ((130*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((145 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                L.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                L.lineTo(((110 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((30 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((5 * EY) + x, (68 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (57 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (52 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((55 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((45 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((47 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (128 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((45 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((55 * EY) + x, (145 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(L);
    }

    public void dibujarM(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double M = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                M.moveTo(((55 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                M.curveTo(((45 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((45 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                M.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                M.curveTo(((10 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((-20 * EY) + x) * tamaño, ((128*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                M.moveTo(((55 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.curveTo(((48 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((52 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                M.moveTo(((55 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                M.curveTo(((62 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((85 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((95 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.moveTo(((95 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.curveTo(((85 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                M.moveTo(((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                M.curveTo(((122 * EY) + x) * tamaño, ((146*EX) + y) * tamaño, ((126 * EY) + x) * tamaño, ((126*EX) + y) * tamaño, ((110 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
            } else {
                M.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.curveTo(((25 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                M.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                M.curveTo(((10 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((-20 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                M.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.curveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((62 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((62 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                M.moveTo(((62 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                M.curveTo(((62 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((85 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((85 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.moveTo(((85 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                M.curveTo(((85 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                M.moveTo(((100 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                M.curveTo(((122 * EY) + x) * tamaño, ((146 *EX)+ y) * tamaño, ((126 * EY) + x) * tamaño, ((126 *EX)+ y) * tamaño, ((110 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                M.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                M.lineTo(((130 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((27 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (160*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((62 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((85 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((85 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((122 * EY) + x, (146*EX) + y, 5, 5);
            g2.fillOval((126 * EY) + x, (126 *EX)+ y, 5, 5);
            g2.fillOval((110 * EY) + x, (130 *EX)+ y, 5, 5);
        }
        g2.draw(M);
    }

    public void dibujarN(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double N = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                N.moveTo(((45 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                N.curveTo(((45 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                N.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                N.curveTo(((10 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((-20 * EY) + x) * tamaño, ((128 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                N.moveTo(((45 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                N.curveTo(((35 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                N.moveTo(((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                N.curveTo(((85 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((130 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
            } else {
                N.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                N.curveTo(((25 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                N.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                N.curveTo(((10 * EY) + x) * tamaño, ((160*EX) + y) * tamaño, ((-20 * EY) + x) * tamaño, ((128*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                N.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                N.curveTo(((25 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                N.moveTo(((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                N.curveTo(((85 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((120 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                N.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                N.lineTo(((130 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((27 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((85 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((120 * EY) + x,(55*EX) + y, 5, 5);
        }
        g2.draw(N);
    }

    public void dibujarÑ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double Ñ = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                Ñ.moveTo(((45 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                Ñ.curveTo(((45 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Ñ.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Ñ.curveTo(((10 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((-20 * EY) + x) * tamaño, ((128*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Ñ.moveTo(((45 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Ñ.curveTo(((35 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                Ñ.moveTo(((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Ñ.curveTo(((85 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((130 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                Ñ.moveTo(((35 * EY) + x) * tamaño, ((40 *EX)+ y) * tamaño);
                Ñ.curveTo(((45 * EY) + x) * tamaño, ((25*EX) + y) * tamaño, ((75 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((115 * EY) + x) * tamaño, ((40*EX) + y) * tamaño);
            } else {
                Ñ.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Ñ.curveTo(((25 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((27 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                Ñ.moveTo(((27 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Ñ.curveTo(((10 * EY) + x) * tamaño, ((160*EX) + y) * tamaño, ((-20 * EY) + x) * tamaño, ((128*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                Ñ.moveTo(((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Ñ.curveTo(((25 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                Ñ.moveTo(((80 * EY) + x) * tamaño, ((143*EX)+ y) * tamaño);
                Ñ.curveTo(((85 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((120 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                Ñ.moveTo(((25 * EY) + x) * tamaño, ((40*EX)+ y) * tamaño);
                Ñ.curveTo(((45 * EY) + x) * tamaño, ((25 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((50*EX) + y) * tamaño, ((115 * EY) + x) * tamaño, ((40*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                Ñ.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                Ñ.lineTo(((130 * EY) + x) * tamaño, ((153*EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((27 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((85 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((120 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (40 *EX)+ y, 5, 5);
            g2.fillOval((45 * EY) + x, (25 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((115 * EY) + x, (40 *EX)+ y, 5, 5);
        }
        g2.draw(Ñ);
    }

    public void dibujarO(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double O = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                O.moveTo(((40 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                O.curveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((55*EX) + y) * tamaño, ((35 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                O.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                O.curveTo(((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((20*EX)+ y) * tamaño, ((45 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                O.moveTo(((45 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                O.curveTo(((40 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((35 * EY) + x) * tamaño, ((85*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
            } else {
                O.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                O.curveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((25 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                O.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                O.curveTo(((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((25 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                O.moveTo(((25 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                O.curveTo(((20 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((15 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                O.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                O.lineTo(((90 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            if (tilde == true) {
                O.moveTo(((40 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño);
                O.lineTo(((60 * EY) + x) * tamaño, ((25 *EX)+ y) * tamaño);
                if (bandera == true) {
                    g2.fillOval((40 * EY) + x, (45 *EX)+ y, 5, 5);
                    g2.fillOval((60 * EY) + x, (25 *EX)+ y, 5, 5);
                }
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((40 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (20 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((25 * EY) + x, (60*EX) + y, 5, 5);
            g2.fillOval((20 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((15 * EY) + x, (85 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (100 *EX)+ y, 5, 5);
        }
        g2.draw(O);
    }

    public void dibujarP(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double P = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                P.moveTo(((30 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                P.curveTo(((20 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((15 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                P.moveTo(((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                P.curveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                P.moveTo(((20 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                P.curveTo(((22 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                P.moveTo(((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                P.curveTo(((90 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            } else {
                P.moveTo(((20 * EY) + x) * tamaño, ((80*EX) + y) * tamaño);
                P.curveTo(((20 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((15 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                P.moveTo(((10 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                P.curveTo(((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                P.moveTo(((10 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                P.curveTo(((12 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                P.moveTo(((60 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                P.curveTo(((90 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                P.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                P.lineTo(((90 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((20 * EY) + x, (80 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((15 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (80 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((12 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((90 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (100 *EX)+ y, 5, 5);
        }
        g2.draw(P);
    }

    public void dibujarQ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double Q = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                Q.moveTo(((40 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Q.curveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((20 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                Q.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Q.curveTo(((80 * EY) + x) * tamaño, ((143*EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Q.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Q.curveTo(((40 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
            } else {
                Q.moveTo(((40 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                Q.curveTo(((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Q.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Q.curveTo(((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                Q.moveTo(((40 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Q.curveTo(((40 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                Q.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                Q.lineTo(((100 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((40 * EY) + x, (130*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (55*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (120*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (140*EX) + y, 5, 5);
        }
        g2.draw(Q);
    }

    public void dibujarR(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double R = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                R.moveTo(((30 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                R.curveTo(((20 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((15 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                R.moveTo(((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                R.curveTo(((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((80*EX) + y) * tamaño, ((20 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                R.moveTo(((20 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                R.curveTo(((22 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((50*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                R.moveTo(((70 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                R.curveTo(((90 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((30 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                R.moveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                R.curveTo(((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((50 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                R.moveTo(((20 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                R.curveTo(((20 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((15 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                R.moveTo(((10 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
                R.curveTo(((0 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                R.moveTo(((10 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                R.curveTo(((12 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((50*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                R.moveTo(((60 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                R.curveTo(((90 * EY) + x) * tamaño, ((65*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((20 * EY) + x) * tamaño, ((100*EX)+ y) * tamaño);
                R.moveTo(((20 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                R.curveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                R.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                R.lineTo(((80 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((20 * EY) + x, (80 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((15 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (80 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((12 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((90 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((20 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((50 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(R);
    }

    public void dibujarS(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double S = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                S.moveTo(((40 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                S.curveTo(((20 * EY) + x) * tamaño, ((85*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((120*EX) + y) * tamaño);
                S.moveTo(((40 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                S.curveTo(((42 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((110 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((105 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                S.moveTo(((70 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                S.curveTo(((68 * EY) + x) * tamaño, ((135 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
            } else {
                S.moveTo(((10 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                S.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                S.moveTo(((10 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                S.curveTo(((12 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                S.moveTo(((70 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                S.curveTo(((68 * EY) + x) * tamaño, ((135 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                S.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                S.lineTo(((80 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((10 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (85*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((12 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (50 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((68 * EY) + x, (135*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((10 * EY) + x, (130*EX) + y, 5, 5);
        }
        g2.draw(S);
    }

    public void dibujarT(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double T = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                T.moveTo(((35 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                T.curveTo(((0 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                T.moveTo(((70 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                T.curveTo(((90 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño, ((120 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño);
                T.moveTo(((90 * EY) + x) * tamaño, ((50 *EX)+ y) * tamaño);
                T.curveTo(((50 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            } else {
                T.moveTo(((35 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                T.curveTo(((0 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((40*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                T.moveTo(((70 * EY) + x) * tamaño, ((65 *EX)+ y) * tamaño);
                T.curveTo(((90 * EY) + x) * tamaño, ((60*EX) + y) * tamaño, ((120 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
                T.moveTo(((90 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
                T.curveTo(((50 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                T.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                T.lineTo(((100 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((35 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (40 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (65 *EX)+ y, 5, 5);
            g2.fillOval((90 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((120 * EY) + x, (60*EX) + y, 5, 5);
            g2.fillOval((90 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((50 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(T);
    }

    public void dibujarU(Graphics2D g2, int x, int y, boolean bandera, boolean tilde, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double U = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                U.moveTo(((45 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                U.curveTo(((20 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((15 *EX)+ y) * tamaño, ((50 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                U.moveTo(((50 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                U.curveTo(((50 * EY) + x) * tamaño, ((200 *EX)+ y) * tamaño, ((85 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                U.moveTo(((100 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                U.curveTo(((100 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((40 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                U.moveTo(((90 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                U.curveTo(((90 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            } else {
                U.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                U.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                U.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                U.curveTo(((50 * EY) + x) * tamaño, ((200*EX) + y) * tamaño, ((85 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
                U.moveTo(((80 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
                U.curveTo(((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((40 *EX)+ y) * tamaño, ((75 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                U.moveTo(((75 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                U.curveTo(((75 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((90 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                U.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                U.lineTo(((100 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            if (tilde == true) {
                U.moveTo(((60 * EY) + x) * tamaño, ((50*EX) + y) * tamaño);
                U.lineTo(((80 * EY) + x) * tamaño, ((30 *EX)+ y) * tamaño);
                if (bandera == true) {
                    g2.fillOval((60 * EY) + x, (50 *EX)+ y, 5, 5);
                    g2.fillOval((80 * EY) + x, (30 *EX)+ y, 5, 5);
                }
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (85 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (15 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((50 * EY) + x, (200 *EX)+ y, 5, 5);
            g2.fillOval((85 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (40 *EX)+ y, 5, 5);
            g2.fillOval((75 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((90 * EY) + x, (143*EX) + y, 5, 5);
        }
        g2.draw(U);
    }

    public void dibujarV(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double V = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                V.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                V.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                V.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                V.curveTo(((50 * EY) + x) * tamaño, ((200 *EX)+ y) * tamaño, ((85 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((95 * EY) + x) * tamaño, ((55*EX) + y) * tamaño);
            } else {
                V.moveTo(((25 * EY) + x) * tamaño, ((75*EX) + y) * tamaño);
                V.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                V.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                V.curveTo(((50 * EY) + x) * tamaño, ((200 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                V.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                V.lineTo(((90 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (85 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (15 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((50 * EY) + x, (200 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (55 *EX)+ y, 5, 5);
        }
        g2.draw(V);
    }

    public void dibujarW(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double W = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                W.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                W.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                W.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                W.curveTo(((40 * EY) + x) * tamaño, ((190 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                W.moveTo(((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                W.curveTo(((60 * EY) + x) * tamaño, ((225 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño, ((90 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño);
            } else {
                W.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                W.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                W.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                W.curveTo(((40 * EY) + x) * tamaño, ((190 *EX)+ y) * tamaño, ((60 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                W.moveTo(((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                W.curveTo(((60 * EY) + x) * tamaño, ((225 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((35*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((70*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                W.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                W.lineTo(((120 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (75*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (85 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (15 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (190 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (120 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((60 * EY) + x, (225*EX) + y, 5, 5);
            g2.fillOval((100 * EY) + x, (35*EX) + y, 5, 5);
            g2.fillOval((80 * EY) + x, (70*EX) + y, 5, 5);
        }
        g2.draw(W);
    }

    public void dibujarX(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double X = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                X.moveTo(((10 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                X.curveTo(((40 * EY) + x) * tamaño, ((20*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((190*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((130 *EX)+ y) * tamaño);
                X.moveTo(((0 * EY) + x) * tamaño, ((135*EX) + y) * tamaño);
                X.curveTo(((10 * EY) + x) * tamaño, ((180*EX) + y) * tamaño, ((90 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
            } else {
                X.moveTo(((0 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                X.curveTo(((30 * EY) + x) * tamaño, ((20*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((190 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((130*EX) + y) * tamaño);
                X.moveTo(((0 * EY) + x) * tamaño, ((135 *EX)+ y) * tamaño);
                X.curveTo(((30 * EY) + x) * tamaño, ((180*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                X.moveTo(((0 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
                X.lineTo(((110 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((0 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (20 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (190 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (130 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (135 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (180 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (20 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (60 *EX)+ y, 5, 5);
        }
        g2.draw(X);
    }

    public void dibujarY(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double Y = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                Y.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                Y.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                Y.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                Y.curveTo(((50 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                Y.moveTo(((70 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                Y.curveTo(((70 * EY) + x) * tamaño, ((45*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((70*EX) + y) * tamaño, ((55 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                Y.moveTo(((55 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                Y.curveTo(((55 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((25 * EY) + x) * tamaño, ((200*EX) + y) * tamaño, ((30 * EY) + x) * tamaño, ((160*EX) + y) * tamaño);
                Y.moveTo(((30 * EY) + x) * tamaño, ((160*EX) + y) * tamaño);
                Y.curveTo(((40 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño, ((55 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((60 * EY) + x) * tamaño, ((115 *EX)+ y) * tamaño);
                Y.moveTo(((60 * EY) + x) * tamaño, ((115*EX) + y) * tamaño);
                Y.curveTo(((70 * EY) + x) * tamaño, ((115 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            } else {
                Y.moveTo(((25 * EY) + x) * tamaño, ((75 *EX)+ y) * tamaño);
                Y.curveTo(((0 * EY) + x) * tamaño, ((85 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((15 *EX)+ y) * tamaño, ((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                Y.moveTo(((40 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                Y.curveTo(((40 * EY) + x) * tamaño, ((110 *EX)+ y) * tamaño, ((70 * EY) + x) * tamaño, ((100*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((60*EX) + y) * tamaño);
                Y.moveTo(((70 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                Y.curveTo(((70 * EY) + x) * tamaño, ((45 *EX)+ y) * tamaño, ((65 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño, ((65 * EY) + x) * tamaño, ((140*EX) + y) * tamaño);
                Y.moveTo(((65 * EY) + x) * tamaño, ((140 *EX)+ y) * tamaño);
                Y.curveTo(((65 * EY) + x) * tamaño, ((170*EX) + y) * tamaño, ((35 * EY) + x) * tamaño, ((200*EX) + y) * tamaño, ((40 * EY) + x) * tamaño, ((160 *EX)+ y) * tamaño);
                Y.moveTo(((40 * EY) + x) * tamaño, ((160*EX) + y) * tamaño);
                Y.curveTo(((50 * EY) + x) * tamaño, ((120*EX) + y) * tamaño, ((65 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((70 * EY) + x) * tamaño, ((115*EX) + y) * tamaño);
                Y.moveTo(((70 * EY) + x) * tamaño, ((115 *EX)+ y) * tamaño);
                Y.curveTo(((70 * EY) + x) * tamaño, ((115 *EX)+ y) * tamaño, ((80 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((143*EX) + y) * tamaño);
            }
            if (subrayado == true) {
                Y.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                Y.lineTo(((110 * EY) + x) * tamaño, ((153 *EX)+ y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((25 * EY) + x, (75 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (85 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (15 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((40 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (100*EX) + y, 5, 5);
            g2.fillOval((70 * EY) + x, (60 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (45*EX) + y, 5, 5);
            g2.fillOval((65 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((65 * EY) + x, (140 *EX)+ y, 5, 5);
            g2.fillOval((65 * EY) + x, (170 *EX)+ y, 5, 5);
            g2.fillOval((35 * EY) + x, (200*EX) + y, 5, 5);
            g2.fillOval((40 * EY) + x, (160 *EX)+ y, 5, 5);
            g2.fillOval((50 * EY) + x, (120*EX) + y, 5, 5);
            g2.fillOval((65 * EY) + x, (110 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (115 *EX)+ y, 5, 5);
            g2.fillOval((80 * EY) + x, (143 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (143 *EX)+ y, 5, 5);
        }
        g2.draw(Y);
    }

    public void dibujarZ(Graphics2D g2, int x, int y, boolean bandera, boolean negrita, boolean subrayado, boolean cursiva, float tamaño, boolean EspejoY,boolean EspejoX) {
        Path2D.Double Z = new Path2D.Double();
        int limite = 1;
        int EY = 1;
        int EX=1;
        if(EspejoX){
            EX=-1;
        }
        if (negrita == true) {
            limite = 5;
        }
        if (EspejoY) {
            EY = -1;
        }
        for (int i = 0; i < limite; i++) {
            if (cursiva == true) {
                Z.moveTo(((40 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                Z.curveTo(((10 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño, ((10 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((110 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                Z.curveTo(((90 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((135*EX) + y) * tamaño);
                Z.curveTo(((10 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((80 * EY) + x) * tamaño, ((175 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                Z.moveTo(((30 * EY) + x) * tamaño, ((100*EX) + y) * tamaño);
                Z.lineTo(((70 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            } else {
                Z.moveTo(((30 * EY) + x) * tamaño, ((80 *EX)+ y) * tamaño);
                Z.curveTo(((0 * EY) + x) * tamaño, ((70 *EX)+ y) * tamaño, ((0 * EY) + x) * tamaño, ((55 *EX)+ y) * tamaño, ((100 * EY) + x) * tamaño, ((60 *EX)+ y) * tamaño);
                Z.curveTo(((90 * EY) + x) * tamaño, ((20 *EX)+ y) * tamaño, ((30 * EY) + x) * tamaño, ((143*EX) + y) * tamaño, ((0 * EY) + x) * tamaño, ((143 *EX)+ y) * tamaño);
                Z.curveTo(((10 * EY) + x) * tamaño, ((110*EX) + y) * tamaño, ((90 * EY) + x) * tamaño, ((175*EX) + y) * tamaño, ((100 * EY) + x) * tamaño, ((120 *EX)+ y) * tamaño);
                Z.moveTo(((30 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
                Z.lineTo(((70 * EY) + x) * tamaño, ((100 *EX)+ y) * tamaño);
            }
            if (subrayado == true) {
                Z.moveTo(((0 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
                Z.lineTo(((110 * EY) + x) * tamaño, ((153*EX) + y) * tamaño);
            }
            x += 1;
        }
        if (bandera == true) {
            g2.fillOval((30 * EY) + x, (80 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (70 *EX)+ y, 5, 5);
            g2.fillOval((0 * EY) + x, (55 *EX)+ y, 5, 5);
            g2.fillOval((100 * EY) + x, (60*EX) + y, 5, 5);
            g2.fillOval((90 * EY) + x, (20 *EX)+ y, 5, 5);
            g2.fillOval((30 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((0 * EY) + x, (143*EX) + y, 5, 5);
            g2.fillOval((10 * EY) + x, (110*EX) + y, 5, 5);
            g2.fillOval((90 * EY) + x, (175*EX) + y, 5, 5);
            g2.fillOval((100 * EY) + x, (120*EX) + y, 5, 5);
            g2.fillOval((30 * EY) + x, (100 *EX)+ y, 5, 5);
            g2.fillOval((70 * EY) + x, (100 *EX)+ y, 5, 5);
        }
        g2.draw(Z);
    }
}
