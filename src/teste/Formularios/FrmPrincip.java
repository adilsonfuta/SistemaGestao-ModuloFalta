/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;


public class FrmPrincip extends javax.swing.JFrame {

    private  String usar_acao;
    private Color c; 
 
    public FrmPrincip() {
        initComponents();
    }

    public FrmPrincip(String v, String modo) {
        initComponents();
       
        jLabel3.setForeground(Color.black);
        jLabel3.setText("Usuario Logado:"+v);
        jLabel2.setText(modo);
        jLabel2.setForeground(Color.GREEN);
        jlabelModo.setText("Modo de Acesso:");
  
        this.usar_acao=modo;
        this.TestandoNiivelAcesso();
    }
    
     public String getUsar_acao() {
        return usar_acao;
    }

    public void setUsar_acao(String usar_acao) {
        this.usar_acao = usar_acao;
    }
    
    public void TestandoNiivelAcesso()
    {
        if(this.usar_acao.equals("Normal"))
        {
        //jButton1.setVisible(false);
        btnEstado.setVisible(false);
        //jButton3.setVisible(false);
        btnDefinicoes.setVisible(false);
        //jButton5.setVisible(false);
        
        } 
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jlabelModo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        btnGrafico = new javax.swing.JButton();
        btnDefinicoes = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, -1, -1));

        jlabelModo.setText("jlabel ");
        getContentPane().add(jlabelModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, -1, -1));

        jButton1.setBackground(java.awt.Color.black);
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 154, 0));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 60, 30));

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/b1.PNG"))); // NOI18N
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 90));

        btnEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/b2.PNG"))); // NOI18N
        getContentPane().add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 90, 80));

        btnGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/dr4.PNG"))); // NOI18N
        btnGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 90));

        btnDefinicoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/b4.PNG"))); // NOI18N
        btnDefinicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinicoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefinicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 90));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/b5.PNG"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 90));

        jLabel3.setText("User:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/fuss.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
          new frmRelatorio().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
                 new frmMenu().setVisible(true);
        //new FrmProfessor().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDefinicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinicoesActionPerformed
            JOptionPane.showMessageDialog(this, "Estamos trablhando nisso....");
    }//GEN-LAST:event_btnDefinicoesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraficoActionPerformed


    
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(FrmPrincip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefinicoes;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnGrafico;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlabelModo;
    // End of variables declaration//GEN-END:variables
}
