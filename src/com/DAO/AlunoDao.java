/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IRENE FUTA
 */
public class AlunoDao extends GenericDao{
    
    
     public void Salvar(Aluno a)
    {
        String sql="INSERT INTO aluno(ID_TURMA,GENERO, NUMERO_DE_TURMA, N_PROCESSO, NOME, CLASSE, TURMA, CURSO) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        SalvarGDAO(sql,a.getIdturma(),a.getGenero(),a.getNumAluno(),a.getProcesso(),a.getNome(),a.getClasse(),a.getTurma(),a.getCurso());
    }
    public void Atualizar(Aluno a)
    {  
        String sql="UPDATE aluno SET ID_TURMA=?,GENERO=?,NUMERO_DE_TURMA=?,NOME=?,CLASSE=?,TURMA=?,CURSO=? WHERE N_PROCESSO=?";
        AtualizarGDAO(sql,a.getIdturma(),a.getGenero(),a.getNumAluno(),a.getProcesso(),a.getNome(),a.getClasse(),a.getTurma(),a.getCurso());
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM aluno WHERE  N_PROCESSO=?";
        DeletarGDAO(sql, id);
    }
    
    public ArrayList<Aluno> listagem(){
        try {
            ArrayList<Aluno> list=new ArrayList<>();
            String sql="SELECT * FROM aluno";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                Aluno p=new Aluno();
                p.setIdturma(rs.getInt("ID_TURMA"));
                p.setGenero(rs.getString("GENERO"));
                p.setNumAluno(rs.getInt("NUMERO_DE_TURMA"));
                p.setProcesso(rs.getInt("N_PROCESSO"));
                p.setNome(rs.getString("NOME"));
                p.setTurma(rs.getString("TURMA"));
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
    public ArrayList<Aluno> ListaDOS_Alunos_determina_turma(String turma){
        try {
            ArrayList<Aluno> list=new ArrayList<>();
            String sql="SELECT aluno.ID_TURMA,aluno.GENERO, aluno.NUMERO_DE_TURMA, aluno.N_PROCESSO, aluno.NOME, aluno.CLASSE, aluno.TURMA, aluno.CURSO"
              + " FROM aluno,turma "
              + "where turma.NOME=? AND turma.ID_TURMA=aluno.ID_TURMA ";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
             ps.setString(1 , turma);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                Aluno p=new Aluno();
                p.setIdturma(rs.getInt("ID_TURMA"));
                p.setGenero(rs.getString("GENERO"));
                p.setNumAluno(rs.getInt("NUMERO_DE_TURMA"));
                p.setProcesso(rs.getInt("N_PROCESSO"));
                p.setNome(rs.getString("NOME"));
                p.setTurma(rs.getString("TURMA"));
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
    public Aluno Encontrar(String nome){
        try {
            Aluno p=null;
            String sql="SELECT * FROM aluno WHERE NOME=?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setString(1 , nome);
                ResultSet rs=ps.executeQuery();
                
                while (rs.next()) {
                    p=new Aluno();
                p.setIdturma(rs.getInt("ID_TURMA"));
                p.setGenero(rs.getString("GENERO"));
                p.setNumAluno(rs.getInt("NUMERO_DE_TURMA"));
                p.setProcesso(rs.getInt("N_PROCESSO"));
                p.setNome(rs.getString("NOME"));
                p.setTurma(rs.getString("TURMA"));
                p.setClasse(rs.getInt("CLASSE"));
                p.setCurso(rs.getString("CURSO"));
                }
                rs.close();
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

    @Override
    public void Inserir_na_Tabela(DefaultTableModel dtm) {
    
        Vector<Vector> dados = new Vector<>();
        String consulta = "SELECT * FROM aluno ORDER BY aluno.NOME asc";

        try {
            PreparedStatement ps = GetConnection().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

       
     
            while (rs.next()) {
                dtm.addRow(new Object[]{ rs.getInt("N_PROCESSO"),
                    rs.getInt("NUMERO_DE_TURMA"),
                    rs.getString("NOME"),
                    rs.getString("GENERO"),
                  rs.getInt("CLASSE"),
                  rs.getString("CURSO"),
                  rs.getString("TURMA"),
                  rs.getInt("ID_TURMA")               
                });
                    }
           for (Vector dado : dados) {
                dtm.addRow(dado);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO ao carregar" + e.getMessage());
        }
    }
    
    
    
    
}
