/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectorcolor;

import java.awt.Color;

import javax.swing.JOptionPane;

/**
 *
 * @author Ma�ana
 */
@SuppressWarnings("serial")
public class VentanaColor extends javax.swing.JFrame {
      int nuevaR=0;
      int nuevaG=0;
      int nuevaB=0;
    /**
     * Creates new form VentanaColor
     */
    public VentanaColor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollRojo = new javax.swing.JScrollBar();
        txtRojo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        scrollVerde = new javax.swing.JScrollBar();
        txtVerde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        scrollAzul = new javax.swing.JScrollBar();
        txtAzul = new javax.swing.JTextField();
        btnRandom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("R");

        scrollRojo.setMaximum(265);
        scrollRojo.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrollRojo.setUnitIncrement(10);
        scrollRojo.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollRojoAdjustmentValueChanged(evt);
            }
        });

        txtRojo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRojo.setText("0");
        txtRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRojoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("G");

        scrollVerde.setMaximum(265);
        scrollVerde.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrollVerde.setUnitIncrement(10);
        scrollVerde.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollVerdeAdjustmentValueChanged(evt);
            }
        });

        txtVerde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVerde.setText("0");
        txtVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerdeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("B");

        scrollAzul.setMaximum(265);
        scrollAzul.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrollAzul.setUnitIncrement(10);
        scrollAzul.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollAzulAdjustmentValueChanged(evt);
            }
        });

        txtAzul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAzul.setText("0");
        txtAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAzulActionPerformed(evt);
            }
        });

        btnRandom.setText("Color Random");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(scrollAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(txtAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(scrollVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(scrollRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnRandom)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(33, 33, 33)
                .addComponent(btnRandom)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRojoActionPerformed
       //cuadro texto del rojo
        nuevaR = Integer.parseInt(txtRojo.getText());
        if (nuevaR<0 || nuevaR > 255){
            JOptionPane.showMessageDialog(this,"solo números entre 0 y 255");
        }else{
        scrollRojo.setValue(nuevaR);}
    }//GEN-LAST:event_txtRojoActionPerformed

    private void scrollRojoAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollRojoAdjustmentValueChanged
        // SCROLL ROJO
         nuevaR = scrollRojo.getValue();//coge el valor de la barra roja
        txtRojo.setText(String.valueOf(nuevaR));
        Color fondo = new Color(nuevaR,nuevaG,nuevaB);
        jPanel1.setBackground(fondo);
    }//GEN-LAST:event_scrollRojoAdjustmentValueChanged

    private void scrollVerdeAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollVerdeAdjustmentValueChanged
        // SCROLL VERDE
        nuevaG = scrollVerde.getValue();
        txtVerde.setText(String.valueOf(nuevaG));
        Color fondo = new Color(nuevaR,nuevaG,nuevaB);
        jPanel1.setBackground(fondo);
    }//GEN-LAST:event_scrollVerdeAdjustmentValueChanged

    private void scrollAzulAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollAzulAdjustmentValueChanged
        // SCROLL AZUL
        nuevaB = scrollAzul.getValue();
        txtAzul.setText(String.valueOf(nuevaB));
        Color fondo = new Color(nuevaR, nuevaG, nuevaB); 
        jPanel1.setBackground(fondo);
    }//GEN-LAST:event_scrollAzulAdjustmentValueChanged

    private void txtVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerdeActionPerformed
        // TXT VERDE        
        nuevaG = Integer.parseInt(txtVerde.getText());
        if(nuevaG<0 || nuevaG>255){
            JOptionPane.showMessageDialog(this,"solo n�meros entre 0 y 255");
        }else{
            scrollVerde.setValue(nuevaG);
        }
    }//GEN-LAST:event_txtVerdeActionPerformed

    private void txtAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAzulActionPerformed
        // TXT AZUL
        nuevaB = Integer.parseInt(txtAzul.getText());
        if(nuevaB<0 ||nuevaB>255 ){
            JOptionPane.showMessageDialog(this,"solo n�meros entre 0 y 255");
        }else{
            scrollAzul.setValue(nuevaB);
        }
    }//GEN-LAST:event_txtAzulActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        // COLOR RANDOM
        nuevaR = (int) Math.floor(Math.random()*255+1);
        nuevaG = (int) Math.floor(Math.random()*255+1);
        nuevaB = (int) Math.floor(Math.random()*255+1);
        Color fondo = new Color(nuevaR, nuevaG, nuevaB); 
        txtRojo.setText(String.valueOf(nuevaR));
        scrollRojo.setValue(nuevaR);
        txtVerde.setText(String.valueOf(nuevaG));
        scrollVerde.setValue(nuevaG);
        txtAzul.setText(String.valueOf(nuevaB));
        scrollAzul.setValue(nuevaB);
        jPanel1.setBackground(fondo);
        btnRandom.setForeground(fondo);
    }//GEN-LAST:event_btnRandomActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar scrollAzul;
    private javax.swing.JScrollBar scrollRojo;
    private javax.swing.JScrollBar scrollVerde;
    private javax.swing.JTextField txtAzul;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables
}
