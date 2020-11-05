/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TbIngrediente {
    public void save(){
        String sql = "INSERT INTO dbcooktok.tbcomprador (cpfcomp,nomecomp) VALUES ('123.456', 'Igor');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stat = conn.createStatement();

            System.out.println(stat.executeUpdate(sql));
            ConexaoFactory.fecharConexao(conn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}