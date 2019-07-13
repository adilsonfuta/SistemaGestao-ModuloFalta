/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexao.ConexaoBanco;
import static Conexao.ConexaoBanco.FecharConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public abstract class GenericDao {
    
    private final Connection cnt;
    private PreparedStatement pst;
    
    protected GenericDao()
    {
        this.cnt=ConexaoBanco.getconectionMysql();   //getconection();
       // this.cnt=ConexaoBanco.getconectionPostGres();   //getconection();
    }
    
    public void Fechar_todas_Conexoes()
    {
        FecharConexao();
    }
    
    protected Connection GetConnection()
    {
    return this.cnt;
    }
    
    protected void SalvarGDAO(String sq, Object... param)
    {
        try {
            pst=GetConnection().prepareStatement(sq);
            
            for (int i = 0; i < param.length; i++) {
               pst.setObject(i+1, param[i]);
            }
            pst.execute();
            pst.close();
             
            
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    protected void AtualizarGDAO(String sq,Object id,Object... param)
    {
        try {
            pst = GetConnection().prepareStatement(sq);
            for (int i = 0; i < param.length; i++) {
                pst.setObject(i + 1, param[i]);
            }
              pst.setObject(param.length+1, id);
                pst.execute();
                pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    protected void DeletarGDAO(String sq,Object... param)
    {
        try {
            pst=GetConnection().prepareStatement(sq);
            for (int i = 0; i < param.length; i++) {
                pst.setObject(i+1, param[i]);
            }
            pst.execute();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /**
     *
     * @param dtm
     * @param consulta
     */
    public abstract void InserirConsulta_na_Tabela(DefaultTableModel dtm, String consulta);
    // como gerar listas Generic <T>
    
     public abstract void Inserir_na_Tabela(DefaultTableModel dtm);

}
