/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/dbcooktok?useSSL=false";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
        }
        return null;
    }

    public static void close(Connection connection){
        try {
            if(connection != null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void close(Connection conn, Statement stat){
        close(conn);
        try {
            if(stat != null)
                stat.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}