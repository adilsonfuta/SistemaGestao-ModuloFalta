/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Caderneta_Justificar;
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
public class Caderneta_JustificarDao extends GenericDao {

    public void Salvar(Caderneta_Justificar cj) {
        String sql = "INSERT INTO [caderneta faltas_a_justificar]"
                + "(PROCESSO, N_PROCESSO, ID_PONTO, N_REGISTRO, ID_Falta, ID_TURMA) VALUES (?,?,?,?,?,?) ";
        
        SalvarGDAO(sql, cj.getProcesso(), cj.getNprocesso(), cj.getIdponto(), cj.getNregistro(), 
                cj.getIdfalta(), cj.getIdturma());
    }

    public void Atualizar(Caderneta_Justificar cj) {
        String a = "UPDATE [caderneta faltas_a_justificar] SET PROCESSO=?,N_PROCESSO"
                + "ID_PONTO=?,"
                + "N_REGISTRO=?,ID_Falta=?,"
                + "ID_TURMA=?";

        String sql = "UPDATE [caderneta faltas_a_justificar] SET N_PROCESSO=?,ID_PONTO=?,"
                + "N_REGISTRO=?,ID_Falta=?,ID_TURMA=? WHERE PROCESSO=?";
        AtualizarGDAO(sql, cj.getProcesso(), cj.getNprocesso(), cj.getIdponto(), cj.getNregistro(), 
                cj.getIdfalta(), cj.getIdturma());
    }

    public void Deletar(int id) {
        String sql = "DELETE FROM [caderneta faltas_a_justificar] WHERE PROCESSO=?";
        DeletarGDAO(sql, id);
    }

    public ArrayList<Caderneta_Justificar> listagem() {
        try {
            ArrayList<Caderneta_Justificar> list = new ArrayList<>();
            String sql = "SELECT * FROM [caderneta faltas_a_justificar]";
            PreparedStatement ps = GetConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Caderneta_Justificar cj = new Caderneta_Justificar();
                cj.setProcesso(rs.getInt("PROCESSO"));
                cj.setNprocesso(rs.getInt("N_PROCESSO"));
                cj.setIdponto(rs.getInt("ID_PONTO"));
                cj.setNregistro(rs.getInt("N_REGISTRO"));
                cj.setIdfalta(rs.getInt("ID_Falta"));
                cj.setIdturma(rs.getInt("ID_TURMA"));
                list.add(cj);
            }
            rs.close();
            ps.close();

            return list;

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Caderneta_Justificar Encontrar(int processo) {
        try {
            Caderneta_Justificar cj = null;
            String sql = "SELECT * FROM [caderneta faltas_a_justificar] WHERE PROCESSO=?";
            PreparedStatement ps = GetConnection().prepareStatement(sql);
            ps.setInt(1, processo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cj = new Caderneta_Justificar();
                cj.setProcesso(rs.getInt("PROCESSO"));
                cj.setNprocesso(rs.getInt("N_PROCESSO"));
                cj.setIdponto(rs.getInt("ID_PONTO"));
                cj.setNregistro(rs.getInt("N_REGISTRO"));
                cj.setIdfalta(rs.getInt("ID_Falta"));
                cj.setIdturma(rs.getInt("ID_TURMA"));
            }
            rs.close();
            ps.close();

            return cj;

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
