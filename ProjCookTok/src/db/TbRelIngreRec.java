/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import conexao.ConexaoFactory;
import cookTok.Rel_ReceitaIngrediente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import telas.TelaAdicionar_Receita;

/**
 *
 * @author iband
 */
public class TbRelIngreRec {
    public static void save(Rel_ReceitaIngrediente relacao){
        String sql = "INSERT INTO dbcooktok.tbrelingrerec (fkcodreceita, fkcodingre, quantidade, medida) VALUES ("
                +relacao.getCod_Receita()+","+relacao.getCod_Ingred()+","+relacao.getQuantidade()+",'"+relacao.getUnidade()+"')";     
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Relação IngreRec inserido com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao inserir Relação IngreRec");
            TelaAdicionar_Receita.Poupop.setSize(400, 200);
            TelaAdicionar_Receita.mensagem_de_alerta.setText("Erro ao salvar Ingredientes");
            TelaAdicionar_Receita.Poupop.setVisible(true);
        }
    }
}
