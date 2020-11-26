/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import conexao.ConexaoFactory;
import cookTok.Receita;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iband
 */
public class TbReceita {
    public static void save(Receita receita){
        String sql = "INSERT INTO dbcooktok.tbreceita (nomereceita, tempo) VALUES ('"+receita.getNome_Receita()+"',"+receita.getTempo_Preparo()*60+")";     
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
    
    public static int ultimo(){
        String sql = "SELECT max(pkcodreceita) as maior from dbcooktok.tbreceita";
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            ResultSet resultado = stat.executeQuery(sql);
            while(resultado.next()){
                return resultado.getInt("maior");
            }
            ConexaoFactory.close(conn,stat);
        } catch (SQLException throwables) {
            System.out.println("Problema ao buscar a ultima receita");
        }
        return 1;
    }
}
