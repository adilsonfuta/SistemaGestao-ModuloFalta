/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.Caderneta_JustificarDao;
import com.Modelos.Caderneta_Justificar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Caderneta_JustificarContr implements InterfaceControler<Caderneta_Justificar>{

 
    public void Salvar(int processo, int nprocesso, int idponto, int nregistro, int idfalta, int idturma) {
        Caderneta_Justificar p = new Caderneta_Justificar(processo, nprocesso, idponto, nregistro, idfalta, idturma);
        new Caderneta_JustificarDao().Salvar(p);
    }

    public void Alterar(int processo, int nprocesso, int idponto, int nregistro, int idfalta, int idturma) {
        Caderneta_Justificar p = new Caderneta_Justificar(processo, nprocesso, idponto, nregistro, idfalta, idturma);
        new Caderneta_JustificarDao().Atualizar(p);
    }

    public void Eliminar(int nregistro) {
        new Caderneta_JustificarDao().Deletar(nregistro);
    }
    
    
    @Override
    public ArrayList<Caderneta_Justificar> ListaGeral() {
        return new Caderneta_JustificarDao().listagem();
    }

    @Override
    public Caderneta_Justificar BuscaComum(String nome) {
            int processo=Integer.parseInt(nome);
        return new Caderneta_JustificarDao().Encontrar(processo);
    }
 
       @Override
    public void SalvarV(Caderneta_Justificar... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Caderneta_Justificar... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Caderneta_Justificar id) {
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
