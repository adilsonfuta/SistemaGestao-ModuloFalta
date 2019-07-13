/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CONTROLLER;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public interface InterfaceControler <T> {
    
    public abstract void SalvarV(T... x);

    public abstract void AlterarV(T... x);

    public abstract void ExcluirV(T id);

    public abstract void Validaçoes();

    public ArrayList<T> ListaGeral();

    public T BuscaComum(String nome);
    
    /**
     *
     * @param dtm
     */
    public abstract void MostrarTABLE(DefaultTableModel dtm);


}
