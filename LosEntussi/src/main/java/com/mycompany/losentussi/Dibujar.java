package com.mycompany.losentussi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Pipe, Juano, Lázaro
 */
public class Dibujar{   
    
    public static String txtadibujar = "";
    public static String color = "";
    static int w = 1300;
    static int h = 1080;
    static DibujarCanvas dc;
    
    
    public static void main(String[] args){
        
        Button Convertir;
        Button Borrar;
        Choice menu;
        
        Convertir = new Button("Convertir");
        Convertir.setBounds(1050, 700, 100, 22);
        Borrar = new Button("Borrar");
        Borrar.setBounds(1170, 700, 100, 22);
        menu = new Choice();
        menu.setBounds(1170, 10, 100, 20);
        menu.add("Negro");
        menu.add("Rojo");
        menu.add("Azul");
        menu.add("Amarillo");
        menu.add("Verde");
        menu.add("Naranjo");
        menu.add("Morado");
        menu.add("Rosado");
        menu.add("Celeste");
        menu.add("Blanco");
        TextField t1 = new TextField("");
        t1.setBounds(10, 700, 1000, 22);  
        JFrame f = new JFrame();
        
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.setResizable(false);
        f.add(Convertir);
        f.add(Borrar);
        f.add(menu);
        Borrar.setEnabled(false);
        f.add(t1);
        cargarDC(f,txtadibujar, color);
       
        ActionListener accionConvertir= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = t1.getText();
                Convertir.setEnabled(false);
                Borrar.setEnabled(true);   
                color = menu.getItem(menu.getSelectedIndex());
                cargarDC(f, txtadibujar, color);
            }
        };
                       
        Convertir.addActionListener(accionConvertir);
        
        ActionListener accionBorrar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = "";
                t1.setText("");
                dc.setVisible(false);
                Convertir.setEnabled(true);
                Borrar.setEnabled(false);
            }
        };
        Borrar.addActionListener(accionBorrar);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void cargarDC(Frame f, String txtadibujar, String color){
        dc = new DibujarCanvas(w,h,txtadibujar, color);
        f.add(dc);
        f.setVisible(true);
    }    
}
