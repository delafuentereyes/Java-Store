/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import Clases.datosLogin;
import Lógica.componentes;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblUsuarioP = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblCandado = new javax.swing.JLabel();
        txtpassContraseña = new javax.swing.JPasswordField();
        lblUsua = new javax.swing.JLabel();
        rsbtnLogin = new rsbuttom.RSButtonMetro();
        rsbtnRegistrarse = new rsbuttom.RSButtonMetro();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuarioP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        pnlPrincipal.add(lblUsuarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 30));

        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 30));

        lblCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        pnlPrincipal.add(lblCandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 30));

        txtpassContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlPrincipal.add(txtpassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, 30));

        lblUsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarioG.png"))); // NOI18N
        pnlPrincipal.add(lblUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 140));

        rsbtnLogin.setBackground(new java.awt.Color(0, 0, 0));
        rsbtnLogin.setText("Login");
        rsbtnLogin.setColorHover(new java.awt.Color(102, 0, 102));
        rsbtnLogin.setColorNormal(new java.awt.Color(0, 0, 0));
        rsbtnLogin.setColorTextHover(new java.awt.Color(102, 0, 102));
        rsbtnLogin.setColorTextPressed(new java.awt.Color(102, 0, 102));
        rsbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnLoginActionPerformed(evt);
            }
        });
        pnlPrincipal.add(rsbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 30));

        rsbtnRegistrarse.setBackground(new java.awt.Color(0, 0, 0));
        rsbtnRegistrarse.setText("Registrarse");
        rsbtnRegistrarse.setColorHover(new java.awt.Color(102, 0, 102));
        rsbtnRegistrarse.setColorNormal(new java.awt.Color(0, 0, 0));
        rsbtnRegistrarse.setColorTextHover(new java.awt.Color(102, 0, 102));
        rsbtnRegistrarse.setColorTextPressed(new java.awt.Color(102, 0, 102));
        rsbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnRegistrarseActionPerformed(evt);
            }
        });
        pnlPrincipal.add(rsbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 140, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo login.png"))); // NOI18N
        pnlPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rsbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnRegistrarseActionPerformed
        // Ir a la ventana de registro
        Registro r = new Registro();
        r.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_rsbtnRegistrarseActionPerformed

    private void rsbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnLoginActionPerformed
        // Iniciar sesión
        String usuario = txtUsuario.getText();
        String contraseña = String.valueOf(txtpassContraseña.getText());
        
        boolean inicio = true;
        
        for (datosLogin i : componentes.usuarios) {
            if (i.getUsuario().equals(usuario) && i.getContraseña().equals(contraseña)) {
                componentes.rol = i.getRoles();
                inicio = true;
                break;
            }else{
                inicio = false;
            }
        }
        if (inicio) {
            ProyectoFinal p = new ProyectoFinal();
            p.setVisible(true);
            
            dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "El usuario ingresado no existe. Intente de nuevo");
        }
    }//GEN-LAST:event_rsbtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCandado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblUsua;
    private javax.swing.JLabel lblUsuarioP;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro rsbtnLogin;
    private rsbuttom.RSButtonMetro rsbtnRegistrarse;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassContraseña;
    // End of variables declaration//GEN-END:variables
}
