/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.losentussi;

import java.awt.*;
import java.awt.geom.Path2D;

/**
 *
 * @author Pipe
 */
public class CD extends javax.swing.JFrame{

    /**
     * Creates new form CD
     */
    public CD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        textField1 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de Script");

        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setLabel("Convertir");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(516, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CD().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2= (Graphics2D)g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        
        //Funcion a:
        Path2D.Double palito1 = new Path2D.Double();
        Path2D.Double curva1 = new Path2D.Double();
        Path2D.Double curva2 = new Path2D.Double();
        Path2D.Double palito2 = new Path2D.Double();
        palito1.moveTo(0, 143);
        palito1.curveTo(40, 143, 40, 100, 40, 100);
        curva1.moveTo(40, 100);
        curva1.curveTo(40, 40, 120, 40, 120, 100);
        curva2.moveTo(40, 100);
        curva2.curveTo(40, 160, 120, 160, 120, 100);
        palito2.moveTo(120, 100);
        palito2.curveTo(120, 100, 120, 143, 160, 143);
        g2.draw(palito1);
        g2.draw(curva1);
        g2.draw(curva2);
        g2.draw(palito2);
        
        //a2
        
        //Funcion a:
        Path2D.Double palito11 = new Path2D.Double();
        Path2D.Double curva11 = new Path2D.Double();
        Path2D.Double curva22 = new Path2D.Double();
        Path2D.Double palito22 = new Path2D.Double();
        palito11.moveTo(160, 143);
        palito11.curveTo(200, 143, 200, 100, 200, 100);
        curva11.moveTo(200, 100);
        curva11.curveTo(200, 40, 280, 40, 280, 100);
        curva22.moveTo(200, 100);
        curva22.curveTo(200, 160, 280, 160, 280, 100);
        palito22.moveTo(280, 100);
        palito22.curveTo(280, 100, 280, 143, 320, 143);
        g2.draw(palito11);
        g2.draw(curva11);
        g2.draw(curva22);
        g2.draw(palito22);
        
        
        //Funcion b:
        /*
        Path2D.Double b1 = new Path2D.Double();
        Path2D.Double b2 = new Path2D.Double();
        Path2D.Double b3 = new Path2D.Double();
        Path2D.Double b4 = new Path2D.Double();
        b1.moveTo(10, 143);
        b1.curveTo(25, 143, 35, 50,25 , 40);
        b2.moveTo(23,143);
        b2.curveTo(23,143, 20,45, 25, 40);
        b3.moveTo(23, 143);
        b3.curveTo(23, 143, 60, 80,30 , 100);
        b4.moveTo(30, 100);
        b4.curveTo(45,100,50, 110,60, 100);
        g2.draw(b1);
        g2.draw(b2);
        g2.draw(b3);
        g2.draw(b4);
        */
        
        //Funcion c:
        /*
        Path2D.Double c1 = new Path2D.Double();
        Path2D.Double c2 = new Path2D.Double();
        c1.moveTo(35,100);
        c1.curveTo(30, 115,30,148,70,143);
        c2.moveTo(20, 143);
        c2.curveTo(50,140,5,85, 68, 95);
        g2.draw(c1);
        g2.draw(c2);
        */    
        
        //Funcion d :
        /*
        Path2D.Double c1 = new Path2D.Double();
        Path2D.Double c2 = new Path2D.Double();
        c1.moveTo(35,100);
        c1.curveTo(30, 115,30,148,80,143);
        c2.moveTo(20, 143);
        c2.curveTo(50,140,5,85, 68, 95);
        c2.moveTo(80,143);
        c2.curveTo(80,143,60, 140,70, 20);
        g2.draw(c1);
        g2.draw(c2);
        */
        
        //Funcion e :
     
        /*
        Path2D.Double e1 = new Path2D.Double();
        Path2D.Double e2 = new Path2D.Double();
        e1.moveTo(10, 143);
        e1.curveTo(25, 143, 35,110,25 , 100);
        e2.moveTo(35,143);
        e2.curveTo(20,143, 15,100, 25, 100);
        g2.draw(e1);
        g2.draw(e2);
        */
        
        //Funcion f :
        /*
        Path2D.Double d1 = new Path2D.Double();
        Path2D.Double d2 = new Path2D.Double();
        Path2D.Double d3 = new Path2D.Double();
        Path2D.Double d4 = new Path2D.Double();
        d1.moveTo(10, 143);
        d1.curveTo(25, 143, 35, 50,25 , 60);
        d2.moveTo(25,170);
        d2.curveTo(20,143, 25,45, 27, 60);
        d3.moveTo(25,170);
        d3.curveTo(50,150,40,130,23,120);
        d4.moveTo(23,130);
        d4.curveTo(30,130, 50, 130, 60,120);
        g2.draw(d1);
        g2.draw(d2);
        g2.draw(d3);
        g2.draw(d4);*/
        
        // Funcion g:
        /*
        Path2D.Double g1 = new Path2D.Double();
        g1.moveTo(30,60);
        g1.curveTo(30,30,70,30,70,60);
        g1.moveTo(30,60);
        g1.curveTo(30,90,70,90,70,60);
        g1.moveTo(30,60);
        g1.curveTo(30,70,20,85,20,80);
        g1.moveTo(70,60);
        g1.curveTo(70,60,65,160,40,140);
        g1.moveTo(40,140);
        g1.curveTo(30,130,90,60,90,60);
        g2.draw(g1);
        */
        
        //Funcion h:
        /*
        Path2D.Double h = new Path2D.Double();
        h.moveTo(10,143);
        h.curveTo(15,135,30,60,20,50);
        h.moveTo(20,50);
        h.curveTo(10,60,20,135,20,143);
        h.moveTo(18,110);
        h.curveTo(60,100,30,143,70,143);
        g2.draw(h);
        */
        
       //Funcion i:
       /*
        Path2D.Double i = new Path2D.Double();
        i.moveTo(0,143);
        i.curveTo(0,143,35,143, 30, 60);
        i.moveTo(30,60);
        i.curveTo(30,143,60,143,60,140);
        g2.fillOval(25,40,10,10);
        g2.draw(i);
       */
        
       /*
        //Funcion j:
        
        Path2D.Double j = new Path2D.Double();
        j.moveTo(0, 143);
        j.curveTo(30, 143, 60, 110, 60, 55);
        j.moveTo(60, 55);
        j.curveTo(60, 55, 70, 180, 45, 180);
        j.moveTo(45, 180);
        j.curveTo(30, 185, 15, 180, 40, 150);
        j.moveTo(40, 150);
        j.curveTo(40, 150, 80, 140, 100, 143);
        g2.setColor(Color.black);
        g2.drawOval(55, 40, 10, 10);
        g2.draw(j);
        */
        
        /*
        //Funcion k:
        Path2D.Double k = new Path2D.Double();
        k.moveTo(0, 100);
        k.curveTo(100, 100, 20, -25, 50, 143);
        k.moveTo(43, 100);
        k.curveTo(43, 100, 70, 40, 80, 55);
        k.moveTo(43, 100);
        k.curveTo(50, 100, 70, 115, 70, 120);
        k.moveTo(70, 120);
        k.curveTo(78, 127, 80, 155, 100, 143);
        g2.draw(k);
        */
        
        /*
        //Funcion l:
        Path2D.Double l = new Path2D.Double();
        l.moveTo(0, 143);
        l.curveTo(40, 143, 60, 40, 40, 55);
        l.moveTo(40, 55);
        l.curveTo(25, 60, 20, 143, 80, 143);
        g2.draw(l);
        */
        
        /*
        //Funcion m:
        Path2D.Double m = new Path2D.Double();
        m.moveTo(0, 143);
        m.curveTo(35, 143, 25, 80, 40, 70);
        m.moveTo(40, 70);
        m.curveTo(70, 50, 70, 143, 70, 143);
        m.moveTo(70, 143);
        m.curveTo(70, 50, 110, 50, 110, 143);
        m.moveTo(110, 143);
        m.curveTo(110, 50, 150, 60, 150, 120);
        m.moveTo(150, 120);
        m.curveTo(150, 140, 145, 160, 190, 143);
        g2.draw(m);
        */
        
        /*
        //Funcion n:
        Path2D.Double n = new Path2D.Double();
        n.moveTo(0, 143);
        n.curveTo(35, 143, 25, 80, 40, 70);
        n.moveTo(40, 70);
        n.curveTo(70, 50, 70, 143, 70, 143);
        n.moveTo(70, 143);
        n.curveTo(70, 50, 110, 60, 110, 120);
        n.moveTo(110, 120);
        n.curveTo(110, 140, 105, 160, 150, 143);
        g2.draw(n);
        */
        
        /*
        //Funcion ñ:
        Path2D.Double ñ = new Path2D.Double();
        ñ.moveTo(0, 143);
        ñ.curveTo(35, 143, 25, 80, 40, 70);
        ñ.moveTo(40, 70);
        ñ.curveTo(70, 50, 70, 143, 70, 143);
        ñ.moveTo(70, 143);
        ñ.curveTo(70, 50, 110, 60, 110, 120);
        ñ.moveTo(110, 120);
        ñ.curveTo(110, 140, 105, 160, 150, 143);
        ñ.moveTo(30, 60);
        ñ.curveTo(60, 20, 80, 80, 110, 50);
        g2.draw(ñ);
        */
        
        /*
        //Funcion o: 
        Path2D.Double o = new Path2D.Double();
        o.moveTo(0, 143);
        o.curveTo(35, 143, 40, 110, 40, 90);
        o.moveTo(40, 100);
        o.curveTo(40, 40, 120, 40, 120, 100);
        o.moveTo(40, 100);
        o.curveTo(40, 160, 120, 160, 120, 100);
        o.moveTo(50, 69);
        o.curveTo(45, 100, 130, 105, 145, 70);
        g2.draw(o);
        */
        
        /*
        //Funcion p:
        Path2D.Double p = new Path2D.Double();
        p.moveTo(0, 143);
        p.curveTo(35, 143, 40, 110, 40, 90);
        p.moveTo(40, 90);
        p.curveTo(45, 110, 45, 170, 35, 180);
        p.moveTo(40, 90);
        p.curveTo(100, 50, 135, 145, 43, 143);
        p.moveTo(40, 130);
        p.curveTo(80, 120, 70, 160, 120, 143);
        p.moveTo(40, 130);
        p.curveTo(30, 135, 33, 145, 43, 143);
        g2.draw(p);
        */
        
        /*
        //Funcion q:
        Path2D.Double q = new Path2D.Double();
        q.moveTo(30,60);
        q.curveTo(30,30,70,30,70,60);
        q.moveTo(30,60);
        q.curveTo(30,90,70,90,70,60);
        q.moveTo(30,60);
        q.moveTo (70,60);
        q.curveTo(70,60,60,180,90,110);
        q.moveTo(90,110);
        q.curveTo(90,110,100,90,50,90);
        q.moveTo(50,90);
        q.curveTo(40,90,50,140,90,70);
        g2.draw(q);
        */
        
        //r
        /*
        Path2D.Double r = new Path2D.Double();
        r.moveTo(0, 143);
        r.curveTo(15, 140, 40,143, 40, 55);
        r.moveTo(40, 55);
        r.curveTo(45, 65, 115, 65, 120, 55);
        r.moveTo(120, 55);
        r.curveTo(120, 65, 120,143, 160, 143);
        g2.draw(r);*/
        
        //s
        /*
        Path2D.Double s = new Path2D.Double();
        s.moveTo(0, 143);
        s.curveTo(60, 143, 65,55, 65, 55);
        s.moveTo(65, 55);
        s.curveTo(140, 110, 130,125, 130, 143);
        s.moveTo(80, 140);
        s.curveTo(94, 147, 145,145, 155, 134);
        g2.draw(s);
        */
        
        //t
        /*
        Path2D.Double t = new Path2D.Double();
        t.moveTo(0,300);
        t.curveTo(20,290,30,300, 30, 150);
        t.moveTo(30,150);
        t.curveTo(30,300,40,290,60,300);
        t.moveTo(0,180);
        t.curveTo(0,180,60,180,60,180);
        g2.draw(t);*/
        
        //u
        /*
        Path2D.Double u =new Path2D.Double();
        u.moveTo(0,143);
        u.curveTo(0,143,30,143,30,55);
        u.moveTo(30,55);
        u.curveTo(20,174,140,174,130,55);
        u.moveTo(130,55);
        u.curveTo(130,55,130,143,160,143);
        g2.draw(u);*/
        
        //v
        /*
        Path2D.Double v =new Path2D.Double();
        v.moveTo(0,143);
        v.curveTo(20,143,15,55,40,55);
        v.moveTo(40,55);
        v.curveTo(65,55,60,143,80,143);
        v.moveTo(80,143);
        v.curveTo(100,143,110,55,110,55);
        v.moveTo(110,55);
        v.curveTo(115,60,155,60,160,55);
        g2.draw(v);*/
        
        //w
        /*
        Path2D.Double w =new Path2D.Double();
        w.moveTo(0,143);
        w.curveTo(20,143,15,55,40,55);
        w.moveTo(40,55);
        w.curveTo(65,55,60,143,80,143);
        w.moveTo(80,143);
        w.curveTo(120,153,110,55,110,55);
        w.moveTo(110,55);
        w.curveTo(110,55,100,153,140,143);       
        w.moveTo(140,143);
        w.curveTo(160,143,160,55,160,55);
        w.moveTo(160,55);
        w.curveTo(165,60,195,60,200,55);
        g2.draw(w);*/
        
        //x
        /*
        Path2D.Double x =new Path2D.Double();
        x.moveTo(0,143);
        x.curveTo(60,143,60,55,100,55);
        x.moveTo(0,55);
        x.curveTo(50,55,50,143,100,143);
        g2.draw(x);*/
        
        //y
        /*
        Path2D.Double  y =new Path2D.Double();
        y.moveTo(0,143);
        y.curveTo(0,143,30,143,30,55);
        y.moveTo(30,55);
        y.curveTo(20,174,80,138,80,138);
        y.moveTo(80,55);
        y.curveTo(80,55,80,200,80,200);
        y.moveTo(80,200);
        y.curveTo(80,225,40,225,40,200);
        y.moveTo(40,200);
        y.curveTo(40,180,60,143,120,143);
        g2.draw(y);*/
        
        //z
        /*
        Path2D.Double  z =new Path2D.Double();
        z.moveTo(20,143);
        z.curveTo(50,143,0,90,70,90);
        z.moveTo(70,90);
        z.curveTo(100,90,90,143,70,143);
        z.moveTo(70,143);
        z.curveTo(45,143,45,125,70,130);     
        z.moveTo(70,130);
        z.curveTo(100,140,110,175,100,200);
        z.moveTo(100,200);
        z.curveTo(95,220,60,220,60,200);
        z.moveTo(60,200);
        z.curveTo(60,185,100,150,120,143);
        g2.draw(z);*/
    }
}

