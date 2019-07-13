/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Modelos.Usuarios;
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
public class UsuarioDao extends GenericDao{

    
    public void Salvar(Usuarios u)
    {
        String sql="INSERT INTO usuarios ( user, senha, modo,Categoria) VALUES (?,?,?,?)";
        SalvarGDAO(sql,u.getUser(),u.getSenha(),u.getModo(),u.getCategoria());
    }
    public void Atualizar(Usuarios u)
    {  String sql="UPDATE usuarios SET user=?,senha=?,modo=?,Categoria=? WHERE iduser=?";
        AtualizarGDAO(sql,u.getIduser(),u.getUser(),u.getSenha(),u.getModo(),u.getCategoria());
    }
    public void Deletar(int id)
    {
        String sql="DELETE FROM usuarios WHERE iduser=?";
        DeletarGDAO(sql, id);
    }
    
public ArrayList<Usuarios> listagem(){
        try {
            ArrayList<Usuarios> list=new ArrayList<>();
            String sql="SELECT * FROM usuarios";
            PreparedStatement ps=GetConnection().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
          
            while (rs.next()) {                
                Usuarios usuarios=new Usuarios();
               usuarios.setIduser(rs.getInt("iduser"));
               usuarios.setUser(rs.getString("user"));
               usuarios.setSenha(rs.getString("senha"));
               usuarios.setModo(rs.getString("modo"));
               usuarios.setCategoria(rs.getString("Categoria"));
                 list.add(usuarios);
            }
            rs.close();
            ps.close();
             
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Usuarios Encontrar(String nome){
        try {
            Usuarios usuarios=null;
            String sql="SELECT * FROM usuarios WHERE user=?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setString(1 , nome);
                ResultSet rs=ps.executeQuery();
                
                while (rs.next()) {
               usuarios=new Usuarios();
               usuarios.setIduser(rs.getInt("iduser"));
               usuarios.setUser(rs.getString("user"));
               usuarios.setSenha(rs.getString("senha"));
               usuarios.setModo(rs.getString("modo"));
               usuarios.setCategoria(rs.getString("Categoria"));
                
                }
                rs.close();
            }
             
            return usuarios;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    // rever este metodos .....
    public Usuarios EntrandoNoSystem(String nome,String senha){
        try {
            Usuarios usuarios=null;
            String sql="SELECT * FROM usuarios WHERE user=?,senha=?";
            try (PreparedStatement ps = GetConnection().prepareStatement(sql)) {
                ps.setString(1 , nome);
                ps.setString(2 , senha);
                ResultSet rs=ps.executeQuery();
                
               while (rs.next()) {
               usuarios=new Usuarios();
               usuarios.setIduser(rs.getInt("iduser"));
               usuarios.setUser(rs.getString("user"));
               usuarios.setSenha(rs.getString("senha"));
               usuarios.setModo(rs.getString("modo"));
               usuarios.setCategoria(rs.getString("Categoria")); 
                }
                rs.close();
            }
             
            return usuarios;
            
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
        String consulta = "SELECT * FROM usuarios";

        try {
            PreparedStatement ps = GetConnection().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("iduser"), rs.getString("user"),
               rs.getString("senha"), rs.getString("modo"), rs.getString("Categoria")});

            }

            for (int i = 0; i < dados.size(); i++) {
                dtm.addRow(dados.get(i));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO ao carregar" + e.getMessage());
        }
    }
    
    
}
