/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.SQLException;

/**
 *
 * @author sergiourzua
 */
public class ProyectoVendedor2 extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoVendedor2
     */
    public ProyectoVendedor2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ProyectoVendedor v = new ProyectoVendedor();
        ConexionDB c = new ConexionDB();
        System.out.println(v.id);
        String sql = "SELECT ClaveVendedor,Nombre,ApPaterno,ApMaterno,RFC FROM Proyecto.Vendedores WHERE ClaveVendedor = "
                      +v.id;
        c.consultar("Proyecto", "root", "", sql);
        String id = "";
        String Nombre = "";
        String RFC = "";
        try {
            while (c.datos.next()){
               id = String.valueOf(c.datos.getInt("ClaveVendedor"));
               Nombre = c.datos.getString("Nombre")+" "+c.datos.getString("ApPaterno")+" "+c.datos.getString("ApMaterno");
               RFC = c.datos.getString("RFC");
            }
            
        } catch (SQLException e) {
            id = Nombre = RFC = "Error al consultar datos";
        } finally {
            c.desconectar();
        }
        jLabelID.setText("ID: "+id);
        jLabelNombre.setText("Nombre: "+Nombre); 
        jLabelRFC.setText("RFC: "+RFC); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonAlta = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelTitulo.setText("Menu de Vendedor");

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");

        jButtonConsultar.setText("Consultar");

        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabelFondo.setText("jLabel1");

        jLabelID.setText("jLabel1");

        jLabelNombre.setText("jLabel2");

        jLabelRFC.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerrarSesion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFondo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAlta)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultar))
                            .addComponent(jLabelTitulo)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelRFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelFondo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRFC)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlta)
                    .addComponent(jButtonVender)
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButtonCerrarSesion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        ProyectoP p = new ProyectoP();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        ProyectoVendedor3 p = new ProyectoVendedor3();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAltaActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProyectoVendedor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
