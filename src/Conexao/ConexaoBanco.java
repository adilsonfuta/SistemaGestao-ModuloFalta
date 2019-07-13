
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    

    private static  String url = null;
    private static  String user = null;
    private static  String passwd = null;
    private static Connection con = null;
   
    
    public static Connection getconectionPostGres() {
        url = "jdbc:postgresql://localhost:5432/ADDI";
        user = "postgres";
        passwd = "amor";
        try {
            System.out.println("conectado ao banco de dados....");
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, passwd);
            return con;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

            return null;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
    
    public static void FecharConexao()
    {
        try {
           // getconection().close();
            getconectionMysql().close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static Connection getconectionMysql() {
       
        url = "jdbc:mysql://localhost/janice";
        user = "root";
        passwd = "";
        try {
            System.out.println("conectado ao banco de dados....");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, passwd);
            return con;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

            return null;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }



}