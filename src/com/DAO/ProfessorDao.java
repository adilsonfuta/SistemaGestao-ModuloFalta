/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProfessorDao extends GenericDao{
    
    public void Salvar(Professor professor)
    {
        String sql="INSERT INTO professor(N_REGISTRO, NOME, DISCIPLINA, TURMAS_DE_AULA, GENERO) "
                + "VALUES (?,?,?,?,?)";
        SalvarGDAO(sql,professor.getNregistro(),professor.getNome(), professor.getDisciplinas(),
                professor.getTumas_de_aula(),professor.getGenero());
    }
    public void Atualizar(Professor professor)
    {
        String sql="UPDATE professor SET NOME=?,DISCIPLINA=?,TURMAS_DE_AULA=?, GENERO=? WHERE N_REGISTRO=?";
        AtualizarGDAO(sql,professor.getNregistro(),professor.getNome(), professor.getDisciplinas(),
                professor.getTumas_de_aula(),professor.getGenero());
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM professor WHERE N_REGISTRO=?";
        DeletarGDAO(sql, id);
    }
    
    public ArrayList<Professor> listagem(){
        try {
            ArrayList<Professor> list=new ArrayList<>();
            String sql="SELECT * FROM professor";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                Professor p=new Professor();
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setNome(rs.getString("NOME"));
                p.setDisciplinas(rs.getString("DISCIPLINA"));
                p.setTumas_de_aula(rs.getString("TURMAS_DE_AULA"));
                p.setGenero(rs.getString("GENERO"));
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
    public Professor Encontrar(String nome){
        try {
            
            Professor p=null;
            String sql="SELECT * FROM professor WHERE NOME=?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setString(1 , nome);
                ResultSet rs=ps.executeQuery();
                
                while (rs.next()) {
                p=new Professor();
                p.setNregistro(rs.getInt("N_REGISTRO"));
                p.setNome(rs.getString("NOME"));
                p.setDisciplinas(rs.getString("DISCIPLINA"));
                p.setTumas_de_aula(rs.getString("TURMAS_DE_AULA"));
                p.setGenero(rs.getString("GENERO"));
                    
                }
                rs.close();
                ps.close();
            }
             
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
    
          
    public void Inserir_na_Tabela(DefaultTableModel dtm) {
        Vector<Vector> dados = new Vector<Vector>();
        String consulta = "SELECT * FROM professor";

        try {
            PreparedStatement ps = GetConnection().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            
                dtm.addRow(new Object[]{rs.getInt("N_REGISTRO"), 
                    rs.getString("NOME"), rs.getString("DISCIPLINA"),
                    rs.getString("TURMAS_DE_AULA"),rs.getString("GENERO")});
          
            /*int Nregistro = rs.getInt("N_REGISTRO");
            String Nome = rs.getString("NOME");
            String Disciplinas = rs.getString("DISCIPLINA");
            String Tumas_de_aula = rs.getString("TURMAS_DE_AULA");

            Vector registrolido = new Vector();
            registrolido.add(Nregistro);
            registrolido.add(Nome);
            registrolido.add(Disciplinas);
            registrolido.add(Tumas_de_aula);
            dados.add(registrolido);
                    */
            }

            for (int i = 0; i < dados.size(); i++) {
                dtm.addRow(dados.get(i));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO ao carregar" + e.getMessage());
        }
    }

    
    
}
