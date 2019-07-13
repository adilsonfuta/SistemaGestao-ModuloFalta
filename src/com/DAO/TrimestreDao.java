/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Trimestre;
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
public class TrimestreDao extends GenericDao {

    public void Salvar(Trimestre t) {
        String sql = "INSERT INTO trimestre(ID_TRIMESTRE, PROCESSO, N_PROCESSO, "
                + "ID_PONTO, N_REGISTRO, ID_TURMA, MEDIA_TRIMESTRAL, AVALICAO_CONTINUA, PROVA1, PROVA2)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?)";
        SalvarGDAO(sql, t.getIdtrimestre(), t.getProcesso(), t.getNprocesso(), t.getIdponto(), t.getNregistro(), t.getIdturma(), t.getMediatrimestral(), t.getAvalicaocontinual(), t.getProva1(), t.getProva2());
    }

    public void Atualizar(Trimestre t) {
        String sql = "UPDATE trimestre SET PROCESSO=?,N_PROCESSO=?,ID_PONTO=?,N_REGISTRO=?,ID_TURMA=?,"
                + "MEDIA_TRIMESTRAL=?,AVALICAO_CONTINUA=?,PROVA1=?,PROVA2=? WHERE ID_TRIMESTRE=?";
        AtualizarGDAO(sql, t.getIdtrimestre(), t.getProcesso(), t.getNprocesso(), t.getIdponto(), t.getNregistro(), t.getIdturma(), t.getMediatrimestral(), t.getAvalicaocontinual(), t.getProva1(), t.getProva2());
    }

    public void Deletar(int id) {
        String sql = "DELETE FROM trimestre WHERE ID_TRIMESTRE=?";
        DeletarGDAO(sql, id);
    }

    public ArrayList<Trimestre> listagem() {
        try {
            ArrayList<Trimestre> list = new ArrayList<>();
            String sql = "SELECT * FROM trimestre";
            PreparedStatement ps = GetConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Trimestre t = new Trimestre();

                t.setIdtrimestre(rs.getInt("ID_TRIMESTRE"));
                t.setProcesso(rs.getInt("PROCESSO"));
                t.setNprocesso(rs.getInt("N_PROCESSO"));
                t.setIdponto(rs.getInt("ID_PONTO"));
                t.setNregistro(rs.getInt("N_REGISTRO"));
                t.setIdturma(rs.getInt("ID_TURMA"));
                t.setMediatrimestral(rs.getInt("MEDIA_TRIMESTRAL"));
                t.setAvalicaocontinual(rs.getInt("AVALICAO_CONTINUA"));
                t.setProva1(rs.getInt("PROVA1"));
                t.setProva2(rs.getInt("PROVA2"));

                list.add(t);
            }
            rs.close();
            ps.close();

            return list;

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Trimestre Encontrar(int trimestre) {
        try {
            Trimestre t = null;
            String sql = "SELECT * FROM trimestre WHERE ID_TRIMESTRE=?";
            PreparedStatement ps = GetConnection().prepareStatement(sql);
            ps.setInt(1, trimestre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                t = new Trimestre();
                t.setIdtrimestre(rs.getInt("ID_TRIMESTRE"));
                t.setProcesso(rs.getInt("PROCESSO"));
                t.setNprocesso(rs.getInt("N_PROCESSO"));
                t.setIdponto(rs.getInt("ID_PONTO"));
                t.setNregistro(rs.getInt("N_REGISTRO"));
                t.setIdturma(rs.getInt("ID_TURMA"));
                t.setMediatrimestral(rs.getInt("MEDIA_TRIMESTRAL"));
                t.setAvalicaocontinual(rs.getInt("AVALICAO_CONTINUA"));
                t.setProva1(rs.getInt("PROVA1"));
                t.setProva2(rs.getInt("PROVA2"));
            }
            rs.close();
            ps.close();

            return t;

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
