/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import conexao.ConexaoFactory;
import cookTok.Ingrediente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TbIngrediente {
    public static void save(Ingrediente ingre){
        String sql = "INSERT INTO dbcooktok.tbingrediente (nomeingre) VALUES ('"+ingre.getNome_Ingred()+"')";     
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Ingrediente inserido com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao inserir Ingrediente");
        }
    }
    public static void update(Ingrediente ingre, String alteracao){
        if(ingre == null || ingre.getCod_Ingred() == -1){
            System.out.println("Não foi possível alterar o ingrediente");
            return;
        }
        String sql = "UPDATE dbcooktok.tbingrediente set nomeingre ='"+alteracao+"' where pkcodingre ="+ingre.getCod_Ingred()+";";       
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Ingrediente alterado com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao alterar Ingrediente");
        }
    }
    public void delete(Ingrediente ingre){
        if(ingre == null || ingre.getCod_Ingred() == -1){
            System.out.println("Não foi possível deletar o ingrediente");
            return;
        }
        String sql = "DELETE FROM dbcooktok.tbingrediente where pkcodingre ="+ingre.getCod_Ingred()+";";
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Ingrediente deletado com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao deletar Ingrediente");
        }
    }
    public static void selectAll(){
        String sql = "SELECT * from dbcooktok.tbingrediente";
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            
            ResultSet result = stat.executeQuery(sql);
            while(result.next()){
                
            }
            ConexaoFactory.close(conn,stat);
            System.out.println("Ingrediente deletado com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao deletar Ingrediente");
        } 
    }
}