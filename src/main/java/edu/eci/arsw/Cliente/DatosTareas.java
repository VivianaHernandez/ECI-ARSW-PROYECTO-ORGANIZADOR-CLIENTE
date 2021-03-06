package edu.eci.arsw.Cliente;

import edu.eci.arsw.CalendarioComun.Documento;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;

public class DatosTareas extends javax.swing.JFrame {
    private TColaborativa tc;
    private TInformativa ti;
    private Documento doc;
    private Calendario c;
    
    public DatosTareas() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(415, 415);
        setResizable(false);        
    }

    DatosTareas(TColaborativa tc,Calendario c) {
        this.c=c;
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(415, 415);
        setResizable(false);
        this.tc=tc;
        nomTarea.setText(tc.getNombre());
        descTarea.setText(tc.getDescripcion());
        tipo.setText("Colaborativa");
        dia.setText(tc.getFecha().getDia()+"");
        mes.setText(tc.getFecha().getMes()+"");
        anio.setText(tc.getFecha().getAnio()+"");
        //tc.getDoc().setVisible(true);
        //doc.setVisibles(true);
    }

    DatosTareas(TInformativa ti,Calendario c) {
        this.c=c;
        initComponents();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(415, 415);
        setResizable(false);
        this.ti=ti;
        nomTarea.setText(ti.getNombre());
        descTarea.setText(ti.getDescripcion());
        tipo.setText("Informativa");
        dia.setText(ti.getFecha().getDia()+"");
        mes.setText(ti.getFecha().getMes()+"");
        anio.setText(ti.getFecha().getAnio()+"");
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomTarea = new javax.swing.JLabel();
        descTarea = new javax.swing.JLabel();
        dia = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        anio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setText("Nombre de la tarea");

        jLabel2.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("Descripción de la tarea ");

        jLabel3.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 153));
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 153));
        jLabel4.setText("Día");

        jLabel5.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 153));
        jLabel5.setText("Mes ");

        jLabel6.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 153));
        jLabel6.setText("Año");

        nomTarea.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        nomTarea.setForeground(new java.awt.Color(102, 0, 102));
        nomTarea.setText("       ");

        descTarea.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        descTarea.setForeground(new java.awt.Color(102, 0, 102));
        descTarea.setText("      ");

        dia.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        dia.setForeground(new java.awt.Color(102, 0, 102));
        dia.setText("       ");

        mes.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        mes.setForeground(new java.awt.Color(102, 0, 102));
        mes.setText("     ");

        anio.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        anio.setForeground(new java.awt.Color(102, 0, 102));
        anio.setText("        ");

        jLabel7.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 153));
        jLabel7.setText("Tipo de la tarea");

        tipo.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        tipo.setForeground(new java.awt.Color(102, 0, 102));
        tipo.setText("       ");

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 255));
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Curlz MT", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 255));
        jButton2.setText("Volver ");
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
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(anio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(dia))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(nomTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTarea)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descTarea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tipo))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dia)))
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(anio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       EdicionCalendario ec; 
        if("Colaborativa".equals(tipo.getText())){
        ec=new EdicionCalendario(tc,c);
        }
         if("Informativa".equals(tipo.getText())){
        ec=new EdicionCalendario(ti,c);
        }
         this.setVisible(false);
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        c.setVisible(true);  
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anio;
    private javax.swing.JLabel descTarea;
    private javax.swing.JLabel dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mes;
    private javax.swing.JLabel nomTarea;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
