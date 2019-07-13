/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

/**
 *
 * @author IRENE FUTA
 */
public class Usuarios {
    private int iduser;
    private String user;
    private String senha;
    private String modo;
    private String Categoria;

    public Usuarios() {
    }

    public Usuarios(int iduser, String user, String senha, String modo, String Categoria) {
        this.iduser = iduser;
        this.user = user;
        this.senha = senha;
        this.modo = modo;
        this.Categoria = Categoria;
    }

    
    public Usuarios(String user, String senha, String modo,String Categoria) {
        this.user = user;
        this.senha = senha;
        this.modo = modo;
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    
}
