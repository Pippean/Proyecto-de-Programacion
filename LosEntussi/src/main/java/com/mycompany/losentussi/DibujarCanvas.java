package com.mycompany.losentussi;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.geom.Path2D;     
import java.util.ArrayList;

/**
 *
 * @author Pipe, Juano, Lázaro
 */

public class DibujarCanvas extends JComponent {
    //Variables de la Clase:
    private int width;
    private int height;
    private Minusculas m1;
    private Mayusculas m2;
    private Simbolos s1;
    private String texto;
    private String color;
    private boolean bandera;
    
    public DibujarCanvas(int w, int h, String texto, String color, boolean bandera ){
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
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        
        //Switch para el Choise Menu:
        switch(color){
            case "Negro":{
                g2.setColor(Color.black);
                break;
            }
            case "Rojo":{
                g2.setColor(Color.red);
                break;
            }
            case "Azul":{
                g2.setColor(Color.blue);
                break;
            }
            case "Amarillo":{
                g2.setColor(Color.yellow);
                break;
            }
            case "Verde":{
                g2.setColor(Color.green);
                break;
            }
            case "Naranjo":{
                g2.setColor(Color.orange);
                break;
            }
            case "Morado":{
                g2.setColor(Color.magenta);
                break;
            }
            case "Rosado":{
                g2.setColor(Color.pink);
                break;
            }
            case "Celeste":{
                g2.setColor(Color.cyan);
                break;
            }
            case "Blanco":{
                g2.setColor(Color.white);
                break;
            }
        }
        
        //Switch para dibujar los caracteres:
        int x= 10, y=0;
        if(!"".equals(texto)){
            for (int i = 0; i < texto.length(); i++){
                char caracter = texto.charAt(i);
                if(x>=1150){
                    if(texto.charAt(i)!= ' '){
                        s1.guion(g2, x, y, bandera);
                    }
                    y+=180;
                    x=10;
                }                
                switch(caracter){
                    case ' ':{
                        x+=40;
                        break;
                    }
                    case 'a':{
                    if(i== 0){
                        m1.dibujara(g2, x, y, bandera);
                        x+=90;
                    }
                    else if(texto.charAt(i-1)=='b'){
                        m1.dibujaracaso(g2, x, y, bandera);
                        x+=70;
                    }
                    else if(texto.charAt(i-1) == 'v'){
                        m1.dibujaracaso(g2, x, y, bandera);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaracaso(g2, x, y, bandera);
                        x+=70;
                    }

                    else{
                        m1.dibujara(g2, x, y, bandera);
                        x+=90;
                    }
                    break;
                    }
                    case 'b':{
                        m1.dibujarb(g2, x, y, bandera);
                        x+=50;
                        break;
                    }
                    case 'c':{
                        m1.dibujarc(g2, x, y, bandera);
                        x+=68;
                        break;
                    }
                    case 'd':{
                        m1.dibujard(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case 'e':{
                    if(i== 0){
                        m1.dibujare(g2, x, y, bandera);
                        x+=35;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarecaso(g2, x, y, bandera);
                        x+=25;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarecaso(g2, x, y, bandera);
                        x+=25; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarecaso(g2, x, y, bandera);
                        x+=25;
                    }
                    else{
                        m1.dibujare(g2, x, y, bandera);
                        x+=35;
                    }
                    break;
                    }
                    case 'f':{
                        m1.dibujarf(g2, x, y, bandera);
                        x+=50;
                        break;
                    }
                    case 'g':{
                        m1.dibujarg(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case 'h':{
                        m1.dibujarh(g2, x, y, bandera);
                        x+=60;
                        break;
                    }
                    case 'i':{
                    if(i==0){
                      m1.dibujari(g2, x, y, bandera);
                      x+=60;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujaricaso(g2, x, y, bandera);
                        x+=30;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujaricaso(g2, x, y, bandera);
                        x+=30; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaricaso(g2, x, y, bandera);
                        x+=30;
                    }
                    else{
                        m1.dibujari(g2, x, y, bandera);
                        x+=60;
                    }
                    break;
                    }
                    case 'j':{
                        m1.dibujarj(g2, x, y, bandera);
                        x+=60;
                        break;
                    }
                    case 'k':{
                        m1.dibujark(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'l':{
                    if(i==0){
                      m1.dibujarl(g2, x, y, bandera);
                      x+=40;   
                    }
                    else if(texto.charAt(i-1)=='b'){
                      m1.dibujarlcaso(g2, x, y, bandera);
                    }
                    else{
                      m1.dibujarl(g2, x, y, bandera);
                      x+=40;
                    }
                    break;
                    }
                    case 'm':{
                        m1.dibujarm(g2, x, y, bandera);
                        x+=155;
                        break;
                    }
                    case 'n':{
                        m1.dibujarn(g2, x, y, bandera);
                        x+=95;
                        break;
                    }
                    case 'ñ':{
                        m1.dibujarñ(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'o':{
                    if (i == 0){
                      m1.dibujaro(g2, x, y, bandera);
                      x+=90; 
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarocaso(g2, x, y, bandera);
                        x+=60;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarocaso(g2, x, y, bandera);
                        x+=60; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarocaso(g2, x, y, bandera);
                        x+=60;
                    }
                    else{
                    m1.dibujaro(g2, x, y, bandera);
                    x+=90;
                    }
                    break;
                    }
                    case 'p':{
                        m1.dibujarp(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'q':{
                        m1.dibujarq(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'r':{
                    if(i==0){
                      m1.dibujarr(g2, x, y, bandera);
                      x+=70;    
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarrcaso(g2, x, y, bandera);
                        x+=45;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarrcaso(g2, x, y, bandera);
                        x+=45; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarrcaso(g2, x, y, bandera);
                        x+=45;
                    }
                    else{
                        m1.dibujarr(g2, x, y, bandera);
                        x+=70;
                    }
                    break;
                    }
                    case 's':{
                        m1.dibujars(g2, x, y, bandera);
                        x+=85;
                        break;
                    }
                    case 't':{
                        m1.dibujart(g2, x, y, bandera);
                        x+=40;
                        break;
                    }
                    case 'u':{
                    if(i==0){
                      m1.dibujaru(g2, x, y, bandera);
                      x+=90;    
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarucaso(g2, x, y, bandera);
                        x+=70;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarucaso(g2, x, y, bandera);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarucaso(g2, x, y, bandera);
                        x+=70;
                    }
                    else{
                        m1.dibujaru(g2, x, y, bandera);
                        x+=90;
                    }
                    break;
                    }
                    case 'v':{
                        m1.dibujarv(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'w':{
                        m1.dibujarw(g2, x, y, bandera);
                        x+=150;
                        break;
                    }
                    case 'x':{
                        m1.dibujarx1(g2, x, y, bandera); 
                        x+=60;
                        break;
                    }
                    case 'y':{
                        m1.dibujary1(g2, x, y, bandera);
                        x+=120;
                        break;
                    }
                    case 'z':{
                        m1.dibujarz(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case '¿':{
                        s1.interrogacionabierto(g2, x, y, bandera);
                        x+=45;
                        break;
                    }
                    case '?':{
                        s1.interrogacioncerrado(g2, x, y, bandera);
                        x+=55;
                        break;
                    }
                    case '!':{
                        s1.exclamacionabierto(g2, x, y, bandera);
                        x+=40;
                        break;
                    }
                    case '¡':{
                        s1.exclamacioncerrado(g2, x, y, bandera);
                        x+=40;
                        break;
                    }
                    case '.':{
                        s1.punto(g2, x, y, bandera);
                        x+=25;
                        break;
                    }
                    case ',':{
                        s1.coma(g2, x, y, bandera);
                        x+=25;
                        break;
                    }
                    case ';':{
                        s1.puntoycoma(g2, x, y, bandera);
                        x+=25;
                        break;
                    }
                    case ':':{
                        s1.dospuntos(g2, x, y, bandera);
                        x+=25;
                        break;
                    }
                    case '‘':{
                        s1.comillasabiertas(g2, x, y, bandera);
                        x+=35;
                        break;
                    }
                    case '’':{
                        s1.comillascerradas(g2, x, y, bandera);
                        x+=35;
                        break;
                    }
                    case '\"':{
                        s1.comillasinglesas(g2, x, y, bandera);
                        x+=35;
                        break;
                    }
                    case '«':{
                        s1.españolaabierta(g2, x, y, bandera);
                        x+=18;
                        s1.españolaabierta(g2, x, y, bandera);
                        x+=50;
                        break;
                    }
                    case '»':{
                        s1.españolacerrada(g2, x, y, bandera);
                        x+=18;
                        s1.españolacerrada(g2, x, y, bandera);
                        x+=50;
                        break;
                    }
                    case '(':{
                        s1.parentesisabierto(g2, x, y, bandera);
                        x+=35;
                        break;
                    }
                    case ')':{
                        s1.parentesiscerrado(g2, x, y, bandera);
                        x+=35;
                        break;
                    }
                    case '{':{
                        s1.llavesabiertas(g2, x, y, bandera);
                        x+=45;
                        break;
                    }
                    case '}':{
                        s1.llavescerradas(g2, x, y, bandera);
                        x+=45;
                        break;
                    }
                    case '-':{
                        x+=25;
                        s1.guion(g2, x, y, bandera);
                        x+=55;
                        break;
                    }
                    case '_':{
                        x+=30;
                        s1.guionbajo(g2, x, y, bandera);
                        x+=65;
                        break;
                    }
                    case 'A':{
                        m2.dibujarA(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'B':{
                        m2.dibujarB(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case 'C':{
                        m2.dibujarC(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'D':{
                        m2.dibujarD(g2, x, y, bandera);
                        x+=120;
                        break;
                    }
                    case 'E':{
                        m2.dibujarE(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'F':{
                        m2.dibujarF(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'G':{
                        m2.dibujarG(g2, x, y, bandera);
                        x+=120;
                        break;
                    }
                    case 'H':{
                        m2.dibujarH(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'I':{
                        m2.dibujarI(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case 'J':{
                        m2.dibujarJ(g2, x, y, bandera);
                        x+=70;
                        break;
                    }
                    case 'K':{
                        m2.dibujarK(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'L':{
                        m2.dibujarL(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'M':{
                        m2.dibujarM(g2, x, y, bandera);
                        x+=130;
                        break;
                    }
                    case 'N':{
                        m2.dibujarN(g2, x, y, bandera);
                        x+=130;
                        break;
                    }
                    case 'Ñ':{
                        m2.dibujarÑ(g2, x, y, bandera);
                        x+=130;
                        break;
                    }
                    case 'O':{
                        m2.dibujarO(g2, x, y, bandera);
                        x+=90;
                        break;
                    }
                    case 'P':{
                        m2.dibujarP(g2, x, y, bandera);
                        x+=90;
                        break;
                    }
                    case 'Q':{
                        m2.dibujarQ(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'R':{
                        m2.dibujarR(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'S':{
                        m2.dibujarS(g2, x, y, bandera);
                        x+=80;
                        break;
                    }
                    case 'T':{
                        m2.dibujarT(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'U':{
                        m2.dibujarU(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'V':{
                        m2.dibujarV(g2, x, y, bandera);
                        x+=90;
                        break;
                    }
                    case 'W':{
                        m2.dibujarW(g2, x, y, bandera);
                        x+=100;
                        break;
                    }
                    case 'X':{
                        m2.dibujarX(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'Y':{
                        m2.dibujarY(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    case 'Z':{
                        m2.dibujarZ(g2, x, y, bandera);
                        x+=110;
                        break;
                    }
                    default:{
                        break;
                    } 
                }    
            }
        }    
    }
}
