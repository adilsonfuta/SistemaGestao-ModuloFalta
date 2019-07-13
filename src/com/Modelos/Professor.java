
package com.Modelos;

import java.util.ArrayList;


public class Professor {
 
    private int nregistro;
    private String nome;
    private String disciplinas;  
    private String tumas_de_aula;
    private String genero;
    
    
    private ArrayList<String> discp;/*  Esta Zona devia ser uma lista de disciplinas   */
  

    public Professor() {
    }

    public Professor(int nregistro, String nome, String disciplinas, String tumas_de_aula ,String genero) {
        this.nregistro = nregistro;
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.tumas_de_aula = tumas_de_aula;
        this.genero=genero;
         this.discp = new ArrayList<>();
       
     }
       public int getNregistro() {
        return nregistro;
    }

    public void setNregistro(int nregistro) {
        this.nregistro = nregistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getTumas_de_aula() {
        return tumas_de_aula;
    }

    public void setTumas_de_aula(String tumas_de_aula) {
        this.tumas_de_aula = tumas_de_aula;
    }

    public ArrayList<String> getDiscp() {
        return discp;
    }

    public void setDiscp(ArrayList<String> discp) {
        this.discp = discp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

        
  public void AddDiscP()
  {
      this.discp.add(this.disciplinas);
  }
  
//  public void RemoverDisc(String nome)
//    {
//        discp.stream().filter((discp1) -> (discp1.equals(nome))).forEach((_item) -> {
//            this.discp.remove(nome);
//        });
//    }
    
    
    
    
}
