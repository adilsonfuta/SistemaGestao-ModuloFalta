/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.Modelos.Cardeneta;
import java.util.ArrayList;
import com.CONTROLLER.CadernetaContr;
import com.DAO.CadernetaDao;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class CadernetaContr implements InterfaceControler<Cardeneta>{

    
    public void Salvar(int nprocesso, int idponto, int nregistro, int idturma, int numero,
            int numtelefone, String email, int anolectivo, Date DataCard, String nomedospais,
            int telefonedospais, String emaidospais, String observao, int processo, String nome,
            int classe, String turma,String curso)
    {
     new CadernetaDao().Salvar(new Cardeneta(nprocesso, idponto, nregistro, idturma, numero, numtelefone, 
             email, anolectivo, DataCard, nomedospais, telefonedospais, emaidospais, observao, processo,
             nome, classe, turma, curso));
    }

  
    public void Alterar(int nprocesso, int idponto, int nregistro, int idturma, int numero,
            int numtelefone, String email, int anolectivo, Date DataCard, String nomedospais,
            int telefonedospais, String emaidospais, String observao, int processo, String nome,
            int classe, String turma,String curso)
    {
     new CadernetaDao().Atualizar(new Cardeneta(nprocesso, idponto, nregistro, idturma, numero, numtelefone, 
             email, anolectivo, DataCard, nomedospais, telefonedospais, emaidospais, observao, processo,
             nome, classe, turma, curso));
    }

   
    public void Excluir(long processo) {
       new CadernetaDao().Deletar((int) processo);
    }

    @Override
    public void SalvarV(Cardeneta... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Cardeneta... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Cardeneta id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cardeneta> ListaGeral() {
    return new CadernetaDao().listagem();
    }

    @Override
    public Cardeneta BuscaComum(String nome) {
        int P=Integer.parseInt(nome);
    return new CadernetaDao().Encontrar(P);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
