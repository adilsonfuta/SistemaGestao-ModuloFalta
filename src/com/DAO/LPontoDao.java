/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Lponto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class LPontoDao extends GenericDao{
    
     public void Salvar(Lponto l)
    {
      String sql="INSERT INTO livroponto(ID_PONTO, N_REGISTRO, FALTA_DE__COMPARENCIA, "
              + "FALTA_VERMELHA, FALTA_DE_UTENSSILHOS,"
              + " ASSINATURA, DISCIPLINA, DATAPONTO, SUMARIO, ANOLECTIVO)"
              + " VALUES (?,?,?,?,?,?,?,?,?,?)";
      
       SalvarGDAO(sql,l.getIdponto(),l.getNregistro(),l.getFaltaComparencia(),l.getFaltaVermelha(),l.getFaltaUtensilio(),
      l.getAssinatura(),l.getDisciplina(),l.getDatLivro(),l.getSumario(),l.getAnoLectivo());
    }
    public void Atualizar(Lponto l)
    {
        String sql="UPDATE livroponto SET N_REGISTRO=?,FALTA_DE__COMPARENCIA=?,FALTA_VERMELHA=?,FALTA_DE_UTENSSILHOS=?"
                + ",ASSINATURA=?,DISCIPLINA=?,DATAPONTO=?, SUMARIO=?, ANOLECTIVO=? WHERE ID_PONTO=?";
        AtualizarGDAO(sql,l.getIdponto(),l.getNregistro(),l.getFaltaComparencia(),l.getFaltaVermelha(),l.getFaltaUtensilio(),
      l.getAssinatura(),l.getDisciplina(),l.getDatLivro(),l.getSumario(),l.getAnoLectivo()); 
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM livroponto WHERE ID_PONTO=?";
        DeletarGDAO(sql, id);
    }
    
   
    public ArrayList<Lponto> listagem(){
        try {
            ArrayList<Lponto> list=new ArrayList<>();
            String sql="SELECT * FROM livroponto";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                Lponto p=new Lponto();
                
                p.setIdponto(rs.getInt("ID_PONTO"));
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setFaltaComparencia(rs.getInt("FALTA_DE__COMPARENCIA"));
                p.setFaltaVermelha(rs.getInt("FALTA_VERMELHA"));
                p.setFaltaUtensilio(rs.getInt("FALTA_DE_UTENSSILHOS"));
                p.setAssinatura(rs.getString("ASSINATURA"));
                p.setDisciplina(rs.getString("DISCIPLINA"));
                p.setDatLivro(rs.getDate("DATAPONTO"));
                p.setSumario(rs.getString("SUMARIO"));
                p.setAnoLectivo(rs.getInt("ANOLECTIVO"));
           
                list.add(p);      
            }
            rs.close();
            ps.close();
             
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Lponto Encontrar(String nome){
        try {
            Lponto p=null;
            String sql="SELECT * FROM livroponto WHERE NOME=?";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ps.setString(1 , nome);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                p=new Lponto();
                p.setIdponto(rs.getInt("ID_PONTO"));
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setFaltaComparencia(rs.getInt("FALTA_DE__COMPARENCIA"));
                p.setFaltaVermelha(rs.getInt("FALTA_VERMELHA"));
                p.setFaltaUtensilio(rs.getInt("FALTA_DE_UTENSSILHOS"));
                p.setAssinatura(rs.getString("ASSINATURA"));
                p.setDisciplina(rs.getString("DISCIPLINA"));
                p.setDatLivro(rs.getDate("DATAPONTO"));
                p.setSumario(rs.getString("SUMARIO"));
                p.setAnoLectivo(rs.getInt("ANOLECTIVO"));
            }
            rs.close();
            ps.close();
             
            return p;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void InserirConsulta_na_Tabela(DefaultTableModel dtm, String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Inserir_na_Tabela(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
