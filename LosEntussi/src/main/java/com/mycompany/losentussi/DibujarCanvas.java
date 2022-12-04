package com.mycompany.losentussi;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Pipe, Juano, Lázaro
 */
public class DibujarCanvas extends JComponent {
    //Variables de la Clase:
    private int width;
    private int height;
    private int angulo = 0;
    private int tmpangulo = 0;
    private int pasado = 0;
    private Minusculas m1;
    private Mayusculas m2;
    private Simbolos s1;
    private String texto;
    private String color;
    private String s = "";
    private String n = "";
    private char caracterinv;
    private int invtotal;
    private boolean bandera;
    private boolean negrita = false;
    private boolean subrayado = false;
    private boolean cursiva = false;
    private boolean sub2 = false;
    private boolean EspejoY = false;
    private boolean Espejo = false;
    private boolean banderaang = false;
    private float tamaño = 1;
    private float limite = 1;

    public DibujarCanvas(int w, int h, String texto, String color, boolean bandera) {
        //Constructor:
        width = w;
        height = h;
        m1 = new Minusculas();
        m2 = new Mayusculas();
        s1 = new Simbolos();
        this.texto = texto;
        this.color = color;
        this.bandera = bandera;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        //Switch para el Choise Menu:
        switch (color) {
            case "Negro": {
                g2.setColor(Color.black);
                break;
            }
            case "Rojo": {
                g2.setColor(Color.red);
                break;
            }
            case "Azul": {
                g2.setColor(Color.blue);
                break;
            }
            case "Amarillo": {
                g2.setColor(Color.yellow);
                break;
            }
            case "Verde": {
                g2.setColor(Color.green);
                break;
            }
            case "Naranjo": {
                g2.setColor(Color.orange);
                break;
            }
            case "Morado": {
                g2.setColor(Color.magenta);
                break;
            }
            case "Rosado": {
                g2.setColor(Color.pink);
                break;
            }
            case "Celeste": {
                g2.setColor(Color.cyan);
                break;
            }
            case "Blanco": {
                g2.setColor(Color.white);
                break;
            }
        }
        //Switch para dibujar los caracteres:
        int x = 10, y = 0;
        if (!"".equals(texto)) {
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (x >= 1150 * limite) {
                    if (texto.charAt(i) != ' ') {
                        s1.guion(g2, x, y, bandera, tamaño);
                    }
                    y += 180;
                    x = 10;
                }
                switch (caracter) {
                    case ' ': {
                        if (verificadorsubrayado(texto, i) == true && subrayado == true) {
                            s1.seguirsubrayado(g2, x, y, bandera, tamaño);
                        } else {
                            subrayado = false;
                        }
                        if (banderaang == true) {

                            g2.rotate(Math.toRadians(-tmpangulo), 143 + y, 10 + x);
                            banderaang = false;
                        }
                        if (EspejoY) {
                            if(caracterinv == 'm' || caracterinv == 'n'|| caracterinv == 'ñ'||caracterinv == 'w'|| caracterinv == 'x' ||caracterinv == 'y'|| caracterinv == 'z'){
                                x += (120 * invtotal);
                            }else{
                                x+=(80*invtotal);
                            }                            
                        }
                        EspejoY = false;
                        Espejo = false;
                        negrita = false;
                        cursiva = false;
                        tamaño = 1;
                        limite = 1;
                        pasado = 0;
                        x += 40;
                        break;
                    }
                    //Minusculas
                    case 'a': {
                        if (EspejoY) {
                            if (caracterinv == 'a' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujara(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else {
                                m1.dibujara(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujara(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujaracaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else {
                                m1.dibujara(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            }
                        }
                        break;
                    }
                    case 'b': {
                        if (EspejoY) {
                            if (caracterinv == 'b' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;

                                pasado++;
                            }
                            m1.dibujarb(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 50;
                        } else {
                            m1.dibujarb(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 50;
                        }
                        break;
                    }
                    case 'c': {
                        if (EspejoY) {
                            if (caracterinv == 'c' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 60 * invtotal;
                                pasado++;
                            }
                            m1.dibujarc(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 68;
                        } else {
                            m1.dibujarc(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 68;
                        }
                        break;
                    }
                    case 'd': {
                        if (EspejoY) {
                            if (caracterinv == 'd' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 60 * invtotal;
                                pasado++;
                            }
                            m1.dibujard(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 70;
                        } else {
                            m1.dibujard(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        }
                        break;
                    }
                    case 'e': {
                        if (EspejoY) {
                            if (caracterinv == 'e' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujare(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 35;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 25;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 25;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 25;
                            } else {
                                m1.dibujare(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 35;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujare(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 35;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 25;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 25;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarecaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 25;
                            } else {
                                m1.dibujare(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 35;
                            }
                        }
                        break;
                    }
                    case 'f': {
                        if (EspejoY) {
                            if (caracterinv == 'f' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            m1.dibujarf(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 50;
                        } else {
                            m1.dibujarf(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 50;
                        }
                        break;
                    }
                    case 'g': {
                        if (EspejoY) {
                            if (caracterinv == 'g' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 60 * invtotal;
                                pasado++;
                            }
                            m1.dibujarg(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 70;
                        } else {
                            m1.dibujarg(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        }
                        break;
                    }
                    case 'h': {
                        if (EspejoY) {
                            if (caracterinv == 'h' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            m1.dibujarh(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 60;
                        } else {
                            m1.dibujarh(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        }
                        break;
                    }
                    case 'i': {
                        if (EspejoY) {
                            if (caracterinv == 'i' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujari(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 60;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 30;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 30;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 30;
                            } else {
                                m1.dibujari(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 60;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujari(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 60;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 30;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 30;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujaricaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 30;
                            } else {
                                m1.dibujari(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 60;
                            }
                        }
                        break;
                    }
                    case 'j': {
                        if (EspejoY) {
                            if (caracterinv == 'j' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            m1.dibujarj(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 60;
                        } else {
                            m1.dibujarj(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        }
                        break;
                    }
                    case 'k': {
                        if (EspejoY) {
                            if (caracterinv == 'k' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujark(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 100;
                        } else {
                            m1.dibujark(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 100;
                        }
                        break;
                    }
                    case 'l': {
                        if (EspejoY) {
                            if (caracterinv == 'l' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 40 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujarl(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 40;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarlcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 30;
                            } else {
                                m1.dibujarl(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 40;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujarl(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 40;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarlcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 30;
                            } else {
                                m1.dibujarl(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 40;
                            }
                        }
                        break;
                    }
                    case 'm': {
                        if (EspejoY) {
                            if (caracterinv == 'm' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 100 * invtotal;
                                pasado++;
                            }
                            m1.dibujarm(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 155;
                        } else {
                            m1.dibujarm(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 155;
                        }
                        break;
                    }
                    case 'n': {
                        if (EspejoY) {
                            if (caracterinv == 'n' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujarn(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 95;
                        } else {
                            m1.dibujarn(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 95;
                        }
                        break;
                    }
                    case 'ñ': {
                        if (EspejoY) {
                            if (caracterinv == 'ñ' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujarñ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 100;
                        } else {
                            m1.dibujarñ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 100;
                        }
                        break;
                    }
                    case 'o': {
                        if (EspejoY) {
                            if (caracterinv == 'o' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujaro(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 60;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 60;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 60;
                            } else {
                                m1.dibujaro(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujaro(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 60;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 60;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarocaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 60;
                            } else {
                                m1.dibujaro(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            }
                        }
                        break;
                    }
                    case 'p': {
                        if (EspejoY) {
                            if (caracterinv == 'p' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujarp(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 100;
                        } else {
                            m1.dibujarp(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 100;
                        }
                        break;
                    }
                    case 'q': {
                        if (EspejoY) {
                            if (caracterinv == 'q' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujarq(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 80;
                        } else {
                            m1.dibujarq(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 80;
                        }
                        break;
                    }
                    case 'r': {
                        if (EspejoY) {
                            if (caracterinv == 'r' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 60 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujarr(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 45;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 45;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 45;
                            } else {
                                m1.dibujarr(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujarr(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 45;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 45;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarrcaso(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 45;
                            } else {
                                m1.dibujarr(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            }
                        }
                        break;
                    }
                    case 's': {
                        if (EspejoY) {
                            if (caracterinv == 's' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujars(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 85;
                        } else {
                            m1.dibujars(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 85;
                        }
                        break;
                    }
                    case 't': {
                        if (EspejoY) {
                            if (caracterinv == 't' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 40 * invtotal;
                                pasado++;
                            }
                            m1.dibujart(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 40;
                        } else {
                            m1.dibujart(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 40;
                        }
                        break;
                    }
                    case 'u': {
                        if (EspejoY) {
                            if (caracterinv == 'u' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            if (i == 0) {
                                m1.dibujaru(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 70;
                            } else {
                                m1.dibujaru(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x -= 90;
                            }
                        } else {
                            if (i == 0) {
                                m1.dibujaru(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            } else if (texto.charAt(i - 1) == 'b') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else if (texto.charAt(i - 1) == 'v') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else if (texto.charAt(i - 1) == 'w') {
                                m1.dibujarucaso(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 70;
                            } else {
                                m1.dibujaru(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                                x += 90;
                            }
                        }
                        break;
                    }
                    case 'v': {
                        if (EspejoY) {
                            if (caracterinv == 'v' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujarv(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 110;
                        } else {
                            m1.dibujarv(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 110;
                        }
                        break;
                    }
                    case 'w': {
                        if (EspejoY) {
                            if (caracterinv == 'w' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 90 * invtotal;
                                pasado++;
                            }
                            m1.dibujarw(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 150;
                        } else {
                            m1.dibujarw(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 150;
                        }
                        break;
                    }
                    case 'x': {
                        if (EspejoY) {
                            if (caracterinv == 'x' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 50 * invtotal;
                                pasado++;
                            }
                            m1.dibujarx1(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 60;
                        } else {
                            m1.dibujarx1(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        }
                        break;
                    }
                    case 'y': {
                        if (EspejoY) {
                            if (caracterinv == 'y' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 70 * invtotal;
                                pasado++;
                            }
                            m1.dibujary1(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 120;
                        } else {
                            m1.dibujary1(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 120;
                        }
                        break;
                    }
                    case 'z': {
                        if (EspejoY) {
                            if (caracterinv == 't' && EspejoY && pasado == 0 && invtotal > 1) {
                                x += 60 * invtotal;
                                pasado++;
                            }
                            m1.dibujarz(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x -= 70;
                        } else {
                            m1.dibujarz(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        }
                        break;
                    }
                    // Simbolos 
                    case '¿': {
                        s1.interrogacionabierto(g2, x, y, bandera, tamaño);
                        x += 45;
                        break;
                    }
                    case '?': {
                        s1.interrogacioncerrado(g2, x, y, bandera, tamaño);
                        x += 55;
                        break;
                    }
                    case '!': {
                        s1.exclamacionabierto(g2, x, y, bandera, tamaño);
                        x += 40;
                        break;
                    }
                    case '¡': {
                        s1.exclamacioncerrado(g2, x, y, bandera, tamaño);
                        x += 40;
                        break;
                    }
                    case '.': {
                        s1.punto(g2, x, y, bandera);
                        x += 25;
                        break;
                    }
                    case ',': {
                        s1.coma(g2, x, y, bandera, tamaño);
                        x += 25;
                        break;
                    }
                    case ';': {
                        s1.puntoycoma(g2, x, y, bandera, tamaño);
                        x += 25;
                        break;
                    }
                    case ':': {
                        s1.dospuntos(g2, x, y, bandera);
                        x += 25;
                        break;
                    }
                    case '‘': {
                        s1.comillasabiertas(g2, x, y, bandera, tamaño);
                        x += 35;
                        break;
                    }
                    case '’': {
                        s1.comillascerradas(g2, x, y, bandera, tamaño);
                        x += 35;
                        break;
                    }
                    case '\"': {
                        s1.comillasinglesas(g2, x, y, bandera, tamaño);
                        x += 35;
                        break;
                    }
                    case '«': {
                        s1.españolaabierta(g2, x, y, bandera, tamaño);
                        x += 18;
                        s1.españolaabierta(g2, x, y, bandera, tamaño);
                        x += 50;
                        break;
                    }
                    case '»': {
                        s1.españolacerrada(g2, x, y, bandera, tamaño);
                        x += 18;
                        s1.españolacerrada(g2, x, y, bandera, tamaño);
                        x += 50;
                        break;
                    }
                    case '(': {
                        s1.parentesisabierto(g2, x, y, bandera, tamaño);
                        x += 35;
                        break;
                    }
                    case ')': {
                        s1.parentesiscerrado(g2, x, y, bandera, tamaño);
                        x += 35;
                        break;
                    }
                    case '{': {
                        s1.llavesabiertas(g2, x, y, bandera, tamaño);
                        x += 45;
                        break;
                    }
                    case '}': {
                        s1.llavescerradas(g2, x, y, bandera, tamaño);
                        x += 45;
                        break;
                    }
                    case '-': {
                        x += 25;
                        s1.guion(g2, x, y, bandera, tamaño);
                        x += 55;
                        break;
                    }
                    case '_': {
                        x += 30;
                        s1.guionbajo(g2, x, y, bandera, tamaño);
                        x += 65;
                        break;
                    }
                    //Mayusculas
                    case 'A': {
                        m2.dibujarA(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'B': {
                        m2.dibujarB(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 70;
                        break;
                    }
                    case 'C': {
                        m2.dibujarC(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 80;
                        break;
                    }
                    case 'D': {
                        m2.dibujarD(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 120;
                        break;
                    }
                    case 'E': {
                        m2.dibujarE(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 80;
                        break;
                    }
                    case 'F': {
                        m2.dibujarF(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 80;
                        break;
                    }
                    case 'G': {
                        m2.dibujarG(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 120;
                        break;
                    }
                    case 'H': {
                        m2.dibujarH(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'I': {
                        m2.dibujarI(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 70;
                        break;
                    }
                    case 'J': {
                        m2.dibujarJ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 70;
                        break;
                    }
                    case 'K': {
                        m2.dibujarK(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'L': {
                        m2.dibujarL(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'M': {
                        m2.dibujarM(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 130;
                        break;
                    }
                    case 'N': {
                        m2.dibujarN(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 130;
                        break;
                    }
                    case 'Ñ': {
                        m2.dibujarÑ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 130;
                        break;
                    }
                    case 'O': {
                        m2.dibujarO(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 90;
                        break;
                    }
                    case 'P': {
                        m2.dibujarP(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 90;
                        break;
                    }
                    case 'Q': {
                        m2.dibujarQ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 100;
                        break;
                    }
                    case 'R': {
                        m2.dibujarR(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 80;
                        break;
                    }
                    case 'S': {
                        m2.dibujarS(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 90;
                        break;
                    }
                    case 'T': {
                        m2.dibujarT(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 100;
                        break;
                    }
                    case 'U': {
                        m2.dibujarU(g2, x, y, bandera, false, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 100;
                        break;
                    }
                    case 'V': {
                        m2.dibujarV(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 90;
                        break;
                    }
                    case 'W': {
                        m2.dibujarW(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 100;
                        break;
                    }
                    case 'X': {
                        m2.dibujarX(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'Y': {
                        m2.dibujarY(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'Z': {
                        m2.dibujarZ(g2, x, y, bandera, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    //Tildes:
                    case 'á': {
                        if (i == 0) {
                            m1.dibujara(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        } else if (texto.charAt(i - 1) == 'b') {
                            m1.dibujaracaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else if (texto.charAt(i - 1) == 'v') {
                            m1.dibujaracaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else if (texto.charAt(i - 1) == 'w') {
                            m1.dibujaracaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else {
                            m1.dibujara(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        }
                        break;
                    }
                    case 'é': {
                        if (i == 0) {
                            m1.dibujare(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 35;
                        } else if (texto.charAt(i - 1) == 'b') {
                            m1.dibujarecaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 25;
                        } else if (texto.charAt(i - 1) == 'v') {
                            m1.dibujarecaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 25;
                        } else if (texto.charAt(i - 1) == 'w') {
                            m1.dibujarecaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 25;
                        } else {
                            m1.dibujare(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 35;
                        }
                        break;
                    }
                    case 'í': {
                        if (i == 0) {
                            m1.dibujari(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        } else if (texto.charAt(i - 1) == 'b') {
                            m1.dibujaricaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 30;
                        } else if (texto.charAt(i - 1) == 'v') {
                            m1.dibujaricaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 30;
                        } else if (texto.charAt(i - 1) == 'w') {
                            m1.dibujaricaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 30;
                        } else {
                            m1.dibujari(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        }
                        break;
                    }
                    case 'ó': {
                        if (i == 0) {
                            m1.dibujaro(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        } else if (texto.charAt(i - 1) == 'b') {
                            m1.dibujarocaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        } else if (texto.charAt(i - 1) == 'v') {
                            m1.dibujarocaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        } else if (texto.charAt(i - 1) == 'w') {
                            m1.dibujarocaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 60;
                        } else {
                            m1.dibujaro(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        }
                        break;
                    }
                    case 'ú': {
                        if (i == 0) {
                            m1.dibujaru(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        } else if (texto.charAt(i - 1) == 'b') {
                            m1.dibujarucaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else if (texto.charAt(i - 1) == 'v') {
                            m1.dibujarucaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else if (texto.charAt(i - 1) == 'w') {
                            m1.dibujarucaso(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 70;
                        } else {
                            m1.dibujaru(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                            x += 90;
                        }
                        break;
                    }
                    case 'Á': {
                        m2.dibujarA(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'É': {
                        m2.dibujarE(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'Í': {
                        m2.dibujarI(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'Ó': {
                        m2.dibujarO(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    case 'Ú': {
                        m2.dibujarU(g2, x, y, bandera, true, negrita, subrayado, cursiva, tamaño, EspejoY, Espejo);
                        x += 110;
                        break;
                    }
                    //Caret:
                    case '^': {
                        //CARET ANGULO PALABRA:        
                        if (texto.charAt(i + 1) == 'a') {
                            i += 1;
                            angulo = angulodigitos(texto, i);
                            tmpangulo = angulo;
                            banderaang = true;
                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                        }                        
                        //CARET ANGULO FRASE:
                        if (texto.charAt(i + 1) == 'A') {
                            i += 1;
                            angulo = digitos();
                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                            
                        }                                                
                        //CARET CURSIVA:
                        if (texto.charAt(i + 1) == 'K') {
                            cursiva = true;
                            i += 1;
                            if (texto.charAt(i + 1) == '+') {
                                i += 1;  
                                if (texto.charAt(i + 1) == 'a') {
                                    i += 1;
                                    angulo = angulodigitos(texto, i);
                                    tmpangulo = angulo;
                                    banderaang = true;
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                                }                        
                                //CARET ANGULO FRASE:
                                if (texto.charAt(i + 1) == 'A') {
                                    i += 1;
                                    angulo = digitos();
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                }
                                if (texto.charAt(i + 1) == 'S') {
                                    subrayado = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'N') {
                                            negrita = true;
                                            i += 1;
                                            if (texto.charAt(i + 1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                        if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }                                         
                                }
                                if (texto.charAt(i + 1) == 'N') {
                                    negrita = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'S') {
                                            subrayado = true;
                                            i += 1; 
                                            if (texto.charAt(i + 1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                }
                                if (texto.charAt(i + 1) == 'T') {
                                    i += 1;
                                    tamaño(i);
                                    i += 1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='N') {
                                            negrita=true;
                                            i+=1;
                                            if (texto.charAt(i+1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i+1)=='S') {
                                                    subrayado=true;
                                                    i+=1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (texto.charAt(i+1)=='S') {
                                            subrayado=true;
                                            i+=1;
                                            if (texto.charAt(i+1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i+1)=='N') {
                                                    negrita=true;
                                                    i+=1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }                            
                        }
                        //CARET SUBRAYADO:
                        if (texto.charAt(i + 1) == 'S') {
                            subrayado = true;
                            i += 1;
                            if (texto.charAt(i + 1) == '+') {
                                i += 1;
                                if (texto.charAt(i + 1) == 'a') {
                                    i += 1;
                                    angulo = angulodigitos(texto, i);
                                    tmpangulo = angulo;
                                    banderaang = true;
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                                }                        
                                //CARET ANGULO FRASE:
                                if (texto.charAt(i + 1) == 'A') {
                                    i += 1;
                                    angulo = digitos();
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                }
                                if (texto.charAt(i + 1) == 'K') {
                                    cursiva = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'N') {
                                            negrita = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }    
                                        }
                                    } 
                                }
                                if (texto.charAt(i + 1) == 'N') {
                                    negrita = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'K') {
                                            cursiva = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                }
                                if (texto.charAt(i + 1) == 'T') {
                                    i += 1;
                                    tamaño(i);
                                    i += 1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='N') {
                                            negrita=true;
                                            i+=1;   
                                            if (texto.charAt(i+1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i+1)=='K') {
                                                    cursiva=true;
                                                    i+=1; 
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }                                                                                                    
                                            }
                                        }
                                        if (texto.charAt(i+1)=='K') {
                                            cursiva=true;
                                            i+=1;
                                            if (texto.charAt(i+1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i+1)=='N') {
                                                    negrita=true;
                                                    i+=1; 
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }                                                                                                    
                                            }                                            
                                        }
                                    }
                                }                                                                   
                            } 
                        }
                        //CARET NEGRITAS:
                        if (texto.charAt(i + 1) == 'N') {
                            negrita = true;
                            i += 1;
                            if (texto.charAt(i + 1) == '+') {
                                i += 1;
                                if (texto.charAt(i + 1) == 'a') {
                                    i += 1;
                                    angulo = angulodigitos(texto, i);
                                    tmpangulo = angulo;
                                    banderaang = true;
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                                }                        
                                //CARET ANGULO FRASE:
                                if (texto.charAt(i + 1) == 'A') {
                                    i += 1;
                                    angulo = digitos();
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                }
                                if (texto.charAt(i + 1) == 'S') {
                                    subrayado = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'K') {
                                            cursiva = true;
                                            i += 1;
                                            if (texto.charAt(i + 1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                }
                                if (texto.charAt(i + 1) == 'K') {
                                    cursiva = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'S') {
                                            subrayado = true;
                                            i += 1;
                                            if (texto.charAt(i + 1)=='+') {
                                                i+=1;
                                                if (texto.charAt(i + 1) == 'T') {
                                                    i += 1;
                                                    tamaño(i);
                                                    i += 1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                }
                                if (texto.charAt(i + 1) == 'T') {
                                    i += 1;
                                    tamaño(i);
                                    i += 1;
                                    if (texto.charAt(i + 1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i + 1)=='S') {
                                            subrayado=true;
                                            i+=1;
                                            if (texto.charAt(i + 1)=='+') {                                                
                                                i+=1;
                                                if (texto.charAt(i + 1)=='K') {
                                                    cursiva=true;
                                                    i+=1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (texto.charAt(i + 1)=='K') {
                                            cursiva=true;
                                            i+=1;
                                            if (texto.charAt(i + 1)=='+') {                                                
                                                i+=1;
                                                if (texto.charAt(i + 1)=='S') {
                                                    subrayado=true;
                                                    i+=1;
                                                    if (texto.charAt(i+1)=='+') {
                                                        i+=1;
                                                         if (texto.charAt(i + 1) == 'a') {
                                                            i += 1;
                                                            angulo = angulodigitos(texto, i);
                                                            tmpangulo = angulo;
                                                            banderaang = true;
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);                                            
                                                        }
                                                         if (texto.charAt(i + 1) == 'A') {
                                                            i += 1;
                                                            angulo = digitos();
                                                            g2.rotate(Math.toRadians(angulo), x + 50, y + 100);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        }
                        //CARET TAMAÑO:
                        if (texto.charAt(i + 1) == 'T') {
                            i += 1;
                            tamaño(i);
                            i += 1;
                            if (texto.charAt(i + 1) == '+') {
                                i += 1;
                                if (texto.charAt(i + 1) == 'a') {
                                    i += 1;
                                    angulo = angulodigitos(texto, i);
                                    tmpangulo = angulo;
                                    banderaang = true;
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                                }                        
                                //CARET ANGULO FRASE:
                                if (texto.charAt(i + 1) == 'A') {
                                    i += 1;
                                    angulo = digitos();
                                    g2.rotate(Math.toRadians(angulo), x + 50, y + 100);
                                }
                                if (texto.charAt(i + 1) == 'N') {
                                    negrita = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'K') {
                                            cursiva = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'S') {
                                                    subrayado = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                        if (texto.charAt(i + 1) == 'S') {
                                            subrayado = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'K') {
                                                    cursiva = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (texto.charAt(i + 1) == 'K') {
                                    cursiva = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'N') {
                                            negrita = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'S') {
                                                    subrayado = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                        if (texto.charAt(i + 1) == 'S') {
                                            subrayado = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'N') {
                                                    negrita = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (texto.charAt(i + 1) == 'S') {
                                    subrayado = true;
                                    i += 1;
                                    if (texto.charAt(i + 1) == '+') {
                                        i += 1;
                                        if (texto.charAt(i + 1) == 'K') {
                                            cursiva = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'N') {
                                                    negrita = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                        if (texto.charAt(i + 1) == 'N') {
                                            negrita = true;
                                            i += 1;
                                            if (texto.charAt(i + 1) == '+') {
                                                i += 1;
                                                if (texto.charAt(i + 1) == 'K') {
                                                    cursiva = true;
                                                    i += 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        //CARET ROTAR:
                        if (texto.charAt(i + 1) == 'R') {                                                            
                            texto = reves(texto);
                            i+=1;                            
                            //Concatenación Pendiente
                        }
                        //CARET MOVER:
                        if (texto.charAt(i + 1) == 'M') {
                            int bandera2 = 0;
                            i += 1;
                            if (texto.charAt(i + 1) == '(') {
                                i += 1;
                                char[] aux3 = texto.toCharArray();
                                for (int w = 0; w < aux3.length; w++) {                                    
                                    if (Character.isDigit(aux3[w]) && bandera2 == 0) {
                                        s += aux3[w];
                                        i += 1;
                                    }
                                    if (aux3[w] == ',') {
                                        i += 1;
                                        bandera2++;
                                    }
                                    if (Character.isDigit(aux3[w]) && bandera2 == 1) {
                                        i += 1;
                                        n += aux3[w];
                                    }
                                }
                            }
                            if (texto.charAt(i + 1) == ')') {
                                x += Integer.parseInt(s);
                                y += Integer.parseInt(n);      
                                i += 1;      
                                if (texto.charAt(i + 1) == '+') {
                                    i += 1;
                                    if (texto.charAt(i + 1) == 'K') {
                                        cursiva = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'S') {
                                                subrayado = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i += 1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'T') {

                                                            i += 1;
                                                            tamaño(i);
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'N') {                                                                                                                        
                                                            negrita=true;
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'S') {
                                        subrayado = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {                                                
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'N') {
                                        negrita = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'T') {
                                        i+=1;                                        
                                        tamaño(i);
                                        i+=1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }                                 
                                }
                            }                                                                                     
                        }
                        //CARET ESPEJO Y:
                        if (texto.charAt(i + 1) == 'E') {
                            i += 1;
                            if (texto.charAt(i + 1) == 'Y') {
                                i += 1;                                
                                if (texto.charAt(i + 1) == '+') {
                                    i += 1;
                                    if (texto.charAt(i + 1) == 'K') {
                                        cursiva = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'S') {
                                                subrayado = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i += 1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'T') {

                                                            i += 1;
                                                            tamaño(i);
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'N') {                                                                                                                        
                                                            negrita=true;
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'S') {
                                        subrayado = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {                                                
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'N') {
                                        negrita = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'T') {
                                        i+=1;                                        
                                        tamaño(i);  //Hay que arreglar algunos errores.
                                        i+=1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }                                 
                                }
                                                            
                                EspejoY = true;
                                caracterinv = texto.charAt(i + 1);
                                invtotal = total(texto, i + 1);
                                x += 120;
                            }
                            if(texto.charAt(i+1) == 'X'){
                                i+=1;
                                if (texto.charAt(i + 1) == '+') {
                                    i += 1;
                                    if (texto.charAt(i + 1) == 'K') {
                                        cursiva = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'S') {
                                                subrayado = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i += 1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'T') {

                                                            i += 1;
                                                            tamaño(i);
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'S') {
                                                            subrayado=true;
                                                            i+=1;
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1)== 'N') {                                                                                                                        
                                                            negrita=true;
                                                            i+=1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'S') {
                                        subrayado = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {                                                
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'N') {
                                        negrita = true;
                                        i += 1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'T') {
                                                i+=1;
                                                tamaño(i);
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'T') {
                                                        i+=1;
                                                        tamaño(i);
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'T') {                                                                
                                                                i+=1;
                                                                tamaño(i);
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (texto.charAt(i + 1) == 'T') {
                                        i+=1;                                        
                                        tamaño(i);  //Hay que arreglar algunos errores.
                                        i+=1;
                                        if (texto.charAt(i + 1) == '+') {
                                            i+=1;
                                            if (texto.charAt(i + 1) == 'K') {
                                                cursiva = true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'N') {                                                        
                                                        negrita=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'N') {
                                                negrita=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva = true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'S') {                                                                
                                                                subrayado=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'S') {
                                                        subrayado=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (texto.charAt(i + 1) == 'S') {                                                
                                                subrayado=true;
                                                i += 1;
                                                if (texto.charAt(i + 1) == '+') {
                                                    i+=1;
                                                    if (texto.charAt(i + 1) == 'N') {
                                                        negrita=true;
                                                        i += 1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'K') {                                                                
                                                                cursiva=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                    if (texto.charAt(i + 1) == 'K') {
                                                        cursiva=true;
                                                        i+=1;
                                                        if (texto.charAt(i + 1) == '+') {
                                                            i+=1;
                                                            if (texto.charAt(i + 1)== 'N') {                                                                
                                                                negrita=true;
                                                                i+=1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }                                 
                                }                                                                
                                Espejo = true;                                
                                y+=200;
                            }
                            break;
                        }                                                                        
                        break;
                    }                
                    default: {
                        break;
                    }
                }
            }
        }
    }
            
    public void tamaño(int i){
        if (texto.charAt(i + 1) == '0') {
            System.out.println("tamaño = 0");
            tamaño = (float) 0.3;
            limite = (float) 3.5;
        }
        if (texto.charAt(i + 1) == '2') {
            System.out.println("tamaño = 2");
            tamaño = (float) 0.5;
            limite = 2;
        }
        if (texto.charAt(i + 1) == '4') {
            System.out.println("tamaño = 4");
            tamaño = (float) 0.7;
            limite = (float) 1.44;
        }
        if (texto.charAt(i + 1) == '5') {
            System.out.println("Tamaño normal");
            tamaño = (float) 1;
            limite = 1;
        }
        if (texto.charAt(i + 1) == '6') {
            System.out.println("tamaño = 6");
            tamaño = (float) 1.3;
            limite = (float) 0.75;
        }
        if (texto.charAt(i + 1) == '8') {
            System.out.println("tamaño = 8");
            tamaño = (float) 1.5;
            limite = (float) 0.63;
        }
    }    
    public static int total(String texto, int j) {
        int numero = 0;
        for (int i = j; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                numero += 1;
            } else {
                break;
            }
        }
        return numero;
    }    
    public static int angulodigitos(String texto, int k) {
        int ubicacion = k;
        String lista = texto.substring(0, ubicacion + 1);
        String invertir = texto.substring(ubicacion + 1, texto.length());
        char[] aux2 = invertir.toCharArray();
        String n = "";
        for (int i = 0; i < invertir.length(); i++) {
            if (Character.isDigit(aux2[i]) && invertir.charAt(i) != ' ') {
                n += aux2[i];
            } else {
                break;
            }
        }        
        return Integer.parseInt(n);
    }
    public int digitos() {
        char[] aux2 = texto.toCharArray();
        for (int j = 0; j < aux2.length; j++) {
            if (Character.isDigit(aux2[j])) {
                n += aux2[j];
            }
        }
        return Integer.parseInt(n);
    }
    public static String reves(String texto) {
        String cadena2 = "";
        String caret = "";
        int ubicacion = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '^') {
                i += 1;
                if (texto.charAt(i) == 'R') {
                    ubicacion = i;
                    caret = "^R";
                    break;

                }
            } else {
                cadena2 += texto.charAt(i);
            }
        }        
        String lista = texto.substring(0, ubicacion + 1);
        String invertir = texto.substring(ubicacion + 1, texto.length());                
        StringBuilder aux = new StringBuilder(invertir);
        String inv = aux.reverse().toString();        
        String aux3 = "";
        String nueva = "";
        for (int i = 0; i < inv.length(); i++) {
            if (inv.charAt(i) == ' ') {
                StringBuilder aux1 = new StringBuilder(aux3);
                String invo = aux1.reverse().toString();
                nueva += invo + " ";
                aux3 = "";
            } else {
                aux3 += inv.charAt(i);
            }
        }        
        StringBuilder aux1 = new StringBuilder(aux3);        
        String invo = aux1.reverse().toString();
        nueva += invo;        
        nueva = cadena2 + caret + nueva;        
        return nueva;
    }
    public static boolean verificadorsubrayado(String texto, int i) {
        boolean bandera = false;
        for (int j = i + 1; j < texto.length(); j++) {
            if (texto.charAt(j) == '^') {
                if (texto.charAt(j + 1) == 'S') {
                    bandera = true;
                    break;
                }
                if (texto.charAt(j + 1) == 'K') {
                    j++;
                    if (texto.charAt(j + 1) == '+') {
                        j++;
                        if (texto.charAt(j + 1) == 'S') {
                            bandera = true;
                            break;
                        }
                        if (texto.charAt(j + 1) == 'N') {
                            j++;
                            if (texto.charAt(j + 1) == '+') {
                                j++;
                                if (texto.charAt(j + 1) == 'S') {
                                    bandera = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (texto.charAt(j + 1) == 'N') {
                    j++;
                    if (texto.charAt(j + 1) == '+') {
                        j++;
                        if (texto.charAt(j + 1) == 'S') {
                            bandera = true;
                        }
                        if (texto.charAt(j + 1) == 'K') {
                            j++;
                            if (texto.charAt(j + 1) == '+') {
                                j++;
                                if (texto.charAt(j + 1) == 'S') {
                                    bandera = true;
                                }
                            }
                        }
                    }
                }
            } else if (texto.charAt(j) == ' ') {
            } else {
                break;
            }
        }
        return bandera;
    }
}
