/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseg
 */
public class AsignacionCursoAMaestros extends javax.swing.JInternalFrame {
    
    private void mostrarReporte(String reporte) {
        JTextArea textArea = new JTextArea(reporte);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        JOptionPane.showMessageDialog(this, scrollPane, "Reporte de Cursos", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Creates new form AsignacionCursoAMaestros
     */
    public AsignacionCursoAMaestros() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursoAsignar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCursoAsignada = new javax.swing.JTable();
        btnAsignarCurso = new javax.swing.JButton();
        btnDesasignarCurso = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Asignación de Cursos");

        tablaCursoAsignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Programción III"},
                {"Programación II"},
                {"Programción I"},
                {"Lógica en Sistemas"},
                {"Física II"},
                {"Física I"},
                {"Métodos Númericos"},
                {"Contabilidad I"},
                {"Electrónica Análogica"},
                {"Introducción a Computación"}
            },
            new String [] {
                "Cursos a Asignar"
            }
        ));
        jScrollPane1.setViewportView(tablaCursoAsignar);

        tablaCursoAsignada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cursos Asignados"
            }
        ));
        jScrollPane2.setViewportView(tablaCursoAsignada);

        btnAsignarCurso.setText("🡪");
        btnAsignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCursoActionPerformed(evt);
            }
        });

        btnDesasignarCurso.setText("🡨");
        btnDesasignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesasignarCursoActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAsignarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnDesasignarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnGenerar)))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnGenerar)
                .addGap(36, 36, 36)
                .addComponent(btnAsignarCurso)
                .addGap(18, 18, 18)
                .addComponent(btnDesasignarCurso)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCursoActionPerformed
        DefaultTableModel modeloAsignar = new DefaultTableModel();
        modeloAsignar = new DefaultTableModel(new Object[]{"Cursos"}, 0);
        DefaultTableModel modeloAsignada = new DefaultTableModel();
        tablaCursoAsignada = new JTable(modeloAsignada);
        
         int selectedRow = tablaCursoAsignar.getSelectedRow();
                if (selectedRow != -1) {
                    Object curso = modeloAsignar.getValueAt(selectedRow, 0);
                    modeloAsignar.removeRow(selectedRow);
                    modeloAsignada.addRow(new Object[]{curso});
                
            }
      
    }//GEN-LAST:event_btnAsignarCursoActionPerformed

    private void btnDesasignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesasignarCursoActionPerformed
        DefaultTableModel modeloAsignada = new DefaultTableModel();
        tablaCursoAsignada = new JTable(modeloAsignada);
        DefaultTableModel modeloAsignar = new DefaultTableModel();
        modeloAsignar = new DefaultTableModel(new Object[]{"Cursos"}, 0);
        int selectedRow = tablaCursoAsignada.getSelectedRow();
                if (selectedRow != -1) {
                    Object curso = modeloAsignada.getValueAt(selectedRow, 0);
                    modeloAsignada.removeRow(selectedRow);
                    modeloAsignar.addRow(new Object[]{curso});
                
             }
       
    }//GEN-LAST:event_btnDesasignarCursoActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        DefaultTableModel modeloAsignada = new DefaultTableModel();
        tablaCursoAsignada = new JTable(modeloAsignada);
        DefaultTableModel modeloAsignar = new DefaultTableModel();
        modeloAsignar = new DefaultTableModel(new Object[]{"Cursos"}, 0);
        StringBuilder reporte = new StringBuilder("Reporte de Cursos Asignados:\n\n");
        for (int i = 0; i < modeloAsignada.getRowCount(); i++) {
            reporte.append(modeloAsignada.getValueAt(i, 0)).append("\n");
        }
        mostrarReporte(reporte.toString());
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarCurso;
    private javax.swing.JButton btnDesasignarCurso;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCursoAsignada;
    private javax.swing.JTable tablaCursoAsignar;
    // End of variables declaration//GEN-END:variables
}