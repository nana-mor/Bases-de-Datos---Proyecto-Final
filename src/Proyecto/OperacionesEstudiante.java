package Proyecto;

public class OperacionesEstudiante extends javax.swing.JFrame {

    
     BlankSpace blankSpace;
     AlumnoInscribirMaterias alumnoInscribirMaterias;
     AlumnoVerMaterias alumnoVerMaterias;
     AlumnoRealizarEntregas alumnoRealizarEntregas;
     AlumnoVerEntregas alumnoVerEntregas;
     
     
    public OperacionesEstudiante() {
        
        initComponents();
        
        blankSpace = new BlankSpace();
        blankSpace.setBounds(0, 0, 800, 475);
        add(blankSpace);
        blankSpace.setVisible(true);
        
        alumnoInscribirMaterias = new AlumnoInscribirMaterias();
        alumnoInscribirMaterias.setBounds(0, 0, 800, 475);
        add(alumnoInscribirMaterias);
        alumnoInscribirMaterias.setVisible(false);
        
        alumnoVerMaterias = new AlumnoVerMaterias();
        alumnoVerMaterias.setBounds(0, 0, 800, 475);
        add(alumnoVerMaterias);
        alumnoVerMaterias.setVisible(false);
        
        alumnoRealizarEntregas = new AlumnoRealizarEntregas();
        alumnoRealizarEntregas.setBounds(0, 0, 800, 475);
        add(alumnoRealizarEntregas);
        alumnoRealizarEntregas.setVisible(false);
        
        alumnoVerEntregas = new AlumnoVerEntregas();
        alumnoVerEntregas.setBounds(0, 0, 800, 475);
        add(alumnoVerEntregas);
        alumnoVerEntregas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        InscribirMaterias = new javax.swing.JMenu();
        InscribirMateria = new javax.swing.JMenuItem();
        VerMateria = new javax.swing.JMenuItem();
        VerMaterias = new javax.swing.JMenu();
        RealizarEntrega = new javax.swing.JMenuItem();
        VerEntrega = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InscribirMaterias.setText("Inscripciones");
        InscribirMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InscribirMaterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InscribirMaterias.setMinimumSize(new java.awt.Dimension(80, 24));
        InscribirMaterias.setPreferredSize(new java.awt.Dimension(150, 24));
        InscribirMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InscribirMateriasMouseClicked(evt);
            }
        });
        InscribirMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirMateriasActionPerformed(evt);
            }
        });

        InscribirMateria.setText("Inscribirse a una Materia");
        InscribirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscribirMateriaActionPerformed(evt);
            }
        });
        InscribirMaterias.add(InscribirMateria);

        VerMateria.setText("Consultar Inscripción");
        VerMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMateriaActionPerformed(evt);
            }
        });
        InscribirMaterias.add(VerMateria);

        jMenuBar1.add(InscribirMaterias);

        VerMaterias.setText("Entregas");
        VerMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VerMaterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VerMaterias.setPreferredSize(new java.awt.Dimension(150, 24));

        RealizarEntrega.setText("Realizar una entrega");
        RealizarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarEntregaActionPerformed(evt);
            }
        });
        VerMaterias.add(RealizarEntrega);

        VerEntrega.setText("Ver entregas");
        VerEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEntregaActionPerformed(evt);
            }
        });
        VerMaterias.add(VerEntrega);

        jMenuBar1.add(VerMaterias);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InscribirMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscribirMateriasMouseClicked
        
    }//GEN-LAST:event_InscribirMateriasMouseClicked

    private void InscribirMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirMateriasActionPerformed

        
    }//GEN-LAST:event_InscribirMateriasActionPerformed

    private void InscribirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscribirMateriaActionPerformed
        blankSpace.setVisible(false);
        alumnoInscribirMaterias.setVisible(true);
        alumnoVerMaterias.setVisible(false);
        alumnoRealizarEntregas.setVisible(false);
        alumnoVerEntregas.setVisible(false);
    }//GEN-LAST:event_InscribirMateriaActionPerformed

    private void VerMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMateriaActionPerformed
        blankSpace.setVisible(false);
        alumnoInscribirMaterias.setVisible(false);
        alumnoVerMaterias.setVisible(true);
        alumnoRealizarEntregas.setVisible(false);
        alumnoVerEntregas.setVisible(false);
    }//GEN-LAST:event_VerMateriaActionPerformed

    private void RealizarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarEntregaActionPerformed
        blankSpace.setVisible(false);
        alumnoInscribirMaterias.setVisible(false);
        alumnoVerMaterias.setVisible(false);
        alumnoRealizarEntregas.setVisible(true);
        alumnoVerEntregas.setVisible(false);
    }//GEN-LAST:event_RealizarEntregaActionPerformed

    private void VerEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEntregaActionPerformed
        blankSpace.setVisible(false);
        alumnoInscribirMaterias.setVisible(false);
        alumnoVerMaterias.setVisible(false);
        alumnoRealizarEntregas.setVisible(false);
        alumnoVerEntregas.setVisible(true);
    }//GEN-LAST:event_VerEntregaActionPerformed

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
            java.util.logging.Logger.getLogger(OperacionesEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InscribirMateria;
    private javax.swing.JMenu InscribirMaterias;
    private javax.swing.JMenuItem RealizarEntrega;
    private javax.swing.JMenuItem VerEntrega;
    private javax.swing.JMenuItem VerMateria;
    private javax.swing.JMenu VerMaterias;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
