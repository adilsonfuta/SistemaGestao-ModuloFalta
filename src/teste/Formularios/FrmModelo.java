/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Formularios;

import com.CONTROLLER.AlunoContr;
import com.CONTROLLER.ProfessorContr;
import com.CONTROLLER.TurmaContr;
import com.DAO.UsuarioDao;
import com.Modelos.Aluno;
import com.Modelos.Professor;
import com.Modelos.Turma;
import com.Modelos.Usuarios;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author IRENE FUTA
 */
public class FrmModelo extends javax.swing.JFrame {
  
    ArrayList<Aluno> nomes ;
    ArrayList<Turma> array = new TurmaContr().ListaGeral();
    int contandoAusentes=0;

    public FrmModelo() {
        initComponents();
        this.setLocationRelativeTo(null);
       
       Lista_aUSENTES.setEnabled(false);
 
       btnTerminarCHAMADA.setEnabled(false);
       btnMarcarFaltas.setEnabled(false);
       jComboBox1.setBackground(Color.ORANGE);
       jLabel1.setText("Lista dos Aluno da Turma: ");
       jLabel2.setText("Lista dos Ausentes: ");
       jLabel3.setText("Selecione Turma");
       MostrarCombo(jComboBox1);
     
     }

    public void Manda() {
       nomes = new AlunoContr().ListaGeral();
        DefaultListModel model = new DefaultListModel();
        String s = null;
        for (Aluno nome : nomes) {
            Lista_Todos_na_tURMA.setModel(model);
          s =String.valueOf(nome.getNumAluno()).toString()+"----"+nome.getNome().toString();
            model.addElement(s);
        }
          Lista_Todos_na_tURMA.setEnabled(false);
    }
    
     public void MandaUMAtURMA() {
         
        //manda uma lista de uma  dos alunos de uma determina turma
       
        String nome_turma=jComboBox1.getSelectedItem().toString();
       nomes = new AlunoContr().ListadeAlunosde_turma(nome_turma); 
        
       DefaultListModel model = new DefaultListModel();
        Lista_aUSENTES.setModel(model);
        Lista_Todos_na_tURMA.setModel(model);
        
        model.clear();
       String s = null;
        
        for (Aluno nome : nomes) {
             Lista_Todos_na_tURMA.setModel(model);
             s = String.valueOf(nome.getNumAluno()).toString() + "----" + nome.getNome().toString();
            model.addElement(s);
        }
        Lista_Todos_na_tURMA.setEnabled(false);
    }
 
     
     // reanalisar as ideias aqu pois podem ser muito complicados ......
     
     public void MarcarFaltas()
    {
     ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < Lista_aUSENTES.getComponentCount(); i++) {    // percorrer textarea?
            al.add(nomes.get(i).getProcesso());
        }   
                 EnviarDadosFaltas(al);
    
    }

    public void EnviarDadosFaltas(ArrayList<Integer> a)
        {
           ArrayList<Aluno>  aluno= new AlunoContr().ListaGeral();
             for (int i = 0; i < aluno.size(); i++) {
                if(aluno.get(i).getProcesso()==a.get(i).intValue())
                    return; // enviar os numeros na caderneta e pegar aquele aluno faltoso
            }

        }

public void MostrarCombo(JComboBox box)
    {
            box.removeAllItems();
        ArrayList<Turma> array = new TurmaContr().ListaGeral();
        String str = null;
        for (Turma array1 : array) {
            str = array1.getNome();
            box.addItem(str);
        }
    }

    
   public void IniChamada()
   {
       
       jLabel1.setText("Lista dos Aluno da Turma: "+jComboBox1.getSelectedItem());
       jLabel2.setText("Lista dos Ausentes: "+jComboBox1.getSelectedItem());
       jLabel3.setText("Selecione Turma");  
       
        MandaUMAtURMA();
        
        
        btnIniChamada.setEnabled(false);
        btnTerminarCHAMADA.setEnabled(true);
        Lista_Todos_na_tURMA.setEnabled(true);
        
        MouseEvent event = null;
        Lista_Todos_na_tURMAMousePressed(event);
       
   }

 public void Lista_dos_aluno(){
     
     
                DefaultListModel model = new DefaultListModel();
                Lista_aUSENTES.setModel(model);
                 model.clear();
      if(!model.contains(Lista_Todos_na_tURMA.getSelectedValue()))  // Testa se o item existe na lista 
        {  
            model.addElement(Lista_Todos_na_tURMA.getSelectedValue());
            contandoAusentes++;  
        }
   
     }
    
public void TerminarCHAMADA()
  {
   // desabilta as lista e poe tudo em ordem crescente elimina as repeticoes  {ver lista sem dublicacao}
        Lista_Todos_na_tURMA.setEnabled(false);
        MouseEvent event = null;
        removeMouseListener((MouseListener) event);
        btnIniChamada.setEnabled(true);
        btnMarcarFaltas.setEnabled(true);
        btnTerminarCHAMADA.setEnabled(false);
  
  
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Todos_na_tURMA = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista_aUSENTES = new javax.swing.JList();
        btnIniChamada = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMarcarFaltas = new javax.swing.JButton();
        btnTerminarCHAMADA = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        Lista_Todos_na_tURMA.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 102, 0)));
        Lista_Todos_na_tURMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Lista_Todos_na_tURMAMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Lista_Todos_na_tURMA);

        Lista_aUSENTES.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), null));
        Lista_aUSENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista_aUSENTESMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Lista_aUSENTES);

        btnIniChamada.setBackground(new java.awt.Color(0, 0, 0));
        btnIniChamada.setForeground(new java.awt.Color(255, 102, 0));
        btnIniChamada.setText("Iniciar Chamada");
        btnIniChamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniChamadaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        btnMarcarFaltas.setBackground(new java.awt.Color(0, 0, 0));
        btnMarcarFaltas.setForeground(new java.awt.Color(255, 102, 0));
        btnMarcarFaltas.setText("Marcar Faltas");
        btnMarcarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarFaltasActionPerformed(evt);
            }
        });

        btnTerminarCHAMADA.setBackground(new java.awt.Color(0, 0, 0));
        btnTerminarCHAMADA.setForeground(new java.awt.Color(255, 102, 0));
        btnTerminarCHAMADA.setText("Terminar Chamada");
        btnTerminarCHAMADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarCHAMADAActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIniChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnTerminarCHAMADA, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMarcarFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMarcarFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTerminarCHAMADA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lista_aUSENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista_aUSENTESMouseClicked
     
    }//GEN-LAST:event_Lista_aUSENTESMouseClicked

    private void Lista_Todos_na_tURMAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista_Todos_na_tURMAMousePressed
        this.Lista_dos_aluno();
    }//GEN-LAST:event_Lista_Todos_na_tURMAMousePressed

    private void btnIniChamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniChamadaActionPerformed
        this.IniChamada();
    }//GEN-LAST:event_btnIniChamadaActionPerformed

    private void btnTerminarCHAMADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarCHAMADAActionPerformed
  this.TerminarCHAMADA();
    }//GEN-LAST:event_btnTerminarCHAMADAActionPerformed

    private void btnMarcarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarFaltasActionPerformed
           // this.MarcarFaltas();
         String Msg=null;
        if(contandoAusentes!=0) {   
      Msg ="Todos Alunos da Lista de Ausente "
                + "serao Marcados faltas de Presença";
           JOptionPane.showMessageDialog(this, Msg);
        }
        else{
         Msg ="Lista de Ausentes Vazia! "
                + "\n \t Deve Fazer a Chamada Primeiro";
           JOptionPane.showMessageDialog(this, Msg);
     
        
        }
           
    }//GEN-LAST:event_btnMarcarFaltasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(FrmModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList Lista_Todos_na_tURMA;
    private javax.swing.JList Lista_aUSENTES;
    private javax.swing.JButton btnIniChamada;
    private javax.swing.JButton btnMarcarFaltas;
    private javax.swing.JButton btnTerminarCHAMADA;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
