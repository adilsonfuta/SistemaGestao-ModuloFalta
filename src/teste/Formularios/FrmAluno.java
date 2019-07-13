/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Formularios;



import com.CONTROLLER.*;
import com.DAO.TurmaDao;
import com.Modelos.Aluno;
import com.Modelos.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public final class FrmAluno extends javax.swing.JFrame{

    
    public FrmAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarCombo(jComboBoxTurma);
    }

  
    
      public  void Limpar(){
     
      txtIdeTurma.setText("");
      txtNOrdem.setText("");
      txtNome.setText("");
      txtNumProc.setText("");
      jComboBoxCurso.setSelectedIndex(0);
      jComboBoxGenero.setSelectedIndex(0);
      jComboBoxTurma.setSelectedIndex(0);
      jComboClasse.setSelectedIndex(0);
              
      }
      public  void Atualizar(){
            if (VerifcarInPuts()==true) {
            int idturma=new TurmaContr().PegaIdTurma_aPArtirNome(jComboBoxTurma.getSelectedItem().toString());
            //int idturma = Integer.parseInt(txtIdeTurma.getText());  // dado o nome da turma pegar seu id
            txtIdeTurma.setText(String.valueOf(idturma));
            int classe = Integer.parseInt(jComboClasse.getSelectedItem().toString());
            String turma = jComboBoxTurma.getSelectedItem().toString();
            String curso = jComboBoxCurso.getSelectedItem().toString();
            String nome = txtNome.getText();
            String genero = jComboBoxGenero.getSelectedItem().toString();
            int numAluno = Integer.parseInt(txtNOrdem.getText());
            int processo = Integer.parseInt(txtNumProc.getText());

            new AlunoContr().Alterar(idturma, genero, numAluno, processo, nome, classe, turma, curso);
            JOptionPane.showMessageDialog(this, "Atualizado com Sucesso");
                              this.Limpar();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione: 1-)Curso 2-)Genero 3-)Turma \n Preencha Todos os Campos...");
               this.Limpar();
        }
      
      
      }
    public void Salvar() {
        if (VerifcarInPuts()==true) {
            
            int idturma=new TurmaContr().PegaIdTurma_aPArtirNome(jComboBoxTurma.getSelectedItem().toString());
            //int idturma = Integer.parseInt(txtIdeTurma.getText());  // dado o nome da turma pegar seu id
            txtIdeTurma.setText(String.valueOf(idturma));
            int classe = Integer.parseInt(jComboClasse.getSelectedItem().toString());
            String turma = jComboBoxTurma.getSelectedItem().toString();
            String curso = jComboBoxCurso.getSelectedItem().toString();
            String nome = txtNome.getText();
            String genero = jComboBoxGenero.getSelectedItem().toString();
            int numAluno = Integer.parseInt(txtNOrdem.getText());
            int processo = Integer.parseInt(txtNumProc.getText());

            new AlunoContr().Salvar(idturma, genero, numAluno, processo, nome, classe, turma, curso);
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso");
                              this.Limpar();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione: 1-)Curso 2-)Genero 3-)Turma \n Preencha Todos os Campos...");
               this.Limpar();
        }

    }
      public  void Deletar(){
        
      if(!txtNumProc.getText().isEmpty()){
        //int idprocesso = list.get(registroAtual).getProcesso();  // poderia usar esse aqui
          int processo = Integer.parseInt(txtNumProc.getText()); 
         new AlunoContr().Eliminar(processo);
         JOptionPane.showMessageDialog(this, "Eliminado com Sucesso");
                              this.Limpar();
      }  else {
            JOptionPane.showMessageDialog(this, "Insira o numero Processo");
               this.Limpar();
        }
     }
     public boolean VerifcarInPuts() {
                boolean volta=false;
        if ((jComboBoxCurso.getSelectedIndex() != 0 && jComboBoxGenero.getSelectedIndex() != 0
                && jComboBoxTurma.getSelectedIndex() != 0&&jComboClasse.getSelectedIndex() != 0 ) ||
                (!txtNOrdem.getText().isEmpty()
                &&!txtIdeTurma.getText().isEmpty()
                && txtNome.getText().isEmpty() && !txtNumProc.getText().isEmpty())
                ) {
            // esta nao selecionado volta true
            return volta=true;
        }
        return volta;
    }
    
     
     public void MostrarCombo(JComboBox box)
    {
        ArrayList<Turma> array = new TurmaDao().listagem();
        String str=null;
        for (Turma array1 : array) {
             str = array1.getNome();
            box.addItem(str);
        }
 }
    
    
      // andar na Lista de Object 
    public List<Aluno> list = new AlunoContr().ListaGeral();
     private int registroAtual = 0;
    public Aluno rol = null;
    
    private void GetValores(int index) {

        if (index <= list.size()) {
            Aluno rol = list.get(index);
           
            txtIdeTurma.setText(String.valueOf(rol.getIdturma()));
            txtNOrdem.setText(String.valueOf(rol.getNumAluno()));
            txtNome.setText(rol.getNome());
            txtNumProc.setText(String.valueOf(rol.getProcesso()));
            jComboBoxCurso.setSelectedItem(rol.getCurso());
            jComboBoxGenero.setSelectedItem(rol.getGenero());
            jComboBoxTurma.setSelectedItem(rol.getTurma());
            jComboClasse.setSelectedItem(rol.getClasse());
            jComboClasse.setSelectedItem(String.valueOf(rol.getClasse()));
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

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumProc = new javax.swing.JTextField();
        txtNOrdem = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox();
        jComboBoxCurso = new javax.swing.JComboBox();
        txtNome = new javax.swing.JTextField();
        jComboBoxTurma = new javax.swing.JComboBox();
        txtIdeTurma = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnDepois = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        jComboClasse = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel4.setText(" Processo");

        jLabel3.setText("Numero Ordem");

        jLabel5.setText("Nome");

        jLabel2.setText("Genero");

        jLabel6.setText("Classe");

        jLabel8.setText("Curso");

        jLabel7.setText("Turma");

        jLabel1.setText("ID Turma");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione Genero>", "Masculino", "Femenino" }));

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione Curso>", "Informatica", "Informatica Multimedia", " Electronica Telecomunicação", " Electronica Audio e Video" }));

        jComboBoxTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione Turma>" }));

        txtIdeTurma.setEditable(false);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
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

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        jComboClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Classe>", "10", "11", "12", "13" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6)
                            .addGap(117, 117, 117))
                        .addComponent(jComboBoxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboClasse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(491, 491, 491))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addGap(44, 44, 44)
                        .addComponent(btnAnterior)
                        .addGap(54, 54, 54)
                        .addComponent(btnDepois)
                        .addGap(46, 46, 46)
                        .addComponent(btnUltimo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(217, 217, 217)))
                .addGap(274, 274, 274))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jComboClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnDepois)
                    .addComponent(btnUltimo))
                .addGap(7, 7, 7))
        );

        jTabbedPane2.addTab("", jPanel1);

        jTabbedPane1.addTab("tab1", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
       this.Primeiro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        this.Ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
      this.Limpar();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.Salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
     this.Atualizar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       this.Deletar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        this.Anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnDepoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepoisActionPerformed
        this.Depois();
    }//GEN-LAST:event_btnDepoisActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new FrmAluno().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDepois;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JComboBox jComboBoxTurma;
    private javax.swing.JComboBox jComboClasse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtIdeTurma;
    private javax.swing.JTextField txtNOrdem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumProc;
    // End of variables declaration//GEN-END:variables
}
