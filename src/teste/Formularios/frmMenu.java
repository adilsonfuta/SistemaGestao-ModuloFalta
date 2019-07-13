/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Formularios;

import java.util.logging.Level;
import java.util.logging.Logger;
import teste.Formularios.FrmProfessor;

/**
 *
 * @author adilson
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListarAluno = new javax.swing.JButton();
        btnListarTurma = new javax.swing.JButton();
        btnListarProfessor = new javax.swing.JButton();
        btnCadLivroPonto = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnRegistrarAssistencia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListarAluno.setBackground(new java.awt.Color(0, 0, 0));
        btnListarAluno.setForeground(new java.awt.Color(255, 102, 0));
        btnListarAluno.setText("Listar Alunos");
        btnListarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 40));

        btnListarTurma.setBackground(new java.awt.Color(0, 0, 0));
        btnListarTurma.setForeground(new java.awt.Color(255, 102, 0));
        btnListarTurma.setText("Listar Turma");
        btnListarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTurmaActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, 40));

        btnListarProfessor.setBackground(new java.awt.Color(0, 0, 0));
        btnListarProfessor.setForeground(new java.awt.Color(255, 102, 0));
        btnListarProfessor.setText("Listar Professor");
        btnListarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 150, 40));

        btnCadLivroPonto.setBackground(new java.awt.Color(0, 0, 0));
        btnCadLivroPonto.setForeground(new java.awt.Color(255, 102, 0));
        btnCadLivroPonto.setText("Livro de Ponto");
        btnCadLivroPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadLivroPontoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadLivroPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 150, 40));

        btnProfessor.setBackground(new java.awt.Color(0, 0, 0));
        btnProfessor.setForeground(new java.awt.Color(255, 102, 0));
        btnProfessor.setText("Cadastrar Professor");
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 150, 40));

        btnUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setForeground(new java.awt.Color(255, 102, 0));
        btnUsuarios.setText("Cadastrar Usuario");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 150, 40));

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setForeground(new java.awt.Color(255, 102, 0));
        btnCadastrar.setText("Cadastrar Turma");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 40));

        btnAlunos.setBackground(new java.awt.Color(0, 0, 0));
        btnAlunos.setForeground(new java.awt.Color(255, 102, 0));
        btnAlunos.setText("Cadastrar Alunos");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 40));

        btnRegistrarAssistencia.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarAssistencia.setForeground(new java.awt.Color(255, 102, 0));
        btnRegistrarAssistencia.setText("Registrar Assistencia");
        btnRegistrarAssistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAssistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarAssistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 300, 40));

        jButton1.setBackground(new java.awt.Color(28, 18, 18));
        jButton1.setForeground(new java.awt.Color(255, 145, 0));
        jButton1.setText("Sair");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 70, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarAssistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAssistenciaActionPerformed
        dispose();
        new FrmModelo().setVisible(true); 
    }//GEN-LAST:event_btnRegistrarAssistenciaActionPerformed

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorActionPerformed
        dispose();
        new FrmProfessor().setVisible(true);        
    }//GEN-LAST:event_btnProfessorActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        dispose();
        new frmTurma().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        dispose();
        new FrmAluno().setVisible(true);
    }//GEN-LAST:event_btnAlunosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
       dispose();
       new frmUsuario().setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnListarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAlunoActionPerformed
        dispose();
       new frmListaAluno().setVisible(true);
    }//GEN-LAST:event_btnListarAlunoActionPerformed

    private void btnListarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTurmaActionPerformed
         dispose();
       new frmListaTurma().setVisible(true);
    }//GEN-LAST:event_btnListarTurmaActionPerformed

    private void btnListarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfessorActionPerformed
        dispose();
       new frmListaProfs().setVisible(true);
    }//GEN-LAST:event_btnListarProfessorActionPerformed

    private void btnCadLivroPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadLivroPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadLivroPontoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnCadLivroPonto;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListarAluno;
    private javax.swing.JButton btnListarProfessor;
    private javax.swing.JButton btnListarTurma;
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnRegistrarAssistencia;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
