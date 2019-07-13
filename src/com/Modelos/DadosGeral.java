/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;


public abstract class DadosGeral {
    
    protected int processo;
    protected String nome;
    protected int classe;
    protected String turma;
    protected  String curso;

    public DadosGeral(int processo, String nome, int classe, String turma,String curso) {
        this.processo = processo;
        this.nome = nome;
        this.classe = classe;
        this.turma = turma;
         this.curso=curso;
    }
     public DadosGeral( String nome, int classe, String turma,String curso) {
        this.nome = nome;
        this.classe = classe;
        this.turma = turma;
        this.curso=curso;
    }
     public DadosGeral( String nome, int classe, String curso) {
        this.nome = nome;
        this.classe = classe;
        this.curso=curso;
    }

    public DadosGeral() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    public int getProcesso() {
        return processo;
    }

    public void setProcesso(int processo) {
        this.processo = processo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
   
    
  
}
