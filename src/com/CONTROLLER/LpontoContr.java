/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.LPontoDao;
import com.Modelos.Lponto;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class LpontoContr implements InterfaceControler<Lponto>{

        public void Salvar(int idponto, int nregistro, int faltaComparencia, int faltaVermelha, int faltaUtensilio,
     String assinatura, String disciplina, Date DatLivro, String Sumario, int AnoLectivo) {
            
            Lponto p=new Lponto(idponto, nregistro, faltaComparencia, faltaVermelha, faltaUtensilio,
                    assinatura, disciplina, DatLivro, Sumario, AnoLectivo);
                    new LPontoDao().Salvar(p);
  }
     public void Alterar(int idponto, int nregistro, int faltaComparencia, int faltaVermelha, int faltaUtensilio,
     String assinatura, String disciplina, Date DatLivro, String Sumario, int AnoLectivo) {
            
            Lponto p=new Lponto(idponto, nregistro, faltaComparencia, faltaVermelha, faltaUtensilio,
                    assinatura, disciplina, DatLivro, Sumario, AnoLectivo);
            new LPontoDao().Atualizar(p);
  }
     public void Eliminar(int nregistro) {
            new LPontoDao().Deletar(nregistro);
  }
    
@Override
    public void SalvarV(Lponto... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Lponto... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Lponto id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Lponto> ListaGeral() {
    return  new LPontoDao().listagem();
    }

    @Override
    public Lponto BuscaComum(String nome) {
        return  new LPontoDao().Encontrar(nome);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
