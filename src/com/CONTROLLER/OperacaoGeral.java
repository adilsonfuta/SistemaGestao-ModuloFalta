/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import com.DAO.TurmaDao;
import com.Modelos.Turma;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author IRENE FUTA
 */
public  class OperacaoGeral 
{

     
      public  Date FormatarData(String data)
    { 
        try {
            String modelodata="dd/MM/yyyy";
            DateFormat format=new SimpleDateFormat(modelodata);
            return new Date(format.parse(data).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(InterfaceControler.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
      
      public  Date FormatarHora(String data)
    { 
        try {
            String modelodata="hh:mm";
            DateFormat format=new SimpleDateFormat(modelodata);
            return new Date(format.parse(data).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(InterfaceControler.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
    }
      
      
      public  void Limpar(){}
      public  void Atualizar(){}
      public  void Salvar(){}
      public  void Deletar(){}
      public  void VerifcarInPuts(){}
      
    
       public void MostrarCombo(JComboBox box) {
        ArrayList<Turma> array = new TurmaDao().listagem();
        String str = null;
        for (Turma array1 : array) {
            str = array1.getNome();
            box.addItem(str);
        }
    }
    
}
