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
}