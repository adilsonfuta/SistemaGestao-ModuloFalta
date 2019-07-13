/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reorganizandotudo;

import Conexao.ConexaoBanco;
import com.CONTROLLER.*;
import com.Modelos.*;
import com.VIEWS.frmLogin;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import teste.Formularios.FrmSplash;
import com.VIEWS.frmSplash;

public class ReorganizandoTudo {

    public static ProfessorContr pc = new ProfessorContr();
    public static LpontoContr contr = new LpontoContr();
    public static UsuarioCntr usuarioCntr = new UsuarioCntr();
    public static TurmaContr tc=new TurmaContr();
    public static AlunoContr ac=new AlunoContr();
    Scanner sc = new Scanner(System.in);
    public static void Professor() {

        int nregistro = 2;
        String nome = "Adilson Futa";
        String disciplinas = "Programação";
        String tumas_de_aula = "A";
        String genero = "Masculino";
        pc.Salvar(nregistro, nome, disciplinas, tumas_de_aula, genero);
        System.out.println("Gravando dados dos profressores...");
        
//       // pc.Alterar(nregistro, nome, disciplinas, tumas_de_aula);
//       // pc.Eliminar(nregistro=1);

        for (Professor p:pc.ListaGeral()) {
              
          System.out.println("\nRegistro nº: "+p.getNregistro());
          System.out.println("\nNome: "+p.getNome());
          System.out.println("Disciplina: "+p.getDisciplinas());
          System.out.println("Disciplina: "+p.getGenero());
          System.out.println("Turmas: "+p.getTumas_de_aula()+" \n ");
          
          }
        System.out.println("---------------------------------------------------------------------------------");
        // Trabalhando com um objeto
//        Professor p = pc.BuscaComum(nome);
//        System.out.println("\nRegistro nº: " + p.getNregistro());
//        System.out.println("\nNome: " + p.getNome());
//        System.out.println("Disciplina: " + p.getDisciplinas());
//        System.out.println("Turmas: " + p.getTumas_de_aula() + " \n ");
    }

    public static void LivroPONTO() {

        int idponto = 1;
        int nregistro =2;
        int faltaComparencia = 3;
        int faltaVermelha = 0;
        int faltaUtensilio = 0;
        String assinatura = "Adilson Futa";
        String disciplina = "TLP";
        Date DatLivro=null;
        String Sumario="JAVA OOP"; 
        int AnoLectivo=2016;
        
        contr.Salvar(idponto, nregistro, faltaComparencia, faltaVermelha, faltaUtensilio, assinatura, disciplina, DatLivro, Sumario, AnoLectivo);
//        contr.Alterar(idponto, nregistro, faltaComparencia, faltaVermelha, faltaUtensilio, assinatura, disciplina, horaInicio, horatermino);
//        contr.Eliminar(nregistro);
        System.out.println("Gravando dados " + contr.toString() + "...");

    }

    public static void UsuariosWork() {

        String nome = "Yadilka";
        String senha = "yadi";
        String modo = "Normal";
        String categ = "Professor";

        usuarioCntr.Salvar(nome, senha, modo, categ);

        System.out.println(" \t \t salvo com sucesso ....\n \n");

        int total = usuarioCntr.ListaGeral().size();

        ArrayList<Usuarios> al = usuarioCntr.ListaGeral();

        System.out.println("Total de Usuarios Cadastrados: " + total + "\n ");

        for (int i = 0; i < total; i++) {

            System.out.println("Id Ususrio nº: " + al.get(i).getIduser());
            System.out.println(" Usuario Nome: " + al.get(i).getUser());
            System.out.println(" Usuario Senha: " + al.get(i).getSenha());
            System.out.println(" Usuario Senha: " + al.get(i).getModo());
            System.out.println(" Modo de Acesso: " + al.get(i).getCategoria() + " \n ");

        }

    }


    public static void AcessoImedato() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmSplash().setVisible(true);  // Projecto Final
                    //    new FrmSplash().setVisible(true);  // Projecto Teste
            }

        });
    }
    
    
    public static void Turmando() {
        int idturma=2;
        int idponto=1;
        int nregistro=1;
        String nome="AI2";
        int classe=10;
        String curso="Informatica";
        tc.Salvar(idturma, idponto, nregistro, nome, classe, curso);
        System.out.println("salvo com sucesso a turma");
    }
    
      
    
    
    public static void Alunos() {
        
        int idturma=2;
        int classe=10;
    
        String turma="A";
        String curso="Informatica";
        
        // Modando para cada caso..... 
        
        String nome="Creuma Kusola";
        String genero="Femenino";
        int numAluno=4;
        int processo=903;
        
        ac.Salvar(idturma, genero, numAluno, processo, nome, classe, turma, curso);
        System.out.println("salvo com sucesso Aluno");
        
        
    }

    public static void main(String[] args) {
         //  System.out.println("" + ConexaoBanco.getconectionMysql().toString());
        //  UsuariosWork();
        //Professor();
        //LivroPONTO();
        //Turmando();
         // Alunos();
        
        
         AcessoImedato();
        
            
        }
        
       
        
     
    }


