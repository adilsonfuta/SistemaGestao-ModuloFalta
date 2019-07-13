/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Formularios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Futa
 */
public class FrmSplash extends javax.swing.JFrame {

  public FrmSplash() {
        initComponents();
       //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setLocationRelativeTo(null);
        new Thread(new carregar()).start();
        this.setEnabled(false);
     
      }

          public void MudartEMA(String x) throws ClassNotFoundException {
        try {
            x="Windows";
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("*x*".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FrmSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(FrmSplash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, -1));

        jProgressBar1.setBackground(java.awt.Color.gray);
        jProgressBar1.setForeground(new java.awt.Color(255, 145, 0));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 500, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teste/Img/splash.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSplash().setVisible(true);
            }
        });
    }
    
      public class carregar implements Runnable
   {   
          
      @Override
        public void run() {
            for (int i = 0; i <=100; i++)
            {
              jProgressBar1.setValue(i);
              jProgressBar1.setStringPainted(true);
             try {
                 
                 
                        if(i<5){
                            jLabel2.setText("Iniciando o SGAMCF.");
                        }
                        else if(i<15){
                            jLabel2.setText("Iniciando o SGAMCF..");
                        }
                        if(i<20){
                            jLabel2.setText("Iniciando o SGAMCF...");
                        }
                        else if(i<30){
                            jLabel2.setText("Carregando Modulos do Sistema.");
                        }
                        else if(i<35){
                            jLabel2.setText("Carregando Modulos do Sistema..");
                            //lista = (ArrayList<Role>) rc.getRoles();
                            
                        }
                        else if(i<40){
                            jLabel2.setText("Carregando Modulos do Sistema...");
                        }
                        else if(i<50){
                            jLabel2.setText("Modulos do Sistema Carregados...");
                        }
                        else if(i<55){
                            jLabel2.setText("Actualizando Modulos dos Sistema.");
                        }
                        else if(i<60){
                            jLabel2.setText("Actualizando Modulos dos Sistema..");
                        }
                        else if(i<65){
                            jLabel2.setText("Actualizando Modulos dos Sistema...");
                        }
                        else if(i<70){
                            jLabel2.setText("Modulos do Sistema Actualizados...");
                        }
                        else if(i<75){
                            jLabel2.setText("Aguarde Por Favor...");
                        }
                        else if(i<80){
                            jLabel2.setText("Abrindo o SGAMCF.");
                        }
                        else if(i<85){
                            jLabel2.setText("Abrindo o SGAMCF...");
                        }
                        else if(i<90){
                            jLabel2.setText("Abrindo o SGAMCF..");
                        }
                        else if(i<95){
                            jLabel2.setText("Bem-vindo ao SGAMCF...");
                        }
                    Thread.sleep(40);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           dispose();
           FrmLogin.main(null);
         
        }
 }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
