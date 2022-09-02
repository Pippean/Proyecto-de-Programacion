package com.mycompany.losentussi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Pipe, Juano, Lazaro
 */
public class Dibujar{   
    
    public static String txtadibujar;
    
    public static void main(String[] args){
        int w = 850;
        int h = 550;
        Button Convertir;
        Button Borrar;
        
        Convertir = new Button("Convertir");
        Convertir.setBounds(720, 480, 100, 22);
        Borrar = new Button("Borrar");
        Borrar.setBounds(615, 480, 100, 22);
        TextField t1 = new TextField("  ");
        t1.setBounds(10, 480, 600, 22);  
        JFrame f = new JFrame();
        DibujarCanvas dc = new DibujarCanvas(w,h);
        
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.add(Convertir);
        f.add(Borrar);
        Borrar.setEnabled(false);
        f.add(t1);
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        ActionListener accionConvertir= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = t1.getText();
                System.out.println(""+ txtadibujar);
                Convertir.setEnabled(false);
                f.add(dc);
                Borrar.setEnabled(true);
            }
        };
        Convertir.addActionListener(accionConvertir);
        
        ActionListener accionBorrar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = " ";
                System.out.println(txtadibujar);
                t1.setText("");
                Convertir.setEnabled(true);
                Borrar.setEnabled(false);
            }
        };
        Borrar.addActionListener(accionBorrar);
        
    }
    
    
    
}
