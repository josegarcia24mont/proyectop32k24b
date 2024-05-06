/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;

/**
 *
 * @author visitante
 */
public class MdiGeneral extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiGeneral.MAXIMIZED_BOTH);
        this.setTitle("Ejemplo Capas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoAbrirSesion = new javax.swing.JMenuItem();
        mnuArchivoCerrarSesion = new javax.swing.JMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        mnuCatalogosMantenimiento = new javax.swing.JMenu();
        mnuCatalogosMantenimientosCursos = new javax.swing.JMenuItem();
        mnuCatalogosMantenimientosAlumnos = new javax.swing.JMenuItem();
        mnuCatalogosMantenimientosMaestros = new javax.swing.JMenuItem();
        mnuCatalogosMantenimientosCarreras = new javax.swing.JMenuItem();
        mnuProcesos = new javax.swing.JMenu();
        mnuReportes = new javax.swing.JMenu();
        mnuAyudas = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        mnuArchivoAbrirSesion.setText("Abrir Sesion");
        mnuArchivoAbrirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoAbrirSesionActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoAbrirSesion);

        mnuArchivoCerrarSesion.setText("Cerrar Sesion");
        mnuArchivo.add(mnuArchivoCerrarSesion);

        jMenuBar1.add(mnuArchivo);

        mnuCatalogos.setText("Catalogos");

        mnuCatalogosMantenimiento.setText("Mantenimientos");
        mnuCatalogosMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientoActionPerformed(evt);
            }
        });

        mnuCatalogosMantenimientosCursos.setText("Mantenimiento Cursos");
        mnuCatalogosMantenimientosCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosCursosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimiento.add(mnuCatalogosMantenimientosCursos);

        mnuCatalogosMantenimientosAlumnos.setText("Mantenimiento Alumnos");
        mnuCatalogosMantenimientosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosAlumnosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimiento.add(mnuCatalogosMantenimientosAlumnos);

        mnuCatalogosMantenimientosMaestros.setText("Mantenimiento Maestros");
        mnuCatalogosMantenimientosMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosMaestrosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimiento.add(mnuCatalogosMantenimientosMaestros);

        mnuCatalogosMantenimientosCarreras.setText("Mantenimiento Carreras");
        mnuCatalogosMantenimientosCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosCarrerasActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimiento.add(mnuCatalogosMantenimientosCarreras);

        mnuCatalogos.add(mnuCatalogosMantenimiento);

        jMenuBar1.add(mnuCatalogos);

        mnuProcesos.setText("Procesos");
        jMenuBar1.add(mnuProcesos);

        mnuReportes.setText("Reportes");
        jMenuBar1.add(mnuReportes);

        mnuAyudas.setText("Ayuda");
        jMenuBar1.add(mnuAyudas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientoActionPerformed

    private void mnuCatalogosMantenimientosCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosCursosActionPerformed
        // TODO add your handling code here:
        MantenimientoCursos ventana = new MantenimientoCursos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_mnuCatalogosMantenimientosCursosActionPerformed

    private void mnuArchivoAbrirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoAbrirSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArchivoAbrirSesionActionPerformed

    private void mnuCatalogosMantenimientosMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosMaestrosActionPerformed
        // TODO add your handling code here:
        MantenimientoMaestros ventana1 = new MantenimientoMaestros();
        jDesktopPane1.add(ventana1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana1.getSize();
        ventana1.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_mnuCatalogosMantenimientosMaestrosActionPerformed

    private void mnuCatalogosMantenimientosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosAlumnosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuCatalogosMantenimientosAlumnosActionPerformed

    private void mnuCatalogosMantenimientosCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosCarrerasActionPerformed
        // TODO add your handling code here:
        MantenimientoCarreras ventana = new MantenimientoCarreras();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2); 
    }//GEN-LAST:event_mnuCatalogosMantenimientosCarrerasActionPerformed

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
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoAbrirSesion;
    private javax.swing.JMenuItem mnuArchivoCerrarSesion;
    private javax.swing.JMenu mnuAyudas;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenu mnuCatalogosMantenimiento;
    private javax.swing.JMenuItem mnuCatalogosMantenimientosAlumnos;
    private javax.swing.JMenuItem mnuCatalogosMantenimientosCarreras;
    private javax.swing.JMenuItem mnuCatalogosMantenimientosCursos;
    private javax.swing.JMenuItem mnuCatalogosMantenimientosMaestros;
    private javax.swing.JMenu mnuProcesos;
    private javax.swing.JMenu mnuReportes;
    // End of variables declaration//GEN-END:variables
}
