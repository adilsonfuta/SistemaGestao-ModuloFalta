/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.ProfessorDao;
import com.Modelos.Professor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author IRENE FUTA
 */
public class ProfessorContr  implements InterfaceControler<Professor>{

  
    public void Salvar(int nregistro, String nome, String disciplinas, String tumas_de_aula ,String genero) {
            Professor p=new Professor(nregistro, nome, disciplinas, tumas_de_aula, genero);
            new ProfessorDao().Salvar(p);
  }
     public void Alterar(int nregistro, String nome, String disciplinas, String tumas_de_aula ,String genero) {
            Professor p=new Professor(nregistro, nome, disciplinas, tumas_de_aula, genero);
            new ProfessorDao().Atualizar(p);
  }
     public void Eliminar(int nregistro) {
            new ProfessorDao().Deletar(nregistro);
  }

     
    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Professor> ListaGeral() {
        try {
            return new ProfessorDao().listagem();
        
        } catch (Exception e) {
        }
        return null;
         }

    @Override
    public Professor BuscaComum(String nome) {
        return new ProfessorDao().Encontrar(nome);
    }

    @Override
    public void SalvarV(Professor... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Professor... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Professor id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
        new ProfessorDao().Inserir_na_Tabela(dtm);
    }

   
    
}

