package com.mycompany.losentussi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Pipe, Juano, Lázaro
 * 
 *      Cosas que tengo que hacer: 
 *  ScrollBar
 *  Rotación de las palabras
 *  
 *  
 */

public class Dibujar{   
    
    //Variables:
    public static String txtadibujar = "";
    public static String aux = txtadibujar;
    public static String color = "";
    static int w = 1300;
    static int h = 1080;
    static DibujarCanvas dc;
    public static boolean bandera = false;
    public static boolean puntosdecontrol = false;
    
    
    public static void main(String[] args){
        //Variables de la Intefaz:
        
        Button Borrar;
        Button Puntos;
        Choice menu;
        
        //Dimensiones de los botones:
        
        Borrar = new Button("Borrar");
        Borrar.setBounds(1050, 700, 100, 22);        
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
        t1.setBounds(10, 690, 1000, 32); 
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        JFrame f = new JFrame();
        
        
        //Agregación para la interfaz
        
        f.setSize(w,h);
        f.setTitle("Conversor de Scripts");
        //f.setResizable(false);
        f.add(Borrar);
        f.add(Puntos);
        f.add(menu);        
        f.add(t1);
        
        
        cargarDC(f,txtadibujar, color, bandera);
        
        
        KeyListener EventosdeTeclado = new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e) { 
            }

            @Override
            public void keyPressed(KeyEvent e) {  
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                dc.setVisible(false);
                color = menu.getItem(menu.getSelectedIndex());                                 
                aux = t1.getText();
                txtadibujar = ""; 
                dc.setVisible(false);
                txtadibujar = aux;                    
                cargarDC(f,txtadibujar, color, bandera);                
                if (txtadibujar.isEmpty()) {
                    //System.out.println("no hay nada");
                }
                          
            }  
        };  
        
        t1.addKeyListener(EventosdeTeclado);                
        
        ActionListener accionBorrar= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){                
                txtadibujar = "";
                t1.setText("");
                bandera = false;
                dc.setVisible(false);
            }
        };
        Borrar.addActionListener(accionBorrar);

        ActionListener accionPuntos= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){                
                if (puntosdecontrol == false) {
                    puntosdecontrol = true;
                    dc.setVisible(false);
                    bandera = true;                      
                    cargarDC(f, txtadibujar, color, bandera);                    
                }
                else{
                    puntosdecontrol = false;
                    aux = t1.getText();
                    txtadibujar = ""; 
                    dc.setVisible(false);
                    txtadibujar = aux;  
                    bandera = false;                   
                    cargarDC(f,txtadibujar, color, bandera);                                                                                                 
                }
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
