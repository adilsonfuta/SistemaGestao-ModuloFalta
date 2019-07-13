/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TurmaDao extends GenericDao{
    
    public void Salvar(Turma t)
    {
        String sql="INSERT INTO turma (ID_TURMA, ID_PONTO, N_REGISTRO,NOME, CLASSE, CURSO) VALUES (?,?,?,?,?,?)";
        SalvarGDAO(sql,t.getIdturma(),t.getIdponto(),t.getNregistro(),t.getNome(),t.getClasse(),t.getCurso());
    }
    public void Atualizar(Turma t)
    {
        String sql="UPDATE turma SET ID_PONTO=?,N_REGISTRO=?,NOME=?,CLASSE=?,CURSO=? WHERE ID_TURMA=?";
        AtualizarGDAO(sql,t.getIdturma(),t.getIdponto(),t.getNregistro(),t.getNome(),t.getClasse(),t.getCurso());
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM turma WHERE ID_TURMA=?";
        DeletarGDAO(sql, id);
    }
    
    public ArrayList<Turma> listagem(){
        try {
            ArrayList<Turma> list=new ArrayList<>();
            String sql="SELECT * FROM turma";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                Turma p=new Turma();
                p.setIdturma(rs.getInt("ID_TURMA")); 
                p.setIdponto(rs.getInt("ID_PONTO")); 
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setNome(rs.getString("NOME"));
                p.setClasse(rs.getInt("CLASSE"));
                p.setCurso(rs.getString("CURSO"));
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
    public Turma Encontrar(String nome){
        try {
            Turma p=null;
            String sql="SELECT * FROM turma WHERE NOME=?";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ps.setString(1 , nome);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {     
                p=new Turma();
                p.setIdturma(rs.getInt("ID_TURMA")); 
                p.setIdponto(rs.getInt("ID_PONTO")); 
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setNome(rs.getString("NOME"));
                p.setClasse(rs.getInt("CLASSE"));
                p.setCurso(rs.getString("CURSO"));
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
        Vector<Vector> dados = new Vector<Vector>();
        String consulta = "SELECT * FROM turma";

        try {
            PreparedStatement ps = GetConnection().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dtm.addRow(new Object[]{
                    rs.getInt("ID_TURMA"),
                    rs.getInt("ID_PONTO"),
                    rs.getInt("N_REGISTRO"),
                    rs.getString("NOME"),
                    rs.getInt("CLASSE"),
                    rs.getString("CURSO")
                });
                
               
               
//                int iduser = rs.getInt("iduser");
//                String user = rs.getString("user");
//                String senha = rs.getString("senha");
//                String modo = rs.getString("modo");
//
//                Vector registrolido = new Vector();
//                registrolido.add(iduser);
//                registrolido.add(user);
//                registrolido.add(senha);
//                registrolido.add(modo);
//                dados.add(registrolido);
            }

            for (int i = 0; i < dados.size(); i++) {
                dtm.addRow(dados.get(i));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO ao carregar" + e.getMessage());
        }  
    
    }
    
    
    
}
