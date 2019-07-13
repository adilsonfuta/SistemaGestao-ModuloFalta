/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelos;

import java.util.ArrayList;

/**
 *
 * @author IRENE FUTA
 */
public class ControloFaltas {
    
private ArrayList<Turma> turmas;

    public ControloFaltas() {
        this.turmas = new ArrayList<>();
    }
    
    public void CriarTurma(Turma t)
    {
        this.turmas.add(t);
        t.Addalunos(new Aluno());
    }

    public int TotalAlunos(String nome)
    {
        int n=turmas.size();
        for (int j = 0; j <=n; j++) {
            if(turmas.get(j).getAlunos().get(j).getTurma().equals(nome))
            return turmas.get(j).getAlunos().size();
        }
         return 0;
    }

    
}
