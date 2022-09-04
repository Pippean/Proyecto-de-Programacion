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
    static int w = 850;
    static int h = 550;
    static DibujarCanvas dc;
    
    public static void main(String[] args){
        
        Button Convertir;
        Button Borrar;
        
        Convertir = new Button("Convertir");
        Convertir.setBounds(720, 480, 100, 22);
        Borrar = new Button("Borrar");
        Borrar.setBounds(615, 480, 100, 22);
        TextField t1 = new TextField("");
        t1.setBounds(10, 480, 600, 22);  
        JFrame f = new JFrame();
        
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.setResizable(false);
        f.add(Convertir);
        f.add(Borrar);
        Borrar.setEnabled(false);
        f.add(t1);
        cargarDC(f,txtadibujar);
       
        ActionListener accionConvertir= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = t1.getText();
                Convertir.setEnabled(false);
                Borrar.setEnabled(true);
                cargarDC(f, txtadibujar);
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
    
    public static void cargarDC(Frame f, String txtadibujar){
        dc = new DibujarCanvas(w,h,txtadibujar);
        f.add(dc);
        f.setVisible(true);
    }    
}
