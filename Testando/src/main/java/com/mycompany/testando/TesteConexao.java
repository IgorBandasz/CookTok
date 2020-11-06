/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testando;

import conexao.ConexaoFactory;
import database.TbIngrediente;
import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        TbIngrediente ingre = new TbIngrediente();
        ingre.save();
    }
}
