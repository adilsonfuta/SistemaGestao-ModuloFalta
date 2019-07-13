/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Faltas_Justificar;
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
public class Faltas_JustificarDao extends GenericDao{
    
    public void Salvar(Faltas_Justificar fj)
    {
        String sql="INSERT INTO faltas_a_justificar(ID_Falta, PORTADOR_DO_BI, ESTADO_CIVIL, DATA_DE_NASCIMENTO, ANO_LECTIVO, CLASSE,"
                + " MOTIVO_DE, NOME_DO_ALUNO, ENCARREGADO_DO_ALUNO, NATURAL_DE, PRONVINCIA_DE, ASSINATURA, DISCIPLINA_QUE_TEVE_FALTA,"
                + " DATA, ASSINATURA_DO_ENCARREGADO, TURMA, NUMERO_DE_PROCESSO, PREIODO, DIRETOR_DE_TURMA)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
        SalvarGDAO(sql,fj.getIdfalta(),fj.getPortadorBI(),fj.getEstadocivil(),fj.getDatanascimento(),fj.getAnolectivo(),fj.getClasse(),
        fj.getMotivo(),fj.getNomealuno(),fj.getEncarregado(),fj.getNatural(),fj.getProvincia(),fj.getAssinatura(),fj.getDisciplinasfaltas(),
        fj.getData(),fj.getAssinaturaEncarregado(),fj.getTurma(),fj.getNprocesso(),fj.getPeriodo(),fj.getDirectorTurma());
    }
    public void Atualizar(Faltas_Justificar fj)
    {   String sql="UPDATE faltas_a_justificar SET PORTADOR_DO_BI=?,ESTADO_CIVIL=?,DATA_DE_NASCIMENTO=?,"
            + "ANO_LECTIVO=?,CLASSE=?,MOTIVO_DE=?,NOME_DO_ALUNO=?,ENCARREGADO_DO_ALUNO=?,NATURAL_DE=?,"
            + "PRONVINCIA_DE=?,ASSINATURA=?,DISCIPLINA_QUE_TEVE_FALTA=?,DATA=?,"
            + "ASSINATURA_DO_ENCARREGADO=?,TURMA=?,NUMERO_DE_PROCESSO=?,"
            + "PREIODO=?,DIRETOR_DE_TURMA=? WHERE ID_Falta=?";
    
        AtualizarGDAO(sql,fj.getIdfalta(),fj.getPortadorBI(),fj.getEstadocivil(),fj.getDatanascimento(),fj.getAnolectivo(),fj.getClasse(),
        fj.getMotivo(),fj.getNomealuno(),fj.getEncarregado(),fj.getNatural(),fj.getProvincia(),fj.getAssinatura(),fj.getDisciplinasfaltas(),
        fj.getData(),fj.getAssinaturaEncarregado(),fj.getTurma(),fj.getNprocesso(),fj.getPeriodo(),fj.getDirectorTurma());
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM faltas_a_justificar WHERE WHERE ID_Falta=?";
        DeletarGDAO(sql, id);
    }
    
    public ArrayList<Faltas_Justificar> listagem(){
        try {
            ArrayList<Faltas_Justificar> list=new ArrayList<>();
            String sql="SELECT * FROM faltas_a_justificar";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
              Faltas_Justificar fj=new Faltas_Justificar();
              fj.setIdfalta(rs.getInt("ID_Falta"));
              fj.setPortadorBI(rs.getString("PORTADOR_DO_BI"));
              fj.setEstadocivil(rs.getString("ESTADO_CIVIL"));
              fj.setDatanascimento(rs.getDate("DATA_DE_NASCIMENTO"));
              fj.setAnolectivo(rs.getInt("ANO_LECTIVO"));
              fj.setClasse(rs.getInt("CLASSE"));              
              fj.setMotivo(rs.getString("MOTIVO_DE"));
              fj.setNomealuno(rs.getString("NOME_DO_ALUNO"));
              fj.setEncarregado(rs.getString("ENCARREGADO_DO_ALUNO"));
              fj.setNatural(rs.getString("NATURAL_DE"));
              fj.setProvincia(rs.getString("PRONVINCIA_DE"));
              fj.setAssinatura(rs.getDate("ASSINATURA"));
              fj.setDisciplinasfaltas(rs.getString("DISCIPLINA_QUE_TEVE_FALTA"));
              fj.setData(rs.getDate("DATA"));
              fj.setAssinaturaEncarregado(rs.getString("ASSINATURA_DO_ENCARREGADO"));
              fj.setTurma(rs.getString("TURMA"));
              fj.setNprocesso(rs.getInt("NUMERO_DE_PROCESSO"));
              fj.setPeriodo(rs.getString("PREIODO"));
              fj.setDirectorTurma(rs.getString("DIRETOR_DE_TURMA"));  
              list.add(fj);
            }
            rs.close();
            ps.close();
             
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Faltas_Justificar Encontrar(String nome) {
        try {
            Faltas_Justificar fj = null;
            String sql = "SELECT * FROM faltas_a_justificar WHERE NOME_DO_ALUNO = ?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    fj = new Faltas_Justificar();
                    fj.setIdfalta(rs.getInt("ID_Falta"));
                    fj.setPortadorBI(rs.getString("PORTADOR_DO_BI"));
                    fj.setEstadocivil(rs.getString("ESTADO_CIVIL"));
                    fj.setDatanascimento(rs.getDate("DATA_DE_NASCIMENTO"));
                    fj.setAnolectivo(rs.getInt("ANO_LECTIVO"));
                    fj.setClasse(rs.getInt("CLASSE"));
                    fj.setMotivo(rs.getString("MOTIVO_DE"));
                    fj.setNomealuno(rs.getString("NOME_DO_ALUNO"));
                    fj.setEncarregado(rs.getString("ENCARREGADO_DO_ALUNO"));
                    fj.setNatural(rs.getString("NATURAL_DE"));
                    fj.setProvincia(rs.getString("PRONVINCIA_DE"));
                    fj.setAssinatura(rs.getDate("ASSINATURA"));
                    fj.setDisciplinasfaltas(rs.getString("DISCIPLINA_QUE_TEVE_FALTA"));
                    fj.setData(rs.getDate("DATA"));
                    fj.setAssinaturaEncarregado(rs.getString("ASSINATURA_DO_ENCARREGADO"));
                    fj.setTurma(rs.getString("TURMA"));
                    fj.setNprocesso(rs.getInt("NUMERO_DE_PROCESSO"));
                    fj.setPeriodo(rs.getString("PREIODO"));
                    fj.setDirectorTurma(rs.getString("DIRETOR_DE_TURMA"));
                }
                rs.close();
                ps.close();
            }

            return fj;

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
         String consulta="SELECT * FROM faltas_a_justificar";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
