/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Cardeneta;
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
public class CadernetaDao extends GenericDao {

    public void Salvar(Cardeneta c) {
        String sql = "INSERT INTO caderneta(N_PROCESSO, ID_PONTO, N_REGISTRO, ID_TURMA, NUMER, NUMERO_DE_TELEFONE, EMAIL,"
                + " ANO_LECTIVO, DATACARD, NOME_DOS_PAIS, TELEFONE_DOS_PAIS, EMAIL_DOS_PAIS, OBSERVACAO, PROCESSO, "
                + "NOME_DO_ALUNO, CLASSE, TURMA, CURSO)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?"
                + ",?,?,?,?,?,?,?,?)";
        
        SalvarGDAO(sql, c.getNprocesso(),c.getIdponto(),c.getNregistro(),c.getIdturma(),c.getNumero(),c.getNumtelefone(),
                c.getEmail(),c.getAnolectivo(),c.getDataCard(),c.getNomedospais(),c.getTelefonedospais(),c.getEmaidospais(),
                c.getObservao(),c.getProcesso(),c.getNome(),c.getClasse(),c.getTurma(),c.getCurso());
    }

    public void Atualizar(Cardeneta c) {
        String sql = "UPDATE caderneta SET N_PROCESSO=?,ID_PONTO=?,N_REGISTRO=?,ID_TURMA=?,NUMER=?,NUMERO_DE_TELEFONE=?,"
                + "EMAIL=?,ANO_LECTIVO=?,DATACARD=?,NOME_DOS_PAIS=?,TELEFONE_DOS_PAIS=?,EMAIL_DOS_PAIS=?,OBSERVACAO=?,"
                + "NOME_DO_ALUNO=?,CLASSE=?,TURMA=?,CURSO=? WHERE PROCESSO=?";
        
        AtualizarGDAO(sql, c.getNprocesso(),c.getIdponto(),c.getNregistro(),c.getIdturma(),c.getNumero(),c.getNumtelefone(),
                c.getEmail(),c.getAnolectivo(),c.getDataCard(),c.getNomedospais(),c.getTelefonedospais(),c.getEmaidospais(),
                c.getObservao(),c.getProcesso(),c.getNome(),c.getClasse(),c.getTurma(),c.getCurso());
  }

    public void Deletar(int id) {
        String sql = "DELETE FROM caderneta WHERE PROCESSO=?";
        DeletarGDAO(sql, id);
    }

    public ArrayList<Cardeneta> listagem() {
        try {
            ArrayList<Cardeneta> list = new ArrayList<>();
            String sql = "SELECT * FROM caderneta";
            PreparedStatement ps = GetConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cardeneta c = new Cardeneta();
                c.setNprocesso(rs.getInt("N_PROCESSO"));
                c.setIdponto(rs.getInt("ID_PONTO"));
                c.setNregistro(rs.getInt("N_REGISTRO"));
                c.setIdturma(rs.getInt("ID_TURMA"));
                c.setNumero(rs.getInt("NUMER"));
                c.setNumtelefone(rs.getInt("NUMERO_DE_TELEFONE"));
                c.setEmail(rs.getString("EMAIL"));
                c.setAnolectivo(rs.getInt("ANO_LECTIVO"));
                c.setDataCard(rs.getDate("DATACARD"));
                c.setNomedospais(rs.getString("NOME_DOS_PAIS"));
                c.setTelefonedospais(rs.getInt("TELEFONE_DOS_PAIS"));
                c.setEmaidospais(rs.getString("EMAIL_DOS_PAIS"));
                c.setObservao(rs.getString("OBSERVACAO"));
                c.setProcesso(rs.getInt("PROCESSO"));
                c.setNome(rs.getString("NOME_DO_ALUNO"));
                c.setClasse(rs.getInt("CLASSE"));
                c.setTurma(rs.getString("TURMA"));
                c.setCurso(rs.getString("CURSO"));

                list.add(c);
            }
            rs.close();
            ps.close();

            return list;

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Cardeneta Encontrar(int Processo) {
        try {
            Cardeneta c = null;
            String sql = "SELECT * FROM caderneta WHERE PROCESSO=?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setInt(1, Processo);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    c = new Cardeneta();
                c.setNprocesso(rs.getInt("N_PROCESSO"));
                c.setIdponto(rs.getInt("ID_PONTO"));
                c.setNregistro(rs.getInt("N_REGISTRO"));
                c.setIdturma(rs.getInt("ID_TURMA"));
                c.setNumero(rs.getInt("NUMER"));
                c.setNumtelefone(rs.getInt("NUMERO_DE_TELEFONE"));
                c.setEmail(rs.getString("EMAIL"));
                c.setAnolectivo(rs.getInt("ANO_LECTIVO"));
                c.setDataCard(rs.getDate("DATACARD"));
                c.setNomedospais(rs.getString("NOME_DOS_PAIS"));
                c.setTelefonedospais(rs.getInt("TELEFONE_DOS_PAIS"));
                c.setEmaidospais(rs.getString("EMAIL_DOS_PAIS"));
                c.setObservao(rs.getString("OBSERVACAO"));
                c.setProcesso(rs.getInt("PROCESSO"));
                c.setNome(rs.getString("NOME_DO_ALUNO"));
                c.setClasse(rs.getInt("CLASSE"));
                c.setTurma(rs.getString("TURMA"));
                c.setCurso(rs.getString("CURSO"));
                }
                rs.close();
                ps.close();
            }

            return c;

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
