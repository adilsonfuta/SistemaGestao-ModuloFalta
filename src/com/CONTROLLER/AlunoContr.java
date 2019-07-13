/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.AlunoDao;
import com.Modelos.Aluno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class AlunoContr implements InterfaceControler<Aluno>{
    
    //int idturma, String genero,int numAluno, int processo, String nome, int classe, String turma,String curso)
    
     public void Salvar(int idturma, String genero,int numAluno, int processo, String nome, int classe,
             String turma,String curso) {
         
            Aluno a=new Aluno(idturma, genero, numAluno, processo, nome, classe, turma, curso);
            new AlunoDao().Salvar(a);
  }
     public void Alterar(int idturma, String genero,int numAluno, int processo, String nome, int classe, String turma,String curso) {
            Aluno a=new Aluno(idturma, genero, numAluno, processo, nome, classe, turma, curso);
            new AlunoDao().Atualizar(a);
  }
     public void Eliminar(int nregistro) {
            new AlunoDao().Deletar(nregistro);
  }
    
    @Override
    public void SalvarV(Aluno... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Aluno... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Aluno id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aluno> ListaGeral() {
    return new AlunoDao().listagem();
    }

    @Override
    public Aluno BuscaComum(String nome) {
     return new AlunoDao().Encontrar(nome);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
     new AlunoDao().Inserir_na_Tabela(dtm); 
    }

   public ArrayList<Aluno> ListadeAlunosde_turma(String nome) {
   return new AlunoDao().ListaDOS_Alunos_determina_turma(nome);
   }
   
  
   
   
}
