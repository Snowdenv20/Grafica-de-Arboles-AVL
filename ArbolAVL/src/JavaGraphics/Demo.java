/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Desarrollo
 */
public class Demo extends javax.swing.JFrame {

    int alto = 0;       
    int ancho = 0;
    
    public Demo() {
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

        jLabel1 = new javax.swing.JLabel();
        btnCuadrado = new javax.swing.JButton();
        btnCirculos = new javax.swing.JButton();
        btnLetras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnNodoRaiz = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GRÁFICOS EN JAVA");

        btnCuadrado.setText("Cuadrados");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnCirculos.setText("Circulos");
        btnCirculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculosActionPerformed(evt);
            }
        });

        btnLetras.setText("Letras");
        btnLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetrasActionPerformed(evt);
            }
        });

        jButton1.setText("Linea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNodoRaiz.setText("Nodo Raiz");
        btnNodoRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNodoRaizActionPerformed(evt);
            }
        });

        jButton2.setText("Graficos Recursivos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCirculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNodoRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(btnCuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCirculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLetras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNodoRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        
        Graphics g = this.getGraphics();
        super.paintComponents(g);
        int alto = 100;
        int ancho = 300;                       

        g.setColor(Color.yellow);
        //g.drawRect(0, 30, ancho, alto);
        g.drawRect((this.getWidth()/2) - (ancho / 2), 30, ancho, alto);
        //g.drawRect(this.getWidth()/2, this.getHeight()/2, 100, 100);

        alto = 200;
        ancho = 200;
        g.setColor(Color.green);
        g.fillRect((this.getWidth()/2) - (ancho / 2), (this.getHeight()/2) - (alto / 2), alto, ancho);                                      
        
        alto = 125;
        ancho = 125;
        int x = this.getHeight() - alto;
        int y = this.getWidth() - ancho;
        g.setColor(Color.red);
        g.fillRect(y, x, alto, ancho);                                      
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private int PintarCuadrado(Graphics g){
        try {
            if(alto > super.getHeight() || ancho > super.getWidth())
                return 0;
            
            alto += 2;
            ancho += 2;
            
            int a = (int) (Math.random()*255) + 1;
            int b = (int) (Math.random()*255) + 1;
            int c = (int) (Math.random()*255) + 1;
            
            int x = (int) (Math.random()*super.getWidth()) + 1;
            int y = (int) (Math.random()*super.getHeight()) + 1;
            
            g.setColor(new Color(a, b ,c));            
            g.drawRect(x, y, ancho, alto);
            TimeUnit.MILLISECONDS.sleep(10);
            
            PintarCuadrado(g);            
        } catch (Exception e) {
        }
        return 0;
    }
    private void btnCirculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculosActionPerformed
        try {
            
            Graphics g = this.getGraphics();
            super.paintComponents(g);
            
            g.setColor(Color.black);
            g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
            
            g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
            
            g.setColor(Color.yellow);
            g.drawOval(this.getWidth()/2, this.getHeight()/2, 100, 100);
            
            g.setColor(Color.green);
            g.fillArc(this.getWidth()/2 - 100, this.getHeight()/2, 100, 100, 0, 90);                        
            
            //dibujando un círculo al centro de la pantalla
            int ancho = 100;
            int alto = 100;
            g.setColor(Color.red);
            g.drawOval((this.getWidth()/2) - (ancho / 2), (this.getHeight()/2) - (alto / 2), ancho, alto);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCirculosActionPerformed

    private void btnLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetrasActionPerformed
        try {
            Graphics g = this.getGraphics();
            super.paintComponents(g);
            g.drawString("¡Hola Mundo!",250, 150);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLetrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try {
            Graphics g = this.getGraphics();
            super.paintComponents(g);
            g.drawLine(0, 0, this.getWidth(), this.getHeight());
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNodoRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNodoRaizActionPerformed
        try {
            
            int yInicial = 40;
            Graphics g = this.getGraphics();
            Graphics f = this.getGraphics();
            super.paintComponents(g);
            int alto = 50;
            int ancho = 50;                       
            
            g.drawOval((this.getWidth()/2)-(ancho/2), yInicial, ancho, alto);
            g.drawString("9", (this.getWidth()/2), yInicial+(ancho/2));
            
            g.drawOval((this.getWidth()/2)-(ancho/2), yInicial+80, ancho, alto);
            g.drawString("10", (this.getWidth()/2), yInicial +80 +(ancho/2));
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNodoRaizActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Graphics g = this.getGraphics();            
        super.paintComponents(g);
        alto = ancho = 0;
        
        PintarCuadrado(g);
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculos;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnLetras;
    private javax.swing.JButton btnNodoRaiz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}