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
    private Minusculas m1;
    private Mayusculas m2;
    private Simbolos s1;
    private String texto;
    private String color;
    private String s="";
    private String n="";
    private boolean bandera;
    private boolean negrita = false;
    private boolean subrayado = false;    
    private boolean cursiva = false;
    private boolean sub2 = false;
    private boolean EspejoY = false;
    private boolean banderaang = false;
    private float  tamaño = 1;
    private float limite = 1;
    
    
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
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if(x>=1150*limite){
                    if(texto.charAt(i)!= ' '){
                        s1.guion(g2, x, y, bandera,tamaño);
                    }
                    y+=180;
                    x=10;
                }                
                switch(caracter){
                    case ' ':{
                        if(verificadorsubrayado(texto, i) == true && subrayado == true){
                            s1.seguirsubrayado(g2, x, y, bandera);
                        }
                        else{
                           subrayado = false;    
                        } 
                        if (banderaang==true) {
                            
                            if (angulo>=0 && angulo<=45) {
                                g2.rotate(Math.toRadians(-tmpangulo), 150-y, x);
                                banderaang = false;
                            }
                            if (angulo>=46 && angulo<=90) {
                                g2.rotate(Math.toRadians(-tmpangulo), 60, 146);
                                banderaang = false;
                            }
                            if (angulo>=91 && angulo<=135) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            if (angulo>=136 && angulo<=180) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            if (angulo>=181 && angulo<=225) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            if (angulo>=226 && angulo<=270) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            if (angulo>=270 && angulo<=315) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            if (angulo>=316 && angulo<=360) {
                                g2.rotate(Math.toRadians(-tmpangulo), y, x);
                                banderaang = false;
                            }
                            //g2.rotate(Math.toRadians(-tmpangulo), y, x);                            
                            //banderaang = false;
                        }
                        EspejoY = false;
                        negrita = false;
                        cursiva = false;
                        tamaño = 1;
                        limite = 1;    
                        x+=40; 
                                           
                        break;
                    }   
                    //Minusculas
                    case 'a':{
                    if(i== 0){
                        m1.dibujara(g2, x, y, bandera,false,negrita, subrayado, cursiva,tamaño, EspejoY);
                        x+=90;
                    }
                    else if(texto.charAt(i-1)=='b'){
                        m1.dibujaracaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }
                    else if(texto.charAt(i-1) == 'v'){
                        m1.dibujaracaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaracaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }

                    else{
                        m1.dibujara(g2, x, y, bandera,false,negrita,subrayado, cursiva,tamaño,EspejoY);
                         x+=90;
                    }
                    break;
                    }
                    case 'b':{
                        m1.dibujarb(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=50;
                        break;
                    }
                    case 'c':{
                        m1.dibujarc(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=68;
                        break;
                    }
                    case 'd':{
                        m1.dibujard(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    case 'e':{
                    if(i== 0){
                        m1.dibujare(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=35;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarecaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=25;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarecaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=25; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarecaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=25;
                    }
                    else{
                        m1.dibujare(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=35;
                    }
                    break;
                    }
                    case 'f':{
                        m1.dibujarf(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=50;
                        break;
                    }
                    case 'g':{
                        m1.dibujarg(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    case 'h':{
                        m1.dibujarh(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                        break;
                    }
                    case 'i':{
                    if(i==0){
                      m1.dibujari(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                      x+=60;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujaricaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=30;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujaricaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=30; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaricaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=30;
                    }
                    else{
                        m1.dibujari(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                    }
                    break;
                    }
                    case 'j':{
                        m1.dibujarj(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                        break;
                    }
                    case 'k':{
                        m1.dibujark(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'l':{
                    if(i==0){
                      m1.dibujarl(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                      x+=40;   
                    }
                    else if(texto.charAt(i-1)=='b'){
                      m1.dibujarlcaso(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                      x+=30;
                    }
                    else{
                      m1.dibujarl(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                      x+=40;
                    }
                    break;
                    }
                    case 'm':{
                        m1.dibujarm(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=155;
                        break;
                    }
                    case 'n':{
                        m1.dibujarn(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=95;
                        break;
                    }
                    case 'ñ':{
                        m1.dibujarñ(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'o':{
                    if (i == 0){
                      m1.dibujaro(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                      x+=90; 
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarocaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=60;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarocaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=60; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarocaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                    }
                    else{
                    m1.dibujaro(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                    x+=90;
                    }
                    break;
                    }
                    case 'p':{
                        m1.dibujarp(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'q':{
                        m1.dibujarq(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=80;
                        break;
                    }
                    case 'r':{
                    if(i==0){
                      m1.dibujarr(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                      x+=70;    
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarrcaso(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=45;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarrcaso(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=45; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarrcaso(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=45;
                    }
                    else{
                        m1.dibujarr(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }
                    break;
                    }
                    case 's':{
                        m1.dibujars(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=85;
                        break;
                    }
                    case 't':{
                        m1.dibujart(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=40;
                        break;
                    }
                    case 'u':{
                    if(i==0){
                      m1.dibujaru(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                      x+=90;    
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarucaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarucaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarucaso(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }
                    else{
                        m1.dibujaru(g2, x, y, bandera,false,negrita, subrayado, cursiva,EspejoY);
                        x+=90;
                    }
                    break;
                    }
                    case 'v':{
                        m1.dibujarv(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'w':{
                        m1.dibujarw(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=150;
                        break;
                    }
                    case 'x':{
                        m1.dibujarx1(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY); 
                        x+=60;
                        break;
                    }
                    case 'y':{
                        m1.dibujary1(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=120;
                        break;
                    }
                    case 'z':{
                        m1.dibujarz(g2, x, y, bandera,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    // Simbolos 
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
                        s1.guion(g2, x, y, bandera,tamaño);
                        x+=55;
                        break;
                    }
                    case '_':{
                        x+=30;
                        s1.guionbajo(g2, x, y, bandera);
                        x+=65;
                        break;
                    }
                    
                    //Mayusculas
                    
                    case 'A':{
                        m2.dibujarA(g2, x, y, bandera,false,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'B':{
                        m2.dibujarB(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    case 'C':{
                        m2.dibujarC(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=80;
                        break;
                    }
                    case 'D':{
                        m2.dibujarD(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=120;
                        break;
                    }
                    case 'E':{
                        m2.dibujarE(g2, x, y, bandera,false,negrita,subrayado,cursiva,EspejoY);
                        x+=80;
                        break;
                    }
                    case 'F':{
                        m2.dibujarF(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=80;
                        break;
                    }
                    case 'G':{
                        m2.dibujarG(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=120;
                        break;
                    }
                    case 'H':{
                        m2.dibujarH(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'I':{
                        m2.dibujarI(g2, x, y, bandera,false,negrita,subrayado,cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    case 'J':{
                        m2.dibujarJ(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=70;
                        break;
                    }
                    case 'K':{
                        m2.dibujarK(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'L':{
                        m2.dibujarL(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'M':{
                        m2.dibujarM(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=130;
                        break;
                    }
                    case 'N':{
                        m2.dibujarN(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=130;
                        break;
                    }
                    case 'Ñ':{
                        m2.dibujarÑ(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=130;
                        break;
                    }
                    case 'O':{
                        m2.dibujarO(g2, x, y, bandera,false,negrita,subrayado,cursiva,EspejoY);
                        x+=90;
                        break;
                    }
                    case 'P':{
                        m2.dibujarP(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=90;
                        break;
                    }
                    case 'Q':{
                        m2.dibujarQ(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'R':{
                        m2.dibujarR(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=80;
                        break;
                    }
                    case 'S':{
                        m2.dibujarS(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=90;
                        break;
                    }
                    case 'T':{
                        m2.dibujarT(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'U':{
                        m2.dibujarU(g2, x, y, bandera,false,negrita,subrayado,cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'V':{
                        m2.dibujarV(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=90;
                        break;
                    }
                    case 'W':{
                        m2.dibujarW(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=100;
                        break;
                    }
                    case 'X':{
                        m2.dibujarX(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'Y':{
                        m2.dibujarY(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'Z':{
                        m2.dibujarZ(g2, x, y, bandera,negrita,subrayado,cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    //Tildes:
                    case 'á':{
                    if(i== 0){
                        m1.dibujara(g2, x, y, bandera,true, negrita,subrayado, cursiva,tamaño,EspejoY);
                        x+=90;
                    }
                    else if(texto.charAt(i-1)=='b'){
                        m1.dibujaracaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }
                    else if(texto.charAt(i-1) == 'v'){
                        m1.dibujaracaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaracaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }

                    else{
                        m1.dibujara(g2, x, y, bandera,true,negrita,subrayado, cursiva,tamaño,EspejoY);
                        x+=90;
                    }
                    break;
                    }
                    case 'é':{
                    if(i== 0){
                        m1.dibujare(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=35;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarecaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=25;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarecaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=25; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarecaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=25;
                    }
                    else{
                        m1.dibujare(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=35;
                    }
                    break;
                    }
                    case 'í':{
                    if(i==0){
                      m1.dibujari(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                      x+=60;
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujaricaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=30;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujaricaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=30; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujaricaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=30;
                    }
                    else{
                        m1.dibujari(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                    }
                    break;
                    }
                    case 'ó':{
                    if (i == 0){
                      m1.dibujaro(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                      x+=90; 
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarocaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=60;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarocaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=60; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarocaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=60;
                    }
                    else{
                    m1.dibujaro(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                    x+=90;
                    }
                    break;
                    }
                    case 'ú':{
                    if(i==0){
                      m1.dibujaru(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                      x+=90;    
                    }
                    else if(texto.charAt(i-1) == 'b'){
                        m1.dibujarucaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70;                            
                    }
                    else if(texto.charAt(i-1) == 'v'){
                         m1.dibujarucaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70; 
                    }
                    else if(texto.charAt(i-1)== 'w'){
                        m1.dibujarucaso(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=70;
                    }
                    else{
                        m1.dibujaru(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=90;
                    }
                    break;
                    }
                    case 'Á':{
                        m2.dibujarA(g2, x, y, bandera,true,negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'É':{
                        m2.dibujarE(g2, x, y, bandera,true, negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'Í':{
                        m2.dibujarI(g2, x, y, bandera,true, negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'Ó':{
                        m2.dibujarO(g2, x, y, bandera,true, negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    case 'Ú':{
                        m2.dibujarU(g2, x, y, bandera,true, negrita, subrayado, cursiva,EspejoY);
                        x+=110;
                        break;
                    }
                    //Caret:
                    case '^':{
                        if(texto.charAt(i+1)=='K'){
                            cursiva = true;                            
                            i+=1;
                            if (texto.charAt(i+1)=='+') {
                                i+=1;
                                if (texto.charAt(i+1)=='S') {
                                    subrayado = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='N') {
                                            negrita = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                                if (texto.charAt(i+1)=='N') {
                                    negrita = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='S') {
                                            subrayado = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                            }
                            else{                                
                                break;
                            }
                        }
                        if(texto.charAt(i+1)=='S'){
                            subrayado = true;                            
                            i+=1;                            
                            if (texto.charAt(i+1)=='+') {
                                i+=1;
                                if (texto.charAt(i+1)=='K') {
                                    cursiva = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='N') {
                                            negrita = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                                if (texto.charAt(i+1)=='N') {
                                    negrita = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='K') {
                                            cursiva = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                            }
                            else{                                
                                break;
                            }

                        }
                        if(texto.charAt(i+1)=='N'){                            
                            negrita = true;
                            i+=1;
                            if (texto.charAt(i+1)=='+') {
                                i+=1;
                                if (texto.charAt(i+1)=='S') {
                                    subrayado = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='K') {
                                            cursiva = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                                if (texto.charAt(i+1)=='K') {
                                    cursiva = true;
                                    i+=1;
                                    if (texto.charAt(i+1)=='+') {
                                        i+=1;
                                        if (texto.charAt(i+1)=='S') {
                                            subrayado = true;
                                            i+=1;
                                        }
                                    }
                                    else{                                
                                        break;
                                    }
                                }
                            }
                            else{                                
                                break;
                            }

                        }
                        if (texto.charAt(i+1)=='T') {
                            i+=1;
                            if(texto.charAt(i+1)== '1'){
                                i+=1;
                                if(texto.charAt(i+1)=='0'){
                                    System.out.println("tamaño = 0");
                                    tamaño = (float) 0.3;
                                    limite = (float) 3.5;
                                }
                                if(texto.charAt(i+1)=='2'){
                                    System.out.println("tamaño = 2");
                                    tamaño = (float) 0.5;
                                    limite = 2;
                                }
                                if(texto.charAt(i+1)=='4'){
                                    System.out.println("tamaño = 4");
                                    tamaño = (float) 0.7;
                                    limite = (float) 1.44;
                                }
                                if(texto.charAt(i+1)=='6'){
                                    System.out.println("tamaño = 6");
                                    tamaño = (float) 1.3;
                                    limite = (float) 0.75;
                                }
                                if(texto.charAt(i+1)=='8'){
                                    System.out.println("tamaño = 8");
                                    tamaño = (float) 1.5;
                                    limite = (float) 0.63;
                                } 
                            }
                        }
                        if (texto.charAt (i+1) == 'R'){
                            texto = " " + reves(texto);
                        }
                        
                        if(texto.charAt(i+1)=='M'){
                            int bandera2=0;
                            i+=1;
                            if(texto.charAt(i+1)=='('){
                                i+=1;
                                char []aux3 =texto.toCharArray();
                                for (int w = 0; w < aux3.length; w++) {
                                    if(Character.isDigit(aux3[w]) && bandera2==0){
                                        s+=aux3[w];                                
                                        i+=1;
                                    }
                                    if(aux3[w]==','){
                                        i+=1;
                                        bandera2++;
                                    }
                                    if(Character.isDigit(aux3[w]) && bandera2==1){
                                        i+=1;
                                        n+=aux3[w];
                                    }                              
                                }
                            }                            
                            if(texto.charAt(i+1)==')'){
                                x+=Integer.parseInt(s);
                                y+=Integer.parseInt(n);
                                i+=1;
                            }
                        }
                        if(texto.charAt(i+1) == 'E'){
                            i+=1;
                            if(texto.charAt(i+1)== 'Y'){
                               i+=1;
                               EspejoY = true;
                                x+=120;
                            }
                        }
                        
                        if (texto.charAt(i+1)=='A') {
                            i+=1;                            
                            angulo = digitos();
                            g2.rotate(Math.toRadians(angulo), x+50, y+100);
                            
                        }
                        
                        if (texto.charAt(i+1)=='a') {
                            i+=1;                                                        
                            angulo = angulodigitos(texto, i);
                            tmpangulo = angulo;
                            banderaang = true;
                            g2.rotate(Math.toRadians(angulo), x+50, y+100);                                                        
                        }
                           
                        break;
                    }
                    
                    default:{
                        break;
                    } 
                }    
            }
        }    
    }
    
    public static int angulodigitos(String texto, int k){        
        int ubicacion = k;        
        String lista = texto.substring(0, ubicacion+1);
        String invertir= texto.substring(ubicacion+1, texto.length());
        char []aux2 = invertir.toCharArray();
        String n = "";
        for(int i = 0; i<invertir.length();i++){
            if(Character.isDigit(aux2[i]) && invertir.charAt(i) != ' '){
                n+=aux2[i];
            }
            else{
                break;
            }
        }
        System.out.println(n);
        return Integer.parseInt(n);
    }
    
    
    public int digitos(){
        char []aux2 = texto.toCharArray(); 
        for (int j = 0; j < aux2.length; j++) {            
            if(Character.isDigit(aux2[j])){
                n+=aux2[j];
            }              
        }
        return Integer.parseInt(n);
    }        
    
    public static String reves(String texto){
        StringBuilder cadena1 = new StringBuilder(texto); 
        String invertido = cadena1.reverse().toString();
        String aux = "";
        String nueva = "";
        for(int i = 0; i<invertido.length();i++){ 
           if(invertido.charAt(i) == ' '){
               StringBuilder aux1 = new StringBuilder(aux);
               String inv = aux1.reverse().toString();
               nueva += inv + " ";
               aux = "";
           }
           else{
                aux += invertido.charAt(i);
           }
        }
        return nueva;
    }
    
    public static boolean verificadorsubrayado(String texto, int i){
        boolean bandera = false;
        for(int j = i+1; j<texto.length();j++){
             if(texto.charAt(j)=='^'){
                if(texto.charAt(j+1)=='S'){
                    bandera = true;
                    break;
                }
                    
                if(texto.charAt(j+1) == 'K'){
                    j++;
                    if(texto.charAt(j+1) == '+'){
                        j++;
                        if(texto.charAt(j+1)== 'S'){
                            bandera = true;
                            break;
                        }
                        if(texto.charAt(j+1)== 'N'){
                            j++;
                            if(texto.charAt(j+1)== '+'){
                                j++;
                                if(texto.charAt(j+1) == 'S'){
                                    bandera = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                if(texto.charAt(j+1) == 'N'){
                    j++;
                    if(texto.charAt(j+1) == '+'){
                        j++;
                        if(texto.charAt(j+1)== 'S'){
                            bandera = true;
                        }
                        if(texto.charAt(j+1)== 'K'){
                            j++;
                            if(texto.charAt(j+1)== '+'){
                                j++;
                                if(texto.charAt(j+1) == 'S'){
                                    bandera = true;                                }
                            }
                        }
                    }
                }
            }
            else if(texto.charAt(j) == ' '){ 
            }
            else{
                break;
            }
                
        }
        return bandera;    
    }
       
}
