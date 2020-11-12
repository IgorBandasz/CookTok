/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import conexao.ConexaoFactory;
import cookTok.Instrucao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iband
 */
public class TbInstrucao {
   public void save(Instrucao instru){
        String sql = "INSERT INTO dbcooktok.tbinstrucao (nomeinstru) VALUES ('"+instru.getNome_Instru()+"')";     
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Instrução inserida com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao inserir");
        }
    }
    public void update(Instrucao instru, String alteracao){
        if(instru == null || instru.getCod_Instru() == -1){
            System.out.println("Não foi possível alterar a instrução");
            return;
        }
        String sql = "UPDATE dbcooktok.tbinstrucao set nomeinstru ='"+alteracao+"' where pkcodinstru ="+instru.getCod_Instru()+";";       
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Instrução alterada com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao alterar Instrução");
        }
    }
    public void delete(Instrucao instru){
        if(instru == null || instru.getCod_Instru() == -1){
            System.out.println("Não foi possível deletar a instrução");
            return;
        }
        String sql = "DELETE FROM dbcooktok.tbinstrucao where pkcodinstru ="+instru.getCod_Instru()+";";
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Instrução deletada com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao deletar Instrução");
        }
    } 
}
