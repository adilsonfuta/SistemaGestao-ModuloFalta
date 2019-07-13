/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

import java.sql.Date;
import java.util.ArrayList;

public class Lponto {
    
    private int idponto;
    private int nregistro;
    private int faltaComparencia;    
    private int faltaVermelha;
    private int faltaUtensilio;
    
    private ArrayList<Integer> faltas; /*  EstaZona devia ser uma lista de faltas   */
    
    private String assinatura;
    private String disciplina;
    private Date DatLivro;
    private String Sumario;
    private int AnoLectivo;
    

    public Lponto() {
    }

    public Lponto(int idponto, int nregistro, int faltaComparencia, int faltaVermelha, int faltaUtensilio,
     String assinatura, String disciplina, Date DatLivro, String Sumario, int AnoLectivo) {
        this.idponto = idponto;
        this.nregistro = nregistro;
        this.faltaComparencia = faltaComparencia;
        this.faltaVermelha = faltaVermelha;
        this.faltaUtensilio = faltaUtensilio;
        this.assinatura = assinatura;
        this.disciplina = disciplina;
        this.DatLivro = DatLivro;
         this.faltas=new ArrayList<>();
        this.Sumario = Sumario;
        this.AnoLectivo = AnoLectivo;
    }

    public String getSumario() {
        return Sumario;
    }

    public void setSumario(String Sumario) {
        this.Sumario = Sumario;
    }

    public int getAnoLectivo() {
        return AnoLectivo;
    }

    public void setAnoLectivo(int AnoLectivo) {
        this.AnoLectivo = AnoLectivo;
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

    public int getFaltaComparencia() {
        return faltaComparencia;
    }

    public void setFaltaComparencia(int faltaComparencia) {
        this.faltaComparencia = faltaComparencia;
    }

    public int getFaltaVermelha() {
        return faltaVermelha;
    }

    public void setFaltaVermelha(int faltaVermelha) {
        this.faltaVermelha = faltaVermelha;
    }

    public int getFaltaUtensilio() {
        return faltaUtensilio;
    }

    public void setFaltaUtensilio(int faltaUtensilio) {
        this.faltaUtensilio = faltaUtensilio;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDatLivro() {
        return DatLivro;
    }

    public void setDatLivro(Date DatLivro) {
        this.DatLivro = DatLivro;
    }

  
    
     public void AddF(int falt)
  {
        boolean add = this.faltas.add(falt);
  }
  
  public void RemoverF(int nproxc)
    {
        int valor=new Turma().getAlunos().size();
        for (int i = 0; i < valor; i++) {
            if(new Turma().getAlunos().get(i).getProcesso()==getFaltas().get(i))
                faltas.remove(i);
        }
    }

    public ArrayList<Integer> getFaltas() {
        return faltas;
    }

    public void setFaltas(ArrayList<Integer> faltas) {
        this.faltas = faltas;
    }
    
    
}
