/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

import java.util.ArrayList;


public class Aluno extends DadosGeral{
   
    private int idturma;
    private String genero;
    private int numAluno;
    
    private ArrayList<Cardeneta> cardenetas;

    public Aluno() {
    }

    public Aluno(int idturma, String genero,int numAluno, int processo, String nome, int classe, String turma,String curso) {
        super(processo, nome, classe, turma,curso);
        this.idturma = idturma;
        this.genero = genero;
        this.numAluno=numAluno;
        this.cardenetas=new ArrayList<>();
    }

    public ArrayList<Cardeneta> getCardenetas() {
        return cardenetas;
    }

    public void setCardenetas(ArrayList<Cardeneta> cardenetas) {
        this.cardenetas = cardenetas;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public void setNumAluno(int numAluno) {
        this.numAluno = numAluno;
    }

    
    
    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    // trabalhando nas cadernetas
    public void adicionarCarderneta(Cardeneta c)
    {
        this.cardenetas.add(c);
    }
    
    public boolean RemoverCarderneta(int proc)
    {
        for (Cardeneta c: cardenetas) {
            if(c.getNprocesso()==proc)
            return   this.cardenetas.remove(c);
        }
        
        return false;
    }
    
    
}
