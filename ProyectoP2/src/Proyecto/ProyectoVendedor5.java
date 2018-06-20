 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author INEGI
 */
public class ProyectoVendedor5 extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoVendedor5
     */
    public ProyectoVendedor5() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    private int i = 0;
    public static float precio = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldClave = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jRadioButtonCredito = new javax.swing.JRadioButton();
        jRadioButtonContado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Vender");

        jLabel2.setText("ID Articulo:");

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Modelo", "Serie", "Descripcion", "Precio Costo", "Precio Venta", "En existencia", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableMostrar);

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jRadioButtonCredito.setText("Credito");

        jRadioButtonContado.setText("Contado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButtonRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonAgregar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonContado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonCredito)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonVender)))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonRegresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVender)
                    .addComponent(jRadioButtonCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonContado)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        String id;
        id = jTextFieldClave.getText();
        ConexionDB c = new ConexionDB();
        String sql = "SELECT * FROM Proyecto.Inventario WHERE Clave ="+id;
        c.consultar("Proyecto", "root", "", sql);
        try {
            while (c.datos.next()){
                jTableMostrar.setValueAt(c.datos.getInt("Clave"), i, 0);
                jTableMostrar.setValueAt(c.datos.getString("Modelo"), i, 1);
                jTableMostrar.setValueAt(c.datos.getInt("Serie"), i, 2);
                jTableMostrar.setValueAt(c.datos.getString("Descripcion"), i, 3);
                jTableMostrar.setValueAt(c.datos.getFloat("PrecioCosto"), i, 4);
                jTableMostrar.setValueAt(c.datos.getFloat("PrecioVenta"), i, 5);
                jTableMostrar.setValueAt(c.datos.getString("Existencia"), i, 6);
            }
            i++;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo hacer la consulta", "Error", ERROR_MESSAGE);
        } finally {
            c.desconectar();
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        ProyectoVendedor2 v = new ProyectoVendedor2();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        precio = 0;
        for (int j = 0; j < i; j++) {
            Integer cant = Integer.parseInt(jTableMostrar.getValueAt(j, 7).toString());
            Integer exis = Integer.parseInt(jTableMostrar.getValueAt(j, 6).toString());
            if (exis>=cant) {
                precio += Float.parseFloat(jTableMostrar.getValueAt(j, 5).toString())*Float.parseFloat(jTableMostrar.getValueAt(j, 7).toString());
                if (jRadioButtonContado.isSelected()) {
                    precio -= precio*0.10;     
                }
                ProyectoVendedor6 v = new ProyectoVendedor6();
                Integer ncant = exis - cant;
                ConexionDB c = new ConexionDB();
                String sql = "UPDATE Proyecto.Inventario SET Existencia = "+ncant+" WHERE Clave = "+jTableMostrar.getValueAt(j, 0);
                c.actulizar("Proyecto", "root", "", sql);
                v.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "En el articulo de ID: "+jTableMostrar.getValueAt(j, 0)+" exede las existencias", "Informacion", WARNING_MESSAGE);
            } 
        }
        
        
    }//GEN-LAST:event_jButtonVenderActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoVendedor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProyectoVendedor5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonContado;
    private javax.swing.JRadioButton jRadioButtonCredito;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTextField jTextFieldClave;
    // End of variables declaration//GEN-END:variables
}
