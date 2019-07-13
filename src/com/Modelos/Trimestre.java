/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;


public class Trimestre {
    
   private int idtrimestre;
   
   private int processo;
   private int nprocesso;
   private int idponto;
   private int nregistro;
   private int idturma;
   
   private int mediatrimestral;
   private int avalicaocontinual;
   private int prova1;
   private int prova2;    

    public Trimestre() {
    }

    public Trimestre(int idtrimestre, int processo, int nprocesso, int idponto, int nregistro, int idturma,
            int mediatrimestral, int avalicaocontinual, int prova1, int prova2) {
        this.idtrimestre = idtrimestre;
        this.processo = processo;
        this.nprocesso = nprocesso;
        this.idponto = idponto;
        this.nregistro = nregistro;
        this.idturma = idturma;
        this.mediatrimestral = mediatrimestral;
        this.avalicaocontinual = avalicaocontinual;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public int getIdtrimestre() {
        return idtrimestre;
    }

    public void setIdtrimestre(int idtrimestre) {
        this.idtrimestre = idtrimestre;
    }

    public int getProcesso() {
        return processo;
    }

    public void setProcesso(int processo) {
        this.processo = processo;
    }

    public int getNprocesso() {
        return nprocesso;
    }

    public void setNprocesso(int nprocesso) {
        this.nprocesso = nprocesso;
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

    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }

    public int getMediatrimestral() {
        return mediatrimestral;
    }

    public void setMediatrimestral(int mediatrimestral) {
        this.mediatrimestral = mediatrimestral;
    }

    public int getAvalicaocontinual() {
        return avalicaocontinual;
    }

    public void setAvalicaocontinual(int avalicaocontinual) {
        this.avalicaocontinual = avalicaocontinual;
    }

    public int getProva1() {
        return prova1;
    }

    public void setProva1(int prova1) {
        this.prova1 = prova1;
    }

    public int getProva2() {
        return prova2;
    }

    public void setProva2(int prova2) {
        this.prova2 = prova2;
    }
    
   
    
   
    
}
