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
import telas.TelaAdicionar_Receita;

/**
 *
 * @author iband
 */
public class TbInstrucao {
   public void save(Instrucao instru){
        String sql = "INSERT INTO dbcooktok.tbinstrucao (nomeinstru,fkcodreceita,tempoinstru)"
                +" VALUES ('"+instru.getNome_Instru()+"',"+instru.getCod_Receita()+","+instru.getTempo_Instru()*60+")";     
        try {
            Connection conn = ConexaoFactory.getConexao();
            Statement stat = conn.createStatement();
            System.out.println(stat.executeUpdate(sql)); //executeUpdate faz comandos DDL
            ConexaoFactory.close(conn,stat);
            System.out.println("Instrução inserida com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Erro ao inserir");
            TelaAdicionar_Receita.Poupop.setSize(400, 200);
            TelaAdicionar_Receita.mensagem_de_alerta.setText("Erro ao salvar Instruções");
            TelaAdicionar_Receita.Poupop.setVisible(true);
        }
    }
}
