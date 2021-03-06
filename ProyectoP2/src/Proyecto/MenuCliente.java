/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.SQLException;

/**
 *
 * @author magar
 */
public class MenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        ConsultarCliente co = new ConsultarCliente();
        ConexionDB c = new ConexionDB();
        String sql = "SELECT Clave,Nombre,ApPaterno,ApMaterno,RFC FROM Proyecto.Clientes WHERE Clave = "
                      +co.id;
        c.consultar("Proyecto", "root", "", sql);
        String id = "";
        String Nombre = "";
        String RFC = "";
        try {
            while (c.datos.next()){
               id = String.valueOf(c.datos.getInt("Clave"));
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

        MenuCliente = new javax.swing.JLabel();
        ButtonRegresar = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        ButtonCatalogo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuCliente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuCliente.setText("Menu de Cliente");
        getContentPane().add(MenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, 291, -1));

        ButtonRegresar.setText("Regresar");
        ButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 77, -1, -1));

        jButtonCerrarSesion.setText("Cerrar Sesion");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        ButtonCatalogo.setText("Catálogo");
        ButtonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCatalogoActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 118, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabelID.setText("jLabel1");

        jLabelNombre.setText("jLabel1");

        jLabelRFC.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRFC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarActionPerformed
        ProyectoP p = new ProyectoP();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonRegresarActionPerformed

    private void ButtonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCatalogoActionPerformed
        Catalogo cat= new Catalogo();
        cat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCatalogoActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        ConsultarCliente c = new ConsultarCliente();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCatalogo;
    private javax.swing.JButton ButtonRegresar;
    private javax.swing.JLabel MenuCliente;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
