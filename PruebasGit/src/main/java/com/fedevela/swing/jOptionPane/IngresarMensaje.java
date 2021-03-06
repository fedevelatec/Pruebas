package com.fedevela.swing.jOptionPane;


/**
 *
 * @author fvelazquez
 */
public class IngresarMensaje extends javax.swing.JDialog {
    
    private String comentarios;
    private Boolean aceptar = false;

    /**
     * Creates new form IngresarMensaje
     */
    public IngresarMensaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String getComentarios() {
        return comentarios;
    }

    public Boolean getAceptar() {
        return aceptar;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlErrores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaErrores = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaComentarios = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jlErrores.setText("Errores Encontrados:");

        jtaErrores.setColumns(20);
        jtaErrores.setRows(5);
        jScrollPane1.setViewportView(jtaErrores);

        jLabel1.setText("Comentarios:");

        jtaComentarios.setColumns(20);
        jtaComentarios.setRows(5);
        jScrollPane2.setViewportView(jtaComentarios);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlErrores)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlErrores)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        comentarios = jtaComentarios.getText();
        aceptar = true;
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
////    public static void main(String args[]) {
////        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(IngresarMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(IngresarMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(IngresarMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(IngresarMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
////
////        /* Create and display the dialog */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                IngresarMensaje dialog = new IngresarMensaje(new javax.swing.JFrame(), true);
////                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
////                    @Override
////                    public void windowClosing(java.awt.event.WindowEvent e) {
////                        System.exit(0);
////                    }
////                });
////                dialog.setVisible(true);
////            }
////        });
////    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlErrores;
    private javax.swing.JTextArea jtaComentarios;
    private javax.swing.JTextArea jtaErrores;
    // End of variables declaration//GEN-END:variables
}
