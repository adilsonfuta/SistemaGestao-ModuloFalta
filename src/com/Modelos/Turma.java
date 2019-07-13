/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

import java.util.ArrayList;


public class Turma extends DadosGeral{

    private int idturma;
    private int idponto;
    private int nregistro;
    private ArrayList<Professor> professores; /*  Esta Zona devia ser uma lista de turmas   */
    private ArrayList<Aluno> alunos;
    private Lponto lponto;

    

    public void setLponto(Lponto lponto) {
        this.lponto = lponto;
    }
    
    public Turma() {
    }

    public Turma(int idturma, int idponto, int nregistro, String nome, int classe,String curso) {
        super(nome, classe,curso);
        this.idturma = idturma;
        this.idponto = idponto;
        this.nregistro = nregistro;
          this.professores = new ArrayList<>();
          this.alunos = new ArrayList<>();
    }
    public Turma(int idturma, int idponto, int nregistro, String nome, int classe,String curso, Lponto l) {
        super(nome, classe,curso);
        this.idturma = idturma;
        this.idponto = idponto;
        this.nregistro = nregistro;
          this.professores = new ArrayList<>();
          this.alunos = new ArrayList<>();
          this.lponto=l;
    }
    
    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public Lponto getLponto() {
        return lponto;
    }

   public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }
    public int getIdponto() {
        return idponto;
    }

    public void setIdponto(int idponto) {
        this.idponto = idponto;
    }

    public int getNregistro() {
        return nregistro;
    }

    public void setNregistro(int nregistro) {
        this.nregistro = nregistro;
    }
    
 // versao de teste essa linhas Professor
    
    public ArrayList<Professor> getProfessor() {
        return professores;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professores = professors;
    }

    public void AddProfessor(Professor t)
  {
      this.professores.add(t);
  }
  
  public boolean RemoverProfessor(String nometurma)
    {
        for (Professor t: professores) {
            if(t.getNome().equals(nometurma))
            return   this.professores.remove(t);
        }
        
        return false;
    }  
  
  
   // versao de teste essa linhas ALUNOS

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
  
    public void Addalunos(Aluno t)
  {
      this.alunos.add(t);
  }
  
  public boolean Removeralunos(int proc)
    {
        for (Aluno t: alunos) {
            if(t.getProcesso()==proc)
            return   this.alunos.remove(t);
        }
        
        return false;
    }  
}
