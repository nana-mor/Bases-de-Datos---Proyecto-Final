package Proyecto;

public class OperacionesDirectivo extends javax.swing.JFrame {

    
     BlankSpace blankSpace;
     DirectivoAgregarMateria directivoAgregarMateria;
     DirectivoAgregarEstudiante directivoAgregarEstudiante;
     DirectivoAgregarProfesor directivoAgregarProfesor;
     DirectivoVerMaterias directivoVerMaterias;
     DirectivoVerEstudiantes directivoVerEstudiantes;
     DirectivoVerProfesores directivoVerProfesores;
     
    public OperacionesDirectivo() {
        
        initComponents();
        
        blankSpace = new BlankSpace();
        blankSpace.setBounds(0, 0, 800, 475);
        add(blankSpace);
        blankSpace.setVisible(true);
        
        directivoAgregarMateria = new DirectivoAgregarMateria();
        directivoAgregarMateria.setBounds(0, 0, 800, 475);
        add(directivoAgregarMateria);
        directivoAgregarMateria.setVisible(false);
        
        directivoAgregarEstudiante = new DirectivoAgregarEstudiante();
        directivoAgregarEstudiante.setBounds(0, 0, 800, 475);
        add(directivoAgregarEstudiante);
        directivoAgregarEstudiante.setVisible(false);
        
        directivoAgregarProfesor = new DirectivoAgregarProfesor();
        directivoAgregarProfesor.setBounds(0, 0, 800, 475);
        add(directivoAgregarProfesor);
        directivoAgregarProfesor.setVisible(false);
        
        directivoVerMaterias = new DirectivoVerMaterias();
        directivoVerMaterias.setBounds(0, 0, 800, 475);
        add(directivoVerMaterias);
        directivoVerMaterias.setVisible(false);
        
        directivoVerEstudiantes = new DirectivoVerEstudiantes();
        directivoVerEstudiantes.setBounds(0, 0, 800, 475);
        add(directivoVerEstudiantes);
        directivoVerEstudiantes.setVisible(false);
        
        directivoVerProfesores = new DirectivoVerProfesores();
        directivoVerProfesores.setBounds(0, 0, 800, 475);
        add(directivoVerProfesores);
        directivoVerProfesores.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Agregar = new javax.swing.JMenu();
        AgregarMateria = new javax.swing.JMenuItem();
        AgregarEstudiante = new javax.swing.JMenuItem();
        AgregarProfesor = new javax.swing.JMenuItem();
        Ver = new javax.swing.JMenu();
        VerMaterias = new javax.swing.JMenuItem();
        VerEstudiantes = new javax.swing.JMenuItem();
        VerProfesores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agregar.setText("Altas");
        Agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar.setMinimumSize(new java.awt.Dimension(80, 24));
        Agregar.setPreferredSize(new java.awt.Dimension(150, 24));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        AgregarMateria.setText("Agregar una Materia");
        AgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaActionPerformed(evt);
            }
        });
        Agregar.add(AgregarMateria);

        AgregarEstudiante.setText("Agregar un Estudiante");
        AgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEstudianteActionPerformed(evt);
            }
        });
        Agregar.add(AgregarEstudiante);

        AgregarProfesor.setText("Agregar un Profesor");
        AgregarProfesor.setToolTipText("");
        AgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProfesorActionPerformed(evt);
            }
        });
        Agregar.add(AgregarProfesor);

        jMenuBar1.add(Agregar);

        Ver.setText("Consultas");
        Ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ver.setPreferredSize(new java.awt.Dimension(150, 24));

        VerMaterias.setText("Ver Materias");
        VerMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMateriasActionPerformed(evt);
            }
        });
        Ver.add(VerMaterias);

        VerEstudiantes.setText("Ver estudiantes");
        VerEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstudiantesActionPerformed(evt);
            }
        });
        Ver.add(VerEstudiantes);

        VerProfesores.setText("Ver profesores");
        VerProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerProfesoresActionPerformed(evt);
            }
        });
        Ver.add(VerProfesores);

        jMenuBar1.add(Ver);

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

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        
    }//GEN-LAST:event_AgregarActionPerformed

    private void AgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMateriaActionPerformed

        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(true);
        directivoAgregarEstudiante.setVisible(false);
        directivoAgregarProfesor.setVisible(false);
        directivoVerMaterias.setVisible(false);
        directivoVerEstudiantes.setVisible(false);
        directivoVerProfesores.setVisible(false);
        
    }//GEN-LAST:event_AgregarMateriaActionPerformed

    private void AgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEstudianteActionPerformed
        
        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(false);
        directivoAgregarEstudiante.setVisible(true);
        directivoAgregarProfesor.setVisible(false);
        directivoVerMaterias.setVisible(false);
        directivoVerEstudiantes.setVisible(false);
        directivoVerProfesores.setVisible(false);
    }//GEN-LAST:event_AgregarEstudianteActionPerformed

    private void VerMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMateriasActionPerformed
        
        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(false);
        directivoAgregarEstudiante.setVisible(false);
        directivoAgregarProfesor.setVisible(false);
        directivoVerMaterias.setVisible(true);
        directivoVerEstudiantes.setVisible(false);
        directivoVerProfesores.setVisible(false);
        
    }//GEN-LAST:event_VerMateriasActionPerformed

    private void VerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstudiantesActionPerformed
        
        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(false);
        directivoAgregarEstudiante.setVisible(false);
        directivoAgregarProfesor.setVisible(false);
        directivoVerMaterias.setVisible(false);
        directivoVerEstudiantes.setVisible(true);
        directivoVerProfesores.setVisible(false);
        
    }//GEN-LAST:event_VerEstudiantesActionPerformed

    private void AgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProfesorActionPerformed
        
        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(false);
        directivoAgregarEstudiante.setVisible(false);
        directivoAgregarProfesor.setVisible(true);
        directivoVerMaterias.setVisible(false);
        directivoVerEstudiantes.setVisible(false);
        directivoVerProfesores.setVisible(false);
    }//GEN-LAST:event_AgregarProfesorActionPerformed

    private void VerProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerProfesoresActionPerformed
        blankSpace.setVisible(false);
        directivoAgregarMateria.setVisible(false);
        directivoAgregarEstudiante.setVisible(false);
        directivoAgregarProfesor.setVisible(false);
        directivoVerMaterias.setVisible(false);
        directivoVerEstudiantes.setVisible(false);
        directivoVerProfesores.setVisible(true);
    }//GEN-LAST:event_VerProfesoresActionPerformed

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
            java.util.logging.Logger.getLogger(OperacionesDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesDirectivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenuItem AgregarEstudiante;
    private javax.swing.JMenuItem AgregarMateria;
    private javax.swing.JMenuItem AgregarProfesor;
    private javax.swing.JMenu Ver;
    private javax.swing.JMenuItem VerEstudiantes;
    private javax.swing.JMenuItem VerMaterias;
    private javax.swing.JMenuItem VerProfesores;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
