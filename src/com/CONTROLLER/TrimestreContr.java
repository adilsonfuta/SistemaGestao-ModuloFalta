/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.TrimestreDao;
import com.Modelos.Trimestre;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class TrimestreContr implements InterfaceControler<Trimestre>{

  
       
    public void Salvar(int idtrimestre, int processo, int nprocesso, int idponto, int nregistro, int idturma, int mediatrimestral, int avalicaocontinual, int prova1, int prova2) {
    new TrimestreDao().Salvar(new Trimestre(idtrimestre, processo, nprocesso, idponto, nregistro, idturma, mediatrimestral,avalicaocontinual, prova1, prova2));
    }

   
    public void Alterar(int idtrimestre, int processo, int nprocesso, int idponto, int nregistro, int idturma, int mediatrimestral, int avalicaocontinual, int prova1, int prova2) {
     new TrimestreDao().Atualizar(new Trimestre(idtrimestre, processo, nprocesso, idponto, nregistro, idturma, mediatrimestral,avalicaocontinual, prova1, prova2));   
    }

  
    public void Excluir(int Trimest) {
        new TrimestreDao().Deletar(Trimest);
    }

    
    @Override
    public ArrayList<Trimestre> ListaGeral() {
    return new TrimestreDao().listagem();
    }

    @Override
    public Trimestre BuscaComum(String nome) {
        int trimestre=Integer.parseInt(nome);
       return new TrimestreDao().Encontrar(trimestre);
    }
    
    
 @Override
    public void SalvarV(Trimestre... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Trimestre... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Trimestre id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
