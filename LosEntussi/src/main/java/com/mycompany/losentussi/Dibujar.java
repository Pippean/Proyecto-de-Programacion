package com.mycompany.losentussi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Pipe, Juano, Lázaro
 */
public class Dibujar{   
    
    //Variables:
    public static String txtadibujar = "";
    public static String color = "";
    static int w = 1300;
    static int h = 1080;
    static int remover = 0;
    static DibujarCanvas dc;
    public static boolean bandera = false;
    
    public static void main(String[] args){
        //Variables de la Intefaz:
        //Button Convertir;
        //Button Borrar;
        Button Puntos;
        Choice menu;
        
        //Dimensiones de los botones:
        //Convertir = new Button("Convertir");
        //Convertir.setBounds(1050, 700, 100, 22);
        //Borrar = new Button("Borrar");
        //Borrar.setBounds(1170, 700, 100, 22);
        
        Puntos = new Button("Puntos");
        Puntos.setBounds(1170, 700, 100, 22);
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
        
        KeyListener EventosdeTeclado = new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                dc.setVisible(false);
                txtadibujar = txtadibujar + String.valueOf(e.getKeyChar());
                remover+=1;
                cargarDC(f,txtadibujar, color, bandera);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                {                    
                    dc.setVisible(false);
                    txtadibujar = txtadibujar.substring(0,remover) + txtadibujar.substring(remover); //Se esta borrando la palabra pero no se actualiza la pantalla
                    cargarDC(f,txtadibujar, color, bandera);                    
                }
            }  
        };        
        
        t1.addKeyListener(EventosdeTeclado);
        
        
        //Agregación para la interfaz
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        f.setResizable(false);
        //f.add(Convertir);
        //f.add(Borrar);
        f.add(Puntos);
        f.add(menu);
        //Borrar.setEnabled(false);
        f.add(t1);
        
        cargarDC(f,txtadibujar, color, bandera);
        
        /*
        ActionListener accionConvertir= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtadibujar = t1.getText();
                //Convertir.setEnabled(false);
                //Borrar.setEnabled(true);   
                Puntos.setEnabled(true);
                t1.setEnabled(false);
                color = menu.getItem(menu.getSelectedIndex());
                cargarDC(f, txtadibujar, color, bandera);
            }
        };
                       
        //Convertir.addActionListener(accionConvertir);
        
        ActionListener accionBorrar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setEnabled(true);
                txtadibujar = "";
                t1.setText("");
                bandera = false;
                dc.setVisible(false);
                Convertir.setEnabled(true);
                Borrar.setEnabled(false);
                Puntos.setEnabled(false);
            }
        };
        Borrar.addActionListener(accionBorrar);
        
        */
        
        ActionListener accionPuntos= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dc.setVisible(false);
                bandera = true;
                cargarDC(f, txtadibujar, color, bandera);
            }
        };               
        Puntos.addActionListener(accionPuntos);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    //Funcion para cargar los datos al constructor:
    public static void cargarDC(Frame f, String txtadibujar, String color, boolean bandera){
        dc = new DibujarCanvas(w,h,txtadibujar, color, bandera);
        f.add(dc);
        f.setVisible(true);
    }
    
}
