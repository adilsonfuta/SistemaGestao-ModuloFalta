/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

import java.sql.Date;
import java.util.ArrayList;

public class Faltas_Justificar {
    
    private int idfalta;
    private String portadorBI;
    private String estadocivil;
    private Date datanascimento;
    private int anolectivo;
    private int classe;
    private String motivo;
    private String nomealuno;
    private String encarregado;
    private String natural;
    private String provincia;
    private Date assinatura;
    private String disciplinasfaltas;   

// list de disciplinas

    
    private Date data;
    private String assinaturaEncarregado;   
    private String turma;
    private int nprocesso;
    private String periodo;
    private String directorTurma;

    public Faltas_Justificar() {
    }

    public Faltas_Justificar(int idfalta, String portadorBI, String estadocivil, Date datanascimento, int anolectivo, 
            int classe, String motivo, String nomealuno, String encarregado, String natural, String provincia, 
            Date assinatura, String disciplinasfaltas, Date data, String assinaturaEncarregado, String turma,
            int nprocesso, String periodo, String directorTurma) {
        
        this.idfalta = idfalta;
        this.portadorBI = portadorBI;
        this.estadocivil = estadocivil;
        this.datanascimento = datanascimento;
        this.anolectivo = anolectivo;
        this.classe = classe;
        this.motivo = motivo;
        this.nomealuno = nomealuno;
        this.encarregado = encarregado;
        this.natural = natural;
        this.provincia = provincia;
        this.assinatura = assinatura;
        this.disciplinasfaltas = disciplinasfaltas;
        this.data = data;
        this.assinaturaEncarregado = assinaturaEncarregado;
        this.turma = turma;
        this.nprocesso = nprocesso;
        this.periodo = periodo;
        this.directorTurma = directorTurma;

        
    }

    public int getIdfalta() {
        return idfalta;
    }

    public void setIdfalta(int idfalta) {
        this.idfalta = idfalta;
    }

    public String getPortadorBI() {
        return portadorBI;
    }

    public void setPortadorBI(String portadorBI) {
        this.portadorBI = portadorBI;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getAnolectivo() {
        return anolectivo;
    }

    public void setAnolectivo(int anolectivo) {
        this.anolectivo = anolectivo;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(String encarregado) {
        this.encarregado = encarregado;
    }

    public String getNatural() {
        return natural;
    }

    public void setNatural(String natural) {
        this.natural = natural;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Date getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(Date assinatura) {
        this.assinatura = assinatura;
    }

    public String getDisciplinasfaltas() {
        return disciplinasfaltas;
    }

    public void setDisciplinasfaltas(String disciplinasfaltas) {
        this.disciplinasfaltas = disciplinasfaltas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAssinaturaEncarregado() {
        return assinaturaEncarregado;
    }

    public void setAssinaturaEncarregado(String assinaturaEncarregado) {
        this.assinaturaEncarregado = assinaturaEncarregado;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getNprocesso() {
        return nprocesso;
    }

    public void setNprocesso(int nprocesso) {
        this.nprocesso = nprocesso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDirectorTurma() {
        return directorTurma;
    }

    public void setDirectorTurma(String directorTurma) {
        this.directorTurma = directorTurma;
    }
    
    
    
}
