
package teste.Formularios;

import com.CONTROLLER.ProfessorContr;
import com.Modelos.Professor;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adilson
 */
public class FrmProfessor extends javax.swing.JFrame {

    public ProfessorContr controller = new ProfessorContr();
   
    public FrmProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        Mostrar();
    }
 
    public void Limpar() {

        txtRegistro.setText("");
        txtTurmas.setText("");
        txtDisciplina.setText("");
        txtNomeProf.setText("");
        txtLocalizar.setText("");

    }

    
    // andar na Lista de Object 
    public List<Professor> list = new ProfessorContr().ListaGeral();
     private int registroAtual = 0;
    public Professor rol = null;
    
    private void GetValores(int index) {

        if (index <= list.size()) {
            Professor rol = list.get(index);
            String idprof = String.valueOf(rol.getNregistro());
            txtRegistro.setText(idprof);
            txtNomeProf.setText(rol.getNome());
            txtDisciplina.setText(rol.getDisciplinas());
            txtTurmas.setText(rol.getTumas_de_aula());
            jComboBoxGenero.setSelectedItem(rol.getGenero());
        }

    }

    public void Ultimo() {
        registroAtual = list.size() - 1;
        GetValores(registroAtual);
    }

    public void Primeiro() {
        registroAtual = 0;
        GetValores(registroAtual);
    }

    public void Anterior() {
        if (registroAtual != 0) {
            GetValores(--registroAtual);
        }
    }

    public void Depois() {
        if (registroAtual != list.size() - 1) {
            GetValores(++registroAtual);
        }
    }
    
    // fim de andar na lista

    // idprofessor,formacao,telefone,nome,sexo,email,datanasc  
    public void Salvar() {

        try {
            int nregistro = Integer.parseInt(txtRegistro.getText());
            String nome = txtNomeProf.getText();
            String disciplinas = txtDisciplina.getText();
            String tumas_de_aula = txtTurmas.getText();
            String genero = jComboBoxGenero.getSelectedItem().toString();

            controller.Salvar(nregistro, nome, disciplinas, tumas_de_aula,genero);

            JOptionPane.showMessageDialog(this, "Guardado Com Sucesso!");
            Mostrar();
            Limpar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nao foi Possivel SALVAR" + e.getLocalizedMessage());
        }

    }

    public void Atualizar() {

        int id = list.get(registroAtual).getNregistro();

        try {
            int nregistro = Integer.parseInt(txtRegistro.getText());
            String nome = txtNomeProf.getText();
            String disciplinas = txtDisciplina.getText();
            String tumas_de_aula = txtTurmas.getText();
            String genero = jComboBoxGenero.getSelectedItem().toString();


            controller.Alterar(nregistro, nome, disciplinas, tumas_de_aula,genero);
            JOptionPane.showMessageDialog(this, "Alterado Com Sucesso!");
            Limpar();
            Mostrar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nao foi Possivel Alterar" + e.getLocalizedMessage());
        }
    }

    public void Deletar() {

        int id = list.get(registroAtual).getNregistro();
        controller.Eliminar(id);
        JOptionPane.showMessageDialog(this, "Eliminado Com Sucesso!");
        Limpar();
        list = new ProfessorContr().ListaGeral();
        Mostrar();
    }

    public void ProcurarProfessor(JTextField jText){
        
        list = new ProfessorContr().ListaGeral();
        boolean b = false;
        for (Professor list1 : list) {

            if (jText.getText().equals(list1.getNome())) {
                b = true;
            
            this.rol = controller.BuscaComum(jText.getText());
            String idprof = String.valueOf(rol.getNregistro());
            txtRegistro.setText(idprof);
            txtNomeProf.setText(rol.getNome());
            txtDisciplina.setText(rol.getDisciplinas());
            txtTurmas.setText(rol.getTumas_de_aula());
            jComboBoxGenero.setSelectedItem(rol.getGenero());

                        }
        }
        
        if (b == true) {
            JOptionPane.showMessageDialog(this, "Achado Com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Nao Achado!");
        }
             
    }
   
    
    public void Mostrar() {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
         modelo.setRowCount(0);
        controller.MostrarTABLE(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtRegistro = new javax.swing.JTextField();
        txtNomeProf = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JTextField();
        txtTurmas = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnDepois = new javax.swing.JButton();
        btnAntes = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLocalizar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxGenero = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Disciplinas", "Turmas", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Numero Registro");

        jLabel2.setText("Nome");

        jLabel3.setText("Disciplina Lecionadas");

        jLabel4.setText("Turmas Lecionadas");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisciplinaActionPerformed(evt);
            }
        });

        btnProcurar.setBackground(new java.awt.Color(28, 18, 18));
        btnProcurar.setForeground(new java.awt.Color(252, 141, 9));
        btnProcurar.setText("Ir");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnDepois.setText(">>");
        btnDepois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepoisActionPerformed(evt);
            }
        });

        btnAntes.setText("<<");
        btnAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntesActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        jLabel8.setText("Localizar por nome:");

        jButton1.setText("Mostrar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione Genero>", "Masculino", "Femenino" }));

        jLabel5.setText("Genero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130)
                                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDepois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(txtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomeProf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDisciplina, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAntes)
                    .addComponent(btnUltimo)
                    .addComponent(btnDepois)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisciplinaActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
                this.ProcurarProfessor(txtLocalizar);
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        this.Ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnDepoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepoisActionPerformed
        this.Depois();
    }//GEN-LAST:event_btnDepoisActionPerformed

    private void btnAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntesActionPerformed
        this.Anterior();
    }//GEN-LAST:event_btnAntesActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        this.Primeiro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.Salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        this.Atualizar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.Deletar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.Mostrar();
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
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntes;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDepois;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtLocalizar;
    private javax.swing.JTextField txtNomeProf;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTurmas;
    // End of variables declaration//GEN-END:variables
}
