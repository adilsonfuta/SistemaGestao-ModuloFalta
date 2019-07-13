
package com.CONTROLLER;

import com.DAO.TurmaDao;
import com.Modelos.Turma;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TurmaContr implements InterfaceControler<Turma>{

          public void Salvar(int idturma, int idponto, int nregistro, String nome, int classe,String curso) {
            Turma p=new Turma(idturma, idponto, nregistro, nome, classe, curso);
              new TurmaDao().Salvar(p);
  }
     public void Alterar(int idturma, int idponto, int nregistro, String nome, int classe,String curso) {
            Turma p=new Turma(idturma, idponto, nregistro, nome, classe, curso);
              new TurmaDao().Atualizar(p);
  }
     public void Eliminar(int nregistro) {
            new TurmaDao().Deletar(nregistro);
  }
  
    @Override
    public void SalvarV(Turma... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Turma... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Turma id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Turma> ListaGeral() {
    return new TurmaDao().listagem();
    }

    @Override
    public Turma BuscaComum(String nome) {
    return new TurmaDao().Encontrar(nome);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
    new TurmaDao().Inserir_na_Tabela(dtm);
    }
    
     public int PegaIdTurma_aPArtirNome(String nome)
   {
       return  new TurmaDao().Encontrar(nome).getIdturma();
   }
}
