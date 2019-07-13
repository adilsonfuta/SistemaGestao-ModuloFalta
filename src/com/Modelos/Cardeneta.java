
package com.Modelos;
import java.sql.Date;


public class Cardeneta extends DadosGeral{
    
   
    private int nprocesso;
    private int idponto;
    private int nregistro;
    private int idturma;
    private int numero;
    private int numtelefone;
    private String email;
    private int anolectivo;
    private Date DataCard;
  
    
    private String nomedospais;
    private int telefonedospais;
    private String emaidospais;
    private String observao;

    public Cardeneta() {
    }

   

    public Cardeneta(int nprocesso, int idponto, int nregistro, int idturma, int numero,
            int numtelefone, String email, int anolectivo, Date DataCard, String nomedospais,
            int telefonedospais, String emaidospais, String observao, int processo, String nome,
            int classe, String turma,String curso) {
        
        super(processo, nome, classe, turma,curso);
        this.nprocesso = nprocesso;
        this.idponto = idponto;
        this.nregistro = nregistro;
        this.idturma = idturma;
        this.numero = numero;
        this.numtelefone = numtelefone;
        this.email = email;
        this.anolectivo = anolectivo;
        this.DataCard = DataCard;
        this.nomedospais = nomedospais;
        this.telefonedospais = telefonedospais;
        this.emaidospais = emaidospais;
        this.observao = observao;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumtelefone() {
        return numtelefone;
    }

    public void setNumtelefone(int numtelefone) {
        this.numtelefone = numtelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnolectivo() {
        return anolectivo;
    }

    public void setAnolectivo(int anolectivo) {
        this.anolectivo = anolectivo;
    }

    public Date getDataCard() {
        return DataCard;
    }

    public void setDataCard(Date DataCard) {
        this.DataCard = DataCard;
    }

    public String getNomedospais() {
        return nomedospais;
    }

    public void setNomedospais(String nomedospais) {
        this.nomedospais = nomedospais;
    }

    public int getTelefonedospais() {
        return telefonedospais;
    }

    public void setTelefonedospais(int telefonedospais) {
        this.telefonedospais = telefonedospais;
    }

    public String getEmaidospais() {
        return emaidospais;
    }

    public void setEmaidospais(String emaidospais) {
        this.emaidospais = emaidospais;
    }

    public String getObservao() {
        return observao;
    }

    public void setObservao(String observao) {
        this.observao = observao;
    }

    
    
    
    
    
    
    
}
