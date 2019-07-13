/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.Modelos.Usuarios;
import com.DAO.UsuarioDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

/**
 *
 * @author IRENE FUTA
 */
public class UsuarioCntr implements InterfaceControler<Usuarios>{

    
    public void Salvar(String user, String senha, String modo, String Categoria) {
       new UsuarioDao().Salvar(new Usuarios( user, senha, modo,Categoria));
    }

    
   
    public void Alterar(int iduser, String user, String senha, String modo,String Categoria) {
       new UsuarioDao().Atualizar(new Usuarios(iduser, user, senha, modo,Categoria));  
    }

   
    public void Excluir(int id) {
           new UsuarioDao().Deletar(id); 
    }
    
    
    
    @Override
    public void SalvarV(Usuarios... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlterarV(Usuarios... x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirV(Usuarios id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Validaçoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuarios> ListaGeral() {
    return new UsuarioDao().listagem();
    }

    @Override
    public Usuarios BuscaComum(String nome) {
    return new UsuarioDao().Encontrar(nome);
    }
    public Usuarios EntrarSistema(String nome,String senha) {
    return new UsuarioDao().EntrandoNoSystem(nome, senha);
    }

    @Override
    public void MostrarTABLE(DefaultTableModel dtm) {
       new UsuarioDao().Inserir_na_Tabela(dtm);
    }
    
    public void MostrarCombo(JComboBox box)
    {
    ArrayList<Usuarios> array = new UsuarioDao().listagem();
        String str = null;
        for (Usuarios array1 : array) {
            str = array1.getUser().toString();
            box.addItem(str);
        }
    }
 
}
        

