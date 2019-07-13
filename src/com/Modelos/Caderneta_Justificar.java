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
public class Caderneta_Justificar {
    
    private int processo;
    private int nprocesso;
    private int idponto;
    private int nregistro;
    private int idfalta;
    private int idturma;

    public Caderneta_Justificar() {
    }

    public Caderneta_Justificar(int processo, int nprocesso, int idponto, int nregistro, int idfalta, int idturma) {
        this.processo = processo;
        this.nprocesso = nprocesso;
        this.idponto = idponto;
        this.nregistro = nregistro;
        this.idfalta = idfalta;
        this.idturma = idturma;
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

    public int getIdfalta() {
        return idfalta;
    }

    public void setIdfalta(int idfalta) {
        this.idfalta = idfalta;
    }

    public int getIdturma() {
        return idturma;
    }

    public void setIdturma(int idturma) {
        this.idturma = idturma;
    }

    
}
