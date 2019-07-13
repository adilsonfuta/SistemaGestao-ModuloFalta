/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import java.util.ArrayList;
import com.DAO.Faltas_JustificarDao;
import com.Modelos.Faltas_Justificar;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class Falta_JustificarContr implements InterfaceControler<Faltas_Justificar>{

   public void Salvar(int idfalta, String portadorBI, String estadocivil, Date datanascimento, int anolectivo, int classe, String motivo, String nomealuno, String encarregado, String natural, String provincia, Date assinatura, String disciplinasfaltas, Date data, String assinaturaEncarregado, String turma, int nprocesso, String periodo, String directorTurma) {
            Faltas_Justificar fj=new Faltas_Justificar(idfalta, portadorBI, estadocivil, null, anolectivo, classe, motivo, nomealuno, encarregado, natural, provincia, null, disciplinasfaltas, null, assinaturaEncarregado, turma, nprocesso, periodo, directorTurma);
            new Faltas_JustificarDao().Salvar(fj);
  }
     public void Alterar(int idfalta, String portadorBI, String estadocivil, Date datanascimento, int anolectivo, int classe, String motivo, String nomealuno, String encarregado, String natural, String provincia, Date assinatura, String disciplinasfaltas, Date data, String assinaturaEncarregado, String turma, int nprocesso, String periodo, String directorTurma) {
           Faltas_Justificar fj=new Faltas_Justificar(idfalta, portadorBI, estadocivil, null, anolectivo, classe, motivo, nomealuno, encarregado, natural, provincia, null, disciplinasfaltas, null, assinaturaEncarregado, turma, nprocesso, periodo, directorTurma);
            new Faltas_JustificarDao().Atualizar(fj);
  }
     public void Eliminar(int nregistro) {
            new Faltas_JustificarDao().Deletar(nregistro);
  }
    
    
    @Override
    public void SalvarV(Faltas_Justificar... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Faltas_Justificar... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Faltas_Justificar id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Faltas_Justificar> ListaGeral() {
    return new Faltas_JustificarDao().listagem();
    }

    @Override
    public Faltas_Justificar BuscaComum(String nome) {
         return new Faltas_JustificarDao().Encontrar(nome);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
