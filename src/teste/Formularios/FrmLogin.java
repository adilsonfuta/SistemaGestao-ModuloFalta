
package teste.Formularios;

import com.CONTROLLER.UsuarioCntr;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teste.Formularios.FrmPrincip;
import com.Modelos.Usuarios;

public class FrmLogin extends javax.swing.JFrame {
    Usuarios u=null;
    UsuarioCntr cntr=new UsuarioCntr();
    public FrmLogin() {
       
        initComponents();
        jPasswordField1.setText("");
        jPasswordField1.setCaretColor(Color.ORANGE);
        jComboBox1.setBackground(Color.ORANGE);
        cntr.MostrarCombo(jComboBox1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(31, 28, 28));
        btnLogin.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 158, 0));
        btnLogin.setText("Aceitar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 110, -1));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 240, -1));

        jPasswordField1.setForeground(new java.awt.Color(255, 102, 0));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setCaretColor(new java.awt.Color(255, 102, 0));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, 20));

        jButton1.setBackground(new java.awt.Color(39, 36, 36));
        jButton1.setForeground(new java.awt.Color(255, 150, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 40, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/login2.PNG"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 122, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       // this.AtivadOlOgin();
        this.InSystem();
    }//GEN-LAST:event_btnLoginActionPerformed

    public void InSystem() {
        String nome = this.jComboBox1.getSelectedItem().toString(); // preencher a combo
        String ssenha = this.jPasswordField1.getText();
        String Mods = null;
       // Usuarios u1 = new UsuarioCntr().EntrarSistema(nome, ssenha);
        Usuarios u = new UsuarioCntr().BuscaComum(nome);

        if (u.getUser().equals(nome) && u.getSenha().equals(ssenha)) {
            
            Mods = u.getModo();
            new FrmPrincip(nome,Mods).setVisible(true);
            ActionEvent evt = null;
            this.jButton1ActionPerformed(evt);
            
        } else {
            this.jPasswordField1.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Usuario e/ou Senha Invalidas", "Informacao", JOptionPane.INFORMATION_MESSAGE);
            jPasswordField1.setText("");
            this.jPasswordField1.setBackground(Color.WHITE);
        }
    }

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
