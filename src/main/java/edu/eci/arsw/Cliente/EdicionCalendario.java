/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.CalendarioCaptureException;
import edu.eci.arsw.CalendarioComun.CalendarioCaptureStub;
import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

public class EdicionCalendario extends javax.swing.JFrame {

    public String nombre = " ";
    public String descripcion = " ";
    static TInformativa infor;
    static TColaborativa colab;
    static String tipo;
    public Calendario c;
    static CalendarioCaptureStub cs;

    public EdicionCalendario() {
        initComponents();
    }

    EdicionCalendario(TColaborativa colab,Calendario c) {
        this.colab = colab;
        this.c=c;
        cs=c.getStub();
        tipo = "Colaborativa";
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    EdicionCalendario(TInformativa infor,Calendario c) {
          this.c=c;
        this.infor = infor;
        cs=c.getStub();
        tipo = "Informativa";
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        informativa = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreOk = new javax.swing.JButton();
        descripcionOK = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informativa.setBackground(new java.awt.Color(102, 0, 102));
        informativa.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        informativa.setForeground(new java.awt.Color(255, 51, 255));
        informativa.setText("Aceptar");
        informativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informativaActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(102, 0, 102));
        jTextField1.setForeground(new java.awt.Color(204, 0, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(102, 0, 102));
        jTextField2.setForeground(new java.awt.Color(204, 0, 153));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 153));
        jLabel3.setText("Descripción");

        nombreOk.setBackground(new java.awt.Color(102, 0, 102));
        nombreOk.setFont(new java.awt.Font("Curlz MT", 0, 10)); // NOI18N
        nombreOk.setForeground(new java.awt.Color(255, 51, 255));
        nombreOk.setText("OK");
        nombreOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreOkActionPerformed(evt);
            }
        });

        descripcionOK.setBackground(new java.awt.Color(102, 0, 102));
        descripcionOK.setFont(new java.awt.Font("Curlz MT", 0, 14)); // NOI18N
        descripcionOK.setForeground(new java.awt.Color(255, 51, 255));
        descripcionOK.setText("OK");
        descripcionOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreOk)
                    .addComponent(descripcionOK))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informativa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombreOk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(descripcionOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(informativa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void nombreOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreOkActionPerformed
        nombre = jTextField1.getText();
        
        
    }//GEN-LAST:event_nombreOkActionPerformed

    private void descripcionOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionOKActionPerformed
        descripcion = jTextField2.getText();
    }//GEN-LAST:event_descripcionOKActionPerformed

    private void informativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informativaActionPerformed
      
        if ("Colaborativa".equals(tipo)) {
            colab.setNombre(nombre);
            colab.setDesripcion(descripcion);
            try {
                cs.enviarTareaColaborativa(colab);
            } catch (CalendarioCaptureException ex) {
                Logger.getLogger(EdicionCalendario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(EdicionCalendario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("Informativa".equals(tipo)) {
            infor.setNombre(nombre);
            infor.setDescripcion(descripcion);
            try {
                cs.enviarTareaInformativa(infor);
            } catch (CalendarioCaptureException ex) {
                Logger.getLogger(EdicionCalendario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(EdicionCalendario.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
       this.setVisible(false);
       
       c.setVisible(true);
    }//GEN-LAST:event_informativaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descripcionOK;
    private javax.swing.JButton informativa;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton nombreOk;
    // End of variables declaration//GEN-END:variables

}
